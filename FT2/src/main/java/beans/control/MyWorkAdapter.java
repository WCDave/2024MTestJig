package beans.control;

import javax.resource.spi.work.WorkAdapter;
import javax.resource.spi.work.WorkEvent;

public class MyWorkAdapter extends WorkAdapter {
	
	@Override
	public void workAccepted(WorkEvent e) {
		// TODO Auto-generated method stub
		super.workAccepted(e);
	}
	
	@Override
	public void workCompleted(WorkEvent e) {
		// TODO Auto-generated method stub
		super.workCompleted(e);
	}
	
	@Override
	public void workStarted(WorkEvent e) {
		// TODO Auto-generated method stub
		super.workStarted(e);
	}
	
	@Override
	public void workRejected(WorkEvent e) {
		// TODO Auto-generated method stub
		super.workRejected(e);
	}

}
