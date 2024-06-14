package jms;

import java.util.Collections;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.jms.Connection;
import javax.jms.ExceptionListener;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.stereotype.Component;

@Component
public class RocketConsole implements MessageListener, ExceptionListener {
	
	private String url = "tcp://localhost:61616";
	private Connection connection;
    private MessageProducer producer;
    private Session session;
    private int count;
    private long start;
    private Topic topic, topic1;
    private Topic control;
    private Map rocketData = Collections.emptyMap();
    private OrbitElementListener orbitElementListener = new OrbitElementListener();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RocketConsole console = new RocketConsole();
		try {
			console.run();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		console.execute();
	}
	
	private void execute() {
		try {
			producer.send(session.createTextMessage("Hello"));
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public RocketConsole(){
		
	}
	@PostConstruct
	public void run() throws JMSException 
	{
		ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory(url);
        connection = factory.createConnection();
        connection.setExceptionListener(this);
        session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        topic = session.createTopic("rocket.fromRocket");
        control = session.createTopic("rocket.toRocket");

        topic1 = session.createTopic("rocket.orbitElements");

        MessageConsumer consumer = session.createConsumer(topic);
        MessageConsumer consumer1 = session.createConsumer(topic1);
        producer = session.createProducer(control);
        consumer.setMessageListener(this);
        consumer1.setMessageListener(orbitElementListener);

    connection.start();

      
	}
	
	@PreDestroy
	public void terminateCommunication()
	{
		try {
			session.close();
			connection.close();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	public void onMessage(Message arg0) {
		try {
			rocketData = (Map)((ObjectMessage)arg0).getObject();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	public Map getRocketData() {
		return rocketData;
	}

	public Map<String, String> getOrbElements() {
    return orbitElementListener.getOrbElements();
  }
	
	public void onException(JMSException arg0) {
		System.out.println("jms exception detected "+arg0.getMessage());
	}

}

class OrbitElementListener implements MessageListener {
   private Map<String,String> orbElements;

  @Override
  public void onMessage(Message message) {
    try {
      orbElements = (Map)((ObjectMessage)message).getObject();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public Map<String, String> getOrbElements() {
    return orbElements;
  }
}
