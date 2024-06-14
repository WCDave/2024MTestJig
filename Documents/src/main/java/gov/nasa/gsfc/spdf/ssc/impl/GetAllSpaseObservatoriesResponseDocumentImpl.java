/*
 * An XML document type.
 * Localname: getAllSpaseObservatoriesResponse
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GetAllSpaseObservatoriesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * A document containing one getAllSpaseObservatoriesResponse(@http://ssc.spdf.gsfc.nasa.gov/) element.
 *
 * This is a complex type.
 */
public class GetAllSpaseObservatoriesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.GetAllSpaseObservatoriesResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetAllSpaseObservatoriesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETALLSPASEOBSERVATORIESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://ssc.spdf.gsfc.nasa.gov/", "getAllSpaseObservatoriesResponse");
    
    
    /**
     * Gets the "getAllSpaseObservatoriesResponse" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetAllSpaseObservatoriesResponse getGetAllSpaseObservatoriesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetAllSpaseObservatoriesResponse target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetAllSpaseObservatoriesResponse)get_store().find_element_user(GETALLSPASEOBSERVATORIESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getAllSpaseObservatoriesResponse" element
     */
    public void setGetAllSpaseObservatoriesResponse(gov.nasa.gsfc.spdf.ssc.GetAllSpaseObservatoriesResponse getAllSpaseObservatoriesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetAllSpaseObservatoriesResponse target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetAllSpaseObservatoriesResponse)get_store().find_element_user(GETALLSPASEOBSERVATORIESRESPONSE$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.GetAllSpaseObservatoriesResponse)get_store().add_element_user(GETALLSPASEOBSERVATORIESRESPONSE$0);
            }
            target.set(getAllSpaseObservatoriesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getAllSpaseObservatoriesResponse" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetAllSpaseObservatoriesResponse addNewGetAllSpaseObservatoriesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetAllSpaseObservatoriesResponse target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetAllSpaseObservatoriesResponse)get_store().add_element_user(GETALLSPASEOBSERVATORIESRESPONSE$0);
            return target;
        }
    }
}
