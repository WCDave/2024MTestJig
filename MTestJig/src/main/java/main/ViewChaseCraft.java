package main;

import RVMath.VMath;
import enums.CRUISE_SPEED;
import main.effects.ICruiseTo;
import orbits.Abstract3DModelObject;
import orbits.CoordSys;
import orbits.NavComputer;
import orbits.Point3D;

import java.util.Vector;

import org.apache.log4j.Logger;

import Foundation.Utils;


public class ViewChaseCraft extends Craft implements ICruiseTo {

  private final Craft craftToChase;
  private final AbstractView view;
  public static final String CHASE_NAME = "CHASE";
  private CruiseToThread thread = null;

  private Logger log = Logger.getLogger(ViewChaseCraft.class);

  public ViewChaseCraft(Craft craftToChase, AbstractView view) {
    this.craftToChase = craftToChase;
    this.name = CHASE_NAME;
    this.view = view;
  }

  @Override
  public void applyAttitudeRates(double dt) {

  }

  @Override
  public double getDragFactor() {
    return 0;
  }

  @Override
  public Vector<Point3D> getDataList() {
    return null;
  }
  
  public void stopThread() {
	  if(thread != null) {
		  thread.exit();
	  }
	  thread = null;
  }

  @Override
  public void setPositionVec(double[] position) {
	if (thread == null) {
		thread = this.cruiseTo(craftToChase.getCoordSys(), view.getCoordSys(), CRUISE_SPEED.FAST);
		thread.start();
//		thread = null;
	}
    CoordSys tempSys = (CoordSys) craftToChase.getCoordSys().clone();
    tempSys.yRotate(-26);

    double[] displacedVec = VMath.vecAdd(tempSys.getPositionVec(), VMath.vecMultByScalar(tempSys.zAxis().getVectorForm(), -3000));
    super.setPositionVec(displacedVec);
//    view.getCoordSys().setPositionAsVec(getPosition());
    tempSys.zRotate(-90);
    getCoordSys().setXAxis(tempSys.xAxis().getVectorForm());
    getCoordSys().setYAxis(tempSys.yAxis().getVectorForm());
    getCoordSys().setZAxis(tempSys.zAxis().getVectorForm());

  }

  @Override
  public void draw(AbstractView view) {  }

@Override
public CruiseToThread cruiseTo(CoordSys target, CoordSys start, CRUISE_SPEED cruiseSpd) {
	// TODO Auto-generated method stub
	return new CruiseToThread(craftToChase.getCoordSys(), view.getCoordSys(), CRUISE_SPEED.FAST);
}

private class CruiseToThread extends Thread {
	private CoordSys target;
	private CoordSys start;
	private CRUISE_SPEED spd;
	private boolean exit;

	public CruiseToThread(CoordSys target, CoordSys start, CRUISE_SPEED spd) {
		this.target = target;
		this.start = start;
		this.spd = spd;
	}
	
	public void exit( ) {
		exit = true;
	}

	@Override
	public void run() {
		double[] diffVec = VMath.vecSubtract(target.getPositionVec(), start.getPositionVec());
//		log.info(VMath.mag(diffVec)+", "+VMath.dotprod( VMath.normalize(diffVec), target.getVelocityAsVec()));
		while(VMath.mag(diffVec) > 3500 && !exit) {
			Utils.sleep(5000);
			CoordSys tempSys = (CoordSys) craftToChase.getCoordSys().clone();
//		    tempSys.yRotate(-26);
//	
//		    double[] displacedVec = VMath.vecAdd(tempSys.getPositionVec(), VMath.vecMultByScalar(tempSys.zAxis().getVectorForm(), -3000));
//		    ViewChaseCraft.super.setPositionVec(displacedVec);
		    ViewChaseCraft.super.setPositionVec(tempSys.getPositionVec());
//	//	    view.getCoordSys().setPositionAsVec(getPosition());
//		    tempSys.zRotate(-90);
		    getCoordSys().setXAxis(tempSys.xAxis().getVectorForm());
		    getCoordSys().setYAxis(tempSys.yAxis().getVectorForm());
		    getCoordSys().setZAxis(tempSys.zAxis().getVectorForm());
		    log.info(VMath.mag(diffVec)+", "+VMath.dotprod( VMath.normalize(diffVec), VMath.normalize(target.getVelocityAsVec())));
		}
//		ViewChaseCraft.super.setPositionVec(null);
	}

}
}
