/*
 * Created on May 22, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package MainPack;

import Foundation.DTList;

/**
 * @author WCDave
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class WXData {
    private DTList metarList = new DTList();
    private DTList parsedMetarDataList = new DTList();
    private int parseType;
    public WXData(){
        
    }
    public void setMetarList(DTList metarList) {
        this.metarList = metarList;
    }
    public DTList metarList() {
        return metarList;
    }
    public void setParsedMetarDataList(DTList parsedMetarDataList) {
        this.parsedMetarDataList = parsedMetarDataList;
    }
    public DTList parsedMetarDataList() {
        return parsedMetarDataList;
    }
    public void setParseType(int parseType) {
        this.parseType = parseType;
    }
    public int parseType() {
        return parseType;
    }
}
