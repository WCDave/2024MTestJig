package beans;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import jmsStuff.GeneConsole;

import com.icesoft.faces.async.render.Renderable;
import com.icesoft.faces.async.render.SessionRenderer;
import com.icesoft.faces.context.effects.Effect;
import com.icesoft.faces.context.effects.Highlight;
import com.icesoft.faces.webapp.xmlhttp.PersistentFacesState;
import com.icesoft.faces.webapp.xmlhttp.RenderingException;

import edu.emory.mathcs.backport.java.util.Collections;
import enums.BASE_TYPES;

public class GeneBean implements Renderable {
	
	private Highlight effectOutputText = new Highlight("#ffcc99");
	private final String RENDER_GROUP = "geneBean";
	private Comparator<String> stringLengthComparator = new Comparator<String>(){
		public int compare(String o1, String o2) {
			
			if(o1 == null || o2 == null) return 0;
			if(o1.length() >= o2.length()) return -1;
			
			return 1;
		}

	};
	
	private int totalNumberOfRows;
	
	public GeneBean(){
		SessionRenderer.addCurrentSession(RENDER_GROUP);
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
	
	public List<String> getGeneList(){
		//<span style="background-color:red;color:red;">r</span><span style="background-color:#FFFF00;color:#FFFF00;">y</span><span style="color:black;background-color:black;">||		
				final String so = "<span style=\"background-color:";
				final String cb = ";\">";
				final String sc ="</span>";
				final String ds ="\"color:black;background-color:black;\"";
				
				FacesContext context = FacesContext.getCurrentInstance();
				HttpServletRequest request = (HttpServletRequest) (context.getExternalContext().getRequest());  
				GeneConsole console = (GeneConsole)request.getSession().getServletContext().getAttribute("geneConsole");
				
				List<String> result = new ArrayList<String>();
				Vector<Vector<Map<String,String>>> vector =  console.getGeneData();
				if(vector != null)
				{
					for(Vector<Map<String,String>> vect:vector)
					{
						StringBuffer buf = new StringBuffer();
						for(Map<String,String> map:vect)
						{
							for(String key:map.keySet())
							{
								String type = BASE_TYPES.typeForHexString(key);
								buf.append(so);
								buf.append(key).append(";color:").append(key).append(cb).append(type).append(sc);
								
								String rColor = map.get(key);
								type = BASE_TYPES.typeForHexString(rColor);
								buf.append(so).append(rColor).append(";color:").append(rColor).append(cb).append(type).append(sc);
								buf.append("<span style=").append(ds).append(">").append("|").append(sc);
							}				
						}
						int res = buf.lastIndexOf("<span style=\"color:black;background-color:black;\">|</span>");
						String s = null;
						try {
						    s = buf.substring(0,res);
						
						}
						catch(StringIndexOutOfBoundsException e){}
						//System.out.println(s);
						result.add(s);
					}
				}
				Collections.sort(result, stringLengthComparator);
				effectOutputText = new Highlight("#E38312");
		        effectOutputText.setFired(false);
		        totalNumberOfRows = result.size();
				return result;
			}

	
	public PersistentFacesState getState() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void renderingException(RenderingException arg0) {
		System.out.println(arg0.getMessage());
		
	}

	public void setTotalNumberOfRows(int totalNumberOfRows) {
		this.totalNumberOfRows = totalNumberOfRows;
	}

	public int getTotalNumberOfRows() {
		return totalNumberOfRows;
	}

}
