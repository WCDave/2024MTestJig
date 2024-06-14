package applets;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import enums.OrbitElementKeys;

@SuppressWarnings("serial")
public class RocketTracker extends Applet implements Runnable {

	private String displayString = new String("&&&");
	private String refName;
	private double rocketX, rocketY, rocketZ;
	private double refX, refY, refZ;

	private BufferedImage earthImage;
	private BufferedImage moonImage;
	private List<double[]> trackHistoryList;
	
	public static final float earthRadius=(float)6.37e6;
	private List<float[]> moonSignalBoundary;
	private double[] moonPos = new double[]{0,0,0,0};

	@Override
	public void init() {
		System.out.println("init");

		try {
			earthImage = ImageIO.read(new URL(getCodeBase()
					+ "img/Global_spatial_coverage_map.gif"));
			moonImage = ImageIO.read(new URL(getCodeBase()
					+ "img/moon_Moon_4K_1__Hermes.jpg"));
		} catch (IOException e) {
			System.out.println("img load failed");
		}
		trackHistoryList = new ArrayList<double[]>();
		

		Thread thread = new Thread(this);
		thread.start();
	}

	private List<float[]> createSignalBoundaryUsing(float radius, double[] pos) {
		List<float[]> resultList = new ArrayList<float[]>();
		
		double rayAngle = Math.asin(radius/VMath.mag(pos));
		float signalRadius = (float)(radius * Math.sin(Math.PI -(rayAngle + Math.PI/2)));
		float zVal = (float)(radius * Math.cos(Math.PI - (rayAngle + Math.PI/2)));
		
		CoordSys cs = new CoordSys();
		double[] zUnit = VMath.normalize(pos);
		double[] yUnit = VMath.normalize(VMath.crossprd(zUnit, VMath.vecAdd(zUnit,new double[]{0,.5,.65} )));
		double[] xUnit = VMath.crossprd(yUnit, zUnit);
		yUnit = VMath.crossprd(zUnit, xUnit);
		
		cs.setXAxis(xUnit);
		cs.setYAxis(yUnit);
		cs.setZAxis(zUnit);
		for(int i=0;i<360;i+=2)
		{
			cs.zRotate(2);
			double[] point3D = VMath.vecMultByScalar(cs.xAxis().getVectorForm(), signalRadius);
			point3D = VMath.vecAdd(point3D, VMath.vecMultByScalar(cs.zAxis().getVectorForm(), zVal));			
			resultList.add(new float[]{(float)point3D[0], (float)point3D[1], (float)point3D[2]});
		}
		
		return resultList;
	}

	public void paint(Graphics g) {
		repaint();
	}

	public void update(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;		
		
		
		//if (!"MOON".equalsIgnoreCase(refName)) {
			g2.drawImage(earthImage, 0, 0, getWidth(), getHeight(), this);
		//} else {
		//	g2.drawImage(moonImage, 0, 0, getWidth(), getHeight(), this);
		//}		
		
		moonSignalBoundary = createSignalBoundaryUsing(earthRadius, moonPos);	
		g2.setColor(Color.white);
		
		for(float[] scn:moonSignalBoundary)
		{
			Map<String,Double> screen = getScreenCoordsFor(new double[]{scn[0], scn[1], scn[2]});
			int x = (int)screen.get("X").doubleValue();
			int y = (int)screen.get("Y").doubleValue();
			g2.drawLine(x,y,x,y);			
		}		
		Map<String,Double> moonScreen = getScreenCoordsFor(new double[]{moonPos[0], moonPos[1], moonPos[2]});
		int xx = (int)moonScreen.get("X").doubleValue();
		int yy = (int)moonScreen.get("Y").doubleValue();
		g2.fillOval( xx - 3,  yy - 3, 6, 6);
		
		g2.setColor(Color.red);
		double[] rockVec = new double[]{rocketX, rocketY, rocketZ,0};
		List<float[]> rockSB = createSignalBoundaryUsing(earthRadius, rockVec);
		
		for(float[] scn:rockSB)
		{
			Map<String,Double> screen = getScreenCoordsFor(new double[]{scn[0], scn[1], scn[2]});
			int x = (int)screen.get("X").doubleValue();
			int y = (int)screen.get("Y").doubleValue();
			g2.drawLine(x,y,x,y);			
		}		
		
		Map<String, Double> dataMap = getScreenCoordsFor(new double[]{rocketX, rocketY, rocketZ});		
		double latitude = dataMap.get("PHI");	
		double longitude = dataMap.get("THETA");
		
		trackHistoryList.add(new double[]{dataMap.get("X"),dataMap.get("Y")});
		for (double[] pair : trackHistoryList) {

			g2.fillOval((int) pair[0] - 1, (int) pair[1] - 1, 2, 2);
		}
		if (trackHistoryList.size() > 3000) {
			trackHistoryList.remove(0);
		}
		g2.setColor(Color.yellow);
		g2.setFont(new Font(Font.MONOSPACED, Font.BOLD, 11));
		g2.drawString("Lat= "+String.format("%8.4f",latitude)+"   Long= "+String.format("%9.4f",longitude) , (int)(getWidth()*0.5),getHeight()-15);
	}

