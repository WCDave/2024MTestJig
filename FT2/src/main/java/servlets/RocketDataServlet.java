package servlets;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jmsStuff.IRocketData;
import jmsStuff.RocketConsole;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class RocketDataServlet extends HttpServlet {
	
//	public void doGet(HttpServletRequest request, HttpServletResponse response)
//	throws ServletException, IOException {	
//		 
//		RocketConsole console = (RocketConsole)request.getSession().getServletContext().getAttribute("rocketConsole");
//		ObjectOutputStream oos = new ObjectOutputStream(response.getOutputStream());
//		oos.writeObject(console.getRocketData());
//	}
	
	
	
    public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {	
    	try {
			response.setContentType("application/x-java-serialized-object");

			// read a String-object from applet
			// instead of a String-object, you can transmit any object, which
			// is known to the servlet and to the applet
			InputStream in = request.getInputStream();
			ObjectInputStream inputFromApplet = new ObjectInputStream(in);
			String aString = (String) inputFromApplet.readObject();

			ServletContext context = getServletContext();
			    WebApplicationContext applicationContext =  WebApplicationContextUtils.getWebApplicationContext(context);
            IRocketData console = (IRocketData)applicationContext.getBean("rocketConsole2");
			
			ObjectOutputStream oos = new ObjectOutputStream(response.getOutputStream());
			oos.writeObject(console.getRocketData());
			oos.flush();
			oos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
