package domain;

import domain.annotations.RelatedEntities;

/**
 * Address entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings("serial")
@RelatedEntities(entities={"domain.Office"}, keys={"entityPid"})
public class Address  implements java.io.Serializable {

	// Fields

	private Long pid;
	private String addressline1;
	private String addressline2;
	private String city;
	private String state;
	private String postalcode;
	private String country;
	private Long entityPid;
	private String addressType;
	private Entity entity;

	// Constructors

	/** default constructor */
	public Address() {
	}

	// Property accessors

	public Long getPid() {
		return this.pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getAddressline1() {
		return this.addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return this.addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalcode() {
		return this.postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setEntityPid(Long entity_pid) {
		this.entityPid = entity_pid;
	}

	public Long getEntityPid() {
		return entityPid;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setEntity(Entity entity) {
		this.entity = entity;
	}

	public Entity getEntity() {
		return entity;
	}

}