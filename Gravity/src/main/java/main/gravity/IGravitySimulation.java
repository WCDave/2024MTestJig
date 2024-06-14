package main.gravity;

import java.util.List;

public interface IGravitySimulation<T> {
	final public static double G = (double) -6.672e-11;
	final public static double SOFTENING_FACTOR = 75;

	void applyGravity(double dt);

	List<T> getParticleList();
}
