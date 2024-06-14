package orbits.keplerian;


import orbits.CoordSys;
import org.apache.commons.math3.util.FastMath;

import java.io.Serializable;

public class KeplerianElements implements Serializable {

  private double a;
  private double e;
  private double i;
  private double raan;
  private double aop;
  private double ta;
  private double mu;
  private CoordSys sys;

  public KeplerianElements(double a, double e, double i, double raan, double aop, double ta, CoordSys sys, double mu) {
    this.a = a;
    this.e = e;
    this.i = i;
    this.raan = raan;
    this.aop = aop;
    this.ta = ta;
    this.sys = sys;
    this.mu = mu;
    /*
     *  double trPer = (1 - e) * a;
    double trAph = (1 + e) * a;

    double rPer = trPer / METERS_PER_MILE;
    double rAph = trAph / METERS_PER_MILE;
    double vPer = FastMath.sqrt(((1 + e) * mu) / trPer) * 2.236;
    double vAph = FastMath.sqrt(((1 - e) * mu) / trAph) * 2.236;
     */
  }

  public double getA() {
    return a;
  }

  public double getE() {
    return e;
  }

  public double getI() {
    return i;
  }

  public double getRaan() {
    return raan;
  }

  public double getAop() {
    return aop;
  }

  public double getTa() {
    return ta;
  }

  public CoordSys getCoordSys() {
    return this.sys;
  }

  public double getPeriod() {
    return KeplerCalc.TWO_PI * FastMath.sqrt(this.a*this.a*this.a/this.mu);
  }
}
