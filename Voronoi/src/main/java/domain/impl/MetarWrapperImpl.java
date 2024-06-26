package domain.impl;

import domain.IMetarWrapper;
import met.METAR;

import java.awt.*;


public class MetarWrapperImpl extends Number implements IMetarWrapper {
  private METAR metar;
  private Polygon polygon;

  public MetarWrapperImpl(METAR metar) {
    this.metar = metar;
    polygon = new Polygon();
  }

  @Override
  public METAR getMetar() {
    return metar;
  }

  @Override
  public void setVoronoiPolygon(Polygon polygon) {
    this.polygon = polygon;
  }

  @Override
  public Polygon getVoronoiPolygon() {
    return polygon;
  }


  @Override
  public int intValue() {
    return metar.getAltimInHg().intValue();
  }

  @Override
  public long longValue() {
    return metar.getAltimInHg().longValue();
  }

  @Override
  public float floatValue() {
    return metar.getAltimInHg().floatValue();
  }

  @Override
  public double doubleValue() {
    return metar.getAltimInHg().doubleValue();
  }
}
