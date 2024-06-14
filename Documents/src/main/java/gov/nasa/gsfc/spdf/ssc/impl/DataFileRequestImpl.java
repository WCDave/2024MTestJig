/*
 * XML Type:  dataFileRequest
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.DataFileRequest
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML dataFileRequest(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class DataFileRequestImpl extends gov.nasa.gsfc.spdf.ssc.impl.DataRequestImpl implements gov.nasa.gsfc.spdf.ssc.DataFileRequest
{
    private static final long serialVersionUID = 1L;
    
    public DataFileRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMATOPTIONS$0 = 
        new javax.xml.namespace.QName("", "formatOptions");
    
    
    /**
     * Gets the "formatOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.FormatOptions getFormatOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FormatOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FormatOptions)get_store().find_element_user(FORMATOPTIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "formatOptions" element
     */
    public boolean isSetFormatOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMATOPTIONS$0) != 0;
        }
    }
    
    /**
     * Sets the "formatOptions" element
     */
    public void setFormatOptions(gov.nasa.gsfc.spdf.ssc.FormatOptions formatOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FormatOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FormatOptions)get_store().find_element_user(FORMATOPTIONS$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.FormatOptions)get_store().add_element_user(FORMATOPTIONS$0);
            }
            target.set(formatOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "formatOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.FormatOptions addNewFormatOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FormatOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FormatOptions)get_store().add_element_user(FORMATOPTIONS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "formatOptions" element
     */
    public void unsetFormatOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMATOPTIONS$0, 0);
        }
    }
}
