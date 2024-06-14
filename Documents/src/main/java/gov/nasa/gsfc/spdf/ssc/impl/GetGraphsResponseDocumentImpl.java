/*
 * An XML document type.
 * Localname: getGraphsResponse
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GetGraphsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * A document containing one getGraphsResponse(@http://ssc.spdf.gsfc.nasa.gov/) element.
 *
 * This is a complex type.
 */
public class GetGraphsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.GetGraphsResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetGraphsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETGRAPHSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://ssc.spdf.gsfc.nasa.gov/", "getGraphsResponse");
    
    
    /**
     * Gets the "getGraphsResponse" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetGraphsResponse getGetGraphsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetGraphsResponse target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetGraphsResponse)get_store().find_element_user(GETGRAPHSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getGraphsResponse" element
     */
    public void setGetGraphsResponse(gov.nasa.gsfc.spdf.ssc.GetGraphsResponse getGraphsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetGraphsResponse target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetGraphsResponse)get_store().find_element_user(GETGRAPHSRESPONSE$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.GetGraphsResponse)get_store().add_element_user(GETGRAPHSRESPONSE$0);
            }
            target.set(getGraphsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getGraphsResponse" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetGraphsResponse addNewGetGraphsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetGraphsResponse target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetGraphsResponse)get_store().add_element_user(GETGRAPHSRESPONSE$0);
            return target;
        }
    }
}
