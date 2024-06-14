/*
 * An XML document type.
 * Localname: longitude
 * Namespace: met
 * Java type: met.LongitudeDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one longitude(@met) element.
 *
 * This is a complex type.
 */
public class LongitudeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.LongitudeDocument
{
    private static final long serialVersionUID = 1L;
    
    public LongitudeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LONGITUDE$0 = 
        new javax.xml.namespace.QName("met", "longitude");
    
    
    /**
     * Gets the "longitude" element
     */
    public float getLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "longitude" element
     */
    public org.apache.xmlbeans.XmlFloat xgetLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LONGITUDE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "longitude" element
     */
    public void setLongitude(float longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONGITUDE$0);
            }
            target.setFloatValue(longitude);
        }
    }
    
    /**
     * Sets (as xml) the "longitude" element
     */
    public void xsetLongitude(org.apache.xmlbeans.XmlFloat longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LONGITUDE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(LONGITUDE$0);
            }
            target.set(longitude);
        }
    }
}
