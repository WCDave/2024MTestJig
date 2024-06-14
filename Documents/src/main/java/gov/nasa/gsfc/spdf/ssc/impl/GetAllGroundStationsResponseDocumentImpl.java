/*
 * An XML document type.
 * Localname: getAllGroundStationsResponse
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GetAllGroundStationsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * A document containing one getAllGroundStationsResponse(@http://ssc.spdf.gsfc.nasa.gov/) element.
 *
 * This is a complex type.
 */
public class GetAllGroundStationsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.GetAllGroundStationsResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetAllGroundStationsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETALLGROUNDSTATIONSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://ssc.spdf.gsfc.nasa.gov/", "getAllGroundStationsResponse");
    
    
    /**
     * Gets the "getAllGroundStationsResponse" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetAllGroundStationsResponse getGetAllGroundStationsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetAllGroundStationsResponse target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetAllGroundStationsResponse)get_store().find_element_user(GETALLGROUNDSTATIONSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getAllGroundStationsResponse" element
     */
    public void setGetAllGroundStationsResponse(gov.nasa.gsfc.spdf.ssc.GetAllGroundStationsResponse getAllGroundStationsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetAllGroundStationsResponse target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetAllGroundStationsResponse)get_store().find_element_user(GETALLGROUNDSTATIONSRESPONSE$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.GetAllGroundStationsResponse)get_store().add_element_user(GETALLGROUNDSTATIONSRESPONSE$0);
            }
            target.set(getAllGroundStationsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getAllGroundStationsResponse" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetAllGroundStationsResponse addNewGetAllGroundStationsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetAllGroundStationsResponse target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetAllGroundStationsResponse)get_store().add_element_user(GETALLGROUNDSTATIONSRESPONSE$0);
            return target;
        }
    }
}
