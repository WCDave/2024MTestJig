/*
 * XML Type:  graphRequest
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GraphRequest
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML graphRequest(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class GraphRequestImpl extends gov.nasa.gsfc.spdf.ssc.impl.RequestImpl implements gov.nasa.gsfc.spdf.ssc.GraphRequest
{
    private static final long serialVersionUID = 1L;
    
    public GraphRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPPROJECTIONOPTIONS$0 = 
        new javax.xml.namespace.QName("", "mapProjectionOptions");
    private static final javax.xml.namespace.QName ORBITOPTIONS$2 = 
        new javax.xml.namespace.QName("", "orbitOptions");
    private static final javax.xml.namespace.QName TIMESERIESOPTIONS$4 = 
        new javax.xml.namespace.QName("", "timeSeriesOptions");
    
    
    /**
     * Gets the "mapProjectionOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions getMapProjectionOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions)get_store().find_element_user(MAPPROJECTIONOPTIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mapProjectionOptions" element
     */
    public boolean isSetMapProjectionOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPPROJECTIONOPTIONS$0) != 0;
        }
    }
    
    /**
     * Sets the "mapProjectionOptions" element
     */
    public void setMapProjectionOptions(gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions mapProjectionOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions)get_store().find_element_user(MAPPROJECTIONOPTIONS$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions)get_store().add_element_user(MAPPROJECTIONOPTIONS$0);
            }
            target.set(mapProjectionOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "mapProjectionOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions addNewMapProjectionOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions)get_store().add_element_user(MAPPROJECTIONOPTIONS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "mapProjectionOptions" element
     */
    public void unsetMapProjectionOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPPROJECTIONOPTIONS$0, 0);
        }
    }
    
    /**
     * Gets the "orbitOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions getOrbitOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions)get_store().find_element_user(ORBITOPTIONS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "orbitOptions" element
     */
    public boolean isSetOrbitOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORBITOPTIONS$2) != 0;
        }
    }
    
    /**
     * Sets the "orbitOptions" element
     */
    public void setOrbitOptions(gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions orbitOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions)get_store().find_element_user(ORBITOPTIONS$2, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions)get_store().add_element_user(ORBITOPTIONS$2);
            }
            target.set(orbitOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "orbitOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions addNewOrbitOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions)get_store().add_element_user(ORBITOPTIONS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "orbitOptions" element
     */
    public void unsetOrbitOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORBITOPTIONS$2, 0);
        }
    }
    
    /**
     * Gets the "timeSeriesOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions getTimeSeriesOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions)get_store().find_element_user(TIMESERIESOPTIONS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timeSeriesOptions" element
     */
    public boolean isSetTimeSeriesOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMESERIESOPTIONS$4) != 0;
        }
    }
    
    /**
     * Sets the "timeSeriesOptions" element
     */
    public void setTimeSeriesOptions(gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions timeSeriesOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions)get_store().find_element_user(TIMESERIESOPTIONS$4, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions)get_store().add_element_user(TIMESERIESOPTIONS$4);
            }
            target.set(timeSeriesOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "timeSeriesOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions addNewTimeSeriesOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions)get_store().add_element_user(TIMESERIESOPTIONS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "timeSeriesOptions" element
     */
    public void unsetTimeSeriesOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMESERIESOPTIONS$4, 0);
        }
    }
}
