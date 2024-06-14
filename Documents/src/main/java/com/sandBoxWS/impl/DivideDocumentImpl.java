/*
 * An XML document type.
 * Localname: divide
 * Namespace: http://sandBoxWS.com/
 * Java type: com.sandBoxWS.DivideDocument
 *
 * Automatically generated - do not modify.
 */
package com.sandBoxWS.impl;
/**
 * A document containing one divide(@http://sandBoxWS.com/) element.
 *
 * This is a complex type.
 */
public class DivideDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sandBoxWS.DivideDocument
{
    private static final long serialVersionUID = 1L;
    
    public DivideDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIVIDE$0 = 
        new javax.xml.namespace.QName("http://sandBoxWS.com/", "divide");
    
    
    /**
     * Gets the "divide" element
     */
    public com.sandBoxWS.Divide getDivide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sandBoxWS.Divide target = null;
            target = (com.sandBoxWS.Divide)get_store().find_element_user(DIVIDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "divide" element
     */
    public void setDivide(com.sandBoxWS.Divide divide)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sandBoxWS.Divide target = null;
            target = (com.sandBoxWS.Divide)get_store().find_element_user(DIVIDE$0, 0);
            if (target == null)
            {
                target = (com.sandBoxWS.Divide)get_store().add_element_user(DIVIDE$0);
            }
            target.set(divide);
        }
    }
    
    /**
     * Appends and returns a new empty "divide" element
     */
    public com.sandBoxWS.Divide addNewDivide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sandBoxWS.Divide target = null;
            target = (com.sandBoxWS.Divide)get_store().add_element_user(DIVIDE$0);
            return target;
        }
    }
}
