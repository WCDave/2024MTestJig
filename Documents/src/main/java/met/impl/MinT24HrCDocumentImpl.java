/*
 * An XML document type.
 * Localname: minT24hr_c
 * Namespace: met
 * Java type: met.MinT24HrCDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one minT24hr_c(@met) element.
 *
 * This is a complex type.
 */
public class MinT24HrCDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.MinT24HrCDocument
{
    private static final long serialVersionUID = 1L;
    
    public MinT24HrCDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MINT24HRC$0 = 
        new javax.xml.namespace.QName("met", "minT24hr_c");
    
    
    /**
     * Gets the "minT24hr_c" element
     */
    public float getMinT24HrC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINT24HRC$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "minT24hr_c" element
     */
    public org.apache.xmlbeans.XmlFloat xgetMinT24HrC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MINT24HRC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "minT24hr_c" element
     */
    public void setMinT24HrC(float minT24HrC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINT24HRC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINT24HRC$0);
            }
            target.setFloatValue(minT24HrC);
        }
    }
    
    /**
     * Sets (as xml) the "minT24hr_c" element
     */
    public void xsetMinT24HrC(org.apache.xmlbeans.XmlFloat minT24HrC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MINT24HRC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(MINT24HRC$0);
            }
            target.set(minT24HrC);
        }
    }
}
