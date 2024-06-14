package domain;

import java.util.Date;
import java.util.List;

/**
 * Purchaseorder entity. @author MyEclipse Persistence Tools
 */
public class Purchaseorder extends AbstractPurchaseorder implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Purchaseorder() {
	}

	/** minimal constructor */
	public Purchaseorder(Integer purchaseordernumber) {
		super(purchaseordernumber);
	}

	/** full constructor */
	public Purchaseorder(Integer purchaseordernumber, Date orderdate,
			Date requireddate, Date shippeddate, String status,
			String comments, Integer customernumber, List orderdetails) {
		super(purchaseordernumber, orderdate, requireddate, shippeddate,
				status, comments, customernumber, orderdetails);
	}

}
