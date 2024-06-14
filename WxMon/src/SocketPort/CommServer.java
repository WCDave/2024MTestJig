/*
 * Created on May 21, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package SocketPort;

import java.util.Hashtable;

import Foundation.SharedResource;

public class CommServer extends SharedResource {
    public static String sharedInstanceName(){
    	return CommServer.class.getName();
    }
    Hashtable socketPortHash = new Hashtable();
    SocketPort aSockPort;
    public CommServer(){
        
    }
    public boolean comTransaction(CSData aDataObject){
        String aKey = new String();
        aKey = Integer.toString(aDataObject.portType())+Integer.toString(aDataObject.socketType());
        if(socketPortHash.containsKey(aKey)){
            aSockPort = (SocketPort)socketPortHash.get(aKey);
        }
        else {
            aSockPort = new SocketPort();
            socketPortHash.put(aKey,aSockPort);
            aSockPort.initSocketPortFor(aDataObject);
        }
        return aSockPort.connectAndSendUsing(aDataObject);
    }
}
