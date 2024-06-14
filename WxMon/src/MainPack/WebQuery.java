/*
 * Created on May 21, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package MainPack;

import java.util.Calendar;

/**
 * @author WCDave
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class WebQuery {
    public static final int WYOEDU =1;
    public static final int METEO = 2;
    public static final int RAP = 3;
    private int type=0;
    private Calendar date;
    private int hour;
    private String units;
    private String station;
    private String functionString;
    public WebQuery(){
        
    }
    public void setType(int type) {
    	/*switch(type) {
    	case RAP :station="rap.ucar.edu";break;
    	case METEO :station = "meteocentre.com";break;
    	case WYOEDU :break;
    	}*/
        this.type = type;
    }
    public int type() {
        return type;
    }
    public void setDate(Calendar date) {
        this.date = date;
    }
    public Calendar date() {
        return date;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int hour() {
        return hour;
    }
    public void setUnits(String units) {
        this.units = units;
    }
    public String units() {
        return units;
    }
    public void setStation(String station) {
        this.station = station;
    }
    public String station() {
        return station;
    }
    public void setFunctionString(String functionString) {
        this.functionString = functionString;
    }
    public String functionString() {
        return functionString;
    }
    public String getQuery(){
//      http://meteocentre.com/cgi-bin/get_sao_stn?STN=KPHL&DELT=100
        String result = functionString;
        switch (type){
           case WebQuery.WYOEDU :
		        if(type !=0)
		           result = addType(result);
		        if(date!=null)
		           result = addDate(result);
		        if(units!=null)
		           result = addUnits(result);
		        if(station!=null)
		           result = addStation(result);
		        break;
		    case WebQuery.METEO :
		        result = addStation(result);result=result+"&";
		        result = result+"DELT="+Integer.toString(hour);break;
		    case RAP: result = "GET /surface/index.php?metarIds="+station+"&hoursStr=past+"+hour+"+hours&std_trans=standard&num_metars=number&submit_metars=Retrieve";
        }
        return result;
    }
    private String addType(String result){
        result=result+"TYPE=";
        switch (type) {
            case 1:result=result+"metar&";
                   break;
        }
        return result;
    }
    private String addDate(String result){
        result=result+"DATE=";
        Calendar today = Calendar.getInstance();
        if(today.get(Calendar.YEAR)== date.get(Calendar.YEAR) &&
           today.get(Calendar.MONTH)== date.get(Calendar.MONTH) &&
           today.get(Calendar.DATE)== date.get(Calendar.DATE)){
            result = result+"current&";
        } 
        else {
            //20050520
            result = result+Integer.toString(date.get(Calendar.YEAR));
            result = result+Integer.toString(date.get(Calendar.MONTH));
            result = result+Integer.toString(date.get(Calendar.DATE))+"&";
        }
        result = result+"HOUR=";
        if(today.get(Calendar.HOUR_OF_DAY) == date.get(Calendar.HOUR_OF_DAY))
            result = result+"current&";
        else
            result=result+Integer.toString(date.get(Calendar.HOUR_OF_DAY))+"&";   
        return result;
    }
    private String addUnits(String result){
        result=result+"UNITS="+units+"&";
        return result;
    }
    private String addStation(String result){
        switch (type){
           case WebQuery.WYOEDU : result = result+"STATION="+station;break;
           case WebQuery.METEO  : result = result+"STN="+station;break;
        }
        
        return result;
    }
    
}
