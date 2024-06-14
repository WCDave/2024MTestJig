package appMonitor;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class MyPhaseListener implements PhaseListener {

	
	public void afterPhase(PhaseEvent arg0) {
		//System.out.println("AFTER: "+arg0.getPhaseId()+" "+arg0.getSource());

	}

	
	public void beforePhase(PhaseEvent arg0) {
		//System.out.println("BEFORE: "+arg0.getPhaseId()+" "+arg0.getSource());

	}

	
	public PhaseId getPhaseId() {
		// TODO Auto-generated method stub
		return PhaseId.ANY_PHASE;
	}

}
