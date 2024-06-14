package main;

import java.util.ArrayList;
import java.util.List;

import VMath.VMath;
import gfxmain.GFXFramework;
import main.gravity.IGravitySimulation;
import main.gravity.gravityImpl.KickDriftKickSimulation;
import threeD.Trackable3D;

public class GravityThread extends Thread implements Trackable3D {

	final public static double G = (double) -6.672e-11;
	private double startingSystemEnergy;
	private double systemEnergy;
	private double maxParticleSpeed;
	private double ke, pe;
	private double dt = 1;
	private double[] centerOfMass = new double[] { 0, 0, 0, 0 };
	private double[] angularMomentum = new double[] { 0, 0, 0, 0 };

	private IGravitySimulation<Particle> gravitySimulation;
	private List<Particle> particleList;
	private ViewingParticle viewingParticle;

	public GravityThread(List<Particle> particleList, ViewingParticle vp) {
		this.particleList = particleList;
//    gravitySimulation = new StandardGravitySimulation(particleList);
		gravitySimulation = new KickDriftKickSimulation(particleList);
		this.viewingParticle = vp;
	}

	public void initialize(double dt) {
		this.dt = dt;
		ke = getKineticEnergy();
		pe = getGravitationalPotentialEnergy();
		startingSystemEnergy = ke + pe;
	}

	public void run() {
		// long t1=new Date().getTime();
		new Thread() {
			public void run() {
				try {
					setPriority(MIN_PRIORITY);
					while (true) {
						synchronized (particleList) {
							ke = getKineticEnergy();
							pe = getGravitationalPotentialEnergy();
							systemEnergy = ke + pe;
							centerOfMass = calculateCenterOfMass();
							angularMomentum = calculateAngularMomentum();
						}
						sleep(5000L);
					}
				} catch (InterruptedException e) {
				}
			}
		}.start();

		while (true) {
			// long t2 = new Date().getTime();

			gravitySimulation.applyGravity(this.dt);
//			synchronized (viewingParticle) {
//				viewingParticle.notifyAll();
//			}
			GFXFramework.sleep(1);

			// t1=t2;
		}
	}

	private double getKineticEnergy() {
		double result = 0;
		double maxParticleSpeed = 0;
		for (Particle p : particleList) {
			double spd = VMath.mag(p.getVelocity());
			result += .5 * p.getMass() * spd * spd;
			maxParticleSpeed = Math.max(this.maxParticleSpeed, spd);
		}
		this.maxParticleSpeed = maxParticleSpeed;
		return result;

	}

	private double getGravitationalPotentialEnergy() {
		double result = 0;
		// int counter = 0;
		Particle p1, p2;
		for (int i = 0; i < particleList.size(); i++) {
			for (int j = i + 1; j < particleList.size(); j++) {
				// counter++;
				p1 = particleList.get(i);
				p2 = particleList.get(j);
				double[] distVec = VMath.vecSubtract(p1.getPosition(), p2.getPosition());
				result += Math.abs(G) * p1.getMass() * p2.getMass() / (VMath.mag(distVec));
			}
		}
		// System.out.println(counter);
		return result;
	}

	private double[] calculateCenterOfMass() {
		double[] result = new double[] { 0, 0, 0, 0 };
		double M = 0;
		for (Particle p : particleList) {
			M = M + p.getMass();
		}
		for (Particle p : particleList) {
			for (int i = 0; i < 3; i++) {
				result[i] = result[i] + p.position[i] * (double) p.getMass();
//				result[i] = result[i] + p.position[i];
			}
		}

		result = VMath.vecMultByScalar(result, 1.0 / M);
//		result = VMath.vecMultByScalar(result, 1.0 / (double) particleList.size());

		System.out.println("CG: " + result[0] + " " + result[1] + " " + result[2]);
		return result;
	}

	private double[] calculateAngularMomentum() {
		List<double[]> angMoms = new ArrayList<double[]>();
		for (Particle p : particleList) {
//			double[] r = VMath.vecSubtract(p.getPosition(), centerOfMass);
//			double[] r = p.getPosition();
			double[] v = VMath.vecMultByScalar(p.getVelocity(), p.getMass());
			angMoms.add(VMath.crossprd(p.getPosition(), v));
		}

//		double[] result = VMath.EMA(torques, angMoms.size());
		double[] result = new double[] { 0, 0, 0, 0 };
		for (int i = 0; i < angMoms.size(); i++) {
			result = VMath.vecAdd(result, angMoms.get(i));
		}

		result = VMath.vecMultByScalar(result, 1 / new Double(angMoms.size()).doubleValue());

		System.out.println("ANGMO: " + result[0] + " " + result[1] + " " + result[2]);

		return result;
	}

	public double getStartingSystemEnergy() {
		return startingSystemEnergy;
	}

	public double getSystemEnergy() {
		return systemEnergy;
	}

	public double getMaxParticleSpeed() {
		return maxParticleSpeed;
	}

	public double getPe() {
		return pe;
	}

	public double getKe() {
		return ke;
	}

	@Override
	public double[] getIspectablePositionFromModel() {
		return centerOfMass;
	}

	public double[] getAngularMomentum() {
		return angularMomentum;
	}
}
