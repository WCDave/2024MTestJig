package jmsStuff;

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

import com.icesoft.faces.async.render.SessionRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("c1")
public class RocketConsole implements MessageListener, ExceptionListener, IRocketData {

  @Autowired
  @Value(value = "${mqBroker.url}")
	private String url;

	private Connection connection;
    private MessageProducer producer;
    private Session session;
    private int count;
    private long start;
    private Topic topic;
    private Topic control;
    private Map rocketData;

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

        MessageConsumer consumer = session.createConsumer(topic);
        producer = session.createProducer(control);
        consumer.setMessageListener(this);

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
		SessionRenderer.render("dataBean");
	}

    @Override
	public Map getRocketData() {
		return rocketData;
	}

	
	public void onException(JMSException arg0) {
		System.out.println("jms exception detected "+arg0.getMessage());
		
	}

}
