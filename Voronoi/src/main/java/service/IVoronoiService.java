package service;


import domain.Circle;
import jaxb.METAR;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.List;

public interface IVoronoiService {

  List<Circle> generateCircles(List<Point2D> points);
  List<Polygon> generatePolygons(List<Circle> circles);
  List<METAR> callWebService();
  Circle createCircle(Point2D.Float p1, Point2D.Float p2, Point2D.Float p3);
}
