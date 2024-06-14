/*
 * An XML document type.
 * Localname: error
 * Namespace: met
 * Java type: met.ErrorDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one error(@met) element.
 *
 * This is a complex type.
 */
public class ErrorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.ErrorDocument
{
    private static final long serialVersionUID = 1L;
    
    public ErrorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERROR$0 = 
        new javax.xml.namespace.QName("met", "error");
    
    
    /**
     * Gets the "error" element
     */
    public java.lang.String getError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "error" element
     */
    public org.apache.xmlbeans.XmlString xgetError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "error" element
     */
    public void setError(java.lang.String error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERROR$0);
            }
            target.setStringValue(error);
        }
    }
    
    /**
     * Sets (as xml) the "error" element
     */
    public void xsetError(org.apache.xmlbeans.XmlString error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERROR$0);
            }
            target.set(error);
        }
    }
}
