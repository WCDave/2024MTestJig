/*
 * An XML document type.
 * Localname: subtract
 * Namespace: http://sandBoxWS.com/
 * Java type: com.sandBoxWS.SubtractDocument
 *
 * Automatically generated - do not modify.
 */
package com.sandBoxWS.impl;
/**
 * A document containing one subtract(@http://sandBoxWS.com/) element.
 *
 * This is a complex type.
 */
public class SubtractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sandBoxWS.SubtractDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubtractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBTRACT$0 = 
        new javax.xml.namespace.QName("http://sandBoxWS.com/", "subtract");
    
    
    /**
     * Gets the "subtract" element
     */
    public com.sandBoxWS.Subtract getSubtract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sandBoxWS.Subtract target = null;
            target = (com.sandBoxWS.Subtract)get_store().find_element_user(SUBTRACT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subtract" element
     */
    public void setSubtract(com.sandBoxWS.Subtract subtract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sandBoxWS.Subtract target = null;
            target = (com.sandBoxWS.Subtract)get_store().find_element_user(SUBTRACT$0, 0);
            if (target == null)
            {
                target = (com.sandBoxWS.Subtract)get_store().add_element_user(SUBTRACT$0);
            }
            target.set(subtract);
        }
    }
    
    /**
     * Appends and returns a new empty "subtract" element
     */
    public com.sandBoxWS.Subtract addNewSubtract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sandBoxWS.Subtract target = null;
            target = (com.sandBoxWS.Subtract)get_store().add_element_user(SUBTRACT$0);
            return target;
        }
    }
}
