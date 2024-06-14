/*
 * An XML document type.
 * Localname: maxT24hr_c
 * Namespace: met
 * Java type: met.MaxT24HrCDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one maxT24hr_c(@met) element.
 *
 * This is a complex type.
 */
public class MaxT24HrCDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.MaxT24HrCDocument
{
    private static final long serialVersionUID = 1L;
    
    public MaxT24HrCDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAXT24HRC$0 = 
        new javax.xml.namespace.QName("met", "maxT24hr_c");
    
    
    /**
     * Gets the "maxT24hr_c" element
     */
    public float getMaxT24HrC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXT24HRC$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxT24hr_c" element
     */
    public org.apache.xmlbeans.XmlFloat xgetMaxT24HrC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MAXT24HRC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "maxT24hr_c" element
     */
    public void setMaxT24HrC(float maxT24HrC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXT24HRC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXT24HRC$0);
            }
            target.setFloatValue(maxT24HrC);
        }
    }
    
    /**
     * Sets (as xml) the "maxT24hr_c" element
     */
    public void xsetMaxT24HrC(org.apache.xmlbeans.XmlFloat maxT24HrC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MAXT24HRC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(MAXT24HRC$0);
            }
            target.set(maxT24HrC);
        }
    }
}
