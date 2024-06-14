/*
 * An XML document type.
 * Localname: SSCExternalException
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.SSCExternalExceptionDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * A document containing one SSCExternalException(@http://ssc.spdf.gsfc.nasa.gov/) element.
 *
 * This is a complex type.
 */
public class SSCExternalExceptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.SSCExternalExceptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public SSCExternalExceptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SSCEXTERNALEXCEPTION$0 = 
        new javax.xml.namespace.QName("http://ssc.spdf.gsfc.nasa.gov/", "SSCExternalException");
    
    
    /**
     * Gets the "SSCExternalException" element
     */
    public gov.nasa.gsfc.spdf.ssc.SSCExternalException getSSCExternalException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SSCExternalException target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SSCExternalException)get_store().find_element_user(SSCEXTERNALEXCEPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SSCExternalException" element
     */
    public void setSSCExternalException(gov.nasa.gsfc.spdf.ssc.SSCExternalException sscExternalException)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SSCExternalException target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SSCExternalException)get_store().find_element_user(SSCEXTERNALEXCEPTION$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.SSCExternalException)get_store().add_element_user(SSCEXTERNALEXCEPTION$0);
            }
            target.set(sscExternalException);
        }
    }
    
    /**
     * Appends and returns a new empty "SSCExternalException" element
     */
    public gov.nasa.gsfc.spdf.ssc.SSCExternalException addNewSSCExternalException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SSCExternalException target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SSCExternalException)get_store().add_element_user(SSCEXTERNALEXCEPTION$0);
            return target;
        }
    }
}
