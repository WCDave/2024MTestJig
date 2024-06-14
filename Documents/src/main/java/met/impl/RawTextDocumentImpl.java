/*
 * An XML document type.
 * Localname: raw_text
 * Namespace: met
 * Java type: met.RawTextDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one raw_text(@met) element.
 *
 * This is a complex type.
 */
public class RawTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.RawTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public RawTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RAWTEXT$0 = 
        new javax.xml.namespace.QName("met", "raw_text");
    
    
    /**
     * Gets the "raw_text" element
     */
    public java.lang.String getRawText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RAWTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "raw_text" element
     */
    public org.apache.xmlbeans.XmlString xgetRawText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RAWTEXT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "raw_text" element
     */
    public void setRawText(java.lang.String rawText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RAWTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RAWTEXT$0);
            }
            target.setStringValue(rawText);
        }
    }
    
    /**
     * Sets (as xml) the "raw_text" element
     */
    public void xsetRawText(org.apache.xmlbeans.XmlString rawText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RAWTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RAWTEXT$0);
            }
            target.set(rawText);
        }
    }
}
