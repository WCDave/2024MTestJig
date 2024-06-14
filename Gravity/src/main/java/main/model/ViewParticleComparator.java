package main.model;

import java.util.Comparator;

import main.Particle;
import threeD.CoordSys;

public class ViewParticleComparator implements Comparator<Particle> {

	private CoordSys coordSys;

	public void setCoordSys(CoordSys coordSys) {
		this.coordSys = coordSys;
	}

	@Override
	public int compare(Particle o1, Particle o2) {

		double[] posVec = coordSys.getPositionVec();
		if (o1 == null || o2 == null || coordSys == null || o1.getPosition() == null || o2.getPosition() == null
				|| posVec == null)
			return -1;
		if (o1.equals(o2))
			return 0;

//		double dist1 = VMath.mag(VMath.vecSubtract(o1.getPosition(), posVec));
//		double dist2 = VMath.mag(VMath.vecSubtract(o2.getPosition(), posVec));
		double dist1 = o1.getDistanceToView();
		double dist2 = o2.getDistanceToView();
		if (dist1 == dist2)
			return 0;

		return dist1 < dist2 ? 1 : -1;
	}
}
