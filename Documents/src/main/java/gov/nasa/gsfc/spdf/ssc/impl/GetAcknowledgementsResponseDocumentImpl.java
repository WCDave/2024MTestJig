/*
 * An XML document type.
 * Localname: getAcknowledgementsResponse
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GetAcknowledgementsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * A document containing one getAcknowledgementsResponse(@http://ssc.spdf.gsfc.nasa.gov/) element.
 *
 * This is a complex type.
 */
public class GetAcknowledgementsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.GetAcknowledgementsResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetAcknowledgementsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETACKNOWLEDGEMENTSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://ssc.spdf.gsfc.nasa.gov/", "getAcknowledgementsResponse");
    
    
    /**
     * Gets the "getAcknowledgementsResponse" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetAcknowledgementsResponse getGetAcknowledgementsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetAcknowledgementsResponse target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetAcknowledgementsResponse)get_store().find_element_user(GETACKNOWLEDGEMENTSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getAcknowledgementsResponse" element
     */
    public void setGetAcknowledgementsResponse(gov.nasa.gsfc.spdf.ssc.GetAcknowledgementsResponse getAcknowledgementsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetAcknowledgementsResponse target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetAcknowledgementsResponse)get_store().find_element_user(GETACKNOWLEDGEMENTSRESPONSE$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.GetAcknowledgementsResponse)get_store().add_element_user(GETACKNOWLEDGEMENTSRESPONSE$0);
            }
            target.set(getAcknowledgementsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getAcknowledgementsResponse" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetAcknowledgementsResponse addNewGetAcknowledgementsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetAcknowledgementsResponse target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetAcknowledgementsResponse)get_store().add_element_user(GETACKNOWLEDGEMENTSRESPONSE$0);
            return target;
        }
    }
}
