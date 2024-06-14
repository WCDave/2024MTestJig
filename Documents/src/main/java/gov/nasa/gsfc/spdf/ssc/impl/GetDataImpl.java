/*
 * XML Type:  getData
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GetData
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML getData(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class GetDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.GetData
{
    private static final long serialVersionUID = 1L;
    
    public GetDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARG0$0 = 
        new javax.xml.namespace.QName("", "arg0");
    
    
    /**
     * Gets the "arg0" element
     */
    public gov.nasa.gsfc.spdf.ssc.DataRequest getArg0()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.DataRequest target = null;
            target = (gov.nasa.gsfc.spdf.ssc.DataRequest)get_store().find_element_user(ARG0$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "arg0" element
     */
    public boolean isSetArg0()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARG0$0) != 0;
        }
    }
    
    /**
     * Sets the "arg0" element
     */
    public void setArg0(gov.nasa.gsfc.spdf.ssc.DataRequest arg0)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.DataRequest target = null;
            target = (gov.nasa.gsfc.spdf.ssc.DataRequest)get_store().find_element_user(ARG0$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.DataRequest)get_store().add_element_user(ARG0$0);
            }
            target.set(arg0);
        }
    }
    
    /**
     * Appends and returns a new empty "arg0" element
     */
    public gov.nasa.gsfc.spdf.ssc.DataRequest addNewArg0()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.DataRequest target = null;
            target = (gov.nasa.gsfc.spdf.ssc.DataRequest)get_store().add_element_user(ARG0$0);
            return target;
        }
    }
    
    /**
     * Unsets the "arg0" element
     */
    public void unsetArg0()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARG0$0, 0);
        }
    }
}
