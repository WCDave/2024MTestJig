package domain;

public class Provider {

	private String id;
	private Long pid;
	
	public Provider()
	{
		
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Long getPid() {
		return pid;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
