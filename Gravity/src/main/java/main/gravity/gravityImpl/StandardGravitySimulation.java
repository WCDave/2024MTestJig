package main.gravity.gravityImpl;

import VMath.VMath;
import main.Particle;
import main.gravity.IGravitySimulation;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class StandardGravitySimulation implements IGravitySimulation {

  final public static double G = (double)-6.672e-11;
  private double maxVel;
  private double minVel;
  private double startingSystemEnergy;
  private double systemEnergy;
  private List<Particle> particleList;

  ExecutorService executor;

  public StandardGravitySimulation(List<Particle> particleList) {
    this.particleList = particleList;
  }

  @Override
  public void applyGravity(double dt) {
    //normalizeEnergy();
    executor = Executors.newFixedThreadPool(20);
    for(int i=0;i<particleList.size();i++){
      Particle p1 = particleList.get(i);
      //float timeFactor=1;

      for(int j=0;j<particleList.size();j++){
        Particle p2 = particleList.get(j);
        if(p1==p2) continue;
        executor.submit(new GravCallable(p1, p2));
//        double[] distVec = VMath.vecSubtract(p1.getPosition(), p2.getPosition());
//        double r = VMath.mag(distVec)+1.75;
//
//        double accVec[] = VMath.vecMultByScalar(distVec, G*p2.getMass()/(r*r*r));
//        p1.setAccVec(accVec);
        //p1.setVelocity(VMath.vecAdd(p1.getVelocity(), VMath.vecMultByScalar(accVec,dt/p1.getTimeFactor())));
      }
//      double vel = VMath.mag(p1.getVelocity());
//      if(vel>maxVel) maxVel = vel;
//      if(vel<minVel || minVel == 0) minVel = vel;
      //p1.setPosition(VMath.vecAdd(p1.getPosition(), VMath.vecMultByScalar(p1.getVelocity(), dt)));
    }
    try {
      executor.awaitTermination(50, TimeUnit.MILLISECONDS);
    } catch (InterruptedException e) {}
    //executor = Executors.newFixedThreadPool(20);



      Iterator<Particle> it = particleList.iterator();
      while (it.hasNext()) {

        Particle p = it.next();

        executor.submit(new PositionCallable( p, dt));
//      p.setVelocity(VMath.vecAdd(p.getVelocity(), VMath.vecMultByScalar(p.getAccVec(),dt)));
//      p.setPosition(VMath.vecAdd(p.getPosition(), VMath.vecMultByScalar(p.getVelocity(), dt)));

    }
   
    executor.shutdown();
  }

  @Override
  public List<Particle> getParticleList() {
    return particleList;
  }

  private void normalizeEnergy() {
    systemEnergy = getGravitationalPotentialEnergy() + getKineticEnergy();
    //System.out.println("SE: "+ systemEnergy+", Ratio: "+ (startingSystemEnergy / systemEnergy));
    double energyNormalizingFactor = startingSystemEnergy / systemEnergy;
    //double energyNormalizingFactor = 1+Math.signum(startingSystemEnergy - systemEnergy)*.1;
    energyNormalizingFactor = energyNormalizingFactor * energyNormalizingFactor;
    //System.out.println(energyNormalizingFactor);
    if(energyNormalizingFactor != 0 ) {
      synchronized (particleList) {
        for (Particle p : particleList) {
          p.setVelocity(VMath.vecMultByScalar(p.getVelocity(), energyNormalizingFactor));
        }
      }
    }
  }

  private double getKineticEnergy() {
    double result = 0;
    for(Particle p : particleList) {
      result += .5 * p.getMass() * VMath.mag(p.getVelocity()) * VMath.mag(p.getVelocity());
    }
    //System.out.println("KE: "+ result);
    return result;

  }

  public double getGravitationalPotentialEnergy() {
    double result=0;
    Particle p1, p2;
    for(int i=0;i<particleList.size();i++)  {
      if(i < particleList.size()-2) {
        for(int j=i+1;j<particleList.size();j++) {
          p1 = particleList.get(i);
          p2 = particleList.get(j);
          double[] distVec = VMath.vecSubtract(p1.getPosition(),p2.getPosition());
          //if(VMath.mag(distVec) != 0) {
            result+= -G * p1.getMass()*p2.getMass() / (Math.max(VMath.mag(distVec), 10));
          //}
        }
      }
    }
    //System.out.println("PE: "+ result);
    return result;
  }

  public double getMaxVel()
  {
    return maxVel;
  }

  public double getMinVel()
  {
    return minVel;
  }

  public double getStartingSystemEnergy() {
    return startingSystemEnergy;
  }

  public double getSystemEnergy() {
    return systemEnergy;
  }

  private class GravCallable implements Callable<Void> {
    private Particle particle1;
    private Particle particle2;

    GravCallable(Particle p1, Particle p2) {
      particle1 = p1;
      particle2 = p2;
    }

    @Override
    public Void call() throws Exception {
      double[] distVec = VMath.vecSubtract(particle1.getPosition(), particle2.getPosition());
      double r = VMath.mag(distVec)+50;

     // double gravDiminish = 1.0-1.0/Math.exp(r/400);
      double gravDiminish = 1.0;
//      if(r < 10) {
//        System.out.println(r+" ----"+gravDiminish);
      //System.out.println(r);
//      }

      double accVec[] = VMath.vecMultByScalar(distVec, gravDiminish*G*particle2.getMass()/(r*r*r));
      particle1.setAccVec(accVec);
      return null;
    }
  }

  private class PositionCallable implements Callable<Void> {
    private Particle p;
    private double dt;

    PositionCallable(Particle p, double dt) {
      this.p = p;
      this.dt = dt;
    }

    @Override
    public Void call() throws Exception {
      p.setVelocity(VMath.vecAdd(p.getVelocity(), VMath.vecMultByScalar(p.getAccVec(), dt)));
      p.setPosition(VMath.vecAdd(p.getPosition(), VMath.vecMultByScalar(p.getVelocity(), dt)));
      return null;
    }
  }
}
