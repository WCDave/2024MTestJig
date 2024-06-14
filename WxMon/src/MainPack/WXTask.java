package MainPack;

import java.util.TimerTask;

import Foundation.DTList;
import SocketPort.CSData;
import SocketPort.CommServer;
import SocketPort.SocketPort;

public class WXTask extends TimerTask {
    
    WebQuery aWXQuery = new WebQuery();
    CSData aDataObject = new CSData();
    
    CommServer aCommServer;
    WXServer aWXServer;
    DTList aList;
    
    //http://meteocentre.com/cgi-bin/get_sao_stn?STN=KPHL&DELT=100
    public WXTask(){
        
    }
    public void run() {        
        aWXQuery.setStation("KPHL");
        aWXQuery.setType(WebQuery.METEO);
        aWXQuery.setHour(1);
        aWXQuery.setFunctionString("GET /cgi-bin/get_sao_stn?");
        aList = aDataObject.messageList();
        aList.add(aWXQuery.getQuery());
        aDataObject.setPortNumber(80);
        aDataObject.setPortType(SocketPort.HTTP_CGI);
        aDataObject.setSiteName("meteocentre.com");
        aDataObject.setSocketType(SocketPort.TCP);
        aDataObject.setWaitForResponse(true);
        aDataObject.setParseOperationSelector(WXServer.GET_ONE_RECORD);
        aDataObject.setExpectedResponseSize(2000);
        aCommServer = (CommServer)CommServer.sharedInstance(CommServer.sharedInstanceName());
        if(aCommServer.comTransaction(aDataObject)){
            aWXServer = (WXServer)WXServer.sharedInstance(WXServer.sharedInstanceName());          
            aWXServer.parseMetarOutput(aDataObject);
        }
        else{
            ;
        }
    }
}
