/*
 * XML Type:  mappedRegionFilterOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML mappedRegionFilterOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class MappedRegionFilterOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions
{
    private static final long serialVersionUID = 1L;
    
    public MappedRegionFilterOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AURORALOVAL$0 = 
        new javax.xml.namespace.QName("", "auroralOval");
    private static final javax.xml.namespace.QName CLEFT$2 = 
        new javax.xml.namespace.QName("", "cleft");
    private static final javax.xml.namespace.QName CUSP$4 = 
        new javax.xml.namespace.QName("", "cusp");
    private static final javax.xml.namespace.QName LOWLATITUDE$6 = 
        new javax.xml.namespace.QName("", "lowLatitude");
    private static final javax.xml.namespace.QName MIDLATITUDE$8 = 
        new javax.xml.namespace.QName("", "midLatitude");
    private static final javax.xml.namespace.QName POLARCAP$10 = 
        new javax.xml.namespace.QName("", "polarCap");
    
    
    /**
     * Gets the "auroralOval" element
     */
    public gov.nasa.gsfc.spdf.ssc.HemisphereOptions getAuroralOval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.HemisphereOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.HemisphereOptions)get_store().find_element_user(AURORALOVAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "auroralOval" element
     */
    public boolean isSetAuroralOval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AURORALOVAL$0) != 0;
        }
    }
    
    /**
     * Sets the "auroralOval" element
     */
    public void setAuroralOval(gov.nasa.gsfc.spdf.ssc.HemisphereOptions auroralOval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.HemisphereOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.HemisphereOptions)get_store().find_element_user(AURORALOVAL$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.HemisphereOptions)get_store().add_element_user(AURORALOVAL$0);
            }
            target.set(auroralOval);
        }
    }
    
    /**
     * Appends and returns a new empty "auroralOval" element
     */
    public gov.nasa.gsfc.spdf.ssc.HemisphereOptions addNewAuroralOval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.HemisphereOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.HemisphereOptions)get_store().add_element_user(AURORALOVAL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "auroralOval" element
     */
    public void unsetAuroralOval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AURORALOVAL$0, 0);
        }
    }
    
    /**
     * Gets the "cleft" element
     */
    public gov.nasa.gsfc.spdf.ssc.HemisphereOptions getCleft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.HemisphereOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.HemisphereOptions)get_store().find_element_user(CLEFT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cleft" element
     */
    public boolean isSetCleft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLEFT$2) != 0;
        }
    }
    
    /**
     * Sets the "cleft" element
     */
    public void setCleft(gov.nasa.gsfc.spdf.ssc.HemisphereOptions cleft)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.HemisphereOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.HemisphereOptions)get_store().find_element_user(CLEFT$2, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.HemisphereOptions)get_store().add_element_user(CLEFT$2);
            }
            target.set(cleft);
        }
    }
    
    /**
     * Appends and returns a new empty "cleft" element
     */
    public gov.nasa.gsfc.spdf.ssc.HemisphereOptions addNewCleft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.HemisphereOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.HemisphereOptions)get_store().add_element_user(CLEFT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "cleft" element
     */
    public void unsetCleft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLEFT$2, 0);
        }
    }
    
    /**
     * Gets the "cusp" element
     */
    public gov.nasa.gsfc.spdf.ssc.HemisphereOptions getCusp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.HemisphereOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.HemisphereOptions)get_store().find_element_user(CUSP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cusp" element
     */
    public boolean isSetCusp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSP$4) != 0;
        }
    }
    
    /**
     * Sets the "cusp" element
     */
    public void setCusp(gov.nasa.gsfc.spdf.ssc.HemisphereOptions cusp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.HemisphereOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.HemisphereOptions)get_store().find_element_user(CUSP$4, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.HemisphereOptions)get_store().add_element_user(CUSP$4);
            }
            target.set(cusp);
        }
    }
    
    /**
     * Appends and returns a new empty "cusp" element
     */
    public gov.nasa.gsfc.spdf.ssc.HemisphereOptions addNewCusp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.HemisphereOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.HemisphereOptions)get_store().add_element_user(CUSP$4);
            return target;
        }
    }
    
    /**
     * Unsets the "cusp" element
     */
    public void unsetCusp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSP$4, 0);
        }
    }
    
    /**
     * Gets the "lowLatitude" element
     */
    public boolean getLowLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWLATITUDE$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "lowLatitude" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetLowLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(LOWLATITUDE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "lowLatitude" element
     */
    public void setLowLatitude(boolean lowLatitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWLATITUDE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOWLATITUDE$6);
            }
            target.setBooleanValue(lowLatitude);
        }
    }
    
    /**
     * Sets (as xml) the "lowLatitude" element
     */
    public void xsetLowLatitude(org.apache.xmlbeans.XmlBoolean lowLatitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(LOWLATITUDE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(LOWLATITUDE$6);
            }
            target.set(lowLatitude);
        }
    }
    
    /**
     * Gets the "midLatitude" element
     */
    public gov.nasa.gsfc.spdf.ssc.HemisphereOptions getMidLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.HemisphereOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.HemisphereOptions)get_store().find_element_user(MIDLATITUDE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "midLatitude" element
     */
    public boolean isSetMidLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MIDLATITUDE$8) != 0;
        }
    }
    
    /**
     * Sets the "midLatitude" element
     */
    public void setMidLatitude(gov.nasa.gsfc.spdf.ssc.HemisphereOptions midLatitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.HemisphereOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.HemisphereOptions)get_store().find_element_user(MIDLATITUDE$8, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.HemisphereOptions)get_store().add_element_user(MIDLATITUDE$8);
            }
            target.set(midLatitude);
        }
    }
    
    /**
     * Appends and returns a new empty "midLatitude" element
     */
    public gov.nasa.gsfc.spdf.ssc.HemisphereOptions addNewMidLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.HemisphereOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.HemisphereOptions)get_store().add_element_user(MIDLATITUDE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "midLatitude" element
     */
    public void unsetMidLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MIDLATITUDE$8, 0);
        }
    }
    
    /**
     * Gets the "polarCap" element
     */
    public gov.nasa.gsfc.spdf.ssc.HemisphereOptions getPolarCap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.HemisphereOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.HemisphereOptions)get_store().find_element_user(POLARCAP$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "polarCap" element
     */
    public boolean isSetPolarCap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POLARCAP$10) != 0;
        }
    }
    
    /**
     * Sets the "polarCap" element
     */
    public void setPolarCap(gov.nasa.gsfc.spdf.ssc.HemisphereOptions polarCap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.HemisphereOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.HemisphereOptions)get_store().find_element_user(POLARCAP$10, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.HemisphereOptions)get_store().add_element_user(POLARCAP$10);
            }
            target.set(polarCap);
        }
    }
    
    /**
     * Appends and returns a new empty "polarCap" element
     */
    public gov.nasa.gsfc.spdf.ssc.HemisphereOptions addNewPolarCap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.HemisphereOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.HemisphereOptions)get_store().add_element_user(POLARCAP$10);
            return target;
        }
    }
    
    /**
     * Unsets the "polarCap" element
     */
    public void unsetPolarCap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POLARCAP$10, 0);
        }
    }
}
