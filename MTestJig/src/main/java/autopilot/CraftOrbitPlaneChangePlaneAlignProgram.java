package autopilot;

import orbits.NavComputer;
import orbits.Newtonian;
import orbits.OrbitToOrbitChangeTransformer;
import orbits.World3DContainer;

public class CraftOrbitPlaneChangePlaneAlignProgram extends OrbitPlaneAlignProgram {

	public CraftOrbitPlaneChangePlaneAlignProgram(NavComputer computer, String craftName) {
	    super(computer);
	    Newtonian satellite = (Newtonian) World3DContainer.getInstance().getItem(craftName);
	 
	    transformer = new OrbitToOrbitChangeTransformer((Newtonian)rocket, satellite, computer);
	  }
}
