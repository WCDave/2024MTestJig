/*
 * XML Type:  result
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.Result
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc;


/**
 * An XML result(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public interface Result extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Result.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("resultce15type");
    
    /**
     * Gets the "statusCode" element
     */
    gov.nasa.gsfc.spdf.ssc.ResultStatusCode.Enum getStatusCode();
    
    /**
     * Gets (as xml) the "statusCode" element
     */
    gov.nasa.gsfc.spdf.ssc.ResultStatusCode xgetStatusCode();
    
    /**
     * True if has "statusCode" element
     */
    boolean isSetStatusCode();
    
    /**
     * Sets the "statusCode" element
     */
    void setStatusCode(gov.nasa.gsfc.spdf.ssc.ResultStatusCode.Enum statusCode);
    
    /**
     * Sets (as xml) the "statusCode" element
     */
    void xsetStatusCode(gov.nasa.gsfc.spdf.ssc.ResultStatusCode statusCode);
    
    /**
     * Unsets the "statusCode" element
     */
    void unsetStatusCode();
    
    /**
     * Gets the "statusSubCode" element
     */
    gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode.Enum getStatusSubCode();
    
    /**
     * Gets (as xml) the "statusSubCode" element
     */
    gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode xgetStatusSubCode();
    
    /**
     * True if has "statusSubCode" element
     */
    boolean isSetStatusSubCode();
    
    /**
     * Sets the "statusSubCode" element
     */
    void setStatusSubCode(gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode.Enum statusSubCode);
    
    /**
     * Sets (as xml) the "statusSubCode" element
     */
    void xsetStatusSubCode(gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode statusSubCode);
    
    /**
     * Unsets the "statusSubCode" element
     */
    void unsetStatusSubCode();
    
    /**
     * Gets array of all "statusText" elements
     */
    java.lang.String[] getStatusTextArray();
    
    /**
     * Gets ith "statusText" element
     */
    java.lang.String getStatusTextArray(int i);
    
    /**
     * Gets (as xml) array of all "statusText" elements
     */
    org.apache.xmlbeans.XmlString[] xgetStatusTextArray();
    
    /**
     * Gets (as xml) ith "statusText" element
     */
    org.apache.xmlbeans.XmlString xgetStatusTextArray(int i);
    
    /**
     * Tests for nil ith "statusText" element
     */
    boolean isNilStatusTextArray(int i);
    
    /**
     * Returns number of "statusText" element
     */
    int sizeOfStatusTextArray();
    
    /**
     * Sets array of all "statusText" element
     */
    void setStatusTextArray(java.lang.String[] statusTextArray);
    
    /**
     * Sets ith "statusText" element
     */
    void setStatusTextArray(int i, java.lang.String statusText);
    
    /**
     * Sets (as xml) array of all "statusText" element
     */
    void xsetStatusTextArray(org.apache.xmlbeans.XmlString[] statusTextArray);
    
    /**
     * Sets (as xml) ith "statusText" element
     */
    void xsetStatusTextArray(int i, org.apache.xmlbeans.XmlString statusText);
    
    /**
     * Nils the ith "statusText" element
     */
    void setNilStatusTextArray(int i);
    
    /**
     * Inserts the value as the ith "statusText" element
     */
    void insertStatusText(int i, java.lang.String statusText);
    
    /**
     * Appends the value as the last "statusText" element
     */
    void addStatusText(java.lang.String statusText);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "statusText" element
     */
    org.apache.xmlbeans.XmlString insertNewStatusText(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "statusText" element
     */
    org.apache.xmlbeans.XmlString addNewStatusText();
    
    /**
     * Removes the ith "statusText" element
     */
    void removeStatusText(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nasa.gsfc.spdf.ssc.Result newInstance() {
          return (gov.nasa.gsfc.spdf.ssc.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Result newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nasa.gsfc.spdf.ssc.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nasa.gsfc.spdf.ssc.Result parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Result parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nasa.gsfc.spdf.ssc.Result parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Result parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Result parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Result parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Result parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Result parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Result parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Result parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Result parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Result parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Result parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Result parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.Result parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.Result parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
