
package MainPack;

import java.io.Serializable;
import java.sql.Date;
import java.util.Calendar;

import Foundation.STDate;

public class Metar implements Serializable, Comparable {
    private int windSpeed;
    private int windDirection;
    private float temperature;
    private float dewPoint;
    private float pressure;
    private STDate date = new STDate();
    private Calendar calTime = Calendar.getInstance();
    private String ident;
    public Metar() {
        
    }
    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }
    public int windSpeed() {
        return windSpeed;
    }
    public void setWindDirection(int windDirection) {
        this.windDirection = windDirection;
    }
    public int windDirection() {
        return windDirection;
    }
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    public float temperature() {
        return temperature;
    }
    public void setDewPoint(float dewPoint) {
        this.dewPoint = dewPoint;
    }
    public float dewPoint() {
        return dewPoint;
    }
    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
    public float pressure() {
        return pressure;
    }
    public void setCalTime(Calendar time) {
        this.calTime = time;
    }
    public Calendar calTime() {
        return date.calendar();
    }
    public void setIdent(String ident) {
    	if(ident.equals("854Z")){
    		int jj=8;
    	}
        this.ident = ident;
    }
    public String ident() {
        return ident;
    }
    public void setDate(STDate date) {
        this.date = date;
        calTime = this.date.calendar();
    }
    public STDate date() {
        return date;
    }
    public float relativeHumidity(){
        //%result = $calc((((112-0.1*$calc(%t)+$calc(%td))/(112+0.9*$calc(%t)))^8)*100)
        return 0;
    }
	public int compareTo(Object arg0) {
		Metar o = (Metar)arg0;
		return date().getDate().compareTo(o.date().getDate());
	}
}
