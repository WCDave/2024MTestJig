package beans;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jmsStuff.RocketConsole;

import org.springframework.context.ApplicationContext;
import org.springframework.web.jsf.FacesContextUtils;

import MainPack.WXMonMain;

import com.icesoft.faces.async.render.Renderable;
import com.icesoft.faces.async.render.SessionRenderer;
import com.icesoft.faces.context.ByteArrayResource;
import com.icesoft.faces.context.DisposableBean;
import com.icesoft.faces.webapp.xmlhttp.PersistentFacesState;
import com.icesoft.faces.webapp.xmlhttp.RenderingException;

public class TestBean implements Renderable, DisposableBean {

	private String testingString;

	private Integer number;

	private List<String> imageList;

	private PersistentFacesState state;

	private static final String RENDER_GROUP = "testBeanRG";
	private String imageName;
	private ByteArrayResource bar = new ByteArrayResource(new byte[5]);

	public TestBean() {
		state = PersistentFacesState.getInstance();
		SessionRenderer.addCurrentSession(RENDER_GROUP);
	}

	public TestBean(List<String> imageList) {
		this.imageList = imageList;
	}

	public BufferedImage getImage() {
		FacesContext context = FacesContext.getCurrentInstance();

		WXMonMain wx = new WXMonMain();
		WXMonMain.autoDuration = Integer.parseInt("100");
		// String station = getServletContext().getInitParameter("Identifier");
		// WXMonMain.autoStation=station;

		WXMonMain.manualInput = 0;
		BufferedImage bi = wx.commandLinePlotting();
		return bi;
	}

	public String getImageURL() {
		FacesContext context = FacesContext.getCurrentInstance();

		HttpServletRequest request = (HttpServletRequest) (context
				.getExternalContext().getRequest());

		HttpSession sess = request.getSession();
		if (testingString != null && testingString.length() == 3) {
			testingString = "K" + testingString.toUpperCase();
		}
		sess.setAttribute("identifier", testingString);
		return "/TestServlet";
	}

	public String getPsImage() {
		ApplicationContext ctx = FacesContextUtils
				.getWebApplicationContext(FacesContext.getCurrentInstance());

		// List<String> list = (List<String>)ctx.getBean("imgList");

		int i = Math.min(imageList.size() - 1,
				(int) (Math.random() * (imageList.size() + 1)));
		return imageList.get(i);
	}

	public void setTestingString(String aString) {
		testingString = aString;
	}

	public String getTestingString() {
		return testingString;
	}

	public String getIndexString() {
		return "punt";
	}

	public String rocketData() {
		return "rocketData";
	}

	public String getRetString() {
		return "kick";
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getNumber() {
		return number;
	}

	public void updateImage(ValueChangeEvent event) {
		String newValue = (String) event.getNewValue();

		WXMonMain wx = new WXMonMain();
		WXMonMain.autoDuration = Integer.parseInt("120");

		WXMonMain.autoStation = newValue.toUpperCase();
		WXMonMain.manualInput = 0;
		BufferedImage bi = null;
		try {
			bi = wx.commandLinePlotting();
			bi.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			ImageIO.write(bi, "jpg", baos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setImageName(newValue);
		this.setBar(new ByteArrayResource(baos.toByteArray()));
		try {
			baos.flush();
			baos.close();
		} catch (Exception e) {
		}
		//SessionRenderer.render(RENDER_GROUP);
	}

	public List<StringPair> getItems() {
		List<StringPair> result = new ArrayList<StringPair>();
		ApplicationContext ctx = FacesContextUtils
				.getWebApplicationContext(FacesContext.getCurrentInstance());

		// List<String> list = (List<String>)ctx.getBean("imgList");

		String string1 = null;
		String string2 = null;
		for (int i = 0; i < imageList.size(); i++) {
			if ((i & 0x001) == 1) {
				string1 = imageList.get(i);
			} else {
				string2 = imageList.get(i);
			}
			if (string1 != null && string2 != null || i == imageList.size() - 1) {
				result.add(new StringPair(string1, string2));
				string1 = null;
				string2 = null;
			}
		}
		return result;

	}

	public synchronized Map getData() {
		Map result = null;
		FacesContext context = FacesContext.getCurrentInstance();

		HttpServletRequest request = (HttpServletRequest) (context
				.getExternalContext().getRequest());
		RocketConsole console = (RocketConsole) request.getSession()
				.getServletContext().getAttribute("rocketConsole");

		result = new HashMap(console.getRocketData());
		return result;
	}

	public synchronized List<StringPair> getDataAsList() {
		Map<String, String> result = null;
		List<StringPair> resultList = new ArrayList<StringPair>();
		FacesContext context = FacesContext.getCurrentInstance();

		HttpServletRequest request = (HttpServletRequest) (context
				.getExternalContext().getRequest());
		RocketConsole console = (RocketConsole) request.getSession()
				.getServletContext().getAttribute("rocketConsole");

		result = new HashMap<String, String>(console.getRocketData());

		for (Map.Entry pair : result.entrySet()) {
			System.out.println(pair.getKey() + " " + pair.getValue());
			Object key = pair.getKey();
			String s1 = key.toString();
			String s2 = ((Double) pair.getValue()).toString();
			resultList.add(new StringPair(s1, s2));
		}
		return resultList;
	}

	public Object[] getKeyList() {
		FacesContext context = FacesContext.getCurrentInstance();

		HttpServletRequest request = (HttpServletRequest) (context
				.getExternalContext().getRequest());
		RocketConsole console = (RocketConsole) request.getSession()
				.getServletContext().getAttribute("rocketConsole");
		return console.getRocketData().keySet().toArray();
	}

	public void setImageList(List<String> imageList) {
		this.imageList = imageList;
	}

	public List<String> getImageList() {
		return imageList;
	}

	public PersistentFacesState getState() {
		return state;
	}

	
	public void renderingException(RenderingException arg0) {
		// TODO Auto-generated method stub

	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getImageName() {
		return imageName;
	}
	
	public String getJs()
	{
		return null;
	}

	

	public void dispose() throws Exception {
		SessionRenderer.removeCurrentSession(RENDER_GROUP);

	}

	public void setBar(ByteArrayResource bar) {
		this.bar = bar;
	}

	public ByteArrayResource getBar() {
		return bar;
	}
}