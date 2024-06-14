/*
 * An XML document type.
 * Localname: getData
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GetDataDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * A document containing one getData(@http://ssc.spdf.gsfc.nasa.gov/) element.
 *
 * This is a complex type.
 */
public class GetDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.GetDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETDATA$0 = 
        new javax.xml.namespace.QName("http://ssc.spdf.gsfc.nasa.gov/", "getData");
    
    
    /**
     * Gets the "getData" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetData getGetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetData target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetData)get_store().find_element_user(GETDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getData" element
     */
    public void setGetData(gov.nasa.gsfc.spdf.ssc.GetData getData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetData target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetData)get_store().find_element_user(GETDATA$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.GetData)get_store().add_element_user(GETDATA$0);
            }
            target.set(getData);
        }
    }
    
    /**
     * Appends and returns a new empty "getData" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetData addNewGetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetData target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetData)get_store().add_element_user(GETDATA$0);
            return target;
        }
    }
}
