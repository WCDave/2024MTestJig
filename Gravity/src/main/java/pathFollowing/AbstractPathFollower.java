package pathFollowing;

import java.util.Arrays;

import gfxmain.GFXFramework;
import threeD.CoordSys;
import threeD.Trackable3D;
import threeD.UVector;

public abstract class AbstractPathFollower extends Thread {

	protected CoordSys coordSys;
	protected double updateRate;
	protected double[] pathCorrection = new double[] { 0, 0, 0, 0 };
	protected double viewCorrectionFactor;
	private boolean stop = false;
	protected double[] nonZeroPath;
	protected Trackable3D trackable;
	protected UVector rotationalAxis;

	public AbstractPathFollower(CoordSys cs, double updateRate, Trackable3D t, UVector rotationalAxis) {
		this.coordSys = cs;
		this.updateRate = updateRate;
		this.trackable = t;
		this.rotationalAxis = rotationalAxis;
	}

	protected abstract void updatePosition(double dt);

	protected abstract double[] pathCorrection();

	public abstract void drawPathCorrection(GFXFramework gfx, CoordSys cs);

	protected abstract double viewAngleCorrection();

	public void run() {
		new Thread() {
			public void run() {
				while (!stop) {
					GFXFramework.sleep(200);
					pathCorrection = pathCorrection();
				}
			}
		}.start();

		new Thread() {
			public void run() {
				while (!stop) {
					GFXFramework.sleep(200);
					viewCorrectionFactor = viewAngleCorrection();
				}
			}
		}.start();
		while (!stop) {
			GFXFramework.sleep(10);
			updatePosition(updateRate);
			Arrays.fill(pathCorrection, 0);
			coordSys.moveCoordSys();
		}
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

}
