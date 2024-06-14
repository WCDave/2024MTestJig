package main.gravity.gravityImpl;

import VMath.VMath;
import main.Particle;
import main.gravity.IGravitySimulation;
import main.model.IInteraction;
import main.model.impl.Interaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class EventDrivenGravitySimulation implements IGravitySimulation<Particle> {

  private List<Particle> particleList;
  private IInteraction[] interactions = null;
  ExecutorService executor;

  public EventDrivenGravitySimulation(List<Particle> particleList) {
    this.particleList = particleList;
    generateInteractions();
    prepareInteractions();
  }

  private void generateInteractions() {
    List<IInteraction> tempList = new ArrayList<IInteraction>();
    for(int i=0;i<particleList.size();i++) {
      Particle p1 = particleList.get(i);
      for (int j = i+1; j < particleList.size(); j++) {
        tempList.add(new Interaction(p1, particleList.get(j)));
      }
    }
    interactions = tempList.toArray(new IInteraction[tempList.size()]);
  }

  @Override
  public void applyGravity(double dt) {
    prepareInteractions();
    Arrays.sort(interactions);
    int j = 0;
    Future<Void>[] futures = new Future[20];
    executor = Executors.newFixedThreadPool(futures.length);
    System.out.println("---"+interactions[0].getDistance()+", ----"+interactions[interactions.length-1].getDistance());
    for(IInteraction i : interactions) {
      //System.out.println(i.getDistance());
      futures[j++] = executor.submit(new InteractionCallable(i));
      if(j == futures.length-1) {
        for (int k = 0; k < futures.length; k++) {
          try {
            futures[k].get();
          } catch (Exception e) {
          }
        }
        j = 0;
      }
//      Particle a = i.getParticleA();
//      Particle b = i.getParticleB();
//      double[] distVec = VMath.vecSubtract(b.getPosition(), a.getPosition());
//      double r = i.getDistance();
//
//      double accVec[] = VMath.vecMultByScalar(distVec, G * b.getMass() / (r * r * r));
//      accVec = VMath.vecAdd(a.getAccVec(), accVec);
//      a.setAccVec(accVec);
//
//      accVec = VMath.vecMultByScalar(VMath.vecMultByScalar(distVec, -1), G * a.getMass() / (r * r * r));
//      accVec = VMath.vecAdd(b.getAccVec(), accVec);
//      b.setAccVec(accVec);
    }
    executor.shutdown();


    for(Particle p : particleList) {
      p.setVelocity(VMath.vecAdd(p.getVelocity(), VMath.vecMultByScalar(p.getAccVec(), dt)));
      p.setPosition(VMath.vecAdd(p.getPosition(), VMath.vecMultByScalar(p.getVelocity(), dt)));
    }
  }

  private void prepareInteractions() {
    for(IInteraction i : interactions) {
      if(i != null) {
        i.prepInteraction();
      }
    }
  }

  @Override
  public List<Particle> getParticleList() {
    return particleList;
  }


  private class InteractionCallable implements Callable<Void> {

    private IInteraction interaction;

    public InteractionCallable(IInteraction i) {
      interaction = i;;
    }

    @Override
    public Void call() throws Exception {
      Particle a = interaction.getParticleA();
      Particle b = interaction.getParticleB();
      double[] distVec = VMath.vecSubtract(b.getPosition(), a.getPosition());
      double r = interaction.getDistance()+5;

      double accVec[] = VMath.vecMultByScalar(distVec, G * b.getMass() / (r * r * r));
      accVec = VMath.vecAdd(a.getAccVec(), accVec);
      a.setAccVec(accVec);

      accVec = VMath.vecMultByScalar(VMath.vecMultByScalar(distVec, -1), G * a.getMass() / (r * r * r));
      accVec = VMath.vecAdd(b.getAccVec(), accVec);
      b.setAccVec(accVec);
      return null;
    }
  }
}
