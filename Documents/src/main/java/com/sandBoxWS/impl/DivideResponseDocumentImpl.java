/*
 * An XML document type.
 * Localname: divideResponse
 * Namespace: http://sandBoxWS.com/
 * Java type: com.sandBoxWS.DivideResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.sandBoxWS.impl;
/**
 * A document containing one divideResponse(@http://sandBoxWS.com/) element.
 *
 * This is a complex type.
 */
public class DivideResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sandBoxWS.DivideResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DivideResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIVIDERESPONSE$0 = 
        new javax.xml.namespace.QName("http://sandBoxWS.com/", "divideResponse");
    
    
    /**
     * Gets the "divideResponse" element
     */
    public com.sandBoxWS.DivideResponse getDivideResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sandBoxWS.DivideResponse target = null;
            target = (com.sandBoxWS.DivideResponse)get_store().find_element_user(DIVIDERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "divideResponse" element
     */
    public void setDivideResponse(com.sandBoxWS.DivideResponse divideResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sandBoxWS.DivideResponse target = null;
            target = (com.sandBoxWS.DivideResponse)get_store().find_element_user(DIVIDERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.sandBoxWS.DivideResponse)get_store().add_element_user(DIVIDERESPONSE$0);
            }
            target.set(divideResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "divideResponse" element
     */
    public com.sandBoxWS.DivideResponse addNewDivideResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sandBoxWS.DivideResponse target = null;
            target = (com.sandBoxWS.DivideResponse)get_store().add_element_user(DIVIDERESPONSE$0);
            return target;
        }
    }
}
