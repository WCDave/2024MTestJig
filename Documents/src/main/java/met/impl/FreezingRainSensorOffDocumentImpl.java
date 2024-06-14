/*
 * An XML document type.
 * Localname: freezing_rain_sensor_off
 * Namespace: met
 * Java type: met.FreezingRainSensorOffDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one freezing_rain_sensor_off(@met) element.
 *
 * This is a complex type.
 */
public class FreezingRainSensorOffDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.FreezingRainSensorOffDocument
{
    private static final long serialVersionUID = 1L;
    
    public FreezingRainSensorOffDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FREEZINGRAINSENSOROFF$0 = 
        new javax.xml.namespace.QName("met", "freezing_rain_sensor_off");
    
    
    /**
     * Gets the "freezing_rain_sensor_off" element
     */
    public java.lang.String getFreezingRainSensorOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEZINGRAINSENSOROFF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "freezing_rain_sensor_off" element
     */
    public org.apache.xmlbeans.XmlString xgetFreezingRainSensorOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FREEZINGRAINSENSOROFF$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "freezing_rain_sensor_off" element
     */
    public void setFreezingRainSensorOff(java.lang.String freezingRainSensorOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEZINGRAINSENSOROFF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FREEZINGRAINSENSOROFF$0);
            }
            target.setStringValue(freezingRainSensorOff);
        }
    }
    
    /**
     * Sets (as xml) the "freezing_rain_sensor_off" element
     */
    public void xsetFreezingRainSensorOff(org.apache.xmlbeans.XmlString freezingRainSensorOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FREEZINGRAINSENSOROFF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FREEZINGRAINSENSOROFF$0);
            }
            target.set(freezingRainSensorOff);
        }
    }
}
