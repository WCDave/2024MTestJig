package domain;


import met.METAR;

import java.awt.*;
import java.util.Set;

public interface IMetarWrapper {

  METAR getMetar();
  Polygon getVoronoiPolygon();
  Point getGridPoint();
  void setGridPoint(Point p);
  Set<Edge> getEdges();
  Point getCentroid();
}
