package threeD;

import VMath.VMath;
import gfxmain.GFXFramework;
import threeD.CoordSys.AXIS;

public class DefaultCoordSysAutoAlignImpl implements IAutoCoordSysAutoAlign {

	private boolean stop;
	private CoordSys coordSys;
	private double[] prevAlignToVec;
	private static final double ROT_SPD =1;

	public DefaultCoordSysAutoAlignImpl(CoordSys cs) {
		this.coordSys = cs;
//		this.prevAlignToVec = new double[] {0,0,0,0};
	}

	@Override
	public void autoAlign(AXIS alignToAxis, AXIS rotAxis) {
		new Thread() {
			public void run() {
				while (!stop) {
					GFXFramework.sleep(10000);
					prevAlignToVec = coordSys.getVelocityAsVec();
//					System.out.println("cmp Thread: "+ prevAlignToVec[0]+", "+prevAlignToVec[1]+", "+prevAlignToVec[2]);
//					System.out.println("cmp Thread zCmp: "+ VMath.dotprod(coordSys.zAxis().getVectorForm(), prevAlignToVec));
				}
			}
		}.start();

		new Thread() {
			public void run() {
				while (!stop) {
					GFXFramework.sleep(100);

					if (prevAlignToVec != null && !prevAlignToVec.equals(coordSys.getVelocityAsVec())) {
						double[] accVec = VMath
								.normalize(VMath.vecSubtract(coordSys.getVelocityAsVec(), prevAlignToVec));
						double[] xAxis = coordSys.xAxis().getVectorForm();
						double[] yAxis = coordSys.yAxis().getVectorForm();
						double[] zAxis = coordSys.zAxis().getVectorForm();
//						double[] xTarget = VMath.normalize(VMath.crossprd(VMath.vecSubtract(coordSys.getVelocityAsVec(), prevAlignToVec), coordSys.getVelocityAsVec()));

						double[] xTarget = VMath.normalize(VMath.crossprd(accVec, prevAlignToVec));
//						
						double dotyAxis = VMath.dotprod(xTarget, yAxis);
						double dotxAxis = VMath.dotprod(xTarget, xAxis);
//						System.out.println("x thread dotx: "+dotxAxis);
						int ii = 0;
						synchronized (coordSys) {
							double yeFactor = Math.abs(dotyAxis);
							double xeFactor = 1-Math.abs(dotxAxis);

							if (yeFactor > .1) {
								System.out
										.println("xthread correcting targetdotx:  doty: " + dotyAxis);
								if (dotyAxis > 0.0) {
									coordSys.zRotate(-ROT_SPD*yeFactor);
								} else if (dotyAxis < 0.0) {
									coordSys.zRotate(ROT_SPD*yeFactor);
								}
							} else if (dotxAxis < .95) {
								System.out
								.println("ythread correcting targetdotx:  dotx " + dotxAxis);
									double dotzAxis = VMath.dotprod(xTarget, zAxis);
									if (dotzAxis > 0) {
										coordSys.yRotate(-ROT_SPD*xeFactor);
									} else if (dotzAxis < 0) {
										coordSys.yRotate(ROT_SPD*xeFactor);
									}

								} else {
									coordSys.notify();
								}	
						}

					}
				}
			}
		}.start();

		new Thread() {
			public void run() {
				while (!stop) {
					GFXFramework.sleep(100);
					if (prevAlignToVec != null && !prevAlignToVec.equals(coordSys.getVelocityAsVec())) {
						double[] zTarget = VMath.normalize(coordSys.getVelocityAsVec());
						double[] zAxis = coordSys.zAxis().getVectorForm();
						double[] yAxis = coordSys.yAxis().getVectorForm();
						double zAxisDotTarget = VMath.dotprod(zAxis, zTarget);
						double yAxisDotTarget = VMath.dotprod(yAxis, zTarget);
						synchronized (coordSys) {
							try {
								coordSys.wait();
								int iii = 0;

								if (zAxisDotTarget < .98) {
									System.out.println("**zthread correcting zdottarget: " + zAxisDotTarget);
									if (yAxisDotTarget > 0) {
										coordSys.xRotate(ROT_SPD);
									} else if (yAxisDotTarget < 0) {
										coordSys.xRotate(-ROT_SPD);
									}
								}
							} catch (InterruptedException e) {
							}
						}
//						System.out
//								.println("z thread dotTargetz: " + zAxisDotTarget + ", yDotTarget: " + yAxisDotTarget);
					}
//					prevAlignToVec = coordSys.getVelocityAsVec();

				}
			}
		}.start();
	}

	@Override
	public void stopAutoAlign() {
		this.stop = true;
	}
}
