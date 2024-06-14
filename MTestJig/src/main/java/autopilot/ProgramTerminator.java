package autopilot;

import Foundation.Utils;
import enums.ComputerButtonKeys;
import gui.ComputerAbstractButton;
import orbits.NavComputer;
import org.apache.log4j.Logger;

public class ProgramTerminator extends AFCSStrategy {

  private Logger log = Logger.getLogger(ProgramTerminator.class);

  public ProgramTerminator(NavComputer computer) {
    super(computer);
  }

  @Override
  public void run() {
    super.run();
    ComputerAbstractButton button = computer.getButton(ComputerButtonKeys.PROGRADE);
    button.setSelected(false);
    button.doClick();

    button = computer.getButton(ComputerButtonKeys.RETROGRADE);
    button.setSelected(false);
    button.doClick();
    computer.getButton(ComputerButtonKeys.AUTOLAUNCH).setSelected(false);
    computer.setAnnunMsg("Program Ended");
    computer.setFlashAnnun(true);
    computer.getControlAdapter().setPlanetSelectEnabled(true);
    log.info("Program Ended msg");
    Utils.sleep(8000);
    computer.setAnnunMsg(null);
  }
}
