/*
 * An XML document type.
 * Localname: latitude
 * Namespace: met
 * Java type: met.LatitudeDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one latitude(@met) element.
 *
 * This is a complex type.
 */
public class LatitudeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.LatitudeDocument
{
    private static final long serialVersionUID = 1L;
    
    public LatitudeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LATITUDE$0 = 
        new javax.xml.namespace.QName("met", "latitude");
    
    
    /**
     * Gets the "latitude" element
     */
    public float getLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "latitude" element
     */
    public org.apache.xmlbeans.XmlFloat xgetLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LATITUDE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "latitude" element
     */
    public void setLatitude(float latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATITUDE$0);
            }
            target.setFloatValue(latitude);
        }
    }
    
    /**
     * Sets (as xml) the "latitude" element
     */
    public void xsetLatitude(org.apache.xmlbeans.XmlFloat latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LATITUDE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(LATITUDE$0);
            }
            target.set(latitude);
        }
    }
}
