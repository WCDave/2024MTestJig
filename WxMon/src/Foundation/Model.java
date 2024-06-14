
package Foundation;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.LinkedList;

public class Model implements DataTypes,Serializable {
    private LinkedList entityList;
    private String userName;
	private String password;
	private String connectString;
	private String databaseArea;

    private void setDatabaseArea(String databaseArea) {
        this.databaseArea = databaseArea;
    }
    private void setConnectString(String connectString) {
        this.connectString = connectString;
    }
    private String connectString() {
        return connectString;
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
public LinkedList entityList(){
    if(entityList == null)
        entityList = new LinkedList();
    return entityList;
}
public void setEntityList(LinkedList aList){
    entityList = aList;
    return;
}
}
