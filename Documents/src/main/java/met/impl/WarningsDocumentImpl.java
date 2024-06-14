/*
 * An XML document type.
 * Localname: warnings
 * Namespace: met
 * Java type: met.WarningsDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one warnings(@met) element.
 *
 * This is a complex type.
 */
public class WarningsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.WarningsDocument
{
    private static final long serialVersionUID = 1L;
    
    public WarningsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WARNINGS$0 = 
        new javax.xml.namespace.QName("met", "warnings");
    
    
    /**
     * Gets the "warnings" element
     */
    public met.WarningsDocument.Warnings getWarnings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.WarningsDocument.Warnings target = null;
            target = (met.WarningsDocument.Warnings)get_store().find_element_user(WARNINGS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "warnings" element
     */
    public void setWarnings(met.WarningsDocument.Warnings warnings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.WarningsDocument.Warnings target = null;
            target = (met.WarningsDocument.Warnings)get_store().find_element_user(WARNINGS$0, 0);
            if (target == null)
            {
                target = (met.WarningsDocument.Warnings)get_store().add_element_user(WARNINGS$0);
            }
            target.set(warnings);
        }
    }
    
    /**
     * Appends and returns a new empty "warnings" element
     */
    public met.WarningsDocument.Warnings addNewWarnings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.WarningsDocument.Warnings target = null;
            target = (met.WarningsDocument.Warnings)get_store().add_element_user(WARNINGS$0);
            return target;
        }
    }
    /**
     * An XML warnings(@met).
     *
     * This is a complex type.
     */
    public static class WarningsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.WarningsDocument.Warnings
    {
        private static final long serialVersionUID = 1L;
        
        public WarningsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WARNING$0 = 
            new javax.xml.namespace.QName("met", "warning");
        
        
        /**
         * Gets the "warning" element
         */
        public java.lang.String getWarning()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARNING$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "warning" element
         */
        public org.apache.xmlbeans.XmlString xgetWarning()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WARNING$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "warning" element
         */
        public boolean isSetWarning()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WARNING$0) != 0;
            }
        }
        
        /**
         * Sets the "warning" element
         */
        public void setWarning(java.lang.String warning)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WARNING$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WARNING$0);
                }
                target.setStringValue(warning);
            }
        }
        
        /**
         * Sets (as xml) the "warning" element
         */
        public void xsetWarning(org.apache.xmlbeans.XmlString warning)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WARNING$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WARNING$0);
                }
                target.set(warning);
            }
        }
        
        /**
         * Unsets the "warning" element
         */
        public void unsetWarning()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WARNING$0, 0);
            }
        }
    }
}
