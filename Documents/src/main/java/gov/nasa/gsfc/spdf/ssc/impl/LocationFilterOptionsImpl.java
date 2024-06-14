/*
 * XML Type:  locationFilterOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.LocationFilterOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML locationFilterOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class LocationFilterOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.LocationFilterOptions
{
    private static final long serialVersionUID = 1L;
    
    public LocationFilterOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALLFILTERS$0 = 
        new javax.xml.namespace.QName("", "allFilters");
    private static final javax.xml.namespace.QName DIPOLEINVARIANTLATITUDE$2 = 
        new javax.xml.namespace.QName("", "dipoleInvariantLatitude");
    private static final javax.xml.namespace.QName DIPOLELVALUE$4 = 
        new javax.xml.namespace.QName("", "dipoleLValue");
    private static final javax.xml.namespace.QName DISTANCEFROMBOWSHOCK$6 = 
        new javax.xml.namespace.QName("", "distanceFromBowShock");
    private static final javax.xml.namespace.QName DISTANCEFROMCENTEROFEARTH$8 = 
        new javax.xml.namespace.QName("", "distanceFromCenterOfEarth");
    private static final javax.xml.namespace.QName DISTANCEFROMMAGNETOPAUSE$10 = 
        new javax.xml.namespace.QName("", "distanceFromMagnetopause");
    private static final javax.xml.namespace.QName DISTANCEFROMNEUTRALSHEET$12 = 
        new javax.xml.namespace.QName("", "distanceFromNeutralSheet");
    private static final javax.xml.namespace.QName MAGNETICFIELDSTRENGTH$14 = 
        new javax.xml.namespace.QName("", "magneticFieldStrength");
    
    
    /**
     * Gets the "allFilters" element
     */
    public boolean getAllFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLFILTERS$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "allFilters" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAllFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ALLFILTERS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "allFilters" element
     */
    public void setAllFilters(boolean allFilters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLFILTERS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALLFILTERS$0);
            }
            target.setBooleanValue(allFilters);
        }
    }
    
    /**
     * Sets (as xml) the "allFilters" element
     */
    public void xsetAllFilters(org.apache.xmlbeans.XmlBoolean allFilters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ALLFILTERS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ALLFILTERS$0);
            }
            target.set(allFilters);
        }
    }
    
    /**
     * Gets the "dipoleInvariantLatitude" element
     */
    public gov.nasa.gsfc.spdf.ssc.LocationFilter getDipoleInvariantLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilter target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().find_element_user(DIPOLEINVARIANTLATITUDE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dipoleInvariantLatitude" element
     */
    public boolean isSetDipoleInvariantLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIPOLEINVARIANTLATITUDE$2) != 0;
        }
    }
    
    /**
     * Sets the "dipoleInvariantLatitude" element
     */
    public void setDipoleInvariantLatitude(gov.nasa.gsfc.spdf.ssc.LocationFilter dipoleInvariantLatitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilter target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().find_element_user(DIPOLEINVARIANTLATITUDE$2, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().add_element_user(DIPOLEINVARIANTLATITUDE$2);
            }
            target.set(dipoleInvariantLatitude);
        }
    }
    
    /**
     * Appends and returns a new empty "dipoleInvariantLatitude" element
     */
    public gov.nasa.gsfc.spdf.ssc.LocationFilter addNewDipoleInvariantLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilter target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().add_element_user(DIPOLEINVARIANTLATITUDE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "dipoleInvariantLatitude" element
     */
    public void unsetDipoleInvariantLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIPOLEINVARIANTLATITUDE$2, 0);
        }
    }
    
    /**
     * Gets the "dipoleLValue" element
     */
    public gov.nasa.gsfc.spdf.ssc.LocationFilter getDipoleLValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilter target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().find_element_user(DIPOLELVALUE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dipoleLValue" element
     */
    public boolean isSetDipoleLValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIPOLELVALUE$4) != 0;
        }
    }
    
    /**
     * Sets the "dipoleLValue" element
     */
    public void setDipoleLValue(gov.nasa.gsfc.spdf.ssc.LocationFilter dipoleLValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilter target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().find_element_user(DIPOLELVALUE$4, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().add_element_user(DIPOLELVALUE$4);
            }
            target.set(dipoleLValue);
        }
    }
    
    /**
     * Appends and returns a new empty "dipoleLValue" element
     */
    public gov.nasa.gsfc.spdf.ssc.LocationFilter addNewDipoleLValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilter target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().add_element_user(DIPOLELVALUE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "dipoleLValue" element
     */
    public void unsetDipoleLValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIPOLELVALUE$4, 0);
        }
    }
    
    /**
     * Gets the "distanceFromBowShock" element
     */
    public gov.nasa.gsfc.spdf.ssc.LocationFilter getDistanceFromBowShock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilter target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().find_element_user(DISTANCEFROMBOWSHOCK$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "distanceFromBowShock" element
     */
    public boolean isSetDistanceFromBowShock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTANCEFROMBOWSHOCK$6) != 0;
        }
    }
    
    /**
     * Sets the "distanceFromBowShock" element
     */
    public void setDistanceFromBowShock(gov.nasa.gsfc.spdf.ssc.LocationFilter distanceFromBowShock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilter target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().find_element_user(DISTANCEFROMBOWSHOCK$6, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().add_element_user(DISTANCEFROMBOWSHOCK$6);
            }
            target.set(distanceFromBowShock);
        }
    }
    
    /**
     * Appends and returns a new empty "distanceFromBowShock" element
     */
    public gov.nasa.gsfc.spdf.ssc.LocationFilter addNewDistanceFromBowShock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilter target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().add_element_user(DISTANCEFROMBOWSHOCK$6);
            return target;
        }
    }
    
    /**
     * Unsets the "distanceFromBowShock" element
     */
    public void unsetDistanceFromBowShock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTANCEFROMBOWSHOCK$6, 0);
        }
    }
    
    /**
     * Gets the "distanceFromCenterOfEarth" element
     */
    public gov.nasa.gsfc.spdf.ssc.LocationFilter getDistanceFromCenterOfEarth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilter target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().find_element_user(DISTANCEFROMCENTEROFEARTH$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "distanceFromCenterOfEarth" element
     */
    public boolean isSetDistanceFromCenterOfEarth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTANCEFROMCENTEROFEARTH$8) != 0;
        }
    }
    
    /**
     * Sets the "distanceFromCenterOfEarth" element
     */
    public void setDistanceFromCenterOfEarth(gov.nasa.gsfc.spdf.ssc.LocationFilter distanceFromCenterOfEarth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilter target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().find_element_user(DISTANCEFROMCENTEROFEARTH$8, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().add_element_user(DISTANCEFROMCENTEROFEARTH$8);
            }
            target.set(distanceFromCenterOfEarth);
        }
    }
    
    /**
     * Appends and returns a new empty "distanceFromCenterOfEarth" element
     */
    public gov.nasa.gsfc.spdf.ssc.LocationFilter addNewDistanceFromCenterOfEarth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilter target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().add_element_user(DISTANCEFROMCENTEROFEARTH$8);
            return target;
        }
    }
    
    /**
     * Unsets the "distanceFromCenterOfEarth" element
     */
    public void unsetDistanceFromCenterOfEarth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTANCEFROMCENTEROFEARTH$8, 0);
        }
    }
    
    /**
     * Gets the "distanceFromMagnetopause" element
     */
    public gov.nasa.gsfc.spdf.ssc.LocationFilter getDistanceFromMagnetopause()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilter target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().find_element_user(DISTANCEFROMMAGNETOPAUSE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "distanceFromMagnetopause" element
     */
    public boolean isSetDistanceFromMagnetopause()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTANCEFROMMAGNETOPAUSE$10) != 0;
        }
    }
    
    /**
     * Sets the "distanceFromMagnetopause" element
     */
    public void setDistanceFromMagnetopause(gov.nasa.gsfc.spdf.ssc.LocationFilter distanceFromMagnetopause)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilter target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().find_element_user(DISTANCEFROMMAGNETOPAUSE$10, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().add_element_user(DISTANCEFROMMAGNETOPAUSE$10);
            }
            target.set(distanceFromMagnetopause);
        }
    }
    
    /**
     * Appends and returns a new empty "distanceFromMagnetopause" element
     */
    public gov.nasa.gsfc.spdf.ssc.LocationFilter addNewDistanceFromMagnetopause()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilter target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().add_element_user(DISTANCEFROMMAGNETOPAUSE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "distanceFromMagnetopause" element
     */
    public void unsetDistanceFromMagnetopause()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTANCEFROMMAGNETOPAUSE$10, 0);
        }
    }
    
    /**
     * Gets the "distanceFromNeutralSheet" element
     */
    public gov.nasa.gsfc.spdf.ssc.LocationFilter getDistanceFromNeutralSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilter target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().find_element_user(DISTANCEFROMNEUTRALSHEET$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "distanceFromNeutralSheet" element
     */
    public boolean isSetDistanceFromNeutralSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTANCEFROMNEUTRALSHEET$12) != 0;
        }
    }
    
    /**
     * Sets the "distanceFromNeutralSheet" element
     */
    public void setDistanceFromNeutralSheet(gov.nasa.gsfc.spdf.ssc.LocationFilter distanceFromNeutralSheet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilter target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().find_element_user(DISTANCEFROMNEUTRALSHEET$12, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().add_element_user(DISTANCEFROMNEUTRALSHEET$12);
            }
            target.set(distanceFromNeutralSheet);
        }
    }
    
    /**
     * Appends and returns a new empty "distanceFromNeutralSheet" element
     */
    public gov.nasa.gsfc.spdf.ssc.LocationFilter addNewDistanceFromNeutralSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilter target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().add_element_user(DISTANCEFROMNEUTRALSHEET$12);
            return target;
        }
    }
    
    /**
     * Unsets the "distanceFromNeutralSheet" element
     */
    public void unsetDistanceFromNeutralSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTANCEFROMNEUTRALSHEET$12, 0);
        }
    }
    
    /**
     * Gets the "magneticFieldStrength" element
     */
    public gov.nasa.gsfc.spdf.ssc.LocationFilter getMagneticFieldStrength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilter target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().find_element_user(MAGNETICFIELDSTRENGTH$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "magneticFieldStrength" element
     */
    public boolean isSetMagneticFieldStrength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAGNETICFIELDSTRENGTH$14) != 0;
        }
    }
    
    /**
     * Sets the "magneticFieldStrength" element
     */
    public void setMagneticFieldStrength(gov.nasa.gsfc.spdf.ssc.LocationFilter magneticFieldStrength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilter target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().find_element_user(MAGNETICFIELDSTRENGTH$14, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().add_element_user(MAGNETICFIELDSTRENGTH$14);
            }
            target.set(magneticFieldStrength);
        }
    }
    
    /**
     * Appends and returns a new empty "magneticFieldStrength" element
     */
    public gov.nasa.gsfc.spdf.ssc.LocationFilter addNewMagneticFieldStrength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilter target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().add_element_user(MAGNETICFIELDSTRENGTH$14);
            return target;
        }
    }
    
    /**
     * Unsets the "magneticFieldStrength" element
     */
    public void unsetMagneticFieldStrength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAGNETICFIELDSTRENGTH$14, 0);
        }
    }
}
