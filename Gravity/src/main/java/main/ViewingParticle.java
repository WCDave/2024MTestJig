package main;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import VMath.VMath;
import gfxmain.GFXFramework;
import threeD.CoordSys;
import threeD.ScreenPoint;

public class ViewingParticle extends Particle {

	private CoordSys coordSys;
	boolean moveable;

	public ViewingParticle(double[] position, boolean moveable) {
		this(position[0], position[1], position[2], moveable);
	}

	public ViewingParticle(double x, double y, double z, boolean moveable) {
		super(x, y, z);
		coordSys = new CoordSys(x, y, z);
		coordSys.setD(coordSys.getD() / 1.5);
//		coordSys.autoAlign();
		this.moveable = moveable;
		Object o = this;
		new Thread() {

			public void run() {
				List<double[]> smoothedAccVecs = new ArrayList<>();
				while (true) {
					GFXFramework.sleep(75);
					double[] temp = new double[] { 0, 0, 0, 0 };
					if (smoothedAccVecs.size() > 200) {
						smoothedAccVecs.remove(0);
					}
					smoothedAccVecs.add(accVec);
//					for (int i = 0; i < smoothedAccVecs.size(); i++) {
//						temp = VMath.vecAdd(temp, smoothedAccVecs.get(i));
//					}
//
//					temp = VMath.vecMultByScalar(temp, 1.0 / new Double(smoothedAccVecs.size()).doubleValue());
					temp = VMath.EMA(smoothedAccVecs, 50);
//					synchronized (smoothedAccVec) {
//						smoothedAccVec[0] = temp[0];
//						smoothedAccVec[1] = temp[1];
//						smoothedAccVec[2] = temp[2];
//					}
					/*---*/
					double[] vec = VMath.normalize(velocity);
//					if (VMath.dotprod(vec, VMath.normalize(temp)) < .9) {

//					synchronized (o) {
//						try {
//							o.wait();
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}

					coordSys.setZAxis(new double[] { vec[0], vec[1], vec[2], 0 });

					double[] xVec = VMath.normalize(VMath.crossprd(vec, position));
//					synchronized (smoothedAccVec) {
					if (VMath.mag(temp) > 0.0) {
						xVec = VMath.normalize(VMath.crossprd(vec, VMath.normalize(temp)));
					}
//					}

					coordSys.setXAxis(new double[] { xVec[0], xVec[1], xVec[2], 0 });
					coordSys.setYAxis(
							VMath.crossprd(coordSys.xAxis().getVectorForm(), coordSys.zAxis().getVectorForm()));
//					}
					/*---*/
				}
			}
//			}
		}.start();
	}

	@Override
	public void setPosition(double[] pos) {
		super.setPosition(pos);
		coordSys.setPositionAsVec(new double[] { position[0], position[1], position[2] });
		// System.out.println("p="+position[0]+" "+position[1]+" "+position[2]);

	}

	@Override
	public void setVelocity(double[] vel) {
		super.setVelocity(vel);
		coordSys.setVelocityAsVec(vel);
		if (moveable) {
//			new Thread() {
//				public void run() {
//			double[] vec = VMath.normalize(velocity);
//			double[] dblVec = new double[] { vec[0], vec[1], vec[2], 0 };
//			coordSys.setZAxis(dblVec);
//
//			double[] xVec = VMath.normalize(VMath.crossprd(vec, position));
//			synchronized (smoothedAccVec) {
//				if (VMath.mag(smoothedAccVec) > 0.0) {
//					xVec = VMath.normalize(VMath.crossprd(vec, VMath.normalize(smoothedAccVec)));
//				}
//			}
//
//			coordSys.setXAxis(new double[] { xVec[0], xVec[1], xVec[2], 0 });
//			coordSys.setYAxis(VMath.crossprd(coordSys.xAxis().getVectorForm(), coordSys.zAxis().getVectorForm()));
//					GFXFramework.sleep(50);
//				}
//			}.start();
		}
	}

	/**
	 * @return the coordSys
	 */
	public CoordSys getCoordSys() {
		return coordSys;
	}

	@Override
	public void draw(GFXFramework gfx, CoordSys cs) {
		Graphics2D g2 = gfx.getG2();
		ScreenPoint sp = cs.getScrnCoords(getPosition(), gfx.getSize());
		if (sp.isInView()) {
			g2.setColor(getColor());
			g2.fillOval(sp.x - 4, sp.y - 4, 9, 9);
		}
	}
}
