/*
 * Created on May 14, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package Foundation;

import java.io.Serializable;
import java.util.LinkedList;

public class Entity implements DataTypes,Serializable{
    private LinkedList propertyList;
    private LinkedList relationList;
    private String entityName = new String();
    private LinkedList dataObjectList;
    
public Entity(){
        
}
    
public LinkedList propertyList(){
    if(propertyList ==null)
        propertyList = new LinkedList();
    return propertyList;
}
public void setPropertyList(LinkedList aList){
    propertyList = aList;
    return;
}
public LinkedList relationList(){
    if(relationList ==null)
        relationList = new LinkedList();
    return relationList;
}
public void setRelationList(LinkedList aList){
    relationList = aList;
    return;
}
public String entityName(){
    return entityName;
}
public void setEntityName(String aString){
    entityName = String.copyValueOf(aString.toCharArray());
    return;
}
}
