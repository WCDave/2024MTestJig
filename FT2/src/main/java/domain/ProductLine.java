package domain;

import java.util.Set;

/**
 * Productline entity. @author MyEclipse Persistence Tools
 */

public class ProductLine implements	java.io.Serializable {

	// Fields

	private String productLine;
	private String textdescription;
	private String htmldescription;
	private String image;
	private Long pid;
	private Set<Product> products;

	// Constructors

	/** default constructor */
	public ProductLine() {
	}


	// Property accessors

	public String getProductLine() {
		return this.productLine;
	}

	public void setProductLine(String productline) {
		this.productLine = productline;
	}

	public String getTextdescription() {
		return this.textdescription;
	}

	public void setTextdescription(String textdescription) {
		this.textdescription = textdescription;
	}

	public String getHtmldescription() {
		return this.htmldescription;
	}

	public void setHtmldescription(String htmldescription) {
		this.htmldescription = htmldescription;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Long getPid() {
		return pid;
	}


	public void setProducts(Set<Product> products) {
		this.products = products;
	}


	public Set<Product> getProducts() {
		return products;
	}

}