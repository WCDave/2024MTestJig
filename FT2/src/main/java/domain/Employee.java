package domain;

import java.util.Set;

/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee  extends Entity implements java.io.Serializable {

	// Fields

	private Long employeenumber;
	private Office office;
	private String lastname;
	private String firstname;
	private String extension;
	private String email;
	private Employee reportsto;
	private String jobtitle;
	private Employee boss;
	private Set<Employee> reportTos;

	// Constructors

	/** default constructor */
	public Employee() {
	}


	// Property accessors

	public Long getEmployeenumber() {
		return this.employeenumber;
	}

	public void setEmployeenumber(Long employeenumber) {
		this.employeenumber = employeenumber;
	}

	public Office getOffice() {
		return this.office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Employee getReportsto() {
		return this.reportsto;
	}

	public void setReportsto(Employee reportsto) {
		this.reportsto = reportsto;
	}

	public String getJobtitle() {
		return this.jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}


	public void setBoss(Employee reportsToEmployee) {
		this.boss = reportsToEmployee;
	}


	public Employee getBoss() {
		return boss;
	}


	public void setReportTos(Set<Employee> reportTos) {
		this.reportTos = reportTos;
	}


	public Set<Employee> getReportTos() {
		return reportTos;
	}

}