/*
 * XML Type:  mapLimits
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.MapLimits
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML mapLimits(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class MapLimitsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.MapLimits
{
    private static final long serialVersionUID = 1L;
    
    public MapLimitsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAXLATITUDE$0 = 
        new javax.xml.namespace.QName("", "maxLatitude");
    private static final javax.xml.namespace.QName MAXLONGITUDE$2 = 
        new javax.xml.namespace.QName("", "maxLongitude");
    private static final javax.xml.namespace.QName MINLATITUDE$4 = 
        new javax.xml.namespace.QName("", "minLatitude");
    private static final javax.xml.namespace.QName MINLONGITUDE$6 = 
        new javax.xml.namespace.QName("", "minLongitude");
    
    
    /**
     * Gets the "maxLatitude" element
     */
    public float getMaxLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXLATITUDE$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxLatitude" element
     */
    public org.apache.xmlbeans.XmlFloat xgetMaxLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MAXLATITUDE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "maxLatitude" element
     */
    public void setMaxLatitude(float maxLatitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXLATITUDE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXLATITUDE$0);
            }
            target.setFloatValue(maxLatitude);
        }
    }
    
    /**
     * Sets (as xml) the "maxLatitude" element
     */
    public void xsetMaxLatitude(org.apache.xmlbeans.XmlFloat maxLatitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MAXLATITUDE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(MAXLATITUDE$0);
            }
            target.set(maxLatitude);
        }
    }
    
    /**
     * Gets the "maxLongitude" element
     */
    public float getMaxLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXLONGITUDE$2, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxLongitude" element
     */
    public org.apache.xmlbeans.XmlFloat xgetMaxLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MAXLONGITUDE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "maxLongitude" element
     */
    public void setMaxLongitude(float maxLongitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXLONGITUDE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXLONGITUDE$2);
            }
            target.setFloatValue(maxLongitude);
        }
    }
    
    /**
     * Sets (as xml) the "maxLongitude" element
     */
    public void xsetMaxLongitude(org.apache.xmlbeans.XmlFloat maxLongitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MAXLONGITUDE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(MAXLONGITUDE$2);
            }
            target.set(maxLongitude);
        }
    }
    
    /**
     * Gets the "minLatitude" element
     */
    public float getMinLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINLATITUDE$4, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "minLatitude" element
     */
    public org.apache.xmlbeans.XmlFloat xgetMinLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MINLATITUDE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "minLatitude" element
     */
    public void setMinLatitude(float minLatitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINLATITUDE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINLATITUDE$4);
            }
            target.setFloatValue(minLatitude);
        }
    }
    
    /**
     * Sets (as xml) the "minLatitude" element
     */
    public void xsetMinLatitude(org.apache.xmlbeans.XmlFloat minLatitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MINLATITUDE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(MINLATITUDE$4);
            }
            target.set(minLatitude);
        }
    }
    
    /**
     * Gets the "minLongitude" element
     */
    public float getMinLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINLONGITUDE$6, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "minLongitude" element
     */
    public org.apache.xmlbeans.XmlFloat xgetMinLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MINLONGITUDE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "minLongitude" element
     */
    public void setMinLongitude(float minLongitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINLONGITUDE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINLONGITUDE$6);
            }
            target.setFloatValue(minLongitude);
        }
    }
    
    /**
     * Sets (as xml) the "minLongitude" element
     */
    public void xsetMinLongitude(org.apache.xmlbeans.XmlFloat minLongitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MINLONGITUDE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(MINLONGITUDE$6);
            }
            target.set(minLongitude);
        }
    }
}
