package beans;

import java.util.Date;
import java.util.List;

import javax.faces.context.FacesContext;

import org.springframework.context.ApplicationContext;
import org.springframework.web.jsf.FacesContextUtils;

public class PopUpBean {

	private boolean visible = false;
	private Date date = new Date();

	public PopUpBean() {

	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public boolean isVisible() {
		return visible;
	}
	
	public String toggleVisible()
	{
		visible = !visible;
		return null;
	}

	@SuppressWarnings("unchecked")
	public String getImage() {
		ApplicationContext ctx = FacesContextUtils
				.getWebApplicationContext(FacesContext.getCurrentInstance());

		List<String> list = (List<String>)ctx.getBean("imgList");
		int i = Math.min(list.size()-1, (int)(Math.random()*(list.size()+1)));
		return list.get(i);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
