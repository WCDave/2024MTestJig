/*
 * An XML document type.
 * Localname: getDataResponse
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GetDataResponseDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * A document containing one getDataResponse(@http://ssc.spdf.gsfc.nasa.gov/) element.
 *
 * This is a complex type.
 */
public class GetDataResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.GetDataResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetDataResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETDATARESPONSE$0 = 
        new javax.xml.namespace.QName("http://ssc.spdf.gsfc.nasa.gov/", "getDataResponse");
    
    
    /**
     * Gets the "getDataResponse" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetDataResponse getGetDataResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetDataResponse target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetDataResponse)get_store().find_element_user(GETDATARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getDataResponse" element
     */
    public void setGetDataResponse(gov.nasa.gsfc.spdf.ssc.GetDataResponse getDataResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetDataResponse target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetDataResponse)get_store().find_element_user(GETDATARESPONSE$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.GetDataResponse)get_store().add_element_user(GETDATARESPONSE$0);
            }
            target.set(getDataResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getDataResponse" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetDataResponse addNewGetDataResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetDataResponse target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetDataResponse)get_store().add_element_user(GETDATARESPONSE$0);
            return target;
        }
    }
}
