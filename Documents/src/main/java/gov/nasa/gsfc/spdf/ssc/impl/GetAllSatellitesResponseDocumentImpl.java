/*
 * An XML document type.
 * Localname: getAllSatellitesResponse
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GetAllSatellitesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * A document containing one getAllSatellitesResponse(@http://ssc.spdf.gsfc.nasa.gov/) element.
 *
 * This is a complex type.
 */
public class GetAllSatellitesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.GetAllSatellitesResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetAllSatellitesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETALLSATELLITESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://ssc.spdf.gsfc.nasa.gov/", "getAllSatellitesResponse");
    
    
    /**
     * Gets the "getAllSatellitesResponse" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetAllSatellitesResponse getGetAllSatellitesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetAllSatellitesResponse target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetAllSatellitesResponse)get_store().find_element_user(GETALLSATELLITESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getAllSatellitesResponse" element
     */
    public void setGetAllSatellitesResponse(gov.nasa.gsfc.spdf.ssc.GetAllSatellitesResponse getAllSatellitesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetAllSatellitesResponse target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetAllSatellitesResponse)get_store().find_element_user(GETALLSATELLITESRESPONSE$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.GetAllSatellitesResponse)get_store().add_element_user(GETALLSATELLITESRESPONSE$0);
            }
            target.set(getAllSatellitesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getAllSatellitesResponse" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetAllSatellitesResponse addNewGetAllSatellitesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetAllSatellitesResponse target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetAllSatellitesResponse)get_store().add_element_user(GETALLSATELLITESRESPONSE$0);
            return target;
        }
    }
}
