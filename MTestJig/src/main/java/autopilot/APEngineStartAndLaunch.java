package autopilot;

import java.util.Date;

import orbits.NavComputer;
import orbits.Planet;
import Foundation.Utils;
import VMath.VMath;
import enums.ControlInputSource;

public class APEngineStartAndLaunch extends AFCSTargetingStrategy {

  private Date startTime;

  public APEngineStartAndLaunch(NavComputer computer) {
    super(computer);
  }

  @Override
  public void run() {
    super.run();
    computer.setAnnunMsg("Launch Sequence");
    Utils.sleep(5000);
    startTime = new Date();

    int i = 10;
    while (!targetReached()) {
      if (i <= 6) {
        computer.setAnnunMsg(i + "-Ignition");
        if (i == 6) {
          computer.getControlAdapter().rampThrust(10, ControlInputSource.COMPUTER);
        }
      } else {
        computer.setAnnunMsg(Integer.toString(i));
      }
      i--;
      Utils.sleep(1000);
    }
    computer.getControlAdapter().setThrottle(60);
    while (VMath.mag(computer.getCraft().getCoordSys().getPositionVec()) < ((Planet) computer.getReferenceObject()).getRadius()+200) {
    	Utils.sleep(20);
    }
    computer.setAnnunMsg("Liftoff");
  }

  @Override
  public boolean targetReached() {
    long dt = new Date().getTime() - startTime.getTime();
    return dt > 10000;
  }

}
