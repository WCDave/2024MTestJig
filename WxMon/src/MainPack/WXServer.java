package MainPack;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Foundation.DBServer;
import Foundation.DTList;
import Foundation.Entity;
import Foundation.SharedResource;
import Foundation.SortTag;
import SocketPort.CSData;

/*
 * Created on May 21, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author WCDave
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

public class WXServer extends SharedResource {
    public static final int GET_ONE_RECORD = 1;
    public static final int GET_ALL_AVAILABLE = 2;
    private static final int metarType = 1;
    public static String sharedInstanceName(){
    	return WXServer.class.getName();
    }
    private static final Pattern alt = Pattern.compile("(A|Q){1}\\d{4}");
    private static final Pattern wind = Pattern.compile(" (VRB)?(\\d{5})?(G?\\d{2})?(KT)?(MPS)? "); //VRB04KT
    private static final Pattern time = Pattern.compile("\\d{6}Z");
    private static final Pattern tdp = Pattern.compile(" M?\\d{1,2}/{1}(M??\\d{0,2})? "); 
    
    private static final Pattern ident = Pattern.compile("[A-Z]{5}");
    
    public WXServer(){
        
    }
    public void parseMetarOutput(CSData aDataObject){
        parseMetarArray(aDataObject);
        if(aDataObject.isParsed()){
            buildMetarsFor(aDataObject);
        }
        return;
    }
    public void parseMetarArray(CSData aDataObject){
        DTList aPreParseList = aDataObject.responseList();
        List aParsedList   = aDataObject.parsedResponseList();
        char[] anArray;
        char[] outputArray;
        char aResult;
        int lineCount;
        int idx1,idx2;
        idx1=0;
        int pCount = aPreParseList.size();
        for(int i=0;i<pCount;i++){
            anArray = (char[])aPreParseList.get(i);
            //idx1=skipLines(anArray,idx1,13);
            switch (aDataObject.parseOperationSelector()){
                case WXServer.GET_ALL_AVAILABLE :
                    while(idx1+1<anArray.length && anArray[idx1+1]!='/'){
                    	outputArray = new char[5000];
                        idx1=getOneLine( anArray, outputArray, idx1);
                        idx1=skipLines(anArray,idx1,1);
                    	aParsedList.add(String.copyValueOf(outputArray).trim());
                    }
                    break;
                case WXServer.GET_ONE_RECORD:{
                	outputArray = new char[5000];
                    idx1=getOneLine( anArray, outputArray, idx1);
                    aParsedList.add(String.copyValueOf(outputArray).trim());
                    break;
                }
            }            
            aDataObject.setIsParsed(true);
        }
        return;
    }
    public int skipLines(char[] anArray,int startIdx,int numLines){
        int idx=startIdx;
        int lineCount=0;
        while(lineCount<numLines && idx<anArray.length){
            if(anArray[idx] == '\n')
                lineCount++;
            idx++;
        }
        return idx;
    }
    public int getOneLine(char[] anArray, char[] x, int startIdx){        
        int i=0;
        while(startIdx<anArray.length-1 && (anArray[startIdx]!='<' && anArray[startIdx]!='$')){
        	if(anArray[startIdx]!='\n')
        	{
        		x[i]=anArray[startIdx];
        		i++;
        	}       
        	else 
        	{
        		int jj=00;
        	}
            startIdx++;
        }
        return startIdx;
    }
    public void buildMetarsFor(CSData aDataObject){
        List aList = aDataObject.parsedResponseList();
        List<Metar> aResultList = aDataObject.resultList();
        //aResultList.setContentsClass(Metar.class);
        SortTag aTag = new SortTag();
        aTag.setSortClass(Metar.class);
        aTag.setSortField("date");
        //aResultList.setSortTag(aTag);
        Metar aMetar;
        String aResult;
        String workString = new String();
        String aTest = new String();
        int aCount = aList.size();
        System.out.println(aCount);
        Date d = new Date();
        
        int today = new Date(d.getTime()+d.getTimezoneOffset()*60*1000).getDate();
        for(int i=0;i<aCount-1;i++){
            aTest = (String)aList.get(i);
            //System.out.println("aTest= "+aTest);
            if(aTest.substring(0,1).equals("<") )
            	continue;
           
            aMetar = new Metar();
            aMetar.setIdent(aTest.substring(0,4));
            Matcher altMatch = alt.matcher(aTest);
            if(altMatch.find()){
                workString = altMatch.group().trim().substring(1);
                if(altMatch.group().trim().contains("A"))
                	aMetar.setPressure(Float.valueOf(workString).floatValue()/100);
                else
                	aMetar.setPressure(Float.valueOf(workString).floatValue()/33.8638f);
            }
            
            boolean metric = false;
            Matcher windMatch = wind.matcher(aTest);
            workString = null;
            if(windMatch.find()){
            	try{
                workString = windMatch.group().trim().substring(0,5);
            	}
            	catch (StringIndexOutOfBoundsException e)
            	{
            		System.out.println(">> WIND Fault >>>>>>> "+aTest+" <<<<<<<<<<");
            	}
                metric = windMatch.group().contains("MPS");
            }
            
            if(workString!=null){
            	if(!workString.contains("VRB"))
            		aMetar.setWindDirection(Integer.valueOf(workString.substring(0,3)).intValue());
            	else
            		aMetar.setWindDirection(-1);
            	if(metric)
            	{
            		aMetar.setWindSpeed((int)(Integer.valueOf(workString.substring(3)).intValue()*1.94384449));
            	}
            	else
            	{	                
	                aMetar.setWindSpeed(Integer.valueOf(workString.substring(3)).intValue());
            	}
            }
            Matcher timeMatch = time.matcher(aTest);
            if(timeMatch.find()){
            	workString = timeMatch.group().substring(0,6);
            	int day = Integer.parseInt(workString.substring(0,2));
            	int month=Calendar.getInstance().getTime().getMonth()+1;
            	if(day>today){
            		month--;
            		//System.out.println("sw "+workString);
            	}
                aMetar.date().setMonth(month);
                aMetar.date().setYear(Calendar.getInstance().getTime().getYear()+1900);
                aMetar.date().setDay(day);
                aMetar.date().setHour(workString.substring(2,4));
                aMetar.date().setMinutes(workString.substring(4));
                //System.out.println(workString);
            }
            Matcher tdpMatch = tdp.matcher(aTest);
	   		
	   		if(tdpMatch.find())
	   		{
	   			String testStr = tdpMatch.group();
	   			String[] s = tdpMatch.group().trim().split("/");
		   		if(s.length>1)
		   		{	float mult = 1;
		   		    String temp = s[0];
		   			if(temp.contains("M"))
		   			{	temp = s[0].replace('M', ' ').trim();
		   				mult = -1;
		   			}
		   			aMetar.setTemperature(mult*Float.valueOf(temp));
		   			
		   			mult = 1;
		   			temp = s[1];
		   			if(temp.contains("M"))
		   			{
		   				temp = s[1].replace('M', ' ').trim();
		   				mult = -1;
		   			}
		   			aMetar.setDewPoint(mult*Float.valueOf(temp));
		   		}
		   		else
		   		{
		   			float mult = 1;
		   		    String temp = s[0];
		   			if(temp.contains("M"))
		   			{	temp = s[0].replace('M', ' ').trim();
		   				mult = -1;
		   			}
		   			aMetar.setTemperature(mult*Float.valueOf(temp));
		   		}
	   		}
	   		 
//            if(tdpMatch.find()){
//                workString = tdpMatch.group();
//                //System.out.println(workString+">>>"+workString.substring(1,4)+" "+workString.substring(4));
//                if(workString.substring(1,2).equals("M")){
//                	aMetar.setTemperature(-Float.valueOf(workString.substring(2,4)).floatValue());
//                	if(workString.substring(5,6).equals("M"))
//                		aMetar.setDewPoint(-Float.valueOf(workString.substring(6)).floatValue());
//                	else{          
//                		//System.out.println(workString.substring(5,6)+"---"+workString.substring(5));
//                		aMetar.setDewPoint(Float.valueOf(workString.substring(5)).floatValue()); 
//                	}
//                }
//                else{
//                   aMetar.setTemperature(Float.valueOf(workString.substring(1,3)).floatValue());
//                  // System.out.println(workString.substring(4,5));
//                   if(workString.substring(4,5).equals("M"))
//                	   aMetar.setDewPoint(-Float.valueOf(workString.substring(5)).floatValue());
//                   else
//                	   aMetar.setDewPoint(Float.valueOf(workString.substring(4)).floatValue());
//                }        
//                
//            }
            aResultList.add(aMetar);
        }
        
       /* for(int i=0;i<aResultList.size();i++){
            aMetar = (Metar)aResultList.get(i);
            System.out.println(aMetar.date().dateString()+" "+aMetar.temperature()+" "+aMetar.dewPoint()+" "+ aMetar.pressure()+" "+aMetar.windSpeed()+" "+aMetar.windDirection());
        }*/
        return;
    }
    public void parseStationDataFor(CSData aDataObject){
        char[] anArray = (char[])aDataObject.responseList().getFirst();
        int idx1=0;
        int idx2=0;
        int recordCount=0;
        boolean found=false;
        boolean parseFinished=false;
        String pString[] = {"","","","","","","","","","","","","",""};
        String aRawLine;
        //rip off header
        DBServer aDBServer =(DBServer)DBServer.sharedInstance(DBServer.sharedInstanceName());
        Entity anEntity = aDBServer.entityForName("STATION_DATA");
        while(!found){
            found=anArray[idx1+idx2]=='\n';
            idx1++;
        }
        while(!parseFinished){
            found=false;
            idx2=0;
            while(!found){
                found=anArray[idx1+idx2]=='\n';
                idx2++;
            }
            recordCount++;
            aRawLine=null;
            aRawLine = new String(anArray,idx1,idx2-3);
            pString=aRawLine.split(";",14);
            idx1=idx2+idx1;
            parseFinished=anArray[idx1]=='\0';
        }
        System.out.println(recordCount);
        return;
    }
    public void drawWindBarb(int x, int y, Metar aMetar, Dimension d, Graphics2D g2){
        float rad = 0;
        if(aMetar.windSpeed()>0 && aMetar.windDirection()>0)
            rad=(float)(d.getWidth()+d.getHeight());
        float theta = (float)Math.toRadians(90-aMetar.windDirection());
        //System.out.println(aMetar.windDirection());
        //theta = (float)Math.PI/2;
        g2.drawLine(x,y,x+(int)(rad*Math.cos(theta)),y-(int)(rad*Math.sin(theta)));
        return;
    }
}
