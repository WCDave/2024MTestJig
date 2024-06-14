package appMonitor;

import java.util.Properties;

import javax.jms.JMSException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import jmsStuff.GeneConsole;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import config.ConfigurationManager;

public class StartupListener implements ServletContextListener, ApplicationContextAware {
	
	
	private GeneConsole geneConsole;
	private ServletContext servletContext;
	private ApplicationContext applicationContext;
	
	public StartupListener()
	{
		//rocketConsole = new RocketConsole();
		geneConsole = new GeneConsole();
	}

	
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		servletContext = null;
	}

	
	public void contextInitialized(ServletContextEvent arg0) {
		servletContext = arg0.getServletContext();
		//servletContext.setAttribute("rocketConsole", rocketConsole);
		servletContext.setAttribute("geneConsole", geneConsole);
		System.out.println(System.getProperties().entrySet());
		try {
			//rocketConsole.run();
			geneConsole.run();
		} catch (JMSException e) {
			e.printStackTrace();
		}
		
//		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		List list = (List)appContext.getBean("imgList");
//		int i=0;
		

	}


	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		this.applicationContext = arg0;
		
	}

}
