package servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeansException;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.ws.transport.http.MessageDispatcherServlet;

public class CustomMessageDispatcherServlet extends MessageDispatcherServlet {

	
	public CustomMessageDispatcherServlet()
	{
		super();
		//this.doPost(request, response)
	}
	
	@Override
	public  WebApplicationContext initWebApplicationContext() throws BeansException
	{
		return super.initWebApplicationContext();
		
	}
	
	@Override
	public void doService(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception
	{
		super.doService(httpServletRequest, httpServletResponse);
	}
}
