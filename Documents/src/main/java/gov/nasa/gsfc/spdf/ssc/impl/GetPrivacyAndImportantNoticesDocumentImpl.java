/*
 * An XML document type.
 * Localname: getPrivacyAndImportantNotices
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNoticesDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * A document containing one getPrivacyAndImportantNotices(@http://ssc.spdf.gsfc.nasa.gov/) element.
 *
 * This is a complex type.
 */
public class GetPrivacyAndImportantNoticesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNoticesDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetPrivacyAndImportantNoticesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRIVACYANDIMPORTANTNOTICES$0 = 
        new javax.xml.namespace.QName("http://ssc.spdf.gsfc.nasa.gov/", "getPrivacyAndImportantNotices");
    
    
    /**
     * Gets the "getPrivacyAndImportantNotices" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices getGetPrivacyAndImportantNotices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices)get_store().find_element_user(GETPRIVACYANDIMPORTANTNOTICES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getPrivacyAndImportantNotices" element
     */
    public void setGetPrivacyAndImportantNotices(gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices getPrivacyAndImportantNotices)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices)get_store().find_element_user(GETPRIVACYANDIMPORTANTNOTICES$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices)get_store().add_element_user(GETPRIVACYANDIMPORTANTNOTICES$0);
            }
            target.set(getPrivacyAndImportantNotices);
        }
    }
    
    /**
     * Appends and returns a new empty "getPrivacyAndImportantNotices" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices addNewGetPrivacyAndImportantNotices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices)get_store().add_element_user(GETPRIVACYANDIMPORTANTNOTICES$0);
            return target;
        }
    }
}
