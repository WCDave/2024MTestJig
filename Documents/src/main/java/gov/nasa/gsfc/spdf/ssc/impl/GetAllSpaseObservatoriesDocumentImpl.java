/*
 * An XML document type.
 * Localname: getAllSpaseObservatories
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GetAllSpaseObservatoriesDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * A document containing one getAllSpaseObservatories(@http://ssc.spdf.gsfc.nasa.gov/) element.
 *
 * This is a complex type.
 */
public class GetAllSpaseObservatoriesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.GetAllSpaseObservatoriesDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetAllSpaseObservatoriesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETALLSPASEOBSERVATORIES$0 = 
        new javax.xml.namespace.QName("http://ssc.spdf.gsfc.nasa.gov/", "getAllSpaseObservatories");
    
    
    /**
     * Gets the "getAllSpaseObservatories" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetAllSpaseObservatories getGetAllSpaseObservatories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetAllSpaseObservatories target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetAllSpaseObservatories)get_store().find_element_user(GETALLSPASEOBSERVATORIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getAllSpaseObservatories" element
     */
    public void setGetAllSpaseObservatories(gov.nasa.gsfc.spdf.ssc.GetAllSpaseObservatories getAllSpaseObservatories)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetAllSpaseObservatories target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetAllSpaseObservatories)get_store().find_element_user(GETALLSPASEOBSERVATORIES$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.GetAllSpaseObservatories)get_store().add_element_user(GETALLSPASEOBSERVATORIES$0);
            }
            target.set(getAllSpaseObservatories);
        }
    }
    
    /**
     * Appends and returns a new empty "getAllSpaseObservatories" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetAllSpaseObservatories addNewGetAllSpaseObservatories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetAllSpaseObservatories target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetAllSpaseObservatories)get_store().add_element_user(GETALLSPASEOBSERVATORIES$0);
            return target;
        }
    }
}
