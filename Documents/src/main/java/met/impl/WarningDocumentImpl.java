/*
 * An XML document type.
 * Localname: warning
 * Namespace: met
 * Java type: met.WarningDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one warning(@met) element.
 *
 * This is a complex type.
 */
public class WarningDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.WarningDocument
{
    private static final long serialVersionUID = 1L;
    
    public WarningDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WARNING$0 = 
        new javax.xml.namespace.QName("met", "warning");
    
    
    /**
     * Gets the "warning" element
     */
    public java.lang.String getWarning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARNING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "warning" element
     */
    public org.apache.xmlbeans.XmlString xgetWarning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WARNING$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "warning" element
     */
    public void setWarning(java.lang.String warning)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARNING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WARNING$0);
            }
            target.setStringValue(warning);
        }
    }
    
    /**
     * Sets (as xml) the "warning" element
     */
    public void xsetWarning(org.apache.xmlbeans.XmlString warning)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WARNING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WARNING$0);
            }
            target.set(warning);
        }
    }
}
