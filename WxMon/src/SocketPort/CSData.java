/*
 * Created on May 21, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package SocketPort;

import java.util.ArrayList;
import java.util.List;

import Foundation.DTList;
import MainPack.Metar;

/**
 * @author WCDave
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CSData {
   private int portType; //http,etc
   private int portNumber;
   private String siteName;
   private DTList messageList = new DTList();
   private DTList responseList = new DTList();
   private DTList parsedResponseList = new DTList();
   private List<Metar> resultList = new ArrayList<Metar>();
   private boolean waitForResponse;
   private int socketType;
   private int parseOperationSelector;
   private boolean isParsed=false;
   private int expectedResponseSize=2000;
   
public void setPortType(int portType) {
    this.portType = portType;
}
public int portType() {
    return portType;
}
public void setPortNumber(int portNumber) {
    this.portNumber = portNumber;
}
public int portNumber() {
    return portNumber;
}
public void setSiteName(String siteName) {
    this.siteName = siteName;
}
public String siteName() {
    return siteName;
}
public void setMessageList(DTList messageList) {
    this.messageList = messageList;
}
public DTList messageList() {
    return messageList;
}
public void setResponseList(DTList responseList) {
    this.responseList = responseList;
}
public DTList responseList() {
    return responseList;
}
public void setSocketType(int socketType) {
    this.socketType = socketType;
}
public int socketType() {
    return socketType;
}
public void setWaitForResponse(boolean waitForResponse) {
    this.waitForResponse = waitForResponse;
}
public boolean waitForResponse() {
    return waitForResponse;
}
public void setParseOperationSelector(int parseOperationSelector) {
    this.parseOperationSelector = parseOperationSelector;
}
public int parseOperationSelector() {
    return parseOperationSelector;
}
public void setParsedResponseList(DTList parsedResponseList) {
    this.parsedResponseList = parsedResponseList;
}
public List parsedResponseList() {
    return parsedResponseList;
}
public void setIsParsed(boolean isParsed) {
    this.isParsed = isParsed;
}
public boolean isParsed() {
    return isParsed;
}
public void setExpectedResponseSize(int expectedResponseSize) {
    this.expectedResponseSize = expectedResponseSize;
}
public int expectedResponseSize() {
    return expectedResponseSize;
}
public void setResultList(DTList aList) {
    this.resultList = aList;
}
public List<Metar> resultList() {
    return resultList;
}

}
