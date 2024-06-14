package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * AbstractPurchaseorder entity provides the base persistence definition of the
 * Purchaseorder entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPurchaseorder implements java.io.Serializable {

	// Fields

	private Integer purchaseordernumber;
	private Date orderdate;
	private Date requireddate;
	private Date shippeddate;
	private String status;
	private String comments;
	private Integer customernumber;
	private List<AbstractOrderdetail> orderdetails = new ArrayList<AbstractOrderdetail>(0);

	// Constructors

	/** default constructor */
	public AbstractPurchaseorder() {
	}

	/** minimal constructor */
	public AbstractPurchaseorder(Integer purchaseordernumber) {
		this.purchaseordernumber = purchaseordernumber;
	}

	/** full constructor */
	public AbstractPurchaseorder(Integer purchaseordernumber, Date orderdate,
			Date requireddate, Date shippeddate, String status,
			String comments, Integer customernumber, List orderdetails) {
		this.purchaseordernumber = purchaseordernumber;
		this.orderdate = orderdate;
		this.requireddate = requireddate;
		this.shippeddate = shippeddate;
		this.status = status;
		this.comments = comments;
		this.customernumber = customernumber;
		this.orderdetails = orderdetails;
	}

	// Property accessors

	public Integer getPurchaseordernumber() {
		return this.purchaseordernumber;
	}

	public void setPurchaseordernumber(Integer purchaseordernumber) {
		this.purchaseordernumber = purchaseordernumber;
	}

	public Date getOrderdate() {
		return this.orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public Date getRequireddate() {
		return this.requireddate;
	}

	public void setRequireddate(Date requireddate) {
		this.requireddate = requireddate;
	}

	public Date getShippeddate() {
		return this.shippeddate;
	}

	public void setShippeddate(Date shippeddate) {
		this.shippeddate = shippeddate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getCustomernumber() {
		return this.customernumber;
	}

	public void setCustomernumber(Integer customernumber) {
		this.customernumber = customernumber;
	}

	public List getOrderdetails() {
		return this.orderdetails;
	}

	public void setOrderdetails(List orderdetails) {
		this.orderdetails = orderdetails;
	}

}