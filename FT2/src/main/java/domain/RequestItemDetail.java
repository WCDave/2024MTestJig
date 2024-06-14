package domain;

public class RequestItemDetail {
	
	
	private Long pid;
	private RequestItem requestItem;
	
	public RequestItemDetail(){
		
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Long getPid() {
		return pid;
	}

	public void setRequestItem(RequestItem requestItem) {
		this.requestItem = requestItem;
	}

	public RequestItem getRequestItem() {
		return requestItem;
	}

}
