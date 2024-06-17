package junits;

import mapUtils.MapHelper;
import orbits.Abstract3DModelObject;
import orbits.Facet;

import org.apache.commons.math3.util.FastMath;
import org.easymock.EasyMock;
import org.easymock.IAnswer;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import main.AbstractView;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;

import javax.imageio.ImageIO;

@RunWith(PowerMockRunner.class)
@PrepareForTest({MapHelper.class})
public class MapHelperTest {

  BufferedImage moonImage;
  BufferedImage earthImage;

  @Before
  public void setUp() throws Exception {

	    try {
		 moonImage =
		 ImageIO.read(new File("moon_Moon_4K_1__Hermes.jpg"));
		 
		 earthImage = ImageIO.read(new File("flat_earth_by_EnforcedCrowd.jpg"));
		 } catch (Exception e) {
		 e.printStackTrace();
		 }
  }

  @After
  public void tearDown() throws Exception {
  }

//  @Test
  public void testGetScreenCoordsFor() {
	  //-72 west cos() = .30
	  //40 N cos() =.76
	  double[] vec = convertGeographicalRadiansToCartesianCoords(100,Math.toRadians(39.96),Math.toRadians(-72));
	 
    Facet f = new Facet(Arrays.asList(vec, vec, vec), null);
    f.setComposedObject(new Abstract3DModelObject() {
		
		@Override
		public void draw(AbstractView view) {
			// TODO Auto-generated method stub
			
		}
	});
    PowerMock.mockStaticPartial(MapHelper.class, "getDecimalTimeOfDay");
    double i = 0;
    EasyMock.expect(MapHelper.getDecimalTimeOfDay()).andReturn(1d).andAnswer(new IAnswer() {

		@Override
		public Object answer() throws Throwable {
			
			return new Double(12);
		}
    	
    });
    PowerMock.replayAll();
    double[] result = MapHelper.getFlatMapCoordsFor(f, new Dimension(earthImage.getWidth(), earthImage.getHeight()));

    PowerMock.mockStaticPartial(MapHelper.class, "getDecimalTimeOfDay");
    EasyMock.expect(MapHelper.getDecimalTimeOfDay()).andReturn(i++).anyTimes();
    PowerMock.replayAll();
    result = MapHelper.getFlatMapCoordsFor(f, new Dimension(500, 200));

    PowerMock.mockStaticPartial(MapHelper.class, "getDecimalTimeOfDay");
    EasyMock.expect(MapHelper.getDecimalTimeOfDay()).andReturn(i++).anyTimes();
    PowerMock.replayAll();
    result = MapHelper.getFlatMapCoordsFor(f, new Dimension(500, 200));

    PowerMock.mockStaticPartial(MapHelper.class, "getDecimalTimeOfDay");
    EasyMock.expect(MapHelper.getDecimalTimeOfDay()).andReturn(i++).anyTimes();
    PowerMock.replayAll();
    result = MapHelper.getFlatMapCoordsFor(f, new Dimension(500, 200));

    PowerMock.mockStaticPartial(MapHelper.class, "getDecimalTimeOfDay");
    EasyMock.expect(MapHelper.getDecimalTimeOfDay()).andReturn(i++).anyTimes();
    PowerMock.replayAll();
    result = MapHelper.getFlatMapCoordsFor(f, new Dimension(500, 200));
  }


//	//@Test
//	public void testGetDecimalTimeOfDay() {
//		double x = MapHelper.getDecimalTimeOfDay();
//		x = Math.PI/12 * x;
//		x = 0;
//	}
//
//	@Test
//	public void testGetColorFromMapForVector() {
//		Color c = null;
//		for(int i = 0;i<50;i++)
//		{
//			double[] vec  = new double[]{10+i,10+i,i+200};
//			c = MapHelper.getColorFromMapForFace(moonImage, vec, 200000);
//			System.out.println(c);
//		}
//		
//		assertTrue(c != null);
//	}
  
  public static double[] convertGeographicalRadiansToCartesianCoords(double radius, double latitude, double longitude) {
	    double[] result = new double[3];

	    result[0] = radius * FastMath.cos(latitude) * FastMath.cos(longitude);
	    result[1] = radius * FastMath.cos(latitude) * FastMath.sin(longitude);
	    result[2] = radius * FastMath.sin(latitude);
	    return result;
	  }

}
