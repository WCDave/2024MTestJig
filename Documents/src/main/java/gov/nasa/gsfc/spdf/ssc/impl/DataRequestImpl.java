/*
 * XML Type:  dataRequest
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.DataRequest
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML dataRequest(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class DataRequestImpl extends gov.nasa.gsfc.spdf.ssc.impl.RequestImpl implements gov.nasa.gsfc.spdf.ssc.DataRequest
{
    private static final long serialVersionUID = 1L;
    
    public DataRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONFILTEROPTIONS$0 = 
        new javax.xml.namespace.QName("", "locationFilterOptions");
    private static final javax.xml.namespace.QName OUTPUTOPTIONS$2 = 
        new javax.xml.namespace.QName("", "outputOptions");
    private static final javax.xml.namespace.QName REGIONFILTEROPTIONS$4 = 
        new javax.xml.namespace.QName("", "regionFilterOptions");
    
    
    /**
     * Gets the "locationFilterOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.LocationFilterOptions getLocationFilterOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilterOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilterOptions)get_store().find_element_user(LOCATIONFILTEROPTIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "locationFilterOptions" element
     */
    public boolean isSetLocationFilterOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONFILTEROPTIONS$0) != 0;
        }
    }
    
    /**
     * Sets the "locationFilterOptions" element
     */
    public void setLocationFilterOptions(gov.nasa.gsfc.spdf.ssc.LocationFilterOptions locationFilterOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilterOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilterOptions)get_store().find_element_user(LOCATIONFILTEROPTIONS$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.LocationFilterOptions)get_store().add_element_user(LOCATIONFILTEROPTIONS$0);
            }
            target.set(locationFilterOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "locationFilterOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.LocationFilterOptions addNewLocationFilterOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilterOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilterOptions)get_store().add_element_user(LOCATIONFILTEROPTIONS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "locationFilterOptions" element
     */
    public void unsetLocationFilterOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONFILTEROPTIONS$0, 0);
        }
    }
    
    /**
     * Gets the "outputOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.OutputOptions getOutputOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.OutputOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.OutputOptions)get_store().find_element_user(OUTPUTOPTIONS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "outputOptions" element
     */
    public boolean isSetOutputOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTPUTOPTIONS$2) != 0;
        }
    }
    
    /**
     * Sets the "outputOptions" element
     */
    public void setOutputOptions(gov.nasa.gsfc.spdf.ssc.OutputOptions outputOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.OutputOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.OutputOptions)get_store().find_element_user(OUTPUTOPTIONS$2, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.OutputOptions)get_store().add_element_user(OUTPUTOPTIONS$2);
            }
            target.set(outputOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "outputOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.OutputOptions addNewOutputOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.OutputOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.OutputOptions)get_store().add_element_user(OUTPUTOPTIONS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "outputOptions" element
     */
    public void unsetOutputOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTPUTOPTIONS$2, 0);
        }
    }
    
    /**
     * Gets the "regionFilterOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.RegionFilterOptions getRegionFilterOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.RegionFilterOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.RegionFilterOptions)get_store().find_element_user(REGIONFILTEROPTIONS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "regionFilterOptions" element
     */
    public boolean isSetRegionFilterOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGIONFILTEROPTIONS$4) != 0;
        }
    }
    
    /**
     * Sets the "regionFilterOptions" element
     */
    public void setRegionFilterOptions(gov.nasa.gsfc.spdf.ssc.RegionFilterOptions regionFilterOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.RegionFilterOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.RegionFilterOptions)get_store().find_element_user(REGIONFILTEROPTIONS$4, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.RegionFilterOptions)get_store().add_element_user(REGIONFILTEROPTIONS$4);
            }
            target.set(regionFilterOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "regionFilterOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.RegionFilterOptions addNewRegionFilterOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.RegionFilterOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.RegionFilterOptions)get_store().add_element_user(REGIONFILTEROPTIONS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "regionFilterOptions" element
     */
    public void unsetRegionFilterOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGIONFILTEROPTIONS$4, 0);
        }
    }
}
