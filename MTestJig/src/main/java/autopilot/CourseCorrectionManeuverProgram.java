package autopilot;

import Foundation.Utils;
import RVMath.VMath;
import enums.OrbitElementKeys;
import main.PhysicsRunnable;
import orbits.IOrbitPlaneChangeTransformer;
import orbits.NavComputer;
import orbits.Planet;
import orbits.World3DContainer;
import orbits.keplerian.KeplerCalc;
import orbits.keplerian.KeplerianElements;

import org.apache.commons.math3.util.FastMath;
import org.apache.log4j.Logger;

import java.util.Map;

public class CourseCorrectionManeuverProgram extends AFCSTargetingStrategy {

  private Planet planet;
  private double periapsis;
  private Logger log = Logger.getLogger(CourseCorrectionManeuverProgram.class);
  private static final double tliAdjustmentStart = 40000;

  public CourseCorrectionManeuverProgram(NavComputer computer, Planet planet, double periapsis) {
    super(computer);
    this.planet = planet;
    this.periapsis = periapsis * NavComputer.METERS_PER_MILE + planet.getRadius();
    System.out.println("planet name=" + planet.getName() + ", planet.getRadius()=" + planet.getRadius() + " periapsis=" + periapsis);
  }

  @Override
  public void run() {
    super.run();

//    computer.setReferenceObject(planet);
//    computer.getControlAdapter().selectReferenceObject(planet);
    //computer.getControlAdapter().toggleEnablePlanetSelect();
    log.info("referenced object=" + computer.getReferenceObject().getName());
    Utils.sleep(1000);

    log.info("awaiting CCM distance " + tliAdjustmentStart * NavComputer.METERS_PER_MILE + " @" + VMath.mag((double[]) computer.getRocketOrbitElements().get(OrbitElementKeys.radiusVec)));

//    executorService.submit(new KeplerCalc(rocket, true));
//    executorService.submit(new KeplerCalc(planet, true));
//    Utils.sleep(1800000);
//    makePlaneAdjustment();
//    executorService.submit(new KeplerCalc(rocket, true));
//    executorService.submit(new KeplerCalc(planet, true));
//
//    log.info("plane Adjustment completed...waiting for TLI adjustment " + tliAdjustmentStart + ", " + VMath.mag((double[]) computer.getRocketOrbitElements().get(OrbitElementKeys.radiusVec)) / NavComputer.METERS_PER_MILE);

    DebugThread dt = new DebugThread();
    dt.start();
    while (!targetReached()) {
      Utils.sleep(500);
    }


    log.info("TLI Adjustment starting, periluna=" + VMath.mag((double[]) computer.computeOrbitalElements(computer.getCraft().getCoordSys(), this.planet).get(OrbitElementKeys.radiusVec)) / NavComputer.METERS_PER_MILE);

    makeTLIAdjustment();
    dt.runThread=false;

    log.info("TLI Adjustment ended, periluna=" + VMath.mag((double[]) computer.computeOrbitalElements(computer.getCraft().getCoordSys(), this.planet).get(OrbitElementKeys.radiusVec)) / NavComputer.METERS_PER_MILE);

    computer.setReferenceObject(planet);
    computer.getControlAdapter().selectReferenceObject(planet);
    computer.getControlAdapter().toggleEnablePlanetSelect();
//		log.info("turning retrograde");
//
//		ComputerAbstractButton button = computer.getButton(ComputerButtonKeys.RETROGRADE);
//		button.setSelected(true);
//		button.doClick();
//
//		computer.setFlashAnnun(true);
//		while(computer.isFlashAnnun())
//		{
//			Utils.sleep(400);
//		}
//
//		computer.getControlAdapter().setThrottle(40);
//		log.info("starting 40% burn to set periapsis to "+this.periapsis);
//		log.info("@ "+ ((Double)computer.getOrbitElements().get(OrbitElementKeys.rPer))*NavComputer.METERS_PER_MILE);
//		while(!targetTwo())
//		{
//			Utils.sleep(100);
//		}
//		computer.getControlAdapter().setThrottle(0);
//		log.info("ending burn "+((Double)computer.getOrbitElements().get(OrbitElementKeys.rPer))*NavComputer.METERS_PER_MILE);
//
//
//		button.setSelected(false);
//		button.doClick();

    try {
      executorService.submit(new KeplerCalc(rocket,computer.getReferenceObject(),true)).get().getKeplerianElements();
      executorService.submit(new KeplerCalc(computer.getReferenceObject(), true)).get().getKeplerianElements();
    }
    catch (Exception  e) {}

    //computer.getControlAdapter().toggleEnablePlanetSelect();

  }

  private void makeTLIAdjustment() {
    boolean continueBurn = true;
    double dotProd = 0;
    Map<OrbitElementKeys, Object> map = null;
    while (continueBurn) {
      map = computer.computeOrbitalElements(computer.getCraft().getCoordSys(), this.planet);
      double[] rP = VMath.vecSubtract(rocket.getPosition(), planet.getPosition());
      double[] vP = VMath.vecSubtract(rocket.getVelocity(), planet.getVelocity());
      dotProd = VMath.dotprod(VMath.crossprd(vP, VMath.crossprd(rP, vP)), planet.getVelocity());
      continueBurn =  FastMath.abs((Double) map.get(OrbitElementKeys.rPer) - planet.getRadius() / NavComputer.METERS_PER_MILE - 170) > 5 && dotProd > 0
              || dotProd < 0;
      if (continueBurn) {
        //log.info("inner>> "+((Double)computer.getOrbitElements().get(OrbitElementKeys.rPer)-planet.getRadius()/NavComputer.METERS_PER_MILE - 150)+", "+dotProd);
        if (dotProd > 0.0 &&  ((Double) map.get(OrbitElementKeys.rPer) - planet.getRadius() / NavComputer.METERS_PER_MILE-170) > 5) {
          computer.getControlAdapter().rcsThrustAft();
        } else {
          computer.getControlAdapter().rcsThrustForward();
        }
      }
      Utils.sleep(500);

//    	try {
//    		KeplerianElements ke = executorService.submit(new KeplerCalc(rocket,computer.getReferenceObject(),false)).get().getKeplerianElements();
//    	     
//    	    }
//    	    catch (Exception  e) {}
    }
    computer.getControlAdapter().rcsThrustOff();
    log.info("burn ended " + ((Double) map.get(OrbitElementKeys.rPer) - planet.getRadius() / NavComputer.METERS_PER_MILE - 170) + ", " + dotProd);

  }

