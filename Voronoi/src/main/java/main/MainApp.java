package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.border.Border;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import domain.Circle;
import domain.Edge;
import domain.IGridOps;
import domain.IMetarWrapper;
import domain.impl.GridOpsImpl;
import domain.impl.MetarWrapperImpl;
import gfxmain.GFXException;
import gfxmain.GFXFramework;
import gfxmain.VisSpect;
import mapUtils.MapHelper;
import met.METAR;
import service.IVoronoiService;
import stat.Station;

public class MainApp extends JFrame implements FocusListener, AdjustmentListener {

	// http://www.aviationweather.gov/dataserver
	// http://www.qc.edu.hk/math/Advanced%20Level/circle%20given%203%20points.htm
	// https://codegolf.stackexchange.com/questions/50299/draw-an-image-as-a-voronoi-map
	// http://www.aviationweather.gov/dataserver
	private GFXFramework gfx;
	private final static int SCREEN_WIDTH = 1200;
	private final static int SCREEN_HEIGHT = 1150;
	private MetarWrapperImpl grid[][];
	private IVoronoiService service;


	private Map<IMetarWrapper, Point2D.Float> pointMetarMap = new HashMap<IMetarWrapper, Point2D.Float>();

	private ApplicationContext appContext = new GenericXmlApplicationContext("classpath:voronoi-appContext.xml");

	public static void main(String[] args) {
		MainApp app = new MainApp();
		app.execute();
		// System.exit(0);
	}

	public MainApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setLayout(null);
		this.setBackground(Color.BLACK);
		setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		setSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT)); 		
		
		try {
			gfx = new GFXFramework(this, true, new Dimension(5000,5000), true);
//			gfx.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		} catch (GFXException e) {
			e.printStackTrace();
		}
		
   
        gfx.getJScrollPane().getViewport().setBackground(Color.PINK);

		gfx.addFocusListener(this);
		gfx.init();
		gfx.setAnimate(false);       	
		
		gfx.getJScrollPane().getVerticalScrollBar().addAdjustmentListener(this);
		gfx.getJScrollPane().getHorizontalScrollBar().addAdjustmentListener(this);
		
//		this.pack();
		
		this.setTitle(""+new java.util.Date());

	}

	public void execute() {
		service = appContext.getBean(IVoronoiService.class);
		List<String>  statList = null;;
		try {
			statList = service.getStationList("K","C","P","T","M","S");
//			statList = service.getStationList("K");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<METAR> metars = service.callWebService(statList);
//    Collections.shuffle(metars);
//    metars = metars.subList(0, 20);
		grid = processMetars(metars);
		IGridOps<Number, Double> g = new GridOpsImpl<Number>(grid);
		generateCircles();
		metars = null;

		Graphics2D g2 = gfx.getG2();
		g2.setColor(Color.cyan);
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] != null) {
					if(metarIsValid(grid[i][j].getMetar())) {
						g2.setColor(Color.cyan);
					}
					else {
						g2.setColor(Color.white);
					}
					g2.drawLine(i, j, i, j);
				}
			}
		}

		gfx.getG2().setColor(Color.orange);
		gfx.getG2().drawRect(2500, 2500, 50, 50);
		gfx.update();		
		gfx.setSaveImage();
