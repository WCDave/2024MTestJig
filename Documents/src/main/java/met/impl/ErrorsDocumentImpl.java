/*
 * An XML document type.
 * Localname: errors
 * Namespace: met
 * Java type: met.ErrorsDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one errors(@met) element.
 *
 * This is a complex type.
 */
public class ErrorsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.ErrorsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ErrorsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORS$0 = 
        new javax.xml.namespace.QName("met", "errors");
    
    
    /**
     * Gets the "errors" element
     */
    public met.ErrorsDocument.Errors getErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.ErrorsDocument.Errors target = null;
            target = (met.ErrorsDocument.Errors)get_store().find_element_user(ERRORS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "errors" element
     */
    public void setErrors(met.ErrorsDocument.Errors errors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.ErrorsDocument.Errors target = null;
            target = (met.ErrorsDocument.Errors)get_store().find_element_user(ERRORS$0, 0);
            if (target == null)
            {
                target = (met.ErrorsDocument.Errors)get_store().add_element_user(ERRORS$0);
            }
            target.set(errors);
        }
    }
    
    /**
     * Appends and returns a new empty "errors" element
     */
    public met.ErrorsDocument.Errors addNewErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.ErrorsDocument.Errors target = null;
            target = (met.ErrorsDocument.Errors)get_store().add_element_user(ERRORS$0);
            return target;
        }
    }
    /**
     * An XML errors(@met).
     *
     * This is a complex type.
     */
    public static class ErrorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.ErrorsDocument.Errors
    {
        private static final long serialVersionUID = 1L;
        
        public ErrorsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ERROR$0 = 
            new javax.xml.namespace.QName("met", "error");
        
        
        /**
         * Gets the "error" element
         */
        public java.lang.String getError()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "error" element
         */
        public org.apache.xmlbeans.XmlString xgetError()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "error" element
         */
        public boolean isSetError()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ERROR$0) != 0;
            }
        }
        
        /**
         * Sets the "error" element
         */
        public void setError(java.lang.String error)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERROR$0);
                }
                target.setStringValue(error);
            }
        }
        
        /**
         * Sets (as xml) the "error" element
         */
        public void xsetError(org.apache.xmlbeans.XmlString error)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERROR$0);
                }
                target.set(error);
            }
        }
        
        /**
         * Unsets the "error" element
         */
        public void unsetError()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ERROR$0, 0);
            }
        }
    }
}
