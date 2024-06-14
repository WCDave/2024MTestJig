/*
 * An XML document type.
 * Localname: getDataFilesResponse
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GetDataFilesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * A document containing one getDataFilesResponse(@http://ssc.spdf.gsfc.nasa.gov/) element.
 *
 * This is a complex type.
 */
public class GetDataFilesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.GetDataFilesResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetDataFilesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETDATAFILESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://ssc.spdf.gsfc.nasa.gov/", "getDataFilesResponse");
    
    
    /**
     * Gets the "getDataFilesResponse" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetDataFilesResponse getGetDataFilesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetDataFilesResponse target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetDataFilesResponse)get_store().find_element_user(GETDATAFILESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getDataFilesResponse" element
     */
    public void setGetDataFilesResponse(gov.nasa.gsfc.spdf.ssc.GetDataFilesResponse getDataFilesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetDataFilesResponse target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetDataFilesResponse)get_store().find_element_user(GETDATAFILESRESPONSE$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.GetDataFilesResponse)get_store().add_element_user(GETDATAFILESRESPONSE$0);
            }
            target.set(getDataFilesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getDataFilesResponse" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetDataFilesResponse addNewGetDataFilesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetDataFilesResponse target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetDataFilesResponse)get_store().add_element_user(GETDATAFILESRESPONSE$0);
            return target;
        }
    }
}
