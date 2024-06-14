package domain;
// default package

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;


/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer extends Entity  {


    // Fields    

     private Long customerNumber;
     private String customerName;
     private String contactLastName;
     private String contactFirstName;
     private String phone;
    
     private Long salesRepEmployeeNumber;
     private BigDecimal creditLimit;
     private Set<Payment> payments = new HashSet<Payment>(0);
     


    // Constructors

    /** default constructor */
    public Customer() {
    }

    // Property accessors

    public Long getCustomerNumber() {
        return this.customerNumber;
    }
    
    
    public void setCustomerNumber(Long customernumber) {
        this.customerNumber = customernumber;
    }

    public String getCustomerName() {
        return this.customerName;
    }
    
    public void setCustomerName(String customername) {
        this.customerName = customername;
    }

    public String getContactLastName() {
        return this.contactLastName;
    }
    
    public void setContactLastName(String contactlastname) {
        this.contactLastName = contactlastname;
    }

    public String getContactFirstName() {
        return this.contactFirstName;
    }
    
    public void setContactFirstName(String contactfirstname) {
        this.contactFirstName = contactfirstname;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }


    public Long getSalesRepEmployeeNumber() {
        return this.salesRepEmployeeNumber;
    }
    
    public void setSalesRepEmployeeNumber(Long salesrepemployeenumber) {
        this.salesRepEmployeeNumber = salesrepemployeenumber;
    }

    public BigDecimal getCreditLimit() {
        return this.creditLimit;
    }
    
    public void setCreditLimit(BigDecimal creditlimit) {
        this.creditLimit = creditlimit;
    }

    public Set<Payment> getPayments() {
        return this.payments;
    }
    
    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }
}