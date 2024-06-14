package domain;

import domain.annotations.RelatedEntities;



/**
 * Orderdetail entity. @author MyEclipse Persistence Tools
 */
@RelatedEntities(entities={"domain.PurchaseOrder","domain.Product"}, keys={"purchaseordernumber","productcode"})
public class Orderdetail extends AbstractOrderdetail implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public Orderdetail() {
    }

	/** minimal constructor */
    public Orderdetail(OrderdetailId id, Purchaseorder purchaseorder, Product product) {
        super(id, purchaseorder, product);        
    }
    
    /** full constructor */
    public Orderdetail(OrderdetailId id, Purchaseorder purchaseorder, Product product, Integer quantityordered, Double priceeach, Short orderlinenumber) {
        super(id, purchaseorder, product, quantityordered, priceeach, orderlinenumber);        
    }
   
}
