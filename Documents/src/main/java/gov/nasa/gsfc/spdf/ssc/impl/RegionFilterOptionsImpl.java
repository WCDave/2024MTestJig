/*
 * XML Type:  regionFilterOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.RegionFilterOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML regionFilterOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class RegionFilterOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.RegionFilterOptions
{
    private static final long serialVersionUID = 1L;
    
    public RegionFilterOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAGNETICTRACEREGIONS$0 = 
        new javax.xml.namespace.QName("", "magneticTraceRegions");
    private static final javax.xml.namespace.QName RADIALTRACEREGIONS$2 = 
        new javax.xml.namespace.QName("", "radialTraceRegions");
    private static final javax.xml.namespace.QName SPACEREGIONS$4 = 
        new javax.xml.namespace.QName("", "spaceRegions");
    
    
    /**
     * Gets the "magneticTraceRegions" element
     */
    public gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions getMagneticTraceRegions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions)get_store().find_element_user(MAGNETICTRACEREGIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "magneticTraceRegions" element
     */
    public boolean isSetMagneticTraceRegions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAGNETICTRACEREGIONS$0) != 0;
        }
    }
    
    /**
     * Sets the "magneticTraceRegions" element
     */
    public void setMagneticTraceRegions(gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions magneticTraceRegions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions)get_store().find_element_user(MAGNETICTRACEREGIONS$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions)get_store().add_element_user(MAGNETICTRACEREGIONS$0);
            }
            target.set(magneticTraceRegions);
        }
    }
    
    /**
     * Appends and returns a new empty "magneticTraceRegions" element
     */
    public gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions addNewMagneticTraceRegions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions)get_store().add_element_user(MAGNETICTRACEREGIONS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "magneticTraceRegions" element
     */
    public void unsetMagneticTraceRegions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAGNETICTRACEREGIONS$0, 0);
        }
    }
    
    /**
     * Gets the "radialTraceRegions" element
     */
    public gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions getRadialTraceRegions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions)get_store().find_element_user(RADIALTRACEREGIONS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "radialTraceRegions" element
     */
    public boolean isSetRadialTraceRegions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RADIALTRACEREGIONS$2) != 0;
        }
    }
    
    /**
     * Sets the "radialTraceRegions" element
     */
    public void setRadialTraceRegions(gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions radialTraceRegions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions)get_store().find_element_user(RADIALTRACEREGIONS$2, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions)get_store().add_element_user(RADIALTRACEREGIONS$2);
            }
            target.set(radialTraceRegions);
        }
    }
    
    /**
     * Appends and returns a new empty "radialTraceRegions" element
     */
    public gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions addNewRadialTraceRegions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions)get_store().add_element_user(RADIALTRACEREGIONS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "radialTraceRegions" element
     */
    public void unsetRadialTraceRegions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RADIALTRACEREGIONS$2, 0);
        }
    }
    
    /**
     * Gets the "spaceRegions" element
     */
    public gov.nasa.gsfc.spdf.ssc.SpaceRegionsFilterOptions getSpaceRegions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SpaceRegionsFilterOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SpaceRegionsFilterOptions)get_store().find_element_user(SPACEREGIONS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "spaceRegions" element
     */
    public boolean isSetSpaceRegions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPACEREGIONS$4) != 0;
        }
    }
    
    /**
     * Sets the "spaceRegions" element
     */
    public void setSpaceRegions(gov.nasa.gsfc.spdf.ssc.SpaceRegionsFilterOptions spaceRegions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SpaceRegionsFilterOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SpaceRegionsFilterOptions)get_store().find_element_user(SPACEREGIONS$4, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.SpaceRegionsFilterOptions)get_store().add_element_user(SPACEREGIONS$4);
            }
            target.set(spaceRegions);
        }
    }
    
    /**
     * Appends and returns a new empty "spaceRegions" element
     */
    public gov.nasa.gsfc.spdf.ssc.SpaceRegionsFilterOptions addNewSpaceRegions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SpaceRegionsFilterOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SpaceRegionsFilterOptions)get_store().add_element_user(SPACEREGIONS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "spaceRegions" element
     */
    public void unsetSpaceRegions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPACEREGIONS$4, 0);
        }
    }
}
