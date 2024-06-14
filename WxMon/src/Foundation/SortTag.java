/*
 * Created on Jul 2, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package Foundation;

import java.lang.reflect.Method;

public class SortTag implements DataTypes {
private Class sortClass;
private Method sortField;
private int returnType;
public SortTag(){
    
}
public void setSortClass(Class sortClass) {
    this.sortClass = sortClass;
}
public Class sortClass() {
    return sortClass;
}
public void setSortField(String sortField) {   
    Class aType;
     try {
        this.sortField = sortClass.getMethod(sortField,null);
        aType = this.sortField.getReturnType();
        if(aType == long.class)
            setReturnType(T_LONG);
            else if(aType == int.class)
                setReturnType(T_INTEGER);
                else if(aType == float.class)
                    setReturnType(T_FLOAT);
                    else if(aType == STDate.class)
                        setReturnType(T_DATE);
        
    } catch (SecurityException e) {
        e.printStackTrace();
    } catch (NoSuchMethodException e) {
        e.printStackTrace();
    }        
}
public Method sortField() {
    return sortField;
}
public void setReturnType(int returnType) {
    this.returnType = returnType;
}
public int returnType() {
    return returnType;
}
}
