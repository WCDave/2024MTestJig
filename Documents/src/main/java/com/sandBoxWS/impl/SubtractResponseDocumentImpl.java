/*
 * An XML document type.
 * Localname: subtractResponse
 * Namespace: http://sandBoxWS.com/
 * Java type: com.sandBoxWS.SubtractResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.sandBoxWS.impl;
/**
 * A document containing one subtractResponse(@http://sandBoxWS.com/) element.
 *
 * This is a complex type.
 */
public class SubtractResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sandBoxWS.SubtractResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubtractResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBTRACTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://sandBoxWS.com/", "subtractResponse");
    
    
    /**
     * Gets the "subtractResponse" element
     */
    public com.sandBoxWS.SubtractResponse getSubtractResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sandBoxWS.SubtractResponse target = null;
            target = (com.sandBoxWS.SubtractResponse)get_store().find_element_user(SUBTRACTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subtractResponse" element
     */
    public void setSubtractResponse(com.sandBoxWS.SubtractResponse subtractResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sandBoxWS.SubtractResponse target = null;
            target = (com.sandBoxWS.SubtractResponse)get_store().find_element_user(SUBTRACTRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.sandBoxWS.SubtractResponse)get_store().add_element_user(SUBTRACTRESPONSE$0);
            }
            target.set(subtractResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "subtractResponse" element
     */
    public com.sandBoxWS.SubtractResponse addNewSubtractResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sandBoxWS.SubtractResponse target = null;
            target = (com.sandBoxWS.SubtractResponse)get_store().add_element_user(SUBTRACTRESPONSE$0);
            return target;
        }
    }
}