//		gfx.setAnimate(true);
		System.out.println("Done.");

	}

	private void generateCircles() {
		Set<Circle> result = new HashSet<Circle>();

		List<IMetarWrapper> metars = new ArrayList<IMetarWrapper>(pointMetarMap.keySet());

		Graphics2D g2 = gfx.getG2();
		g2.setColor(Color.red);

		for (int i = 0; i < metars.size(); i++) {
			for (int j = i + 1; j < metars.size(); j++) {
				for (int k = j + 1; k < metars.size(); k++) {
					IMetarWrapper m1 = metars.get(i);
					IMetarWrapper m2 = metars.get(j);
					IMetarWrapper m3 = metars.get(k);

					Circle c = service.createCircle(pointMetarMap.get(m1), pointMetarMap.get(m2),
							pointMetarMap.get(m3));
					if (circleIsValid(c)) {
						if (result.add(c)) {
							for (Circle c1 : result) {
								if (!c1.equals(c)) {
									Collection<?> intersection = CollectionUtils.intersection(c.getPointSet(),
											c1.getPointSet());
									if (intersection.size() == 2) {
										int[] p1 = new int[] { (int) c1.getX(), (int) c1.getY() };
										int[] p2 = new int[] { (int) c.getX(), (int) c.getY() };
										if (intersection.contains(pointMetarMap.get(m1))) {
											m1.getEdges().add(
													new Edge(new Point(p1[0], p1[1]), new Point(p2[0], p2[1]), m1));
										}
										if (intersection.contains(pointMetarMap.get(m2))) {
											m2.getEdges().add(
													new Edge(new Point(p1[0], p1[1]), new Point(p2[0], p2[1]), m2));
										}
										if (intersection.contains(pointMetarMap.get(m3))) {
											m3.getEdges().add(
													new Edge(new Point(p1[0], p1[1]), new Point(p2[0], p2[1]), m3));
										}

										System.out.println(i + ", " + j + ", " + k + " --- " + result.size());
									}
								}
							}
						}
//            g2.setColor(Color.gray);
//            Shape theCircle = new Ellipse2D.Double(c.getX()-c.getRadius(), c.getY()- c.getRadius(), 2.0 * c.getRadius(), 2.0 * c.getRadius());
//            g2.draw(theCircle);
//            gfx.update();
					}
				}
			}
		}
		g2.setColor(Color.red);
		for (int i = 0; i < metars.size(); i++) {
			g2.setColor(Color.red);
			IMetarWrapper m1 = metars.get(i);

			Polygon p = m1.getVoronoiPolygon();
			if (m1.getCentroid() != null) {
				g2.setColor(Color.yellow);
				g2.drawLine(m1.getCentroid().x, m1.getCentroid().y, m1.getCentroid().x, m1.getCentroid().y);
			}
			g2.setColor(Color.red);
			if (p != null) {
				g2.draw(p);
				float mapVal = VisSpect.mapValueRangeIntoWavelengths(m1.getMetar().getAltimInHg(), 28.0f, 32f);
				System.out.println(m1.getMetar().getAltimInHg() + " --- " + mapVal);
				Color c = VisSpect.getSpectralColor(mapVal);
				g2.setColor(c);
				g2.fill(p);
			}
//    	
			gfx.update();
		}
	}

	private boolean circleIsValid(Circle c) {
		boolean found = false;
		for (IMetarWrapper mw : pointMetarMap.keySet()) {
			if (c == null || c.contains(pointMetarMap.get(mw))) {
				found = true;
				break;
			}
		}
		return !found;
	}

	private MetarWrapperImpl[][] processMetars(List<METAR> metars) {
		MetarWrapperImpl[][] result = new MetarWrapperImpl[SCREEN_WIDTH][SCREEN_HEIGHT];
		int XDISP = 0;
		int YDISP = 0;
		for (METAR m : metars) {
			if (metarIsValid(m)) {
				int[] mapPosition = MapHelper.getFlatMapCoordsLatLong(m.getLatitude(), m.getLongitude(),
						new Dimension((int) (SCREEN_WIDTH * 2.7), (int) (SCREEN_HEIGHT * 2.7)));
				MetarWrapperImpl mw = new MetarWrapperImpl(m);

				mapPosition[0] = mapPosition[0] + XDISP;
				mapPosition[1] = mapPosition[1] + YDISP;
				mw.setGridPoint(new Point(mapPosition[0], mapPosition[1]));
//        System.out.println(mapPosition[0] + " " + mapPosition[1]);

				if (mapPosition[0] > 0 && mapPosition[0] < result.length && mapPosition[1] > 0
						&& mapPosition[1] < result[0].length) {
					pointMetarMap.put(mw, new Point2D.Float(mapPosition[0], mapPosition[1]));
					result[mapPosition[0]][mapPosition[1]] = mw;
				}
			}
		}
		return result;
	}

	private boolean metarIsValid(METAR m) {
		return m.getLatitude() != null && 
				m.getLongitude() != null && 
				m.getAltimInHg() != null && 
				Math.abs(m.getLatitude()) <= 90 && Math.abs(m.getLongitude()) <= 180 &&
				m.getAltimInHg() > 20 &&
				m.getAltimInHg() < 33;
	}

	@Override
	public void focusGained(FocusEvent e) {
		gfx.update();
	}

	@Override
	public void focusLost(FocusEvent e) {

	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		gfx.update();	
//		System.out.println(jsp.getViewport().getViewRect().x+" :  "+jsp.getViewport().getViewRect().y);
	}

}
