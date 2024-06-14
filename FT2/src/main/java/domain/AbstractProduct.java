package domain;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * AbstractProduct entity provides the base persistence definition of the Product entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractProduct  implements java.io.Serializable {


    // Fields    

     private String productcode;
     private String productname;
     private Long productLinePID;
     private ProductLine productLine;
     private String productscale;
     private String productvendor;
     private String productdescription;
     private Integer quantityinstock;
     private Double buyprice;
     private Double msrp;
     private Set orderdetails = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractProduct() {
    }

	/** minimal constructor */
    public AbstractProduct(String productcode) {
        this.productcode = productcode;
    }
    
    

   
    // Property accessors

    public String getProductcode() {
        return this.productcode;
    }
    
    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public String getProductname() {
        return this.productname;
    }
    
    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Long getProductLinePID() {
        return this.productLinePID;
    }
    
    public void setProductLinePID(Long productline) {
        this.productLinePID = productline;
    }

    public String getProductscale() {
        return this.productscale;
    }
    
    public void setProductscale(String productscale) {
        this.productscale = productscale;
    }

    public String getProductvendor() {
        return this.productvendor;
    }
    
    public void setProductvendor(String productvendor) {
        this.productvendor = productvendor;
    }

    public String getProductdescription() {
        return this.productdescription;
    }
    
    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }

    public Integer getQuantityinstock() {
        return this.quantityinstock;
    }
    
    public void setQuantityinstock(Integer quantityinstock) {
        this.quantityinstock = quantityinstock;
    }

    public Double getBuyprice() {
        return this.buyprice;
    }
    
    public void setBuyprice(Double buyprice) {
        this.buyprice = buyprice;
    }

    public Double getMsrp() {
        return this.msrp;
    }
    
    public void setMsrp(Double msrp) {
        this.msrp = msrp;
    }

    public Set getOrderdetails() {
        return this.orderdetails;
    }
    
    public void setOrderdetails(Set orderdetails) {
        this.orderdetails = orderdetails;
    }

	public void setProductLine(ProductLine productLine) {
		this.productLine = productLine;
	}

	public ProductLine getProductLine() {
		return productLine;
	}
   








}