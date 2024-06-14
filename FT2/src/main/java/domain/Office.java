package domain;

import java.util.HashSet;
import java.util.Set;

import domain.annotations.RelatedEntities;

/**
 * Office entity. @author MyEclipse Persistence Tools
 */
@RelatedEntities(entities={"domain.Entity"}, keys={"pid"})
public class Office extends Entity implements java.io.Serializable {

	// Fields

	private String phone;	
	private String territory;
	private Set<Employee> employees = new HashSet<Employee>(0);
	private String city;

	// Constructors

	/** default constructor */
	public Office() {
	}


	// Property accessors
	

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getTerritory() {
		return this.territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}

	public Set<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCity() {
		return city;
	}

}