/*
 * An XML document type.
 * Localname: request
 * Namespace: met
 * Java type: met.RequestDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one request(@met) element.
 *
 * This is a complex type.
 */
public class RequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.RequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public RequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUEST$0 = 
        new javax.xml.namespace.QName("met", "request");
    
    
    /**
     * Gets the "request" element
     */
    public met.RequestDocument.Request getRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.RequestDocument.Request target = null;
            target = (met.RequestDocument.Request)get_store().find_element_user(REQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "request" element
     */
    public void setRequest(met.RequestDocument.Request request)
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.RequestDocument.Request target = null;
            target = (met.RequestDocument.Request)get_store().find_element_user(REQUEST$0, 0);
            if (target == null)
            {
                target = (met.RequestDocument.Request)get_store().add_element_user(REQUEST$0);
            }
            target.set(request);
        }
    }
    
    /**
     * Appends and returns a new empty "request" element
     */
    public met.RequestDocument.Request addNewRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.RequestDocument.Request target = null;
            target = (met.RequestDocument.Request)get_store().add_element_user(REQUEST$0);
            return target;
        }
    }
    /**
     * An XML request(@met).
     *
     * This is a complex type.
     */
    public static class RequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.RequestDocument.Request
    {
        private static final long serialVersionUID = 1L;
        
        public RequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("", "type");
        
        
        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$0) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$0);
            }
        }
    }
}