  @Override
  public boolean targetReached() {
//    // double[] r = (double[]) computer.getRocketOrbitElements().get(OrbitElementKeys.radiusVec);
//    double[] r = (double[])computer.computeOrbitalElements(computer.getCraft().getCoordSys(), this.planet).get(OrbitElementKeys.radiusVec);
//    return VMath.mag(r) <= tliAdjustmentStart * NavComputer.METERS_PER_MILE;
	  return gravTarget();
  }

  private boolean targetTwo() {
    return ((Double) computer.getOrbitElements().get(OrbitElementKeys.rPer)) * NavComputer.METERS_PER_MILE <= this.periapsis;
  }
  
  private boolean gravTarget() {
	  double tRad = VMath.mag(VMath.vecSubtract(rocket.getPosition(), planet.getPosition()));
	  double targetGrav = Math.abs(PhysicsRunnable.G * this.planet.getMass() / (tRad*tRad));
	  
	  double eRad = VMath.mag(rocket.getPosition());
	  double earthGrav  = Math.abs(PhysicsRunnable.G * ((Planet) World3DContainer.getInstance().getItem("Earth")).getMass() / (eRad*eRad));
	  
//	  log.info("%%%%% t="+targetGrav+"    "+"e="+earthGrav);
	  return targetGrav > earthGrav;
  }

  private void makePlaneAdjustment() {
    double[] moonOrbitPlaneNormal = VMath.normalize(IOrbitPlaneChangeTransformer.computeOrbitalNormal(planet, planet.getCentralBody().getCoordSys()));
    double correctionDot = VMath.dotprod(moonOrbitPlaneNormal, VMath.normalize(rocket.getVelocity()));

    if (correctionDot > 0) {
      computer.getControlAdapter().rcsThrustDown();
    } else {
      computer.getControlAdapter().rcsThrustUp();
    }

    log.info("making plane adjustment correction " + correctionDot);
    while (FastMath.abs(correctionDot) > .0005) {
      correctionDot = VMath.dotprod(moonOrbitPlaneNormal, VMath.normalize(rocket.getVelocity()));
      Utils.sleep(50);
    }

    computer.getControlAdapter().rcsThrustOff();
    log.info("plane adjustment correction complete " + correctionDot);
  }

//  double[] rockToMoonVec = VMath.vecSubtract(rocket.getPosition(), planet.getPosition());
//      double[] rockVelRelMoon = VMath.vecSubtract(rocket.getVelocity(), planet.getVelocity());
//      dotProd = VMath.dotprod(VMath.crossprd(rockVelRelMoon, VMath.crossprd(rockToMoonVec, rockVelRelMoon)), planet.getVelocity());
private class DebugThread extends Thread {

  public boolean runThread = true;
  private Map<OrbitElementKeys,Object> map = null;


  public DebugThread()   {

  }

  @Override
  public void run() {

    System.out.println("start thread");
    while (runThread) {
      map = CourseCorrectionManeuverProgram.this.computer.computeOrbitalElements(computer.getCraft().getCoordSys(), CourseCorrectionManeuverProgram.this.planet);
      double[] rockToMoonVec = VMath.vecSubtract(rocket.getPosition(), planet.getPosition());
      double[] rockVelRelMoon = VMath.vecSubtract(rocket.getVelocity(), planet.getVelocity());
      double[] angMo = VMath.crossprd(rockToMoonVec, rockVelRelMoon);
      double dotProd = VMath.dotprod(VMath.crossprd(rockVelRelMoon, angMo), planet.getVelocity());
      
      double tRad = VMath.mag(VMath.vecSubtract(rocket.getPosition(), planet.getPosition()));
	  double targetGrav = Math.abs(PhysicsRunnable.G * planet.getMass() / (tRad*tRad));
	  
	  double eRad = VMath.mag(rocket.getPosition());
	  double earthGrav  = Math.abs(PhysicsRunnable.G * ((Planet) World3DContainer.getInstance().getItem("Earth")).getMass() / (eRad*eRad));
	  
	  log.info("%%%%% t="+targetGrav+"    "+"e="+earthGrav);


      log.info(dotProd + ", rockVelM="+VMath.mag(rockVelRelMoon)+", moonVel="+VMath.mag(planet.getVelocity())+", angMo="+VMath.mag(angMo)+", currPeri="+
              ((Double) map.get(OrbitElementKeys.rPer) - planet.getRadius() / NavComputer.METERS_PER_MILE));
      try {
          executorService.submit(new KeplerCalc(rocket, planet, true)).get().getKeplerianElements();
          executorService.submit(new KeplerCalc(planet, true)).get().getKeplerianElements();
        }
        catch (Exception  e) {

        }
      Utils.sleep(60000);
    }
    System.out.println("end thread");
  }
}

}
