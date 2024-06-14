/*
 * An XML document type.
 * Localname: getAcknowledgements
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GetAcknowledgementsDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * A document containing one getAcknowledgements(@http://ssc.spdf.gsfc.nasa.gov/) element.
 *
 * This is a complex type.
 */
public class GetAcknowledgementsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.GetAcknowledgementsDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetAcknowledgementsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETACKNOWLEDGEMENTS$0 = 
        new javax.xml.namespace.QName("http://ssc.spdf.gsfc.nasa.gov/", "getAcknowledgements");
    
    
    /**
     * Gets the "getAcknowledgements" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetAcknowledgements getGetAcknowledgements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetAcknowledgements target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetAcknowledgements)get_store().find_element_user(GETACKNOWLEDGEMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getAcknowledgements" element
     */
    public void setGetAcknowledgements(gov.nasa.gsfc.spdf.ssc.GetAcknowledgements getAcknowledgements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetAcknowledgements target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetAcknowledgements)get_store().find_element_user(GETACKNOWLEDGEMENTS$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.GetAcknowledgements)get_store().add_element_user(GETACKNOWLEDGEMENTS$0);
            }
            target.set(getAcknowledgements);
        }
    }
    
    /**
     * Appends and returns a new empty "getAcknowledgements" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetAcknowledgements addNewGetAcknowledgements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetAcknowledgements target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetAcknowledgements)get_store().add_element_user(GETACKNOWLEDGEMENTS$0);
            return target;
        }
    }
}
