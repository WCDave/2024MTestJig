/*
 * XML Type:  locationFilter
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.LocationFilter
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML locationFilter(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class LocationFilterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.LocationFilter
{
    private static final long serialVersionUID = 1L;
    
    public LocationFilterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOWERDATE$0 = 
        new javax.xml.namespace.QName("", "lowerDate");
    private static final javax.xml.namespace.QName LOWERLIMIT$2 = 
        new javax.xml.namespace.QName("", "lowerLimit");
    private static final javax.xml.namespace.QName MAXIMUM$4 = 
        new javax.xml.namespace.QName("", "maximum");
    private static final javax.xml.namespace.QName MINIMUM$6 = 
        new javax.xml.namespace.QName("", "minimum");
    private static final javax.xml.namespace.QName UPPERDATE$8 = 
        new javax.xml.namespace.QName("", "upperDate");
    private static final javax.xml.namespace.QName UPPERLIMIT$10 = 
        new javax.xml.namespace.QName("", "upperLimit");
    
    
    /**
     * Gets the "lowerDate" element
     */
    public java.util.Calendar getLowerDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "lowerDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetLowerDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LOWERDATE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "lowerDate" element
     */
    public boolean isSetLowerDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOWERDATE$0) != 0;
        }
    }
    
    /**
     * Sets the "lowerDate" element
     */
    public void setLowerDate(java.util.Calendar lowerDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOWERDATE$0);
            }
            target.setCalendarValue(lowerDate);
        }
    }
    
    /**
     * Sets (as xml) the "lowerDate" element
     */
    public void xsetLowerDate(org.apache.xmlbeans.XmlDateTime lowerDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LOWERDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(LOWERDATE$0);
            }
            target.set(lowerDate);
        }
    }
    
    /**
     * Unsets the "lowerDate" element
     */
    public void unsetLowerDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOWERDATE$0, 0);
        }
    }
    
    /**
     * Gets the "lowerLimit" element
     */
    public double getLowerLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERLIMIT$2, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "lowerLimit" element
     */
    public org.apache.xmlbeans.XmlDouble xgetLowerLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LOWERLIMIT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "lowerLimit" element
     */
    public boolean isSetLowerLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOWERLIMIT$2) != 0;
        }
    }
    
    /**
     * Sets the "lowerLimit" element
     */
    public void setLowerLimit(double lowerLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWERLIMIT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOWERLIMIT$2);
            }
            target.setDoubleValue(lowerLimit);
        }
    }
    
    /**
     * Sets (as xml) the "lowerLimit" element
     */
    public void xsetLowerLimit(org.apache.xmlbeans.XmlDouble lowerLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LOWERLIMIT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(LOWERLIMIT$2);
            }
            target.set(lowerLimit);
        }
    }
    
    /**
     * Unsets the "lowerLimit" element
     */
    public void unsetLowerLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOWERLIMIT$2, 0);
        }
    }
    
    /**
     * Gets the "maximum" element
     */
    public boolean getMaximum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMUM$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "maximum" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetMaximum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MAXIMUM$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "maximum" element
     */
    public void setMaximum(boolean maximum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMUM$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXIMUM$4);
            }
            target.setBooleanValue(maximum);
        }
    }
    
    /**
     * Sets (as xml) the "maximum" element
     */
    public void xsetMaximum(org.apache.xmlbeans.XmlBoolean maximum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MAXIMUM$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(MAXIMUM$4);
            }
            target.set(maximum);
        }
    }
    
    /**
     * Gets the "minimum" element
     */
    public boolean getMinimum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMUM$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "minimum" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetMinimum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MINIMUM$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "minimum" element
     */
    public void setMinimum(boolean minimum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMUM$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINIMUM$6);
            }
            target.setBooleanValue(minimum);
        }
    }
    
    /**
     * Sets (as xml) the "minimum" element
     */
    public void xsetMinimum(org.apache.xmlbeans.XmlBoolean minimum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MINIMUM$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(MINIMUM$6);
            }
            target.set(minimum);
        }
    }
    
    /**
     * Gets the "upperDate" element
     */
    public java.util.Calendar getUpperDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPPERDATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "upperDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetUpperDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(UPPERDATE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "upperDate" element
     */
    public boolean isSetUpperDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPPERDATE$8) != 0;
        }
    }
    
    /**
     * Sets the "upperDate" element
     */
    public void setUpperDate(java.util.Calendar upperDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPPERDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPPERDATE$8);
            }
            target.setCalendarValue(upperDate);
        }
    }
    
    /**
     * Sets (as xml) the "upperDate" element
     */
    public void xsetUpperDate(org.apache.xmlbeans.XmlDateTime upperDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(UPPERDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(UPPERDATE$8);
            }
            target.set(upperDate);
        }
    }
    
    /**
     * Unsets the "upperDate" element
     */
    public void unsetUpperDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPPERDATE$8, 0);
        }
    }
    
    /**
     * Gets the "upperLimit" element
     */
    public double getUpperLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPPERLIMIT$10, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "upperLimit" element
     */
    public org.apache.xmlbeans.XmlDouble xgetUpperLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(UPPERLIMIT$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "upperLimit" element
     */
    public boolean isSetUpperLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPPERLIMIT$10) != 0;
        }
    }
    
    /**
     * Sets the "upperLimit" element
     */
    public void setUpperLimit(double upperLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPPERLIMIT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPPERLIMIT$10);
            }
            target.setDoubleValue(upperLimit);
        }
    }
    
    /**
     * Sets (as xml) the "upperLimit" element
     */
    public void xsetUpperLimit(org.apache.xmlbeans.XmlDouble upperLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(UPPERLIMIT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(UPPERLIMIT$10);
            }
            target.set(upperLimit);
        }
    }
    
    /**
     * Unsets the "upperLimit" element
     */
    public void unsetUpperLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPPERLIMIT$10, 0);
        }
    }
}