	@SuppressWarnings("unchecked")
	
	public void run() {
		
		while (true) {
			Map rocketData = null;
			InputStream instr = null;
			ObjectInputStream inputFromServlet = null;
			OutputStream outStream = null;
			ObjectOutputStream oos = null;
			try {
				URLConnection con = getServletConnection();
				outStream = con.getOutputStream();
				oos = new ObjectOutputStream(outStream);
				oos.writeObject("h");
				oos.flush();				
				
				// receive result from servlet
				instr = con.getInputStream();
				inputFromServlet = new ObjectInputStream(instr);
				rocketData = (Map) inputFromServlet.readObject();
				
			} catch (IOException e1) {
				e1.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			finally {
				if(inputFromServlet != null)
				{
					try {
						inputFromServlet.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
				if(instr != null)
				{
					try {
						instr.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}		
				
				if(oos != null) 
				{
					try {
						oos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
				if(outStream != null)
				{
					try {
						outStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}


			if (rocketData != null) {
				rocketX = ((Double) rocketData.get(OrbitElementKeys.rocketX))
						.doubleValue();
				rocketY = ((Double) rocketData.get(OrbitElementKeys.rocketY))
						.doubleValue();
				rocketZ = ((Double) rocketData.get(OrbitElementKeys.rocketZ))
						.doubleValue();

				refName = (String) rocketData.get(OrbitElementKeys.refName);
				refX = ((Double) rocketData.get(OrbitElementKeys.refX))
						.doubleValue();
				refY = ((Double) rocketData.get(OrbitElementKeys.refY))
						.doubleValue();
				refZ = ((Double) rocketData.get(OrbitElementKeys.refZ))
						.doubleValue();
				Map locMap = (Map)rocketData.get(OrbitElementKeys.locMap);
				moonPos = (double[])locMap.get("Moon");

			}
			repaint();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
			}
		}
	}
	
	private Map<String,Double> getScreenCoordsFor(double[] vec3D)
	{
		double x = vec3D[0];
		double y = vec3D[1];
		double z = vec3D[2];
		
		Map<String, Double> result = new HashMap<String,Double>();
		double theta = Math.acos(x / Math.sqrt(x * x + y * y));
	
		if (y < 0) {
			theta = Math.PI * 2 - theta;
		}
		// position rocket's longitude
		theta = (theta + Math.PI * 4 - getDecimalTimeOfDay() * Math.PI / 12 - Math.toRadians(170))
				% (Math.PI * 2);
		
		double phi = Math.atan(z / (Math.sqrt(x * x + y * y)));

		// LN(tan(x)+sec(x))
		// result[1] = getHeight()/2 * (1 - Math.log(Math.abs(Math.tan(phi)+
		// 1/Math.cos(phi))));
		result.put("Y", new Double(getHeight() / 2 * (1 - Math.sin(phi))));
		result.put("X", new Double(getWidth() * theta / (Math.PI * 2)));
		result.put("THETA", new Double(Math.toDegrees(theta)-180.3));
		result.put("PHI", new Double(Math.toDegrees(phi)));
		return result;
	}

	private static double getDecimalTimeOfDay() {
		Calendar c = Calendar.getInstance();
		int hr = c.get(Calendar.HOUR_OF_DAY);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		int ms = c.get(Calendar.MILLISECOND);
		double result = hr + min / 60.0 + sec / 3600.0 + ms / (3600000.0);
		return result;
	}

	private URLConnection getServletConnection()  {

		URL urlServlet = null;
		URLConnection con = null;
		try {
			urlServlet = new URL(getCodeBase(), "RocketDataServlet");
			if(urlServlet != null)
			{
				con = urlServlet.openConnection();
				con.setDoInput(true);
				con.setDoOutput(true);
				con.setUseCaches(false);
				con.setRequestProperty("Content-Type","application/x-java-serialized-object");
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public void setRocketVector(double[] vec)
	{
		rocketX = vec[0];
		rocketY = vec[1];
		rocketZ = vec[2];
	}

}
