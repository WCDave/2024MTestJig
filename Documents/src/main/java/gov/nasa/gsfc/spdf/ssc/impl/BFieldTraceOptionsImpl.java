/*
 * XML Type:  bFieldTraceOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML bFieldTraceOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class BFieldTraceOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions
{
    private static final long serialVersionUID = 1L;
    
    public BFieldTraceOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDINATESYSTEM$0 = 
        new javax.xml.namespace.QName("", "coordinateSystem");
    private static final javax.xml.namespace.QName FIELDLINELENGTH$2 = 
        new javax.xml.namespace.QName("", "fieldLineLength");
    private static final javax.xml.namespace.QName FOOTPOINTLATITUDE$4 = 
        new javax.xml.namespace.QName("", "footpointLatitude");
    private static final javax.xml.namespace.QName FOOTPOINTLONGITUDE$6 = 
        new javax.xml.namespace.QName("", "footpointLongitude");
    private static final javax.xml.namespace.QName HEMISPHERE$8 = 
        new javax.xml.namespace.QName("", "hemisphere");
    
    
    /**
     * Gets the "coordinateSystem" element
     */
    public gov.nasa.gsfc.spdf.ssc.CoordinateSystem.Enum getCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COORDINATESYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return (gov.nasa.gsfc.spdf.ssc.CoordinateSystem.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "coordinateSystem" element
     */
    public gov.nasa.gsfc.spdf.ssc.CoordinateSystem xgetCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.CoordinateSystem target = null;
            target = (gov.nasa.gsfc.spdf.ssc.CoordinateSystem)get_store().find_element_user(COORDINATESYSTEM$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "coordinateSystem" element
     */
    public boolean isSetCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COORDINATESYSTEM$0) != 0;
        }
    }
    
    /**
     * Sets the "coordinateSystem" element
     */
    public void setCoordinateSystem(gov.nasa.gsfc.spdf.ssc.CoordinateSystem.Enum coordinateSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COORDINATESYSTEM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COORDINATESYSTEM$0);
            }
            target.setEnumValue(coordinateSystem);
        }
    }
    
    /**
     * Sets (as xml) the "coordinateSystem" element
     */
    public void xsetCoordinateSystem(gov.nasa.gsfc.spdf.ssc.CoordinateSystem coordinateSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.CoordinateSystem target = null;
            target = (gov.nasa.gsfc.spdf.ssc.CoordinateSystem)get_store().find_element_user(COORDINATESYSTEM$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.CoordinateSystem)get_store().add_element_user(COORDINATESYSTEM$0);
            }
            target.set(coordinateSystem);
        }
    }
    
    /**
     * Unsets the "coordinateSystem" element
     */
    public void unsetCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COORDINATESYSTEM$0, 0);
        }
    }
    
    /**
     * Gets the "fieldLineLength" element
     */
    public boolean getFieldLineLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDLINELENGTH$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "fieldLineLength" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetFieldLineLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FIELDLINELENGTH$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fieldLineLength" element
     */
    public void setFieldLineLength(boolean fieldLineLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDLINELENGTH$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIELDLINELENGTH$2);
            }
            target.setBooleanValue(fieldLineLength);
        }
    }
    
    /**
     * Sets (as xml) the "fieldLineLength" element
     */
    public void xsetFieldLineLength(org.apache.xmlbeans.XmlBoolean fieldLineLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FIELDLINELENGTH$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(FIELDLINELENGTH$2);
            }
            target.set(fieldLineLength);
        }
    }
    
    /**
     * Gets the "footpointLatitude" element
     */
    public boolean getFootpointLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOOTPOINTLATITUDE$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "footpointLatitude" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetFootpointLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FOOTPOINTLATITUDE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "footpointLatitude" element
     */
    public void setFootpointLatitude(boolean footpointLatitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOOTPOINTLATITUDE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FOOTPOINTLATITUDE$4);
            }
            target.setBooleanValue(footpointLatitude);
        }
    }
    
    /**
     * Sets (as xml) the "footpointLatitude" element
     */
    public void xsetFootpointLatitude(org.apache.xmlbeans.XmlBoolean footpointLatitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FOOTPOINTLATITUDE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(FOOTPOINTLATITUDE$4);
            }
            target.set(footpointLatitude);
        }
    }
    
    /**
     * Gets the "footpointLongitude" element
     */
    public boolean getFootpointLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOOTPOINTLONGITUDE$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "footpointLongitude" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetFootpointLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FOOTPOINTLONGITUDE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "footpointLongitude" element
     */
    public void setFootpointLongitude(boolean footpointLongitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOOTPOINTLONGITUDE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FOOTPOINTLONGITUDE$6);
            }
            target.setBooleanValue(footpointLongitude);
        }
    }
    
    /**
     * Sets (as xml) the "footpointLongitude" element
     */
    public void xsetFootpointLongitude(org.apache.xmlbeans.XmlBoolean footpointLongitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FOOTPOINTLONGITUDE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(FOOTPOINTLONGITUDE$6);
            }
            target.set(footpointLongitude);
        }
    }
    
    /**
     * Gets the "hemisphere" element
     */
    public gov.nasa.gsfc.spdf.ssc.Hemisphere.Enum getHemisphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEMISPHERE$8, 0);
            if (target == null)
            {
                return null;
            }
            return (gov.nasa.gsfc.spdf.ssc.Hemisphere.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "hemisphere" element
     */
    public gov.nasa.gsfc.spdf.ssc.Hemisphere xgetHemisphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.Hemisphere target = null;
            target = (gov.nasa.gsfc.spdf.ssc.Hemisphere)get_store().find_element_user(HEMISPHERE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "hemisphere" element
     */
    public boolean isSetHemisphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEMISPHERE$8) != 0;
        }
    }
    
    /**
     * Sets the "hemisphere" element
     */
    public void setHemisphere(gov.nasa.gsfc.spdf.ssc.Hemisphere.Enum hemisphere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEMISPHERE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEMISPHERE$8);
            }
            target.setEnumValue(hemisphere);
        }
    }
    
    /**
     * Sets (as xml) the "hemisphere" element
     */
    public void xsetHemisphere(gov.nasa.gsfc.spdf.ssc.Hemisphere hemisphere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.Hemisphere target = null;
            target = (gov.nasa.gsfc.spdf.ssc.Hemisphere)get_store().find_element_user(HEMISPHERE$8, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.Hemisphere)get_store().add_element_user(HEMISPHERE$8);
            }
            target.set(hemisphere);
        }
    }
    
    /**
     * Unsets the "hemisphere" element
     */
    public void unsetHemisphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEMISPHERE$8, 0);
        }
    }
}
