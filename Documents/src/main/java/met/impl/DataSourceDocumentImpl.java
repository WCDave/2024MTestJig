/*
 * An XML document type.
 * Localname: data_source
 * Namespace: met
 * Java type: met.DataSourceDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one data_source(@met) element.
 *
 * This is a complex type.
 */
public class DataSourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.DataSourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataSourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASOURCE$0 = 
        new javax.xml.namespace.QName("met", "data_source");
    
    
    /**
     * Gets the "data_source" element
     */
    public met.DataSourceDocument.DataSource getDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.DataSourceDocument.DataSource target = null;
            target = (met.DataSourceDocument.DataSource)get_store().find_element_user(DATASOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "data_source" element
     */
    public void setDataSource(met.DataSourceDocument.DataSource dataSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.DataSourceDocument.DataSource target = null;
            target = (met.DataSourceDocument.DataSource)get_store().find_element_user(DATASOURCE$0, 0);
            if (target == null)
            {
                target = (met.DataSourceDocument.DataSource)get_store().add_element_user(DATASOURCE$0);
            }
            target.set(dataSource);
        }
    }
    
    /**
     * Appends and returns a new empty "data_source" element
     */
    public met.DataSourceDocument.DataSource addNewDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.DataSourceDocument.DataSource target = null;
            target = (met.DataSourceDocument.DataSource)get_store().add_element_user(DATASOURCE$0);
            return target;
        }
    }
    /**
     * An XML data_source(@met).
     *
     * This is a complex type.
     */
    public static class DataSourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.DataSourceDocument.DataSource
    {
        private static final long serialVersionUID = 1L;
        
        public DataSourceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                return target;
            }
        }
        
        /**
         * True if has "name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$0) != null;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$0);
            }
        }
    }
}
