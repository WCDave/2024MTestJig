package main;

import domain.Circle;
import domain.IGridOps;
import domain.IMetarWrapper;
import domain.impl.GridOpsImpl;
import domain.impl.MetarWrapperImpl;
import gfxmain.GFXException;
import gfxmain.GFXFramework;
import met.METAR;
import mapUtils.MapHelper;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import service.IVoronoiService;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainApp extends JFrame {

  //http://www.aviationweather.gov/dataserver
  //http://www.qc.edu.hk/math/Advanced%20Level/circle%20given%203%20points.htm
  //https://codegolf.stackexchange.com/questions/50299/draw-an-image-as-a-voronoi-map
  //http://www.aviationweather.gov/dataserver
  private GFXFramework gfx;
  private final static int SCREEN_WIDTH = 1001;
  private final static int SCREEN_HEIGHT = 1001;
  private MetarWrapperImpl grid[][];
  private IVoronoiService service;

  private Map<IMetarWrapper, Point2D.Float> pointMetarMap = new HashMap<IMetarWrapper, Point2D.Float>();

  private ApplicationContext appContext = new GenericXmlApplicationContext("classpath:voronoi-appContext.xml");

  public static void main(String[] args) {
    MainApp app = new MainApp();
    app.execute();
    //System.exit(0);
  }

  public MainApp() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    this.setBackground(Color.BLACK);
    setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
    try {
      gfx = new GFXFramework(this, true);
    } catch (GFXException e) {
      e.printStackTrace();
    }
    gfx.init();
    gfx.setAnimate(false);

  }

  public void execute() {
    service = appContext.getBean(IVoronoiService.class);
    List<METAR> metars = service.callWebService();
//    Collections.shuffle(metars);
//    metars = metars.subList(0, 20);
    grid = processMetars(metars);
    IGridOps g = new GridOpsImpl(grid);
    generateCircles();
    metars = null;


    Graphics2D g2 = gfx.getG2();
    g2.setColor(Color.cyan);
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (grid[j][i] != null) {
          g2.setColor(Color.cyan);
          g2.drawLine(j, i, j, i);
        }
      }
    }


    gfx.update();
    System.out.println("Done.");

  }

  private void generateCircles() {
    Set<Circle> result = new HashSet<Circle>();

    List<IMetarWrapper> metars = new ArrayList(pointMetarMap.keySet());
    //Collections.shuffle(metars);
    //metars = metars.subList(0, metars.size()/2);
    Graphics2D g2 = gfx.getG2();
    g2.setColor(Color.red);

    for (int i = 0; i < metars.size(); i++) {
      for (int j = i + 1; j < metars.size(); j++) {
        for (int k = j + 1; k < metars.size(); k++) {
          IMetarWrapper m1 = metars.get(i);
          IMetarWrapper m2 = metars.get(j);
          IMetarWrapper m3 = metars.get(k);

          Circle c = service.createCircle(pointMetarMap.get(m1), pointMetarMap.get(m2), pointMetarMap.get(m3));
          if (circleIsValid(c)) {
            if (result.add(c)) {
              for (Circle c1 : result) {
                if (c1 != c) {
                  Collection intersection = CollectionUtils.intersection(c.getPointSet(), c1.getPointSet());
                  if (intersection.size() == 2) {
                    int[] p1 = new int[]{(int) c1.getX(), (int) c1.getY()};
                    int[] p2 = new int[]{(int) c.getX(), (int) c.getY()};
                    if (intersection.contains(pointMetarMap.get(m1))) {
                      m1.getVoronoiPolygon().addPoint(p2[0], p2[1]);
                    }
                    if (intersection.contains(pointMetarMap.get(m2))) {
                      m2.getVoronoiPolygon().addPoint(p2[0], p2[1]);
                    }
                    if (intersection.contains(pointMetarMap.get(m3))) {
                      m3.getVoronoiPolygon().addPoint(p2[0], p2[1]);
                    }
                    g2.drawLine(p1[0], p1[1], p2[0], p2[1]);

//              Point2D.Float p1 = (Point2D.Float) c.getPointSet().toArray()[0];
//              Point2D.Float p2 = (Point2D.Float) c.getPointSet().toArray()[1];
//              Point2D.Float p3 = (Point2D.Float) c.getPointSet().toArray()[2];
//
//              g2.setColor(Color.RED);
//              g2.drawLine((int) p1.getX(), (int) p1.getY(), (int) p2.getX(), (int) p2.getY());
//              g2.drawLine((int) p1.getX(), (int) p1.getY(), (int) p3.getX(), (int) p3.getY());
//              g2.drawLine((int) p2.getX(), (int) p2.getY(), (int) p3.getX(), (int) p3.getY());
                    gfx.update();
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
        int[] mapPosition = MapHelper.getFlatMapCoordsLatLong(m.getLatitude(), m.getLongitude(), new Dimension((int) (SCREEN_WIDTH * 2.7), (int) (SCREEN_HEIGHT * 2.7)));
        MetarWrapperImpl mw = new MetarWrapperImpl(m);

        mapPosition[0] = mapPosition[0] + XDISP;
        mapPosition[1] = mapPosition[1] + YDISP;
        System.out.println(mapPosition[0] + " " + mapPosition[1]);

        if (mapPosition[0] > 0 && mapPosition[0] < result.length && mapPosition[1] > 0 && mapPosition[1] < result[0].length) {
          pointMetarMap.put(mw, new Point2D.Float(mapPosition[0], mapPosition[1]));
          result[mapPosition[0]][mapPosition[1]] = mw;
        }
      }
    }
    return result;
  }

  private boolean metarIsValid(METAR m) {
    return m.getLatitude() != null && m.getLongitude() != null && m.getAltimInHg() != null && Math.abs(m.getLatitude()) <= 90 && Math.abs(m.getLongitude()) <= 180;
  }

}
