package Foundation;
import java.lang.reflect.InvocationTargetException;
import java.util.Hashtable;



public class SharedResource {
    static Hashtable sharedResHash = new Hashtable();
     public static Object sharedInstance(String aSharedInstanceName) {
     	Object resultObject=null;
     	if (sharedResHash.containsKey(aSharedInstanceName))
            return sharedResHash.get(aSharedInstanceName);
     	else{
     		try {
     			resultObject=Class.forName(aSharedInstanceName).getConstructors()[0].newInstance(null);
			} catch (IllegalArgumentException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			} catch (InvocationTargetException e1) {
				e1.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			sharedResHash.put(aSharedInstanceName,resultObject);
			return resultObject;
     	}        
     }
}
