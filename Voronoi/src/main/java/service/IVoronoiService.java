package service;


import domain.Circle;
import met.METAR;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.List;

import javax.xml.bind.JAXBException;

public interface IVoronoiService {

  List<Circle> generateCircles(List<Point2D> points);
  List<Polygon> generatePolygons(List<Circle> circles);
  List<METAR> callWebService(List<String> stationString);
  Circle createCircle(Point2D.Float p1, Point2D.Float p2, Point2D.Float p3);
  List<String> getStationList(String ...strings ) throws Exception;
}
