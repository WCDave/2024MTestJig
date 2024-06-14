package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import jmsStuff.IRocketData;
import jmsStuff.RocketConsole;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.jsf.FacesContextUtils;

import com.icesoft.faces.async.render.Renderable;
import com.icesoft.faces.async.render.SessionRenderer;
import com.icesoft.faces.component.ext.HtmlDataTable;
import com.icesoft.faces.component.ext.HtmlInputTextarea;
import com.icesoft.faces.component.ext.OutputBody;
import com.icesoft.faces.component.selectinputtext.TextChangeEvent;
import com.icesoft.faces.context.DisposableBean;
import com.icesoft.faces.context.effects.Effect;
import com.icesoft.faces.context.effects.Highlight;
import com.icesoft.faces.webapp.xmlhttp.PersistentFacesState;
import com.icesoft.faces.webapp.xmlhttp.RenderingException;

import enums.OrbitElementKeys;



public class DataBean implements Renderable, DisposableBean {
	
	private PersistentFacesState state; 
	private static final String RENDER_GROUP = "dataBean";
	private Highlight effectOutputText = new Highlight("#ffcc99");
	
	private HtmlDataTable table;
	private OutputBody body;
	private String text;
	private PopUpBean popUpBean;
	private static final Logger log = Logger.getLogger(DataBean.class);
  private IRocketData restRocketData;

	public DataBean( PopUpBean popUpBean, IRocketData restRocketData){
		this.popUpBean = popUpBean;
		SessionRenderer.addCurrentSession(RENDER_GROUP);
    this.restRocketData = restRocketData;
	}
	
	public synchronized Map getData(){
		Map result = null;
		FacesContext context = FacesContext.getCurrentInstance();
		
		HttpServletRequest request = (HttpServletRequest) (context.getExternalContext().getRequest());  
		RocketConsole console = (RocketConsole)request.getSession().getServletContext().getAttribute("rocketConsole");
		
		result = new HashMap(console.getRocketData());
		return result;
	}
	
	
	public synchronized List<StringPair> getDataAsList(){
		Map<String,String> result = null;
		List<StringPair> resultList = new ArrayList<StringPair>();
		FacesContext context = FacesContext.getCurrentInstance();
		
//		HttpServletRequest request = (HttpServletRequest) (context.getExternalContext().getRequest());  
//		RocketConsole console = (RocketConsole)request.getSession().getServletContext().getAttribute("rocketConsole");
		WebApplicationContext ctx = FacesContextUtils.getWebApplicationContext(FacesContext.getCurrentInstance());
		FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        IRocketData console = (IRocketData)ctx.getBean("rocketConsole");
    console = restRocketData;
		
		if(console.getRocketData() != null)
		{			
			result = new HashMap<String,String>(console.getRocketData());
			result.remove(OrbitElementKeys.locMap.name());
			
			for(Map.Entry pair:result.entrySet())
			{
				//log.info(pair.getKey()+" "+pair.getValue());
				Object key = pair.getKey();
				String s1 = key.toString();
				String s2 = null;
				if(pair.getValue() instanceof Double)
					s2 = ((Double)pair.getValue()).toString();
				else
					s2 = (String)pair.getValue();
				resultList.add(new StringPair(s1, s2));
			}
		}
		
		effectOutputText = new Highlight("#E38312");
        effectOutputText.setFired(false);

		return resultList;
	}
	
	public Object[] getKeyList(){
        FacesContext context = FacesContext.getCurrentInstance();
		
		HttpServletRequest request = (HttpServletRequest) (context.getExternalContext().getRequest());  
		RocketConsole console = (RocketConsole)request.getSession().getServletContext().getAttribute("rocketConsole");
		return console.getRocketData().keySet().toArray();
	}
	
	public String getRetString()
	{
		//SessionRenderer.removeCurrentSession(RENDER_GROUP);
		return "kick";
	}
	
	/* Returns the text effect
     *@return Effect EffectOutputText
     */
    public Effect getEffectOutputText() {

        return effectOutputText;
    }

    /*
     * Sets the output text effect
     *@param Effect effectOutputText
     */
    public void setEffectOutputText(Effect effectOutputText) {
        this.effectOutputText = (Highlight) effectOutputText;
    }

	
	

	
	public PersistentFacesState getState() {
		return state;
	}

	
	public void renderingException(RenderingException arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void dispose() throws Exception {
		System.out.println("databean.dispose");
		
	}

	public void setTable(HtmlDataTable table) {
		this.table = table;
	}

	public HtmlDataTable getTable() {
		return table;
	}

	public void setBody(OutputBody body) {
		if(body != null && table != null)
			body.setFocus(table.getClientId(FacesContext.getCurrentInstance()));
		this.body = body;
	}

	public OutputBody getBody() {
		if(body != null && table != null)
			body.setFocus(table.getClientId(FacesContext.getCurrentInstance()));
		return body;
	}
	
	public String getClientId()
	{
		String aString = table.getClientId(FacesContext.getCurrentInstance());
		System.out.println(">>>>>>>> "+aString);
		return table.getClientId(FacesContext.getCurrentInstance());
	}
	
	
	
	public String getApplet()
	{
		
		//<applet codebase="/Facestest/rocketData.jspx" code="applets.RocketTracker.class" height="400" hspace="10" jreversion="1.6" type="applet" vspace="50" width="800">
        //</applet>
		String result = null;
		StringBuffer buf = new StringBuffer("<applet code=\"applets.RocketTracker\"  ");
		buf.append("height=\"800\" width=\"1600\" type=\"applet\" jreversion=\"1.6\" > </applet>");
		result = buf.toString();
		return result;
	}
	
	public void setTextArea(String area)
	{
		text = area;
	}
	
	public String getTextArea()
	{
		return text;
	}
	
	public void setTextAreaLength(String i){}
	
	public String getTextAreaLength()
	{
		String result = "0";
		if(text != null)
		{
			result = Integer.toString(text.length());
		}
		return result;
			
	}
	
	public void textAreaListener(TextChangeEvent e)
	{
		Object o = e.getNewValue();
	}
	
	private HtmlInputTextarea binding;
	public HtmlInputTextarea getTextAreaBinding()
	{
		return this.binding;
	}
	
	public void setTextAreaBinding(HtmlInputTextarea area)
	{
		this.getTextArea();
		binding = area;
	}
	
	public String enablePopUp()
	{
		popUpBean.setVisible(true);
		return null;
	}


}
