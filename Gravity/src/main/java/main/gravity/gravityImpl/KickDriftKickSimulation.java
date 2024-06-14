package main.gravity.gravityImpl;

import java.util.List;

import VMath.VMath;
import main.Particle;
import main.gravity.IGravitySimulation;

public class KickDriftKickSimulation implements IGravitySimulation<Particle> {

	private List<Particle> particleList;

	public KickDriftKickSimulation(List<Particle> particleList) {
		this.particleList = particleList;
	}

	@Override
	public void applyGravity(double dt) {
		synchronized (particleList) {
			for (int i = 0; i < particleList.size(); i++) {
				Particle p1 = particleList.get(i);

				for (int j = i + 1; j < particleList.size(); j++) {
					// # (1/2) kick
					// vel += acc * dt/2.0
					//
					// # drift
					// pos += vel * dt
					//
					// # update accelerations
					// acc = getAcc( pos, mass, G, softening )
					//
					// # (1/2) kick
					// vel += acc * dt/2.0
					Particle p2 = particleList.get(j);
					p1.setVelocity(VMath.vecAdd(p1.getVelocity(), VMath.vecMultByScalar(p1.getAccVec(), dt / 2)));
					p2.setVelocity(VMath.vecAdd(p2.getVelocity(), VMath.vecMultByScalar(p2.getAccVec(), dt / 2)));

					p1.setPosition(VMath.vecAdd(p1.getPosition(), VMath.vecMultByScalar(p1.getVelocity(), dt)));
					p2.setPosition(VMath.vecAdd(p2.getPosition(), VMath.vecMultByScalar(p2.getVelocity(), dt)));
					//
					double[] distVec = VMath.vecSubtract(p1.getPosition(), p2.getPosition());
					double r = VMath.mag(distVec) + SOFTENING_FACTOR;
					//
					double accVec[] = VMath.vecMultByScalar(distVec, G * p2.getMass() / (r * r * r));
					p1.setAccVec(accVec);
					p1.setVelocity(VMath.vecAdd(p1.getVelocity(), VMath.vecMultByScalar(accVec, dt / 2)));

					accVec = VMath.vecMultByScalar(distVec, -G * p1.getMass() / (r * r * r));
					p2.setAccVec(accVec);
					p2.setVelocity(VMath.vecAdd(p2.getVelocity(), VMath.vecMultByScalar(accVec, dt / 2)));
				}
			}
		}

	}

	@Override
	public List<Particle> getParticleList() {
		// TODO Auto-generated method stub
		return null;
	}

}
