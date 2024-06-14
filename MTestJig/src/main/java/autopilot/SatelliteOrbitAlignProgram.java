package autopilot;

import main.Craft;
import orbits.*;

public class SatelliteOrbitAlignProgram extends OrbitPlaneAlignProgram {

  private Craft satellite;

  public SatelliteOrbitAlignProgram(NavComputer computer) {
    super(computer);
    satellite = (Craft) World3DContainer.getInstance().getItem("Test1");
    transformer = new OrbitToOrbitChangeTransformer(rocket, satellite, computer);
  }
}
