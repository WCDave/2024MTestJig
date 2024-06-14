
package Foundation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

public class Environment extends SharedResource {
   protected Hashtable EnvHash = new Hashtable();
   public Environment(){
   	  super();
   	  boolean EOF=false;
   	  BufferedReader source=null;
   	  String aLine=null;
   	  String aKey,aValue;
   	  int anIndex;
   	  try {
   	    source = new BufferedReader(new FileReader("envir.txt"));
	  }
	  catch (IOException e) { 
		System.err.println("File not found "+e.getMessage());
	  }
	  while(!EOF) {
	  	 try {
			aLine=source.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		EOF=aLine==null;
		if(!EOF){
			anIndex=aLine.indexOf("|");
			if (anIndex>0) {
				aKey=aLine.substring(0,anIndex);
				aValue=aLine.substring(anIndex+1);
				EnvHash.put(aKey.trim(),aValue.trim());
			}
		}
	  }
   }
   public static String sharedInstanceName(){
	    return Environment.class.getName();
   }
   public String StringForKey(String aString){
       String tempString = (String)EnvHash.get(aString.trim());
       return tempString;
   }
   public boolean keyIsSet(String aString){
   	   String aValue=(String)EnvHash.get(aString.trim());
   	   if(aValue.equals("1")){
   	   	  return true;
   	   }
   	   return false;
   }
}
