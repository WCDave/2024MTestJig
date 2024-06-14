package servlets;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import appMonitor.ThreadStat;

public class IdentFilter implements Filter {

	
	public void destroy() {
		// TODO Auto-generated method stub

	}

	
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		String ident = arg0.getParameter("identifier");
		if(ident != null && ident.length()<4)
		{
			System.out.println(">>>>>>>>>*******filtering");
			arg0.setAttribute("identifier", "K"+arg0.getParameter("identifier"));
			ident = "K"+ident;
			arg0.setAttribute("ADD", "K");
		}
		//System.out.println(((HttpServletRequest)arg0).getRequestURI());
		ThreadStat threadStat = new ThreadStat();
		threadStat.setURI(((HttpServletRequest)arg0).getRequestURI());
		threadStat.setSessionId(((HttpServletRequest)arg0).getSession().getId());
		threadStat = ThreadStat.getInstance();		
		System.out.println(((HttpServletRequest)arg0).getRequestURI()+" "+threadStat.hashCode()+" --- "+ ((HttpServletRequest)arg0).getRemoteHost());
		arg2.doFilter(arg0, arg1);

	}

	
	public void init(FilterConfig arg0) throws ServletException {
		

	}

}
