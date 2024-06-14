package jmsStuff;

import java.util.Map;
import java.util.Vector;

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

public class GeneConsole implements MessageListener, ExceptionListener {
	
	private String url = "tcp://DaveMain:61616";
	private Connection connection;
    private MessageProducer producer;
    private Session session;
    private int count;
    private long start;
    private Topic topic;
    private Topic control;
    private Vector<Vector<Map<String,String>>> dataVector ;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GeneConsole console = new GeneConsole();
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
			e.printStackTrace();
		}
		
	}

	public GeneConsole(){
		
	}
	
	public void run() throws JMSException 
	{
		ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory(url);
        connection = factory.createConnection();
        connection.setExceptionListener(this);
        session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        topic = session.createTopic("Gene.fromReactor");        

        MessageConsumer consumer = session.createConsumer(topic);
        consumer.setMessageListener(this);

        connection.start();      
	}
	
	public void terminateCommunication()
	{
		try {
			session.close();
			connection.close();
		} catch (JMSException e) {
			e.printStackTrace();
		}		
	}

	@SuppressWarnings("unchecked")
	
	public void onMessage(Message arg0) {
		try {
			dataVector = (Vector<Vector<Map<String,String>>>)((ObjectMessage)arg0).getObject();
		} catch (JMSException e) {
			e.printStackTrace();
		}		
		SessionRenderer.render("geneBean");
	}

	public Vector<Vector<Map<String,String>>> getGeneData() {
		return dataVector;
	}

	
	public void onException(JMSException arg0) {
		System.out.println("jms exception detected "+arg0.getMessage());
		
	}

}
