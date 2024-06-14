/*
 * An XML document type.
 * Localname: getPrivacyAndImportantNoticesResponse
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNoticesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * A document containing one getPrivacyAndImportantNoticesResponse(@http://ssc.spdf.gsfc.nasa.gov/) element.
 *
 * This is a complex type.
 */
public class GetPrivacyAndImportantNoticesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNoticesResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetPrivacyAndImportantNoticesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRIVACYANDIMPORTANTNOTICESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://ssc.spdf.gsfc.nasa.gov/", "getPrivacyAndImportantNoticesResponse");
    
    
    /**
     * Gets the "getPrivacyAndImportantNoticesResponse" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNoticesResponse getGetPrivacyAndImportantNoticesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNoticesResponse target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNoticesResponse)get_store().find_element_user(GETPRIVACYANDIMPORTANTNOTICESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getPrivacyAndImportantNoticesResponse" element
     */
    public void setGetPrivacyAndImportantNoticesResponse(gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNoticesResponse getPrivacyAndImportantNoticesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNoticesResponse target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNoticesResponse)get_store().find_element_user(GETPRIVACYANDIMPORTANTNOTICESRESPONSE$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNoticesResponse)get_store().add_element_user(GETPRIVACYANDIMPORTANTNOTICESRESPONSE$0);
            }
            target.set(getPrivacyAndImportantNoticesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getPrivacyAndImportantNoticesResponse" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNoticesResponse addNewGetPrivacyAndImportantNoticesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNoticesResponse target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNoticesResponse)get_store().add_element_user(GETPRIVACYANDIMPORTANTNOTICESRESPONSE$0);
            return target;
        }
    }
}
