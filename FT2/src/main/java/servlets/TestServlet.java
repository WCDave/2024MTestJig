package servlets;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.faces.context.FacesContext;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import appMonitor.ThreadStat;

import MainPack.WXMonMain;

public class TestServlet extends HttpServlet {
	
	
	private WXMonMain wx;
	private String identifier;
	/**
	 * Constructor of the object.
	 */
	
	public TestServlet() {
		super();
		wx = new WXMonMain();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	
		
		
		System.setProperty("java.awt.headless", "false"); 
		String o = System.getProperty("java.awt.headless");
		FacesContext facesContext = FacesContext.getCurrentInstance();  
		
			
		System.out.println("&&&& "+ThreadStat.getInstance().getSessionId());
		
		int duration = -1;
		try {
		   duration = Integer.parseInt(request.getParameter("duration"));
		}
		catch (NumberFormatException e)
		{
			
		}

		if(duration<0)
		     WXMonMain.autoDuration=Integer.parseInt("120");
		
		String ident = request.getParameter("identifier");
		String test = this.getServletContext().getInitParameter("Identifier");
		if(ident == null || "".equals(ident.trim()))
		{
			ident = (String)request.getSession().getAttribute("identifier");
		}
	    
		String station=null;
		if(ident == null || "".equals(ident))
		{
		    station = getServletConfig().getInitParameter("Identifier");
		}
		else
		{
			if(request.getAttribute("ADD") != null)
				ident = "k"+ident;
			station = ident;
		}
		WXMonMain.autoStation=station.toUpperCase();
		WXMonMain.manualInput=0;
		BufferedImage bi = null;
		try {
			bi=wx.commandLinePlotting();
		}
		catch(Exception e)
		{
			return ;
		}
		
		//wx=null;
		//System.gc();
		response.setIntHeader("Refresh",30);
		response.setContentType("image/jpeg");
		System.out.println("Session id="+request.getSession().getId()+" request IP="+request.getRemoteAddr());
		OutputStream out = response.getOutputStream();
		
		ImageIO.write(bi,"jpg", out);
		out.flush();
		out.close();
		bi=null;
		//System.gc();
		
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occure
	 */
	public void init() throws ServletException {
		// Put your code here
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getIdentifier() {
		return identifier;
	}

  @Override
  protected void doOptions(HttpServletRequest req, HttpServletResponse resp)
          throws ServletException, IOException {
    setAccessControlHeaders(resp);
    resp.setStatus(HttpServletResponse.SC_OK);
  }

  private void setAccessControlHeaders(HttpServletResponse resp) {
    
    resp.setHeader("Access-Control-Allow-Origin", "*");
    resp.setHeader("Access-Control-Allow-Methods", "*");
    resp.setHeader("Access-Control-Max-Age", "72000");
    resp.setHeader("Access-Control-Allow-Headers", "*");

  }

}
