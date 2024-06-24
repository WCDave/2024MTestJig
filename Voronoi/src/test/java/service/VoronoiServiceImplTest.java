package service;


import domain.Circle;
import org.junit.Test;
import service.impl.VoronoiServiceImpl;

import java.awt.geom.Point2D;

import static org.junit.Assert.assertEquals;

public class VoronoiServiceImplTest {

  IVoronoiService iut = new VoronoiServiceImpl();

  @Test
  public void testCreatedCircle() {
    Circle result = iut.createCircle(new Point2D.Float(2,1), new Point2D.Float(0, 5), new Point2D.Float(-1, 2));
    assertEquals(result.getX(), 1, 0);
    assertEquals(result.getY(), 3, 0);
    assertEquals(result.getRadius(), Math.sqrt(5), .000001);
  }
}
