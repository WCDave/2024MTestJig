package domain;

import java.util.ArrayList;
import java.util.List;

public class RequestItem {
	
	private Long pid;
	private Request request;
	private List<RequestItemDetail> requestItemDetails = new ArrayList<RequestItemDetail>();
	
	public RequestItem(){
		
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Long getPid() {
		return pid;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequestItemDetails(List<RequestItemDetail> requestItemDetails) {
		this.requestItemDetails = requestItemDetails;
	}

	public List<RequestItemDetail> getRequestItemDetails() {
		return requestItemDetails;
	}

}
