/*
 * An XML document type.
 * Localname: multiply
 * Namespace: http://sandBoxWS.com/
 * Java type: com.sandBoxWS.MultiplyDocument
 *
 * Automatically generated - do not modify.
 */
package com.sandBoxWS.impl;
/**
 * A document containing one multiply(@http://sandBoxWS.com/) element.
 *
 * This is a complex type.
 */
public class MultiplyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sandBoxWS.MultiplyDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiplyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIPLY$0 = 
        new javax.xml.namespace.QName("http://sandBoxWS.com/", "multiply");
    
    
    /**
     * Gets the "multiply" element
     */
    public com.sandBoxWS.Multiply getMultiply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sandBoxWS.Multiply target = null;
            target = (com.sandBoxWS.Multiply)get_store().find_element_user(MULTIPLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiply" element
     */
    public void setMultiply(com.sandBoxWS.Multiply multiply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sandBoxWS.Multiply target = null;
            target = (com.sandBoxWS.Multiply)get_store().find_element_user(MULTIPLY$0, 0);
            if (target == null)
            {
                target = (com.sandBoxWS.Multiply)get_store().add_element_user(MULTIPLY$0);
            }
            target.set(multiply);
        }
    }
    
    /**
     * Appends and returns a new empty "multiply" element
     */
    public com.sandBoxWS.Multiply addNewMultiply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sandBoxWS.Multiply target = null;
            target = (com.sandBoxWS.Multiply)get_store().add_element_user(MULTIPLY$0);
            return target;
        }
    }
}
