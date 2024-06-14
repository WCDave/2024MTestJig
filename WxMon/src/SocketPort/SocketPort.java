package SocketPort;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.regex.Pattern;

import Foundation.DTList;
import Foundation.SharedResource;
import MainPack.WXMonMain;

public class SocketPort extends SharedResource {
    protected int port;
    protected int socketType;
    String addr = new String();
    public final static int Datagram = 1;
    public final static int TCP = 0;
    public final static int Server = 1;
    public final static int Client = 0;
    public final static int HTTP_CGI = 0;
    public final static int HTTP_FILE = 1;
    /*---------- Port Types ------------------------*/
    public final static int FTP = 21;
    public final static int HTTP = 80;
    public SocketPort(){
        super();        
    }
    public void setSocketType(int aType){
        socketType = aType;
        return;
    }
    public int socketType(){
        return socketType;
    }
    public int port(){
        return port;
    }
    public void setPortType(int aType){
        port = aType;
        //if(port == Server){
        //    startListenThread();
        //} 
        return;
    }
    public static String sharedInstanceName(){
    	return SocketPort.class.getName();
    }
    /*public void startListenThread(){
        try {
            ServerThread aThread = new ServerThread("Dave");
            aThread.setDataObjectAddr("Got it");
            aThread.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
    public void initSocketPortFor(CSData aDataObject){
        port = aDataObject.portNumber();
        addr = aDataObject.siteName();
        socketType = aDataObject.socketType();
        
    }
    public boolean connectAndSendUsing(CSData aDataObject){
        switch (socketType){
             case 0 : return connectAndSendToTCP(aDataObject);                      
             case 1 : return connectAndSendToDG(aDataObject);                      
        }
        return false;
    }
    public boolean connectAndSendToTCP(CSData aDataObject){
        Socket s=null;
        PrintWriter out=null;
        BufferedReader in;
        int readSize;
        int readPos;
        DTList anInputMessageList = aDataObject.messageList();
        DTList aResponseList = aDataObject.responseList();
        int inputCount = anInputMessageList.size();
        String aMessage;
        String aResponse;
        char[] charArray = new char[aDataObject.expectedResponseSize()*100];
        for(int i=0;i<inputCount;i++){
            aMessage = (String)anInputMessageList.get(i);
	        try {
	            s = new Socket(addr,port);
	            out = new PrintWriter(s.getOutputStream(), true);
	    		in = new BufferedReader(new InputStreamReader(s.getInputStream()),charArray.length);
	        } catch (UnknownHostException e) {
	            System.err.println("Unable to resolve "+addr);
	            return false;
	        } catch (IOException e) {
	            System.err.println("Unable to connect to "+addr+" on port "+port);
	            return false;
	        }        	
			out.println(aMessage);
			System.out.println(aMessage+"    "+new Date());
			readSize=0;
			readPos=0;
			if(aDataObject.waitForResponse()){                    
                try {
                    while(!in.ready())
                        Thread.sleep(100);
                    while(readSize!=-1 && readPos<aDataObject.expectedResponseSize()){
                       readSize=in.read(charArray,readPos,charArray.length-readPos);
                       //System.out.println(readPos+"  "+readSize);
                       readPos=readPos+readSize;
                    }
                    
                    String station = WXMonMain.autoStation;
                    String workString = new String(charArray).toUpperCase();
                    int startPos = workString.indexOf(station);
                    int endPos = workString.indexOf("</SPAN>");
                    workString = workString.substring(startPos, endPos);
                    charArray = workString.toCharArray();
                    char[] resultArray = new char[charArray.length];
                    for(int k=0;k<charArray.length-startPos;k++)
                    {
                    	resultArray[k] = charArray[k+startPos];
                    }
                    //System.out.println("=="+String.copyValueOf(charArray));
                    aResponseList.add(charArray);
                    FileOutputStream fos = new FileOutputStream("test.txt");
                    PrintStream ps = new PrintStream(fos);
                    ps.print(charArray);
                    ps.flush();fos.flush();
                    ps.close();fos.close();
                    //System.exit(0);
                } catch (Exception e1) {
                	System.err.print(e1.getCause().getLocalizedMessage());
                    return false;
                }            
			}
        }
        try {
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out = null;
        in = null;
		return true;
    }
    public boolean connectAndSendToDG(CSData aDataObject){
        /*DatagramSocket s=null;
        DatagramPacket p=null;
        byte[] buf = message.getBytes();
        
        try {
            p = new DatagramPacket(buf,buf.length,InetAddress.getByName(addr),port);
            s = new DatagramSocket();
            s.send(p);
        } catch (UnknownHostException e) {
            return false;
        } catch (SocketException e) {
            return false;
        } catch (IOException e) {
            return false;
        }*/
        return true;
    }
    public static boolean ftpSend(String address, String fileName) throws Exception{
        char[] charArray = new char[1000];
        byte[] byteArray = new byte[70000];
        final Pattern addrAndPort = Pattern.compile("\\d,\\d,\\d,\\d,\\d,\\d");
        //(a1,a2,a3,a4,p1,p2)
        try {
            FileInputStream fis = new FileInputStream(fileName);
            try {
                fis.read(byteArray);
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        try {
            Socket s = new Socket(address,SocketPort.FTP);
            PrintWriter out = new PrintWriter(s.getOutputStream(),true);
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()),charArray.length);
            while(!in.ready())
                Thread.sleep(100);
            in.read(charArray);
            out.println("USER vze2s2s2");
            while(!in.ready())
                Thread.sleep(100);
            in.read(charArray);
            out.println("PASS hea73her");
            while(!in.ready())
                Thread.sleep(100);
            in.read(charArray);
            out.println("CWD public_html");
            while(!in.ready())
                Thread.sleep(100);
            in.read(charArray);
            out.println("TYPE I");
            while(!in.ready())
                Thread.sleep(100);
            in.read(charArray);
            out.println("PASV");
            while(!in.ready())
                Thread.sleep(100);
            in.read(charArray);
            String aString = new String(charArray).substring(27);
            aString = aString.substring(0,aString.indexOf(")"));
            String[] pString = new String[6];
            pString = aString.split(",");
            int aPort = Integer.parseInt(pString[4])*256+Integer.parseInt(pString[5]);
            Socket imgSock = new Socket("members.verizon.net",aPort);
            DataOutputStream ds = new DataOutputStream(imgSock.getOutputStream());
            
            out.println("STOR "+fileName.toLowerCase());    
            ds.write(byteArray);
            ds.flush();
            ds.close();
            s.close();
            
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
