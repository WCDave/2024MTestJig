package threeD;

import threeD.CoordSys.AXIS;

public interface IAutoCoordSysAutoAlign {

	void autoAlign(AXIS alignToAxis, AXIS rotAxis);
	void stopAutoAlign();

}
