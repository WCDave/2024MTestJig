/*
 * An XML document type.
 * Localname: precip_in
 * Namespace: met
 * Java type: met.PrecipInDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one precip_in(@met) element.
 *
 * This is a complex type.
 */
public class PrecipInDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.PrecipInDocument
{
    private static final long serialVersionUID = 1L;
    
    public PrecipInDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRECIPIN$0 = 
        new javax.xml.namespace.QName("met", "precip_in");
    
    
    /**
     * Gets the "precip_in" element
     */
    public float getPrecipIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECIPIN$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "precip_in" element
     */
    public org.apache.xmlbeans.XmlFloat xgetPrecipIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PRECIPIN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "precip_in" element
     */
    public void setPrecipIn(float precipIn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECIPIN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRECIPIN$0);
            }
            target.setFloatValue(precipIn);
        }
    }
    
    /**
     * Sets (as xml) the "precip_in" element
     */
    public void xsetPrecipIn(org.apache.xmlbeans.XmlFloat precipIn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PRECIPIN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(PRECIPIN$0);
            }
            target.set(precipIn);
        }
    }
}
