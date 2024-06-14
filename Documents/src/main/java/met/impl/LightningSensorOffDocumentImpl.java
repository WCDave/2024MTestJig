/*
 * An XML document type.
 * Localname: lightning_sensor_off
 * Namespace: met
 * Java type: met.LightningSensorOffDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one lightning_sensor_off(@met) element.
 *
 * This is a complex type.
 */
public class LightningSensorOffDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.LightningSensorOffDocument
{
    private static final long serialVersionUID = 1L;
    
    public LightningSensorOffDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIGHTNINGSENSOROFF$0 = 
        new javax.xml.namespace.QName("met", "lightning_sensor_off");
    
    
    /**
     * Gets the "lightning_sensor_off" element
     */
    public java.lang.String getLightningSensorOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIGHTNINGSENSOROFF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lightning_sensor_off" element
     */
    public org.apache.xmlbeans.XmlString xgetLightningSensorOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LIGHTNINGSENSOROFF$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "lightning_sensor_off" element
     */
    public void setLightningSensorOff(java.lang.String lightningSensorOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIGHTNINGSENSOROFF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIGHTNINGSENSOROFF$0);
            }
            target.setStringValue(lightningSensorOff);
        }
    }
    
    /**
     * Sets (as xml) the "lightning_sensor_off" element
     */
    public void xsetLightningSensorOff(org.apache.xmlbeans.XmlString lightningSensorOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LIGHTNINGSENSOROFF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LIGHTNINGSENSOROFF$0);
            }
            target.set(lightningSensorOff);
        }
    }
}
