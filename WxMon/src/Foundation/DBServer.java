
package Foundation;

import oracle.jdbc.driver.OracleDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;



public class DBServer extends SharedResource{
	
	public static final int ORACLE=1;
	public static final int ACCESS=2;
	protected String DBPortName=null;
	protected int DBPort;
	protected Hashtable DBHash = new Hashtable();
	protected Connection defaultConnection=null;
	private Model dbModel;
	private int dbType;
	private String dbName = new String();
	private String dbUserName = new String();
	private String dbPassWord = new String();
	private Hashtable entityHash=new Hashtable();
	
	public static String sharedInstanceName(){
    	return DBServer.class.getName();
    }
	public DBServer(){
	    super();
	    Environment anEnv = (Environment)Environment.sharedInstance(Environment.sharedInstanceName());
	    String aString = anEnv.StringForKey("Model_Location");
	    if(aString !=null)
	        dbModel = loadModel(aString);
	}
	public int dbType(){
	    return dbType;
	}
	public void setDbType(int aType){
	    dbType=aType;
	    return;
	}
	public String dbName(){
	    return dbName;
	}
	public void setDbName(String aType){
	    dbName=String.copyValueOf(aType.toCharArray());
	    return;
	}
	public String dbUserName(){
	    return dbUserName;
	}
	public void setDbUserName(String aType){
	    dbUserName=String.copyValueOf(aType.toCharArray());
	    return;
	}
	public String dbPassWord(){
	    return dbPassWord;
	}
	public void setDbPassWord(String aType){
	    dbPassWord=String.copyValueOf(aType.toCharArray());
	    return;
	}
	public void setDBPort(int aPort){
		DBPort = aPort;
		return;
	}
	public int DBPort(){
		return DBPort;
	}
	public Hashtable DBHash(){
		return DBHash;
	}
	public void setDefaultConnection(Connection aConnection){
		defaultConnection = aConnection;
		this.DBHash().put("default",defaultConnection);
		return;
	}
	public Connection defaultConnection(){
		return defaultConnection;
	}
	public void setdbModel(Model aModel){
	    dbModel = aModel;
	}
	public Model dbModel(){
	    return dbModel;
	}
	public java.sql.Connection connectToDB(DBData anObject){
	    Connection con = (Connection)DBHash.get(anObject.entityName());
	    if(con==null){
	        con = connectToDB();
	        this.DBHash().put(anObject.entityName(),con);
	    }
	    return con;
	}
	public java.sql.Connection connectToDB() {
		Connection con=null;
		String aConnectString = new String();
		if (con==null){
			switch (dbType) {
			   case ORACLE:
			   {
			   	   //aConnectString ="jdbc:oracle:thin:@HAL-9000:1521:"+dbName;
                   //aConnectString ="jdbc:oracle:thin:@crdsupportsrv3:1521:"+aDBName;
			   	   aConnectString = "jdbc:oracle:oci8:@"+dbName;
			   	   try {
					   DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
					   con = DriverManager.getConnection(aConnectString,dbUserName,dbPassWord);
				   } catch (SQLException e) {
					   e.printStackTrace();
				   }
				   break;
			   }
			   case ACCESS:
			   {
			   	    aConnectString="jdbc:odbc:"+dbName;
	        		try {
	        			DriverManager.registerDriver(new OracleDriver());
						//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					    con = DriverManager.getConnection(aConnectString,dbUserName,dbPassWord);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
			   }		   
			}
		}
		return con;
	}	
	public boolean createBlankTableFromDataObject(Object aDataObject, int aDBType,Connection aConnection){
		String aTableName = aDataObject.getClass().getConstructors()[0].getName();
		String sql_string="select count(*) from user_tables where table_name ='";
		ResultSet rs=null;
		DatabaseMetaData dbm=null;
		String aStrResult=null;
		int aResult=0;
		boolean returnValue=false;
		String[] strarray = {"TABLE"};
		if(aConnection == null)
			aConnection=defaultConnection;
		if (aTableName.indexOf(".")!=0){
			aTableName=aTableName.substring(aTableName.indexOf(".")+1);
		}
		sql_string=sql_string+aTableName.toUpperCase()+"'";
		Statement aStatement=null;
		try {
			aStatement = aConnection.createStatement();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			 rs = aStatement.executeQuery(sql_string);
			 rs.next();
			 aResult=rs.getInt("count(*)");
			 returnValue=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return returnValue;
	}
	public boolean closeConnection(Connection aConnection){
		boolean aResult=false;
		if (aConnection != null){
			boolean found=false;
			Object aKey=null;
		    String aDBName;
		    String t=null;
		    int anIndex=0;
		    Hashtable h=this.DBHash();
			for(Enumeration e=h.keys();e.hasMoreElements();){
				aKey=e.nextElement();
				if(h.get(aKey).hashCode()==aConnection.hashCode()){
					h.remove(aKey);
					break;
				}
			}
			try {
				aConnection.close();
				aResult=true;
			} catch (SQLException e) {
				aResult=false;
			}
		}
		return aResult;
	}
	public void buildModelFromDB(String aSchemaName){
	    dbModel = new Model();
	    DatabaseMetaData dbm=null;
		ResultSet rs=null;
		String[] strarray = {"TABLE"};
		LinkedList anEntityList = dbModel.entityList();
		Entity anEntity;
		DBProp aProperty;
		ResultSet columnRS;
		ResultSetMetaData rsmd;
		try {
            dbm = defaultConnection.getMetaData();
            rs = dbm.getTables(null,aSchemaName,null,strarray);
            while(rs.next()){
                anEntity = new Entity();
                anEntity.setEntityName(rs.getString("TABLE_NAME"));
                columnRS = defaultConnection.createStatement().executeQuery("select * from "+anEntity.entityName());
                rsmd = columnRS.getMetaData();
                for(int i=1;i<=rsmd.getColumnCount();i++){
                    aProperty = new DBProp();
                    aProperty.setDbColumnName(rsmd.getColumnName(i));
                    aProperty.setDataType(rsmd.getColumnType(i));
                    //System.out.println(rsmd.getColumnType(i));
                    aProperty.setEntity(anEntity);
                    anEntity.propertyList().add(aProperty);
                }
                anEntityList.add(anEntity);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
	}
	public void writeModelToFile(String aFileName){
	    //String fileName = "C:\\model.mod";
	    FileOutputStream fos;
	    ObjectOutputStream oos;
	    try {
            fos = new FileOutputStream(aFileName);            
            oos = new ObjectOutputStream(fos);
            oos.writeObject(dbModel);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
	}
	public boolean beginTransactionFor(DBData aDataObject){
	    return true;
	}
	public Model loadModel(String aString){
	    Model aModel=null;
	    FileInputStream fis;
	    ObjectInputStream ois;
	    try {
            fis = new FileInputStream(aString);
            ois = new ObjectInputStream(fis);
    	    aModel = (Model)ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
	   
	    return aModel;
	}
	public Entity entityForName(String aName){
	    Entity aResult=null;
	    aResult = (Entity)entityHash.get(aName);
	    if(aResult==null){
	        String aTestName;
	        for(int i=0;i<dbModel.entityList().size();i++){
	            aResult = (Entity)dbModel.entityList().get(i);
	            aTestName = aResult.entityName();
	            if(aTestName.equals(aName)){
	                entityHash.put(aName,aResult);
	                break;
	            }
	            else
	                aResult = null;
	        }
	    }
	    return aResult;
	}
}
