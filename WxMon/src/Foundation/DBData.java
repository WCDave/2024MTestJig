/*
 * Created on May 14, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package Foundation;

import java.sql.Connection;

/**
 * @author WCDave
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class DBData {
//int aType, String aDBName,String userName, String passWord)//
    String entityName = new String();
    private String userName;
	private String password;
	private String connectString;
	private String databaseArea;
	private Connection connection;
	
	public DBData(){
	    
	}

    private void setDatabaseArea(String databaseArea) {
        this.databaseArea = databaseArea;
    }
    private void setConnectString(String connectString) {
        this.connectString = connectString;
    }
    private String connectString() {
        return connectString;
    }
    private Connection connection(){
        return connection;
    }
    private void setPassword(String password) {
        this.password = password;
    }
    private String password() {
        return password;
    }
    private void setUserName(String userName) {
        this.userName = userName;
    }
    private String userName() {
        return userName;
    }
    private String databaseArea() {
        return databaseArea;
    }

public String entityName(){
    return entityName;
}
public void setEntityName(String aString){
    entityName = String.copyValueOf(aString.toCharArray());
    return;
}
}
