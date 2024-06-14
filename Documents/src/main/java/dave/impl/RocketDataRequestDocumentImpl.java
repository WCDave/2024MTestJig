/*
 * An XML document type.
 * Localname: RocketDataRequest
 * Namespace: dave
 * Java type: dave.RocketDataRequestDocument
 *
 * Automatically generated - do not modify.
 */
package dave.impl;
/**
 * A document containing one RocketDataRequest(@dave) element.
 *
 * This is a complex type.
 */
public class RocketDataRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dave.RocketDataRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public RocketDataRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROCKETDATAREQUEST$0 = 
        new javax.xml.namespace.QName("dave", "RocketDataRequest");
    
    
    /**
     * Gets the "RocketDataRequest" element
     */
    public dave.RocketDataRequestDocument.RocketDataRequest getRocketDataRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dave.RocketDataRequestDocument.RocketDataRequest target = null;
            target = (dave.RocketDataRequestDocument.RocketDataRequest)get_store().find_element_user(ROCKETDATAREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RocketDataRequest" element
     */
    public void setRocketDataRequest(dave.RocketDataRequestDocument.RocketDataRequest rocketDataRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dave.RocketDataRequestDocument.RocketDataRequest target = null;
            target = (dave.RocketDataRequestDocument.RocketDataRequest)get_store().find_element_user(ROCKETDATAREQUEST$0, 0);
            if (target == null)
            {
                target = (dave.RocketDataRequestDocument.RocketDataRequest)get_store().add_element_user(ROCKETDATAREQUEST$0);
            }
            target.set(rocketDataRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "RocketDataRequest" element
     */
    public dave.RocketDataRequestDocument.RocketDataRequest addNewRocketDataRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dave.RocketDataRequestDocument.RocketDataRequest target = null;
            target = (dave.RocketDataRequestDocument.RocketDataRequest)get_store().add_element_user(ROCKETDATAREQUEST$0);
            return target;
        }
    }
    /**
     * An XML RocketDataRequest(@dave).
     *
     * This is a complex type.
     */
    public static class RocketDataRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dave.RocketDataRequestDocument.RocketDataRequest
    {
        private static final long serialVersionUID = 1L;
        
        public RocketDataRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REFNAME$0 = 
            new javax.xml.namespace.QName("dave", "refName");
        
        
        /**
         * Gets the "refName" element
         */
        public java.lang.String getRefName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "refName" element
         */
        public org.apache.xmlbeans.XmlString xgetRefName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFNAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "refName" element
         */
        public void setRefName(java.lang.String refName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFNAME$0);
                }
                target.setStringValue(refName);
            }
        }
        
        /**
         * Sets (as xml) the "refName" element
         */
        public void xsetRefName(org.apache.xmlbeans.XmlString refName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFNAME$0);
                }
                target.set(refName);
            }
        }
    }
}
