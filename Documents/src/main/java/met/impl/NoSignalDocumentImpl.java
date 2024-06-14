/*
 * An XML document type.
 * Localname: no_signal
 * Namespace: met
 * Java type: met.NoSignalDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one no_signal(@met) element.
 *
 * This is a complex type.
 */
public class NoSignalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.NoSignalDocument
{
    private static final long serialVersionUID = 1L;
    
    public NoSignalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOSIGNAL$0 = 
        new javax.xml.namespace.QName("met", "no_signal");
    
    
    /**
     * Gets the "no_signal" element
     */
    public java.lang.String getNoSignal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOSIGNAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "no_signal" element
     */
    public org.apache.xmlbeans.XmlString xgetNoSignal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOSIGNAL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "no_signal" element
     */
    public void setNoSignal(java.lang.String noSignal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOSIGNAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOSIGNAL$0);
            }
            target.setStringValue(noSignal);
        }
    }
    
    /**
     * Sets (as xml) the "no_signal" element
     */
    public void xsetNoSignal(org.apache.xmlbeans.XmlString noSignal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOSIGNAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOSIGNAL$0);
            }
            target.set(noSignal);
        }
    }
}
