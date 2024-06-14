/*
 * XML Type:  getGraphsResponse
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GetGraphsResponse
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML getGraphsResponse(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class GetGraphsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.GetGraphsResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetGraphsResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETURN$0 = 
        new javax.xml.namespace.QName("", "return");
    
    
    /**
     * Gets the "return" element
     */
    public gov.nasa.gsfc.spdf.ssc.FileResult getReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FileResult target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FileResult)get_store().find_element_user(RETURN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "return" element
     */
    public boolean isSetReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RETURN$0) != 0;
        }
    }
    
    /**
     * Sets the "return" element
     */
    public void setReturn(gov.nasa.gsfc.spdf.ssc.FileResult xreturn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FileResult target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FileResult)get_store().find_element_user(RETURN$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.FileResult)get_store().add_element_user(RETURN$0);
            }
            target.set(xreturn);
        }
    }
    
    /**
     * Appends and returns a new empty "return" element
     */
    public gov.nasa.gsfc.spdf.ssc.FileResult addNewReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FileResult target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FileResult)get_store().add_element_user(RETURN$0);
            return target;
        }
    }
    
    /**
     * Unsets the "return" element
     */
    public void unsetReturn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RETURN$0, 0);
        }
    }
}
