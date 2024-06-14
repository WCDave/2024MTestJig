package main.model.impl;

import VMath.VMath;
import main.Particle;
import main.model.IInteraction;


public class Interaction implements IInteraction, Comparable<IInteraction> {

  private Particle[] particles = new Particle[2];
  private double distanceBetween;

  public Interaction(Particle a, Particle b) {
    particles[0] = a;
    particles[1] = b;
  }
  @Override
  public Particle getParticleA() {
    return particles[0];
  }

  @Override
  public Particle getParticleB() {
    return particles[1];
  }

  @Override
  public double getDistance() {
    return distanceBetween;
  }

  @Override
  public void prepInteraction() {
    distanceBetween = VMath.mag(VMath.vecSubtract(particles[0].getPosition(), particles[1].getPosition()));
  }

  @Override
  public int compareTo(IInteraction o) {
    if(this.getDistance() - o.getDistance() > 0) {
      return 1;
    }
    else {
      return -1;
    }
  }
}
