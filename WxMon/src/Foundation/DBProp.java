/*
 * Created on May 8, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package Foundation;

import java.io.Serializable;

public class DBProp implements DataTypes,Serializable {
private int dataType = -1;
private boolean isDataBase=true;
private String dbColumnName = new String();
private Entity entity;

public void setDataType(int aType){
    dataType = aType;
}
public int dataType(){
    return dataType;
}
public String dbColumnName(){
    return dbColumnName;
}
public void setDbColumnName(String aName){
    dbColumnName = String.copyValueOf(aName.toCharArray());
}
public void setisDataBase(boolean aFlag){
    isDataBase = aFlag;
    }
    public boolean isDataBase(){
        return isDataBase;
    }
public String dataTypeName(){
    String aResult = new String();
    switch (dataType){
      case T_BOOLEAN : aResult = "Boolean";
           break;
      case T_STRING : aResult = "String";
           break;
      case T_DATE : aResult = "Date";
           break;
      case T_INTEGER : aResult = "Integer";
           break;
    }
    return aResult;
}
public void setEntity(Entity entity) {
    this.entity = entity;
}
public Entity entity() {
    return entity;
}
}

