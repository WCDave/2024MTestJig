package orbits;

import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;

import org.apache.commons.lang.math.NumberUtils;

import autopilot.AFCSTargetingStrategy;
import autopilot.CraftOrbitPlaneChangePlaneAlignProgram;
import autopilot.PlanetPlaneChangePlaneAlignProgram;

/**
 * Created by dbutterw on 5/22/2017.
 */
public class PlaneChangeCommandHandler implements ICommandHandler<Matcher, AFCSTargetingStrategy> {

	private NavComputer computer;

	public PlaneChangeCommandHandler(NavComputer computer) {
		this.computer = computer;
	}

	@Override
	public List<AFCSTargetingStrategy> handle(Matcher m) {
		CoordSys cs = (CoordSys) computer.getReferenceObject().getCoordSys().clone();
		AFCSTargetingStrategy p;
		String resultCommand = m.group().substring(1);
		if (!NumberUtils.isNumber(resultCommand)) {
			p = new CraftOrbitPlaneChangePlaneAlignProgram(computer, "Test1");
		} else {
			float targetPlaneAngle = Float.parseFloat(resultCommand);
			computer.setOrbitInclination(targetPlaneAngle);

			cs.xRotate(targetPlaneAngle);
			p = new PlanetPlaneChangePlaneAlignProgram(computer,
					cs.zAxis().getVectorForm());
		}
		

		return Collections.singletonList(p);
	}
}
