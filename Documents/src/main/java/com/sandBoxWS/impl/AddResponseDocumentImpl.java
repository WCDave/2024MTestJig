/*
 * An XML document type.
 * Localname: addResponse
 * Namespace: http://sandBoxWS.com/
 * Java type: com.sandBoxWS.AddResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.sandBoxWS.impl;
/**
 * A document containing one addResponse(@http://sandBoxWS.com/) element.
 *
 * This is a complex type.
 */
public class AddResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sandBoxWS.AddResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://sandBoxWS.com/", "addResponse");
    
    
    /**
     * Gets the "addResponse" element
     */
    public com.sandBoxWS.AddResponse getAddResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sandBoxWS.AddResponse target = null;
            target = (com.sandBoxWS.AddResponse)get_store().find_element_user(ADDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "addResponse" element
     */
    public void setAddResponse(com.sandBoxWS.AddResponse addResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sandBoxWS.AddResponse target = null;
            target = (com.sandBoxWS.AddResponse)get_store().find_element_user(ADDRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.sandBoxWS.AddResponse)get_store().add_element_user(ADDRESPONSE$0);
            }
            target.set(addResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "addResponse" element
     */
    public com.sandBoxWS.AddResponse addNewAddResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sandBoxWS.AddResponse target = null;
            target = (com.sandBoxWS.AddResponse)get_store().add_element_user(ADDRESPONSE$0);
            return target;
        }
    }
}
