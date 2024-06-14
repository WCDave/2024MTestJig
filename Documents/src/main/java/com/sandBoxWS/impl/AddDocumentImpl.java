/*
 * An XML document type.
 * Localname: add
 * Namespace: http://sandBoxWS.com/
 * Java type: com.sandBoxWS.AddDocument
 *
 * Automatically generated - do not modify.
 */
package com.sandBoxWS.impl;
/**
 * A document containing one add(@http://sandBoxWS.com/) element.
 *
 * This is a complex type.
 */
public class AddDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sandBoxWS.AddDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADD$0 = 
        new javax.xml.namespace.QName("http://sandBoxWS.com/", "add");
    
    
    /**
     * Gets the "add" element
     */
    public com.sandBoxWS.Addit getAdd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sandBoxWS.Addit target = null;
            target = (com.sandBoxWS.Addit)get_store().find_element_user(ADD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "add" element
     */
    public void setAdd(com.sandBoxWS.Addit add)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sandBoxWS.Addit target = null;
            target = (com.sandBoxWS.Addit)get_store().find_element_user(ADD$0, 0);
            if (target == null)
            {
                target = (com.sandBoxWS.Addit)get_store().add_element_user(ADD$0);
            }
            target.set(add);
        }
    }
    
    /**
     * Appends and returns a new empty "add" element
     */
    public com.sandBoxWS.Addit addNewAdd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sandBoxWS.Addit target = null;
            target = (com.sandBoxWS.Addit)get_store().add_element_user(ADD$0);
            return target;
        }
    }
}
