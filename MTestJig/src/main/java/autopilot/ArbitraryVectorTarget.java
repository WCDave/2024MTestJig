package autopilot;

import java.util.List;

import orbits.NavComputer;

public class ArbitraryVectorTarget extends OnOrbitAlignmentStrategy {

	private double[] cruiseToVector;

	public ArbitraryVectorTarget(NavComputer computer) {
		super(computer);
	}

	@Override
	public List<double[]> acquireTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setUpdatedCruiseToVector(double[] vector) {
		cruiseToVector = vector;
	}

}
