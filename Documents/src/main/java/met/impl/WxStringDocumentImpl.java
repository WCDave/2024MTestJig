/*
 * An XML document type.
 * Localname: wx_string
 * Namespace: met
 * Java type: met.WxStringDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one wx_string(@met) element.
 *
 * This is a complex type.
 */
public class WxStringDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.WxStringDocument
{
    private static final long serialVersionUID = 1L;
    
    public WxStringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WXSTRING$0 = 
        new javax.xml.namespace.QName("met", "wx_string");
    
    
    /**
     * Gets the "wx_string" element
     */
    public java.lang.String getWxString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WXSTRING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "wx_string" element
     */
    public org.apache.xmlbeans.XmlString xgetWxString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WXSTRING$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "wx_string" element
     */
    public void setWxString(java.lang.String wxString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WXSTRING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WXSTRING$0);
            }
            target.setStringValue(wxString);
        }
    }
    
    /**
     * Sets (as xml) the "wx_string" element
     */
    public void xsetWxString(org.apache.xmlbeans.XmlString wxString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WXSTRING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WXSTRING$0);
            }
            target.set(wxString);
        }
    }
}
