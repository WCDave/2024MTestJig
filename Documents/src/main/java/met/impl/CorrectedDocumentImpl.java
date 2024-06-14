/*
 * An XML document type.
 * Localname: corrected
 * Namespace: met
 * Java type: met.CorrectedDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one corrected(@met) element.
 *
 * This is a complex type.
 */
public class CorrectedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.CorrectedDocument
{
    private static final long serialVersionUID = 1L;
    
    public CorrectedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORRECTED$0 = 
        new javax.xml.namespace.QName("met", "corrected");
    
    
    /**
     * Gets the "corrected" element
     */
    public java.lang.String getCorrected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRECTED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "corrected" element
     */
    public org.apache.xmlbeans.XmlString xgetCorrected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORRECTED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "corrected" element
     */
    public void setCorrected(java.lang.String corrected)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRECTED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORRECTED$0);
            }
            target.setStringValue(corrected);
        }
    }
    
    /**
     * Sets (as xml) the "corrected" element
     */
    public void xsetCorrected(org.apache.xmlbeans.XmlString corrected)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORRECTED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORRECTED$0);
            }
            target.set(corrected);
        }
    }
}
