package Foundation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;

public class DTList extends LinkedList implements DataTypes{
    private SortTag sortTag;
    private Class contentsClass;
    
public DTList(){
    
}

public void setContentsClass(Class contentsClass) {
    this.contentsClass = contentsClass;
}
public Class contentsClass() {
    return contentsClass;
}
public void setSortTag(SortTag sortTag) {
    this.sortTag = sortTag;
}
public SortTag sortTag() {
    return sortTag;
}
public boolean sortList(){
    if(sortTag == null)
        return false;
    Method meth =null;
    Object val1, val2,temp;
    boolean flipIt = false;    
    try {
        meth = sortTag.sortField();
    } catch (SecurityException e) {
        e.printStackTrace();
    }
    int listSize = this.size()-1;
    for(int i=listSize;i>=0;i--){
        for(int j = 1;j<=i;j++){
            try {
                val1 = meth.invoke(this.get(j),null);
                val2 = meth.invoke(this.get(j-1),null);
                switch (sortTag.returnType()){
                    case T_LONG: {
                        flipIt = ((Long)val2).longValue()>((Long)val1).longValue();
                        break;
                    }
                    case T_FLOAT: {
                        flipIt = ((Float)val2).floatValue()>((Float)val1).floatValue();
                        break;
                    }
                    case T_INTEGER: {
                        flipIt = ((Integer)val2).intValue()>((Integer)val1).intValue();
                        break;
                    }
                    case T_DATE: {
                        flipIt = ((STDate)val2).daysSinceEpoch()>((STDate)val1).daysSinceEpoch();
                        break;
                    }
                }
                if(flipIt) {
                    temp = this.get(j-1);
                    this.set(j-1,this.get(j));
                    this.set(j,temp);
                }
            } catch (IllegalArgumentException e1) {
                e1.printStackTrace();
            } catch (IllegalAccessException e1) {
                e1.printStackTrace();
            } catch (InvocationTargetException e1) {
                e1.printStackTrace();
            }
        }
    }
    return true;
}
public void invertList(){
    Object anObject;
    int listSize = this.size()/2;
    for(int i=0;i<listSize;i++){
        anObject = this.get(i);
        this.set(i,this.get(listSize-i));
        this.set(listSize-i-1,anObject);
    }
    return;
}
}
