/*
 * An XML document type.
 * Localname: present_weather_sensor_off
 * Namespace: met
 * Java type: met.PresentWeatherSensorOffDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one present_weather_sensor_off(@met) element.
 *
 * This is a complex type.
 */
public class PresentWeatherSensorOffDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.PresentWeatherSensorOffDocument
{
    private static final long serialVersionUID = 1L;
    
    public PresentWeatherSensorOffDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRESENTWEATHERSENSOROFF$0 = 
        new javax.xml.namespace.QName("met", "present_weather_sensor_off");
    
    
    /**
     * Gets the "present_weather_sensor_off" element
     */
    public java.lang.String getPresentWeatherSensorOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTWEATHERSENSOROFF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "present_weather_sensor_off" element
     */
    public org.apache.xmlbeans.XmlString xgetPresentWeatherSensorOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRESENTWEATHERSENSOROFF$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "present_weather_sensor_off" element
     */
    public void setPresentWeatherSensorOff(java.lang.String presentWeatherSensorOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTWEATHERSENSOROFF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRESENTWEATHERSENSOROFF$0);
            }
            target.setStringValue(presentWeatherSensorOff);
        }
    }
    
    /**
     * Sets (as xml) the "present_weather_sensor_off" element
     */
    public void xsetPresentWeatherSensorOff(org.apache.xmlbeans.XmlString presentWeatherSensorOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRESENTWEATHERSENSOROFF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRESENTWEATHERSENSOROFF$0);
            }
            target.set(presentWeatherSensorOff);
        }
    }
}
