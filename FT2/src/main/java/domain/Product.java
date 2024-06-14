package domain;

import java.util.Set;


/**
 * Product entity. @author MyEclipse Persistence Tools
 */
public class Product extends AbstractProduct implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public Product() {
    }

	/** minimal constructor */
    public Product(String productcode) {
        super(productcode);        
    }
    
   
   
}
   

   

