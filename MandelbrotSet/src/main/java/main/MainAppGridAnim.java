package main;
import enums.MouseStates;
import gfxmain.GFXException;
import gfxmain.GFXFramework;
import gfxmain.VisSpect;
import threeD.*;

import javax.swing.*;
import java.awt.*;
import java.util.Properties;

public class MainAppGridAnim extends JFrame {

  private final double minX =  -2.25;
  private final double maxX =  .75;
  private final double minY =  -1.5;
  private final double maxY =   1.5;

  private int GRID_SIZE = 500;

  double dx = (this.maxX - this.minX)/ SCREEN_WIDTH;
  double dy = (this.maxY - this.minY)/ SCREEN_WIDTH;

  private GFXFramework gfx;
  private final static int SCREEN_WIDTH = 1000;
  private final static int SCREEN_HEIGHT = 1000;


  private CoordSys navObject;
  private boolean coloredParticles;
  private SlewKeyNavAdapter keyAdapter;
  private Plane3D refPlane;
  private CoordSys cachedNavObject;
  private int[][] data;

  public static void main(String[] args) {
    new MainAppGridAnim().run();
  }
  public MainAppGridAnim() {
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
    Properties p = System.getProperties();
    MouseStates ms = MouseStates.valueOf("CLICKED");
    MouseStates[] msArray = MouseStates.values();
//    	for(MouseStates m:msArray) {
//    		System.out.println(m.toString());
//    	}
    navObject = new CoordSys(0, 0, GRID_SIZE);
    navObject.xRotate(180);
    navObject.addObserver(World3DContainer.getInstance());
    keyAdapter = new SlewKeyNavAdapter(navObject, 20);

    refPlane = new Plane3D(new CoordSys(0, 0, 0), GRID_SIZE, new Color(80, 80, 80), 25);
    data = this.buildResult();
  }

  public void run() {

    while (true) {

      render();
      if (gfx.isAnimationOn()) {
        refPlane.draw(gfx, navObject);
      }

    keyAdapter.handleKey(gfx.getKey());
      
      //double displayVel = displayMaxVel ? aThread.getMaxVel() : aThread.getMinVel();
      setTitle("Gravity : " + (gfx.isAnimationOn() ? "Animation On" : "Animation Off") + " / "
              + (keyAdapter.isTranslationMode() ? "Translation" : "Rotation") + " | " + navObject.getViewDirection()
             );

      GFXFramework.sleep(50);
      gfx.update();
    }
  }

  private void render() {

//    double areaFactor = Math.exp((currentBounds.width*currentBounds.height)/5)*.5;
    Graphics2D g2=gfx.getG2();
    for(int x = 0; x< SCREEN_WIDTH; x+=1){
      for(int y = 0; y< SCREEN_WIDTH; y+=1){
//        double xx = x*dx +this.minX;
//        double yy = y*dy +this.minY;
//        ComplexNumber c = new ComplexNumber(xx, yy);
//        int i= (int) Math.round(getMandelValueFor(c,4000));

//        Color color = VisSpect.getSpectralColor(((double)Math.log10(i)*10+378d));


        ScreenPoint sp = navObject.getScrnCoords(new double[]{x-SCREEN_WIDTH/2,y-SCREEN_WIDTH/2,this.data[x][y]/10}, gfx.getSize());
//        ScreenPoint spx = navObject.getScrnCoords(new double[]{x-GRID_SIZE/2,y-GRID_SIZE/2,0}, gfx.getSize());
        if(sp.isInView()){
//          int colorAdj = this.data[x][y] == 0 ? 0: (int) Math.min(this.data[x][y] * 60, 255);
//          g2.setColor(new Color( Color.red.getRed()-10,
//                   Color.red.getGreen()+colorAdj,
//                  Color.red.getBlue()+colorAdj));
          g2.setColor(VisSpect.getSpectralColor(this.data[x][y]+378d));
          g2.drawLine(sp.x, sp.y, sp.x, sp.y);
//          if(x == 0 && y==0) {
//            g2.setColor(Color.white);
//            g2.drawLine(spx.x, spx.y, spx.x, spx.y);
//          }
        }
       
      }
    }
  }

  private int[][] buildResult() {
    int mini = Integer.MAX_VALUE;
    int mxi = Integer.MIN_VALUE;
    int[][] result = new int[SCREEN_WIDTH][SCREEN_WIDTH];
    for(int x = 0; x< SCREEN_WIDTH; x+=1) {
      for (int y = 0; y < SCREEN_WIDTH; y += 1) {
        double xx = x * dx + this.minX;
        double yy = y * dy + this.minY;
        IComplexNumber c = new ComplexNumberSimple(xx, yy);
        int i = (int) GetMandelValueImplBuilder.createBuilder(c).execute(2000);    ;
        result[x][y] = i;
        mini = Math.min(mini, i);
        mxi = Math.max(mxi, i);
      }
    }
    System.out.println("max i="+mxi+", mini="+mini);
    return result;
  }
}
