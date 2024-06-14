/*
 * An XML document type.
 * Localname: response
 * Namespace: met
 * Java type: met.ResponseDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one response(@met) element.
 *
 * This is a complex type.
 */
public class ResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.ResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSE$0 = 
        new javax.xml.namespace.QName("met", "response");
    
    
    /**
     * Gets the "response" element
     */
    public met.ResponseDocument.Response getResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.ResponseDocument.Response target = null;
            target = (met.ResponseDocument.Response)get_store().find_element_user(RESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "response" element
     */
    public void setResponse(met.ResponseDocument.Response response)
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.ResponseDocument.Response target = null;
            target = (met.ResponseDocument.Response)get_store().find_element_user(RESPONSE$0, 0);
            if (target == null)
            {
                target = (met.ResponseDocument.Response)get_store().add_element_user(RESPONSE$0);
            }
            target.set(response);
        }
    }
    
    /**
     * Appends and returns a new empty "response" element
     */
    public met.ResponseDocument.Response addNewResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.ResponseDocument.Response target = null;
            target = (met.ResponseDocument.Response)get_store().add_element_user(RESPONSE$0);
            return target;
        }
    }
    /**
     * An XML response(@met).
     *
     * This is a complex type.
     */
    public static class ResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.ResponseDocument.Response
    {
        private static final long serialVersionUID = 1L;
        
        public ResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUESTINDEX$0 = 
            new javax.xml.namespace.QName("met", "request_index");
        private static final javax.xml.namespace.QName DATASOURCE$2 = 
            new javax.xml.namespace.QName("met", "data_source");
        private static final javax.xml.namespace.QName REQUEST$4 = 
            new javax.xml.namespace.QName("met", "request");
        private static final javax.xml.namespace.QName ERRORS$6 = 
            new javax.xml.namespace.QName("met", "errors");
        private static final javax.xml.namespace.QName WARNINGS$8 = 
            new javax.xml.namespace.QName("met", "warnings");
        private static final javax.xml.namespace.QName TIMETAKENMS$10 = 
            new javax.xml.namespace.QName("met", "time_taken_ms");
        private static final javax.xml.namespace.QName DATA$12 = 
            new javax.xml.namespace.QName("met", "data");
        private static final javax.xml.namespace.QName VERSION$14 = 
            new javax.xml.namespace.QName("", "version");
        
        
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
        
        /**
         * Gets the "data_source" element
         */
        public met.DataSourceDocument.DataSource getDataSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                met.DataSourceDocument.DataSource target = null;
                target = (met.DataSourceDocument.DataSource)get_store().find_element_user(DATASOURCE$2, 0);
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
                target = (met.DataSourceDocument.DataSource)get_store().find_element_user(DATASOURCE$2, 0);
                if (target == null)
                {
                    target = (met.DataSourceDocument.DataSource)get_store().add_element_user(DATASOURCE$2);
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
                target = (met.DataSourceDocument.DataSource)get_store().add_element_user(DATASOURCE$2);
                return target;
            }
        }
        
        /**
         * Gets the "request" element
         */
        public met.RequestDocument.Request getRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                met.RequestDocument.Request target = null;
                target = (met.RequestDocument.Request)get_store().find_element_user(REQUEST$4, 0);
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
                target = (met.RequestDocument.Request)get_store().find_element_user(REQUEST$4, 0);
                if (target == null)
                {
                    target = (met.RequestDocument.Request)get_store().add_element_user(REQUEST$4);
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
                target = (met.RequestDocument.Request)get_store().add_element_user(REQUEST$4);
                return target;
            }
        }
        
        /**
         * Gets the "errors" element
         */
        public met.ErrorsDocument.Errors getErrors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                met.ErrorsDocument.Errors target = null;
                target = (met.ErrorsDocument.Errors)get_store().find_element_user(ERRORS$6, 0);
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
                target = (met.ErrorsDocument.Errors)get_store().find_element_user(ERRORS$6, 0);
                if (target == null)
                {
                    target = (met.ErrorsDocument.Errors)get_store().add_element_user(ERRORS$6);
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
                target = (met.ErrorsDocument.Errors)get_store().add_element_user(ERRORS$6);
                return target;
            }
        }
        
        /**
         * Gets the "warnings" element
         */
        public met.WarningsDocument.Warnings getWarnings()
        {
            synchronized (monitor())
            {
                check_orphaned();
                met.WarningsDocument.Warnings target = null;
                target = (met.WarningsDocument.Warnings)get_store().find_element_user(WARNINGS$8, 0);
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
                target = (met.WarningsDocument.Warnings)get_store().find_element_user(WARNINGS$8, 0);
                if (target == null)
                {
                    target = (met.WarningsDocument.Warnings)get_store().add_element_user(WARNINGS$8);
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
                target = (met.WarningsDocument.Warnings)get_store().add_element_user(WARNINGS$8);
                return target;
            }
        }
        
        /**
         * Gets the "time_taken_ms" element
         */
        public int getTimeTakenMs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMETAKENMS$10, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "time_taken_ms" element
         */
        public org.apache.xmlbeans.XmlInt xgetTimeTakenMs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIMETAKENMS$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "time_taken_ms" element
         */
        public void setTimeTakenMs(int timeTakenMs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMETAKENMS$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMETAKENMS$10);
                }
                target.setIntValue(timeTakenMs);
            }
        }
        
        /**
         * Sets (as xml) the "time_taken_ms" element
         */
        public void xsetTimeTakenMs(org.apache.xmlbeans.XmlInt timeTakenMs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIMETAKENMS$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TIMETAKENMS$10);
                }
                target.set(timeTakenMs);
            }
        }
        
        /**
         * Gets the "data" element
         */
        public met.DataDocument.Data getData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                met.DataDocument.Data target = null;
                target = (met.DataDocument.Data)get_store().find_element_user(DATA$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "data" element
         */
        public void setData(met.DataDocument.Data data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                met.DataDocument.Data target = null;
                target = (met.DataDocument.Data)get_store().find_element_user(DATA$12, 0);
                if (target == null)
                {
                    target = (met.DataDocument.Data)get_store().add_element_user(DATA$12);
                }
                target.set(data);
            }
        }
        
        /**
         * Appends and returns a new empty "data" element
         */
        public met.DataDocument.Data addNewData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                met.DataDocument.Data target = null;
                target = (met.DataDocument.Data)get_store().add_element_user(DATA$12);
                return target;
            }
        }
        
        /**
         * Gets the "version" attribute
         */
        public java.lang.String getVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VERSION$14);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "version" attribute
         */
        public org.apache.xmlbeans.XmlString xgetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(VERSION$14);
                }
                return target;
            }
        }
        
        /**
         * True if has "version" attribute
         */
        public boolean isSetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VERSION$14) != null;
            }
        }
        
        /**
         * Sets the "version" attribute
         */
        public void setVersion(java.lang.String version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$14);
                }
                target.setStringValue(version);
            }
        }
        
        /**
         * Sets (as xml) the "version" attribute
         */
        public void xsetVersion(org.apache.xmlbeans.XmlString version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERSION$14);
                }
                target.set(version);
            }
        }
        
        /**
         * Unsets the "version" attribute
         */
        public void unsetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VERSION$14);
            }
        }
    }
}
