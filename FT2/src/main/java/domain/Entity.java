package domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Entity implements Serializable {

	private Long pid;
	private Date DOB;
	private Date DOD;
	private String entityName;
	
	private Set<Address> addresses = new HashSet<Address>(0);
	
	public Entity()
	{
		
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Long getPid() {
		return pid;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOD(Date DOD) {
		this.DOD = DOD;
	}

	public Date getDOD() {
		return DOD;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}
}
