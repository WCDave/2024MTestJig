package main;

import enums.CRUISE_SPEED;
import main.effects.ICruiseTo;
import orbits.Abstract3DModelObject;
import orbits.CoordSys;
import orbits.World3DContainer;

public class RocketViewStrategy implements IExternalViewStrategy<ExternalView> {

	@Override
	public void applyToView(ExternalView view) {

		Craft viewCraft = (Craft) World3DContainer.getInstance().getItem(ViewChaseCraft.CHASE_NAME);
		if (viewCraft == null) {
			viewCraft = new ViewChaseCraft(view.getCraft(), view);
			World3DContainer.getInstance().addCraft(viewCraft);
			view.setViewingCoordSys(viewCraft.getCoordSys());
		}

		// view.getCoordSys().setPositionAsVec(displacedVec);

		// view.getCoordSys().setPositionAsVec(viewCraft.getPosition());
//    if (view.isViewLock()) {
//      tempSys.zRotate(-90);
//      view.getCoordSys().setXAxis(tempSys.xAxis().getVectorForm());
//      view.getCoordSys().setYAxis(tempSys.yAxis().getVectorForm());
//      view.getCoordSys().setZAxis(tempSys.zAxis().getVectorForm());
//    }
	}

	@Override
	public void reset() {
		ViewChaseCraft viewCraft = (ViewChaseCraft) World3DContainer.getInstance().getItem(ViewChaseCraft.CHASE_NAME);
		if (viewCraft != null) {
			viewCraft.stopThread();
			World3DContainer.getInstance().removeCraft(viewCraft);
		}
	}

	
}
