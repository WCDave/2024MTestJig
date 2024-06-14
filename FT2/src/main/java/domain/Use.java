package domain;

public class Use {

	private Long pid;
	private String code;
	private String descr;
	
	public Use()
	{
		
	}
	
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public Long getPid() {
		return pid;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCode() {
		return code;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getDescr() {
		return descr;
	}
}
