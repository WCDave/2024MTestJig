package messaging;

import enums.ComputerButtonKeys;
import enums.OrbitElementKeys;
import gui.ComputerAbstractButton;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import main.ConfigurationManager;
import orbits.CoordSys;
import orbits.NavComputer;

import orbits.keplerian.KeplerianElements;
import org.apache.activemq.ActiveMQConnectionFactory;

import RVMath.VMath;

public class CommLink implements MessageListener {

  private String url = "tcp://localhost:61616";
  private Connection connection;
  private MessageProducer producer, producer1;
  private Session session;
  private int count;
  private long start;
  private Topic topic;
  private Topic control, control1;

  private NavComputer computer;

  public CommLink(NavComputer computer) {
    this.computer = computer;
  }

  public void run() throws JMSException {
    String hostName = ConfigurationManager.getInstance().getProperty("MQ_HOST_NAME");
    url = hostName;
    ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory(url);
    connection = factory.createConnection();
    session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
    topic = session.createTopic("rocket.toRocket");
    control = session.createTopic("rocket.fromRocket");
    control1 = session.createTopic("rocket.orbitElements");

    MessageConsumer consumer = session.createConsumer(topic);
    consumer.setMessageListener(this);

    connection.start();

    producer = session.createProducer(control);
    producer1 = session.createProducer(control1);
    System.out.println("Waiting for messages...");
  }


  public void onMessage(Message arg0) {
    try {
      String s = ((TextMessage) arg0).getText();
      if ("Hello".equals(s)) {
        ComputerAbstractButton b = computer.getButton(ComputerButtonKeys.AUTOLAUNCH);
        b.setSelected(!b.isSelected());
        b.doClick();
      }
    } catch (JMSException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void sendOrbitalElements(KeplerianElements elements) {
    Map map = new HashMap<String, String>();
    map.put("a", elements.getA());
    map.put("e", elements.getE());
    map.put("i", elements.getI());
    map.put("raan", elements.getRaan());
    map.put("aop", elements.getAop());
    map.put("ta", elements.getTa());
    map.put("period", elements.getPeriod());
    try {
      producer1.send(session.createObjectMessage((Serializable) map));
    } catch (JMSException e) {
      e.printStackTrace();
    }
  }

  public void sendData() {
    try {
      HashMap aMap = new HashMap();
      aMap.putAll(computer.getOrbitElements());
      CoordSys nav = computer.getCraft().getCoordSys();
      aMap.put("speed", VMath.mag(nav.getVelocityAsVec()));
      aMap.put("alt", VMath.mag(nav.getPositionVec()));
      double[] rVec = (double[]) aMap.get(OrbitElementKeys.radiusVec);
      double[] eVec = (double[]) aMap.get(OrbitElementKeys.ecc);
      aMap.remove(OrbitElementKeys.radiusVec);
      aMap.remove(OrbitElementKeys.ecc);

      aMap.put(OrbitElementKeys.radiusVec, VMath.mag(rVec));
      aMap.put(OrbitElementKeys.ecc, VMath.mag(eVec));
      producer.send(session.createObjectMessage(aMap));
    } catch (Exception e) {

    }
  }
}
