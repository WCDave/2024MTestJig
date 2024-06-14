package domain;

import java.util.ArrayList;
import java.util.List;

public class Request {
	
	private String id;
	private Long pid;
	private List<RequestItem> requestItems = new ArrayList<RequestItem>();
	
	public Request()
	{
		
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Long getPid() {
		return pid;
	}

	public void setRequestItems(List<RequestItem> requestItems) {
		this.requestItems = requestItems;
	}

	public List<RequestItem> getRequestItems() {
		return requestItems;
	}

}
