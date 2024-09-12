package orbits.keplerian;

import RVMath.VMath;
import orbits.Abstract3DModelObject;
import orbits.NavComputer;

import org.apache.commons.math3.util.FastMath;
import orbits.Planet;
import java.util.Date;
import java.util.concurrent.Callable;

public class KeplerCalc implements Callable<IOrbit> {

	private Abstract3DModelObject a3o;
	double mu = 3.98574405096e14;
	static double TWO_PI = FastMath.PI * 2;
	private boolean displayData;
	Abstract3DModelObject planet;

	public KeplerCalc(Abstract3DModelObject a3o) {
		this.a3o = a3o;
	}

	public KeplerCalc(Abstract3DModelObject a3o, boolean displayData) {
		this.a3o = a3o;
		this.displayData = displayData;
	}

	public KeplerCalc(Abstract3DModelObject a3o, Abstract3DModelObject planet, boolean displayData) {
		this(a3o, displayData);
		this.planet = planet;
		mu = -((Planet)this.planet).getMu();
	}

	@Override
	public IOrbit call() throws Exception {
		double[] vVec = a3o.getCoordSys().getVelocityAsVec();
		double[] rVec = a3o.getCoordSys().getPositionVec();
		if (this.planet != null) {
			vVec = VMath.vecSubtract(vVec, planet.getCoordSys().getVelocityAsVec());
			rVec = VMath.vecSubtract(rVec, planet.getCoordSys().getPositionVec());
		}

		double[] angMomentum = VMath.crossprd(rVec, vVec);
		double[] node = VMath.crossprd(new double[] { 0, 0, 1 }, VMath.normalize(angMomentum));
		double v = VMath.mag(vVec);
		double r = VMath.mag(rVec);
		double n = VMath.mag(node);

//		double eVec[] = VMath.vecMultByScalar(VMath.vecSubtract(VMath.vecMultByScalar(rVec, (v * v - mu / r)),
//				VMath.vecMultByScalar(vVec, VMath.dotprod(rVec, vVec))), 1 / mu);
		double eVec[] = VMath.vecSubtract(VMath.vecMultByScalar(VMath.crossprd(vVec, angMomentum), 1 / mu),
				VMath.normalize(rVec));
		
		// double v[] = VMath.vecSubtract(cs.getVelocityAsVec(), ((Planet) refObject).getVelocity());
	    // double magV = VMath.mag(v);
	    // radiusVec = VMath.vecSubtract(cs.getPositionVec(), refObject.getCoordSys().getPositionVec());
	    // double h[] = VMath.crossprd(radiusVec, v);
		// ecc = VMath.vecSubtract(VMath.vecMultByScalar(VMath.crossprd(v, h), 1 / mu), VMath.normalize(radiusVec));
		
		double e = VMath.mag(eVec);

		double E = v * v / 2 - mu / r;
		double a = -mu / (2 * E);
		double i = FastMath.acos(angMomentum[2] / VMath.mag(angMomentum));
		double RAAN = FastMath.acos(node[0] / n);
		double argp = FastMath.acos(VMath.dotprod(node, eVec) / (n * e));
		double TA = FastMath.acos(VMath.dotprod(eVec, rVec) / (e * r));

		if (node[1] < 0) {
			RAAN = TWO_PI - RAAN;
		}
		if (eVec[2] < 0) {
			argp = TWO_PI - argp;
		}
		if (VMath.dotprod(rVec, vVec) < 0) {
			TA = TWO_PI - TA;
		}
		KeplerianElements ke = new KeplerianElements(a, e, i, RAAN, argp, TA, a3o.getCoordSys(), mu);
		IOrbit orbit = new Orbit(ke);
		if (displayData) {
			System.out.println(new Date() + " -- " + (this.planet != null ?"*"+a3o.getName():a3o.getName())+ ": a=" + String.format("%12.4f",a) + 
					", e=" + String.format("%10.4f",e) + ", i="+ String.format("%9.4f",FastMath.toDegrees(i)) + 
					", RAAN=" + String.format("%10.4f",FastMath.toDegrees(RAAN)) + ", argP="+ String.format("%10.4f",FastMath.toDegrees(argp)) + 
					", TA=" + FastMath.toDegrees(TA) + ", T=" + ke.getPeriod()+", v="+String.format("%12.4f", v * 2.236f)+", r="+String.format("%12.4f",r/ NavComputer.METERS_PER_MILE));
		}
		return orbit;
	}
}
