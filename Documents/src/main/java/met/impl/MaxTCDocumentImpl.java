/*
 * An XML document type.
 * Localname: maxT_c
 * Namespace: met
 * Java type: met.MaxTCDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one maxT_c(@met) element.
 *
 * This is a complex type.
 */
public class MaxTCDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.MaxTCDocument
{
    private static final long serialVersionUID = 1L;
    
    public MaxTCDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAXTC$0 = 
        new javax.xml.namespace.QName("met", "maxT_c");
    
    
    /**
     * Gets the "maxT_c" element
     */
    public float getMaxTC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXTC$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxT_c" element
     */
    public org.apache.xmlbeans.XmlFloat xgetMaxTC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MAXTC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "maxT_c" element
     */
    public void setMaxTC(float maxTC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXTC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXTC$0);
            }
            target.setFloatValue(maxTC);
        }
    }
    
    /**
     * Sets (as xml) the "maxT_c" element
     */
    public void xsetMaxTC(org.apache.xmlbeans.XmlFloat maxTC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MAXTC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(MAXTC$0);
            }
            target.set(maxTC);
        }
    }
}
