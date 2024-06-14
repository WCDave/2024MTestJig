package domain;

import java.util.Date;

import domain.annotations.RelatedEntities;

@RelatedEntities(entities={"domain.Customer"}, keys={"customerNumber"})
public class Payment {
	
	private String checkNumber;
	private long customerNumber;
	private Date paymentDate;
	private long pid;
	private float amount;
	
	public Payment(){
		
	}
	
	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}
	
	public String getCheckNumber() {
		return checkNumber;
	}
	
	public void setCustomerNumber(long customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	public long getCustomerNumber() {
		return customerNumber;
	}
	
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	public Date getPaymentDate() {
		return paymentDate;
	}
	
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	public float getAmount() {
		return amount;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public long getPid() {
		return pid;
	}

}
