/*
 * Created on May 23, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package Foundation;

import java.util.Calendar;
import java.util.Date;

/**
 * @author WCDave
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class STDate {
private int month;
private int day;
private int year;
private int hour;
private int minutes;
private int seconds;

public STDate(){
    
}
public void setMonth(int month) {
    this.month = month;
}
public void setMonth(String month) {
    this.month = Integer.valueOf(month).intValue();
}
public int month() {
    return month;
}
public void setDay(int day) {
    this.day = day;
}
public void setDay(String day) {
    this.day = Integer.valueOf(day).intValue();
}
public int day() {
    return day;
}
public void setYear(int year) {
    this.year = year;
}
public void setYear(String year) {
    this.year = Integer.valueOf(year).intValue();
}
public int year() {
    return year;
}
public void setHour(int hour) {
    this.hour = hour;
}
public void setHour(String hour) {
    this.hour = Integer.valueOf(hour).intValue();
}
public int hour() {
    return hour;
}
public void setMinutes(int minutes) {
    this.minutes = minutes;
}
public void setMinutes(String minutes) {
    this.minutes = Integer.valueOf(minutes).intValue();
}
public int minutes() {
    return minutes;
}
public void setSeconds(int seconds) {
    this.seconds = seconds;
}
public void setSeconds(String seconds) {
    this.seconds = Integer.valueOf(seconds).intValue();
}
public int seconds() {
    return seconds;
}
public Calendar calendar(){
    Calendar aCal = Calendar.getInstance();
    aCal.set(Calendar.MONTH,month);
    aCal.set(Calendar.DAY_OF_MONTH,day);
    aCal.set(Calendar.YEAR,year);
    aCal.set(Calendar.HOUR_OF_DAY,hour);
    aCal.set(Calendar.MINUTE,minutes);
    aCal.set(Calendar.SECOND,seconds);
    return aCal;
}
public float timeAsDecimal(){
    return (float)((float)hour+(float)minutes/60.0+(float)seconds/3600.0);
}
public float dayAsDecimal(){
	Date d = new Date(this.year-1900,this.month-1,this.day,this.hour,this.minutes);
	return (float)(d.getTime()/86400000.0);
    //return (float)((float)day+(float)hour/24.0+(float)minutes/60.0+(float)seconds/3600.0);
}
public static float daysBetweenTwoDates(STDate date1, STDate date2){
    return (float)(Math.abs(date1.calendar().getTimeInMillis()-date2.calendar().getTimeInMillis())/86400000.0);
}
public float daysSinceEpoch() {
    return this.calendar().getTimeInMillis()/86400000;
}
public String dateString(){
    String aResult = new String();
    aResult = Integer.toString(month)+"/"+Integer.toString(day)+"/"+Integer.toString(year)+" "+hour+":"+minutes;
    return aResult;
}
public Date getDate(){
	//System.out.println(this.year+" "+month+" "+day+" "+hour+" "+minutes);
	return new Date(this.year-1900,this.month-1,this.day,this.hour,this.minutes);
}

}
