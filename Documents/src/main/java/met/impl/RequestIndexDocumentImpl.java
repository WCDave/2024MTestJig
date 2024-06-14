/*
 * An XML document type.
 * Localname: request_index
 * Namespace: met
 * Java type: met.RequestIndexDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one request_index(@met) element.
 *
 * This is a complex type.
 */
public class RequestIndexDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.RequestIndexDocument
{
    private static final long serialVersionUID = 1L;
    
    public RequestIndexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTINDEX$0 = 
        new javax.xml.namespace.QName("met", "request_index");
    
    
    /**
     * Gets the "request_index" element
     */
    public int getRequestIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTINDEX$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "request_index" element
     */
    public org.apache.xmlbeans.XmlInt xgetRequestIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(REQUESTINDEX$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "request_index" element
     */
    public void setRequestIndex(int requestIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTINDEX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTINDEX$0);
            }
            target.setIntValue(requestIndex);
        }
    }
    
    /**
     * Sets (as xml) the "request_index" element
     */
    public void xsetRequestIndex(org.apache.xmlbeans.XmlInt requestIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(REQUESTINDEX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(REQUESTINDEX$0);
            }
            target.set(requestIndex);
        }
    }
}
