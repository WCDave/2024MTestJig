package main.model;


import main.Particle;

public interface IInteraction {

  Particle getParticleA();
  Particle getParticleB();
  double getDistance();
  void prepInteraction();
}
