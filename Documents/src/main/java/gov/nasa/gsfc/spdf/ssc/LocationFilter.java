/*
 * XML Type:  locationFilter
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.LocationFilter
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc;


/**
 * An XML locationFilter(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public interface LocationFilter extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LocationFilter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("locationfilter05a5type");
    
    /**
     * Gets the "lowerDate" element
     */
    java.util.Calendar getLowerDate();
    
    /**
     * Gets (as xml) the "lowerDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetLowerDate();
    
    /**
     * True if has "lowerDate" element
     */
    boolean isSetLowerDate();
    
    /**
     * Sets the "lowerDate" element
     */
    void setLowerDate(java.util.Calendar lowerDate);
    
    /**
     * Sets (as xml) the "lowerDate" element
     */
    void xsetLowerDate(org.apache.xmlbeans.XmlDateTime lowerDate);
    
    /**
     * Unsets the "lowerDate" element
     */
    void unsetLowerDate();
    
    /**
     * Gets the "lowerLimit" element
     */
    double getLowerLimit();
    
    /**
     * Gets (as xml) the "lowerLimit" element
     */
    org.apache.xmlbeans.XmlDouble xgetLowerLimit();
    
    /**
     * True if has "lowerLimit" element
     */
    boolean isSetLowerLimit();
    
    /**
     * Sets the "lowerLimit" element
     */
    void setLowerLimit(double lowerLimit);
    
    /**
     * Sets (as xml) the "lowerLimit" element
     */
    void xsetLowerLimit(org.apache.xmlbeans.XmlDouble lowerLimit);
    
    /**
     * Unsets the "lowerLimit" element
     */
    void unsetLowerLimit();
    
    /**
     * Gets the "maximum" element
     */
    boolean getMaximum();
    
    /**
     * Gets (as xml) the "maximum" element
     */
    org.apache.xmlbeans.XmlBoolean xgetMaximum();
    
    /**
     * Sets the "maximum" element
     */
    void setMaximum(boolean maximum);
    
    /**
     * Sets (as xml) the "maximum" element
     */
    void xsetMaximum(org.apache.xmlbeans.XmlBoolean maximum);
    
    /**
     * Gets the "minimum" element
     */
    boolean getMinimum();
    
    /**
     * Gets (as xml) the "minimum" element
     */
    org.apache.xmlbeans.XmlBoolean xgetMinimum();
    
    /**
     * Sets the "minimum" element
     */
    void setMinimum(boolean minimum);
    
    /**
     * Sets (as xml) the "minimum" element
     */
    void xsetMinimum(org.apache.xmlbeans.XmlBoolean minimum);
    
    /**
     * Gets the "upperDate" element
     */
    java.util.Calendar getUpperDate();
    
    /**
     * Gets (as xml) the "upperDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetUpperDate();
    
    /**
     * True if has "upperDate" element
     */
    boolean isSetUpperDate();
    
    /**
     * Sets the "upperDate" element
     */
    void setUpperDate(java.util.Calendar upperDate);
    
    /**
     * Sets (as xml) the "upperDate" element
     */
    void xsetUpperDate(org.apache.xmlbeans.XmlDateTime upperDate);
    
    /**
     * Unsets the "upperDate" element
     */
    void unsetUpperDate();
    
    /**
     * Gets the "upperLimit" element
     */
    double getUpperLimit();
    
    /**
     * Gets (as xml) the "upperLimit" element
     */
    org.apache.xmlbeans.XmlDouble xgetUpperLimit();
    
    /**
     * True if has "upperLimit" element
     */
    boolean isSetUpperLimit();
    
    /**
     * Sets the "upperLimit" element
     */
    void setUpperLimit(double upperLimit);
    
    /**
     * Sets (as xml) the "upperLimit" element
     */
    void xsetUpperLimit(org.apache.xmlbeans.XmlDouble upperLimit);
    
    /**
     * Unsets the "upperLimit" element
     */
    void unsetUpperLimit();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nasa.gsfc.spdf.ssc.LocationFilter newInstance() {
          return (gov.nasa.gsfc.spdf.ssc.LocationFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.LocationFilter newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nasa.gsfc.spdf.ssc.LocationFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nasa.gsfc.spdf.ssc.LocationFilter parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.LocationFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.LocationFilter parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.LocationFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nasa.gsfc.spdf.ssc.LocationFilter parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.LocationFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.LocationFilter parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.LocationFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.LocationFilter parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.LocationFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.LocationFilter parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.LocationFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.LocationFilter parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.LocationFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.LocationFilter parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.LocationFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.LocationFilter parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.LocationFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.LocationFilter parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.LocationFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.LocationFilter parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.LocationFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.LocationFilter parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.LocationFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.LocationFilter parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.LocationFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.LocationFilter parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.LocationFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.LocationFilter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.LocationFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.LocationFilter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.LocationFilter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
