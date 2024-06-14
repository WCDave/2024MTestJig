/*
 * An XML document type.
 * Localname: auto
 * Namespace: met
 * Java type: met.AutoDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one auto(@met) element.
 *
 * This is a complex type.
 */
public class AutoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.AutoDocument
{
    private static final long serialVersionUID = 1L;
    
    public AutoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTO$0 = 
        new javax.xml.namespace.QName("met", "auto");
    
    
    /**
     * Gets the "auto" element
     */
    public java.lang.String getAuto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "auto" element
     */
    public org.apache.xmlbeans.XmlString xgetAuto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "auto" element
     */
    public void setAuto(java.lang.String auto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTO$0);
            }
            target.setStringValue(auto);
        }
    }
    
    /**
     * Sets (as xml) the "auto" element
     */
    public void xsetAuto(org.apache.xmlbeans.XmlString auto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTO$0);
            }
            target.set(auto);
        }
    }
}
