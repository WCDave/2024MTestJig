package domain;


import jaxb.METAR;

import java.awt.*;

public interface IMetarWrapper {

  METAR getMetar();
  void setVoronoiPolygon(Polygon polygon);
  Polygon getVoronoiPolygon();


}
