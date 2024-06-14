/*
 * An XML document type.
 * Localname: response
 * Namespace: met
 * Java type: met.ResponseDocument
 *
 * Automatically generated - do not modify.
 */
package met;


/**
 * A document containing one response(@met) element.
 *
 * This is a complex type.
 */
public interface ResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("responsee456doctype");
    
    /**
     * Gets the "response" element
     */
    met.ResponseDocument.Response getResponse();
    
    /**
     * Sets the "response" element
     */
    void setResponse(met.ResponseDocument.Response response);
    
    /**
     * Appends and returns a new empty "response" element
     */
    met.ResponseDocument.Response addNewResponse();
    
    /**
     * An XML response(@met).
     *
     * This is a complex type.
     */
    public interface Response extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Response.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("responsee9d9elemtype");
        
        /**
         * Gets the "request_index" element
         */
        int getRequestIndex();
        
        /**
         * Gets (as xml) the "request_index" element
         */
        org.apache.xmlbeans.XmlInt xgetRequestIndex();
        
        /**
         * Sets the "request_index" element
         */
        void setRequestIndex(int requestIndex);
        
        /**
         * Sets (as xml) the "request_index" element
         */
        void xsetRequestIndex(org.apache.xmlbeans.XmlInt requestIndex);
        
        /**
         * Gets the "data_source" element
         */
        met.DataSourceDocument.DataSource getDataSource();
        
        /**
         * Sets the "data_source" element
         */
        void setDataSource(met.DataSourceDocument.DataSource dataSource);
        
        /**
         * Appends and returns a new empty "data_source" element
         */
        met.DataSourceDocument.DataSource addNewDataSource();
        
        /**
         * Gets the "request" element
         */
        met.RequestDocument.Request getRequest();
        
        /**
         * Sets the "request" element
         */
        void setRequest(met.RequestDocument.Request request);
        
        /**
         * Appends and returns a new empty "request" element
         */
        met.RequestDocument.Request addNewRequest();
        
        /**
         * Gets the "errors" element
         */
        met.ErrorsDocument.Errors getErrors();
        
        /**
         * Sets the "errors" element
         */
        void setErrors(met.ErrorsDocument.Errors errors);
        
        /**
         * Appends and returns a new empty "errors" element
         */
        met.ErrorsDocument.Errors addNewErrors();
        
        /**
         * Gets the "warnings" element
         */
        met.WarningsDocument.Warnings getWarnings();
        
        /**
         * Sets the "warnings" element
         */
        void setWarnings(met.WarningsDocument.Warnings warnings);
        
        /**
         * Appends and returns a new empty "warnings" element
         */
        met.WarningsDocument.Warnings addNewWarnings();
        
        /**
         * Gets the "time_taken_ms" element
         */
        int getTimeTakenMs();
        
        /**
         * Gets (as xml) the "time_taken_ms" element
         */
        org.apache.xmlbeans.XmlInt xgetTimeTakenMs();
        
        /**
         * Sets the "time_taken_ms" element
         */
        void setTimeTakenMs(int timeTakenMs);
        
        /**
         * Sets (as xml) the "time_taken_ms" element
         */
        void xsetTimeTakenMs(org.apache.xmlbeans.XmlInt timeTakenMs);
        
        /**
         * Gets the "data" element
         */
        met.DataDocument.Data getData();
        
        /**
         * Sets the "data" element
         */
        void setData(met.DataDocument.Data data);
        
        /**
         * Appends and returns a new empty "data" element
         */
        met.DataDocument.Data addNewData();
        
        /**
         * Gets the "version" attribute
         */
        java.lang.String getVersion();
        
        /**
         * Gets (as xml) the "version" attribute
         */
        org.apache.xmlbeans.XmlString xgetVersion();
        
        /**
         * True if has "version" attribute
         */
        boolean isSetVersion();
        
        /**
         * Sets the "version" attribute
         */
        void setVersion(java.lang.String version);
        
        /**
         * Sets (as xml) the "version" attribute
         */
        void xsetVersion(org.apache.xmlbeans.XmlString version);
        
        /**
         * Unsets the "version" attribute
         */
        void unsetVersion();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static met.ResponseDocument.Response newInstance() {
              return (met.ResponseDocument.Response) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static met.ResponseDocument.Response newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (met.ResponseDocument.Response) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static met.ResponseDocument newInstance() {
          return (met.ResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static met.ResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (met.ResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static met.ResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (met.ResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static met.ResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (met.ResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static met.ResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (met.ResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static met.ResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (met.ResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static met.ResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (met.ResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static met.ResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (met.ResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static met.ResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (met.ResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static met.ResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (met.ResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static met.ResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (met.ResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static met.ResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (met.ResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static met.ResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (met.ResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static met.ResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (met.ResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static met.ResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (met.ResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static met.ResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (met.ResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static met.ResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (met.ResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static met.ResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (met.ResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
