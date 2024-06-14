/*
 * An XML document type.
 * Localname: SSCResourceLimitExceededException
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.SSCResourceLimitExceededExceptionDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * A document containing one SSCResourceLimitExceededException(@http://ssc.spdf.gsfc.nasa.gov/) element.
 *
 * This is a complex type.
 */
public class SSCResourceLimitExceededExceptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.SSCResourceLimitExceededExceptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public SSCResourceLimitExceededExceptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SSCRESOURCELIMITEXCEEDEDEXCEPTION$0 = 
        new javax.xml.namespace.QName("http://ssc.spdf.gsfc.nasa.gov/", "SSCResourceLimitExceededException");
    
    
    /**
     * Gets the "SSCResourceLimitExceededException" element
     */
    public gov.nasa.gsfc.spdf.ssc.SSCResourceLimitExceededException getSSCResourceLimitExceededException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SSCResourceLimitExceededException target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SSCResourceLimitExceededException)get_store().find_element_user(SSCRESOURCELIMITEXCEEDEDEXCEPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SSCResourceLimitExceededException" element
     */
    public void setSSCResourceLimitExceededException(gov.nasa.gsfc.spdf.ssc.SSCResourceLimitExceededException sscResourceLimitExceededException)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SSCResourceLimitExceededException target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SSCResourceLimitExceededException)get_store().find_element_user(SSCRESOURCELIMITEXCEEDEDEXCEPTION$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.SSCResourceLimitExceededException)get_store().add_element_user(SSCRESOURCELIMITEXCEEDEDEXCEPTION$0);
            }
            target.set(sscResourceLimitExceededException);
        }
    }
    
    /**
     * Appends and returns a new empty "SSCResourceLimitExceededException" element
     */
    public gov.nasa.gsfc.spdf.ssc.SSCResourceLimitExceededException addNewSSCResourceLimitExceededException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SSCResourceLimitExceededException target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SSCResourceLimitExceededException)get_store().add_element_user(SSCRESOURCELIMITEXCEEDEDEXCEPTION$0);
            return target;
        }
    }
}
