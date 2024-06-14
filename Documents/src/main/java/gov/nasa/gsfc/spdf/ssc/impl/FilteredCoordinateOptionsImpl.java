/*
 * XML Type:  filteredCoordinateOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.FilteredCoordinateOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML filteredCoordinateOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class FilteredCoordinateOptionsImpl extends gov.nasa.gsfc.spdf.ssc.impl.CoordinateOptionsImpl implements gov.nasa.gsfc.spdf.ssc.FilteredCoordinateOptions
{
    private static final long serialVersionUID = 1L;
    
    public FilteredCoordinateOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILTER$0 = 
        new javax.xml.namespace.QName("", "filter");
    
    
    /**
     * Gets the "filter" element
     */
    public gov.nasa.gsfc.spdf.ssc.LocationFilter getFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilter target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().find_element_user(FILTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "filter" element
     */
    public boolean isSetFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTER$0) != 0;
        }
    }
    
    /**
     * Sets the "filter" element
     */
    public void setFilter(gov.nasa.gsfc.spdf.ssc.LocationFilter filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilter target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().find_element_user(FILTER$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().add_element_user(FILTER$0);
            }
            target.set(filter);
        }
    }
    
    /**
     * Appends and returns a new empty "filter" element
     */
    public gov.nasa.gsfc.spdf.ssc.LocationFilter addNewFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LocationFilter target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LocationFilter)get_store().add_element_user(FILTER$0);
            return target;
        }
    }
    
    /**
     * Unsets the "filter" element
     */
    public void unsetFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTER$0, 0);
        }
    }
}
