/*
 * An XML document type.
 * Localname: multiplyResponse
 * Namespace: http://sandBoxWS.com/
 * Java type: com.sandBoxWS.MultiplyResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.sandBoxWS.impl;
/**
 * A document containing one multiplyResponse(@http://sandBoxWS.com/) element.
 *
 * This is a complex type.
 */
public class MultiplyResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sandBoxWS.MultiplyResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiplyResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIPLYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://sandBoxWS.com/", "multiplyResponse");
    
    
    /**
     * Gets the "multiplyResponse" element
     */
    public com.sandBoxWS.MultiplyResponse getMultiplyResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sandBoxWS.MultiplyResponse target = null;
            target = (com.sandBoxWS.MultiplyResponse)get_store().find_element_user(MULTIPLYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiplyResponse" element
     */
    public void setMultiplyResponse(com.sandBoxWS.MultiplyResponse multiplyResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sandBoxWS.MultiplyResponse target = null;
            target = (com.sandBoxWS.MultiplyResponse)get_store().find_element_user(MULTIPLYRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.sandBoxWS.MultiplyResponse)get_store().add_element_user(MULTIPLYRESPONSE$0);
            }
            target.set(multiplyResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "multiplyResponse" element
     */
    public com.sandBoxWS.MultiplyResponse addNewMultiplyResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sandBoxWS.MultiplyResponse target = null;
            target = (com.sandBoxWS.MultiplyResponse)get_store().add_element_user(MULTIPLYRESPONSE$0);
            return target;
        }
    }
}
