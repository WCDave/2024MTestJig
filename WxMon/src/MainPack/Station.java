/*
 * Created on May 21, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package MainPack;

import java.io.Serializable;
import Foundation.DTList;

/**
 * @author WCDave
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Station implements Serializable {
    private DTList metarList;
    private float latitude;
    private float longitude;
    private float elevation;
    private String country = new String();
    private String state = new String();
    private String identifier = new String();
    private String name = new String();
    public Station(){
        
    }
    private void setMetarList(DTList metarList) {
        this.metarList = metarList;
    }
    private DTList metarList() {
        return metarList;
    }
    private void setLatitude(float latitude) {
        this.latitude = latitude;
    }
    private float latitude() {
        return latitude;
    }
    private void setLongitude(float longitude) {
        this.longitude = longitude;
    }
    private float longitude() {
        return longitude;
    }
    private void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    private String identifier() {
        return identifier;
    }
    private void setName(String name) {
        this.name = name;
    }
    private String name() {
        return name;
    }
    public void setElevation(float elevation) {
        this.elevation = elevation;
    }
    public float elevation() {
        return elevation;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String country() {
        return country;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String state() {
        return state;
    }
}
