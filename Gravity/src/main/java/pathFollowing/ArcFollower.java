package pathFollowing;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Arrays;

import VMath.VMath;
import gfxmain.GFXFramework;
import threeD.CoordSys;
import threeD.Trackable3D;

public class ArcFollower extends AbstractPathFollower {
	private double[] centerOfArc;
	private double[] prevCenterOfArc = new double[] { 0, 0, 0, 0 };
	private double startingDistanceFromCenterOfArc;

	public ArcFollower(CoordSys cs, Trackable3D t) {
		super(cs, -.3, t, cs.yAxis());

		double[] vecToCoA = VMath.vecSubtract(this.trackable.getIspectablePositionFromModel(),
				coordSys.getPositionVec());
		this.prevCenterOfArc = this.trackable.getIspectablePositionFromModel();
		startingDistanceFromCenterOfArc = VMath.mag(vecToCoA);
	}

	@Override
	protected void updatePosition(double dt) {
		centerOfArc = this.trackable.getIspectablePositionFromModel();

		double[] vecToCoA = VMath.vecSubtract(coordSys.getPositionVec(), centerOfArc);
		double spd = VMath.mag(vecToCoA) * Math.toRadians(Math.abs(dt));

		if (centerOfArc != null) {

			vecToCoA = VMath.vecSubtract(coordSys.getPositionVec(), centerOfArc);
			coordSys.xRotate(dt + this.viewCorrectionFactor);
			spd = VMath.mag(vecToCoA) * Math.toRadians(Math.abs(dt));
			double[] vel = VMath
					.vecMultByScalar(VMath.normalize(VMath.crossprd(coordSys.xAxis().getVectorForm(), vecToCoA)), spd);
			vel = VMath.vecAdd(vel, this.pathCorrection);

			coordSys.setVelocityAsVec(vel);
		}

	}

	@Override
	protected double[] pathCorrection() {
		centerOfArc = this.trackable.getIspectablePositionFromModel();
		double[] vecToCoA = VMath.vecSubtract(coordSys.getPositionVec(), centerOfArc);
		double currentDist = VMath
				.mag(VMath.vecSubtract(this.trackable.getIspectablePositionFromModel(), coordSys.getPositionVec()));
		double ratio = Math.abs(currentDist - startingDistanceFromCenterOfArc) / startingDistanceFromCenterOfArc;
		double[] correction = new double[] { 0, 0, 0, 0 };
		if (ratio > .02) {
			if (currentDist > startingDistanceFromCenterOfArc) {
				correction = VMath.vecMultByScalar(VMath.normalize(vecToCoA), -50 * ratio);
			} else {
				correction = VMath.vecMultByScalar(VMath.normalize(vecToCoA), 50 * ratio);
			}
		}
		double[] cOfADelta = VMath.vecSubtract(centerOfArc, prevCenterOfArc);

		correction = VMath.vecAdd(correction, cOfADelta);
		if (VMath.mag(correction) > 0.0d) {
			nonZeroPath = Arrays.copyOf(correction, correction.length);
		}
		prevCenterOfArc = Arrays.copyOf(centerOfArc, centerOfArc.length);
		return VMath.vecMultByScalar(correction, 1.05d);
	}

	@Override
	public void drawPathCorrection(GFXFramework gfx, CoordSys cs) {
		if (nonZeroPath != null) {
			Graphics2D g2 = gfx.getG2();
			g2.setColor(nonZeroPath[2] > 0 ? Color.green : Color.red);
			double[] normalzp = VMath.vecMultByScalar(VMath.normalize(nonZeroPath), 50);
			g2.drawLine(75, 75, 75 + (int) (normalzp[0]), 75 + (int) (-normalzp[1]));
		}
	}

	protected double viewAngleCorrection() {

		double[] vecToCoA = VMath.normalize(
				VMath.vecSubtract(this.trackable.getIspectablePositionFromModel(), coordSys.getPositionVec()));

		double dtError = VMath.dotprod(coordSys.zAxis().getVectorForm(), vecToCoA);

		double correction = 0;
		if (Math.abs(dtError) < 1) {
			correction = Math.acos(dtError) / 1e1;
		}

		double rotDotVecToCoA = VMath.dotprod(rotationalAxis.getVectorForm(), vecToCoA);
//		System.out.println(dtError + ", " + rotDotVecToCoA);
		return rotDotVecToCoA < 0 ? -correction : correction;
	}
}
