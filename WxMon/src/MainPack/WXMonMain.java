/*
 * Created on May 21, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package MainPack;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Time;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageOutputStream;
import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Foundation.DTList;
import Foundation.STDate;
import SocketPort.CSData;
import SocketPort.CommServer;
import SocketPort.SocketPort;


public class WXMonMain implements ActionListener {
    String selectStationGraphing = new String();
    MyComponent mc; 
    public static int manualInput = 0;
    public static String autoStation="KPHL";
    public static int autoDuration=200;
    JTextField stationId = new JTextField();
    JTextField hours = new JTextField();
    JCheckBox tempCheck = new JCheckBox("Temperature",true);
    JCheckBox dpCheck   = new JCheckBox("Dew Point",true);
    JCheckBox windSpdCheck = new JCheckBox("Wind Speed",true);
    JCheckBox windDirectionCheck = new JCheckBox("Wind Direction",true);
    JCheckBox pressCheck = new JCheckBox("Pressure",true);
    
    JFrame f;
    JMenuBar aMenuBar = new JMenuBar();
    JMenu menu0 = new JMenu("File");
    JMenu menu1 = new JMenu("Station Loader");
    JMenu menu2 = new JMenu("Graphing");
    JMenuItem menu2Item0 = new JMenuItem("Select Station",java.awt.event.KeyEvent.VK_ENTER);
    JMenuItem menu1Item0 = new JMenuItem("Load");
    JMenuItem menu0Item0 = new JMenuItem("Exit");
    public static void main(String[] args) {
        if(args.length>0)
	        if(args[0].equalsIgnoreCase("-A")){
	            manualInput = 0;
	            if(args.length>1)
	                autoStation = args[1].toUpperCase();
	            if(args.length==3)
	                autoDuration = Integer.parseInt(args[2]);
	        }
        WXMonMain x = new WXMonMain();
        x.commandLinePlotting();
        System.exit(0);
    }
    public WXMonMain(){        
    	GraphicsEnvironment ge = GraphicsEnvironment.
    	   getLocalGraphicsEnvironment();

//    	GraphicsConfiguration gc  = ge.getDefaultScreenDevice().getDefaultConfiguration();
//    	System.setProperty("java.awt.headless", "false");
    	
    	if(this.manualInput == 0){
    		mc = new MyComponent(new Dimension(800,800));
        	mc.setPreferredSize(new Dimension(800,800));
        	mc.setVisible(true);
        	mc.repaint();
    		
    	}
    	else
    	{
    		
    	
    	f = new JFrame("WXMonitor");
    	f.setSize(800,800); 
    	mc = new MyComponent(new Dimension(800,800));
    	mc.setPreferredSize(new Dimension(f.getWidth(),f.getHeight()-50));
        
        mc.setVisible(true);
    	f.setJMenuBar(aMenuBar);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        f.getContentPane().setLayout(new FlowLayout());
        f.getContentPane().add(mc);
        f.setVisible(true);
        f.pack();    
    	}
        /*DBServer aDBServer = (DBServer)DBServer.sharedInstance(DBServer.sharedInstanceName());
        aDBServer.setDbName("davedb");
        aDBServer.setDbUserName("qsut");
        aDBServer.setDbPassWord("qsut");
        aDBServer.setDbType(DBServer.ORACLE);
        Connection aConnection = aDBServer.connectToDB();
	    aDBServer.setDefaultConnection(aConnection);
        //aDBServer.buildModelFromDB();
       // aDBServer.writeModelToFile();*/
        menu2Item0.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER,0));
        menu0.add(menu0Item0);
        menu1.add(menu1Item0);
        menu2.add(menu2Item0);
        aMenuBar.add(menu0);
        aMenuBar.add(menu1);
        aMenuBar.add(menu2);        
        aMenuBar.add(stationId);
        aMenuBar.add(hours);
        tempCheck.setForeground(Color.RED);
        dpCheck.setForeground(Color.green);
        windSpdCheck.setForeground(Color.blue);
        pressCheck.setForeground(Color.cyan);
        windDirectionCheck.setForeground(Color.BLACK);
        aMenuBar.add(tempCheck);
        aMenuBar.add(dpCheck);
        aMenuBar.add(windSpdCheck);
        aMenuBar.add(windDirectionCheck);
        aMenuBar.add(pressCheck);
        aMenuBar.add(Box.createHorizontalStrut(75));
        menu0Item0.addActionListener(this);
        menu1Item0.addActionListener(this);
        menu2Item0.addActionListener(this);
        aMenuBar.setToolTipText("A Menu");
        
        
       
        
        
        stationId.setVisible(false);
        hours.setVisible(false);
        //Timer aWxTimer = new Timer();
        //TimerTask aTask = new WXTask();
        //aWxTimer.schedule(aTask,0,1000*60*60);        
        
        //commandLinePlotting();
      /*while(true){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mc.blankImage();
        mc.setMessage("waiting");
    }*/
    }
	public BufferedImage commandLinePlotting() {
		BufferedImage bi=null;
		if(manualInput == 0){
            //System.loadLibrary("Qutil");
            //f.setExtendedState(JFrame.ICONIFIED);
            stationId.setText(autoStation);
            graphDataFor(getStationData((int)Math.abs(autoDuration)>200?200:(int)Math.abs(autoDuration)));
            Graphics2D g2 = (Graphics2D)mc.im.getGraphics();
            g2.setColor(Color.BLACK);
            g2.drawString(Calendar.getInstance().getTime().toGMTString()+"  "+autoStation.toUpperCase()+" for last "+autoDuration+" hrs   Red=Temp, Green=Dew Point, Lt Blue=Press, Blue=Wind Spd",10,10);
            bi = (BufferedImage)mc.im;
            String[] p = bi.getPropertyNames();
            File outfile = new File("wximage.jpg");
            FileImageOutputStream fios=null;
            try {
                fios = new FileImageOutputStream(outfile);
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            try {
                ImageIO.write(bi, "jpg", fios);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(manualInput != 0)
            	f.setVisible(false);
//            try {
//                SocketPort.ftpSend("members.verizon.net","wximage.jpg");
//            } catch (Exception e1) {
//                System.out.println(e1.getMessage());
//            }
            //System.exit(0);
        }
		return bi;
	}
    class MyComponent extends JPanel {
        private String message=new String();
        private BufferedImage im;
        private Graphics2D gfx;
        private Dimension sizeDim;
        public MyComponent(Dimension d){
            sizeDim = d;
        }
        public void paint(Graphics g){
            if(im==null){
            	im = new BufferedImage(800, 800, BufferedImage.TYPE_3BYTE_BGR);
                //im = this.createImage(this.getWidth(),this.getHeight());
                gfx=(Graphics2D)im.getGraphics();
                gfx.setColor(Color.WHITE);
                gfx.fillRect(0,0,sizeDim.width, sizeDim.height);
                //gfx.setColor(Color.BLACK);
            }
            g.drawImage(im,0,0,this);
        }
        public synchronized void update(Graphics g){
        	if(im==null){
        		im = new BufferedImage(800, 800, BufferedImage.TYPE_INT_RGB);
                gfx=(Graphics2D)im.getGraphics();
                gfx.setColor(Color.WHITE);
                gfx.fillRect(0,0,sizeDim.width, sizeDim.height);
                //gfx.setColor(Color.BLACK);
            }
            g.drawImage(im,0,0,this);
            return;
        }
        public void setMessage(String aMessage) {
            this.message = aMessage+"-"+new Time(System.currentTimeMillis()).toGMTString();
            gfx().setColor(Color.BLACK);
            gfx().drawString(message,1,10);
            gfx().setColor(Color.WHITE);
            repaint();
        }
        public String message() {
            return message;
        }
        public Graphics2D gfx() {
        	if(im==null){
        		im = new BufferedImage(800, 800, BufferedImage.TYPE_INT_RGB);
                gfx=(Graphics2D)im.getGraphics();
                gfx.setColor(Color.WHITE);
                gfx.fillRect(0,0,sizeDim.width, sizeDim.height);
            }
            return gfx;
        }
        public void blankImage(){
        	im = new BufferedImage(800, 800, BufferedImage.TYPE_INT_RGB);
            gfx=(Graphics2D)im.getGraphics();
            gfx.setColor(Color.WHITE);
            gfx.fillRect(0,0,sizeDim.width, sizeDim.height);            
        }
    }
   
    public void actionPerformed(ActionEvent arg0) {
       List<Metar> aMetarList;
       if(arg0.getActionCommand() == "Load")
           loadStationInfo();
       else if(arg0.getActionCommand() == "Exit")
           System.exit(0);
       else if(arg0.getActionCommand() == "Select Station")
           if(stationId.isVisible()){
               aMetarList=getStationData(Integer.valueOf(hours.getText().trim()).intValue());
               graphDataFor(aMetarList);
           }
           stationId.setVisible(!stationId.isVisible());
           hours.setVisible(!hours.isVisible());
       return;
    }
    public void loadStationInfo(){
        WXServer aWXServer = (WXServer)WXServer.sharedInstance(WXServer.sharedInstanceName());   
        WebQuery aQuery = new WebQuery();
        aQuery.setFunctionString("GET /data/nsd_cccc.txt");
        CSData aDataObject = new CSData();
        aDataObject.setPortNumber(SocketPort.HTTP);
        aDataObject.setPortType(SocketPort.HTTP_CGI);
        aDataObject.setSiteName("weather.noaa.gov");
        aDataObject.setSocketType(SocketPort.TCP);
        aDataObject.messageList().add(aQuery.getQuery());
        aDataObject.setWaitForResponse(true);
        aDataObject.setExpectedResponseSize(550000);
        aDataObject.setPortType(SocketPort.HTTP_FILE);
        CommServer aCommServer = (CommServer)CommServer.sharedInstance(CommServer.sharedInstanceName());
        if(aCommServer.comTransaction(aDataObject))
            aWXServer.parseStationDataFor(aDataObject);
    }
    public List<Metar> getStationData(int aDuration){
        String aResult=null;
        WebQuery aWXQuery = new WebQuery();
        CSData aDataObject = new CSData();
        CommServer aCommServer;
        WXServer aWXServer;
        DTList aList;
        aResult = stationId.getText();
        if(aResult.trim() =="")
            aResult = "KPHL";
        aWXQuery.setStation(aResult);
        aWXQuery.setType(WebQuery.RAP);
        if(aDuration>0)
           aWXQuery.setHour(aDuration);
        else
           aWXQuery.setHour(24);
        //aWXQuery.setFunctionString("GET /cgi-bin/get_sao_stn?");
        aList = aDataObject.messageList();
        aList.add(aWXQuery.getQuery());
        aDataObject.setPortNumber(SocketPort.HTTP);
        aDataObject.setPortType(SocketPort.HTTP_CGI);
        aDataObject.setSiteName("weather.rap.ucar.edu");
        aDataObject.setSocketType(SocketPort.TCP);
        aDataObject.setWaitForResponse(true);
        aDataObject.setParseOperationSelector(WXServer.GET_ALL_AVAILABLE);
        aDataObject.setExpectedResponseSize(2000*aWXQuery.hour()/6+200);
        aCommServer = (CommServer)CommServer.sharedInstance(CommServer.sharedInstanceName());
        if(aCommServer.comTransaction(aDataObject)){
            aWXServer = (WXServer)WXServer.sharedInstance(WXServer.sharedInstanceName());          
            aWXServer.parseMetarOutput(aDataObject);
        }
        //aDataObject.resultList().sortByDate();
        Collections.sort(aDataObject.resultList());
        Metar aMetar=null;
        /*for(int i=0;i<aDataObject.resultList().size();i++){
            aMetar = (Metar)aDataObject.resultList().get(i);
            System.out.println(aMetar.date().dateString()+" "+aMetar.temperature()+" "+aMetar.dewPoint()+" "+ aMetar.pressure()+" "+aMetar.windSpeed()+" "+aMetar.windDirection());
        }*/
        return aDataObject.resultList();
    }
    public void graphDataFor(List<Metar> aMetarList){
        Metar aMetar;
        if(aMetarList.size() == 0)
            return;
        float lim=300;
        //aMetar = (Metar)aMetarList.getLast();
        aMetar = aMetarList.get(aMetarList.size()-1);
        STDate xMax = aMetar.date();
        STDate xMin=null;
        int idx=0;
        while(idx<aMetarList.size() && lim>=200){
	        aMetar = (Metar)aMetarList.get(idx++);
	        xMin = aMetar.date();
	        lim=STDate.daysBetweenTwoDates(xMax,xMin);
	        //System.out.println("lim="+lim);
        }
        mc.blankImage();
        if(tempCheck.isSelected())
            graphItem(xMin,xMax,aMetarList,tempCheck);
        if(dpCheck.isSelected())
            graphItem(xMin,xMax,aMetarList,dpCheck);
        if(windSpdCheck.isSelected())
            graphItem(xMin,xMax,aMetarList,windSpdCheck);
        if(windDirectionCheck.isSelected())
            graphItem(xMin,xMax,aMetarList,windDirectionCheck);
        if(pressCheck.isSelected())
            graphItem(xMin,xMax,aMetarList,pressCheck);
        return;
    }
    
    public void graphItem(STDate min, STDate max, List<Metar> metarList, JCheckBox aCheckBox) {
        int aCount = metarList.size();
        Graphics2D g2 = mc.gfx();
        float newX=0;float newY=0;
        float oldX, oldY;
        Metar aMetar, previousMetar=null;
        String  checkBoxText = aCheckBox.getText();
        float dx = STDate.daysBetweenTwoDates(max,min)*30;
        //System.out.println("d1="+min.getDate()+", d2="+max.getDate()+", dx="+dx);
        //dx = 375/(dx);
        g2.setColor(Color.BLACK);
        g2.drawLine(50,800-120,50,800-700); //y-axis
        g2.drawLine(50,800-120,50+700,800-120); //x-axis
        g2.setColor(Color.WHITE);
        mc.repaint();
        Dimension aDim = new Dimension((int)dx/15,(int)dx/15);
        WXServer aWXServer = (WXServer)WXServer.sharedInstance(WXServer.sharedInstanceName()); 
        for(int i=0;i<aCount;i++){
            oldX=newX;oldY=newY;
            aMetar = (Metar)metarList.get(i);
            //System.out.print("curdate="+aMetar.date().dayAsDecimal());
            if(previousMetar!=null){
            	float deltat=aMetar.date().dayAsDecimal()-previousMetar.date().dayAsDecimal();
            	if(deltat<=2)
            	    newX=(float)(deltat)*dx+newX;
            	//System.out.println(", prev="+previousMetar.date().dayAsDecimal()+", anewx="+newX+", deltat="+(deltat));
            }
            if(checkBoxText == "Temperature"){
                g2.setColor(Color.RED);
                newY=(aMetar.temperature()+30)*10;
                //System.out.println(newY+" "+aMetar.temperature());
            }
                else if(checkBoxText == "Dew Point"){
                    g2.setColor(Color.GREEN);
                    newY=(aMetar.dewPoint()+30)*10;
                    //System.out.println(newY+" "+aMetar.dewPoint());
                }
                     else if(checkBoxText == "Wind Speed"){
                         g2.setColor(Color.BLUE);
                         newY=aMetar.windSpeed()*10;
                     }
                          else if(checkBoxText == "Pressure"){	                          
                              g2.setColor(Color.CYAN);
                              newY=(aMetar.pressure()-28)*100;
                          }                          
	                          
            if(oldX!=-999 ){
                if(checkBoxText != "Wind Direction"){
                	//g2.setColor(Color.BLACK);
	                g2.drawLine((int)oldX+50,(int)(680-oldY),(int)newX+50,(int)(680-newY));
	                mc.repaint();
                }
                else {           
                	g2.setColor(Color.BLACK);
                    aWXServer.drawWindBarb((int)newX+50, 200, aMetar, aDim, g2);
                }
            }
            previousMetar=aMetar;
         }
     } 
}
