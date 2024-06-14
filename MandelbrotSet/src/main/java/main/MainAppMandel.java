package main;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;
import java.math.BigDecimal;

import javax.swing.JFrame;

import enums.MouseStates;
import gfxmain.GFXException;
import gfxmain.GFXFramework;
import gfxmain.VisSpect;

public class MainAppMandel extends JFrame {
	private final double minX =  -2.25;
    private final double maxX =  .75;
    private final double minY =  -1.5;
    private final double maxY =   1.5;
    
    private final static int SCREEN_WIDTH=1000;
    private final static int SCREEN_HEIGHT=1000;
    private boolean drawingNewBox;
    private CaptureBox drawingBox;
    private final Rectangle2D.Double startingBounds = new Rectangle2D.Double(minX, minY,Math.abs(minX-maxX),Math.abs(minY-maxY));
    private Rectangle2D.Double currentBounds = (Rectangle2D.Double)startingBounds.clone();
    private boolean redraw;
    
    
    private GFXFramework gfx;
    
    public MainAppMandel(){
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLayout(null);
    	setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
    	try {
			gfx=new GFXFramework(this,false);
		} catch (GFXException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
    	pack();
    	gfx.init();    	
        setVisible(true); 
//        getMandelValueImpl = new GetMandelValueImpl();
    }
    
    public static void main(String[] args){
    	new MainAppMandel().run();
    }
    
    private void run(){
    	redraw=true;
    	while(true){
    		String rangeStr = "Re ["
     		   +currentBounds.x+","+(currentBounds.x+currentBounds.width)+"], Im ["+currentBounds.y+","+(currentBounds.y+currentBounds.height)+"]";
     		setTitle(rangeStr+(redraw?" DRAWING":" SCAN MODE"));
     		
     		if(redraw){
    		   gfx.clearSaveImage();
			   gfx.setAnimate(false);
	    	   drawMandelBrotSet();
	    	   gfx.setAnimate(true);
	    	   gfx.setSaveImage();
	    	   redraw=false;	    	   
    		}    		
    		
    		switch (gfx.getKey()) {
                case KeyEvent.VK_SEMICOLON : {
                	redraw=!currentBounds.equals(startingBounds);
    				currentBounds = (Rectangle2D.Double)startingBounds.clone();;
    			}
    			case KeyEvent.VK_ESCAPE : {
    				drawingNewBox=false;
        			drawingBox=null;
    			}    			
    		}
    		
			if(drawingBox!=null && drawingBox.isValid()) {
			    drawingBox.draw(gfx.getG2());
			}
			
			MouseStates ms = gfx.getMouseState();
    		if(ms.isStateChange()){
    			adjustSetBox(ms);
    		}
	    	gfx.update();
	    	GFXFramework.sleep(10);
    	}		
    }

	private void adjustSetBox(MouseStates ms) {
		switch(ms){
			case CLICKED : {
				if(drawingNewBox) {
					drawingBox.setEndPoint(ms.getMousePosition());
					resetDrawingBounds();
					redraw=true;
				}
				else {
					drawingNewBox=true;
					drawingBox = new CaptureBox(ms.getMousePosition());
				}
				break;
			}
			case MOVED : {
				if(drawingNewBox){
					drawingBox.setEndPoint(ms.getMousePosition());
				}
			}
		}		
	}

	private void resetDrawingBounds() {
		drawingNewBox=false;
		Rectangle r = drawingBox.getRectangle();
		double newMinX=currentBounds.x+(double)r.x/(double)SCREEN_WIDTH*currentBounds.width;
		double newMinY=currentBounds.y+(double)r.y/(double)SCREEN_HEIGHT*currentBounds.height;
		double newWidth = ((double)r.getWidth()/(double)SCREEN_WIDTH)*currentBounds.width;
		double newHeight = ((double)r.getHeight()/(double)SCREEN_HEIGHT)*currentBounds.height;
		currentBounds = new Rectangle2D.Double(newMinX, newMinY, newWidth, newHeight);
		drawingBox=null;
		
	}

	private void drawMandelBrotSet() {
		double dx=currentBounds.width/(double)SCREEN_WIDTH;
    	double dy=currentBounds.height/(double)SCREEN_HEIGHT;
    	double areaFactor = Math.exp((currentBounds.width*currentBounds.height)/5)*.5;
    	
    	Graphics2D g2=gfx.getG2();
    	for(int y=0;y<SCREEN_HEIGHT;y++){
    		for(int x=0;x<SCREEN_WIDTH;x++){
    			IComplexNumber c = new ComplexNumberSimple((double)x*dx+currentBounds.x,(double)y*dy+currentBounds.y);
//    			IComplexNumberBigDecimal c = new ComplexNumberBigDecimal(new BigDecimal(x*dx+currentBounds.x), new BigDecimal(y*dy+currentBounds.y));
    			long i = GetMandelValueImplBuilder.createBuilder(c).execute(10000);    			
    			Color color = VisSpect.getSpectralColor(((double)i*areaFactor+378d));
    			g2.setColor(color);
    			g2.drawLine(x, y, x, y);    			
    		}    	
    		gfx.update();
    	}
	}
}
