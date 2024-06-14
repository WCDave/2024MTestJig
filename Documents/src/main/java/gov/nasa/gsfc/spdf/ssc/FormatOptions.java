/*
 * XML Type:  formatOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.FormatOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc;


/**
 * An XML formatOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public interface FormatOptions extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FormatOptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("formatoptions8ffdtype");
    
    /**
     * Gets the "cdf" element
     */
    boolean getCdf();
    
    /**
     * Gets (as xml) the "cdf" element
     */
    org.apache.xmlbeans.XmlBoolean xgetCdf();
    
    /**
     * Sets the "cdf" element
     */
    void setCdf(boolean cdf);
    
    /**
     * Sets (as xml) the "cdf" element
     */
    void xsetCdf(org.apache.xmlbeans.XmlBoolean cdf);
    
    /**
     * Gets the "dateFormat" element
     */
    gov.nasa.gsfc.spdf.ssc.DateFormat.Enum getDateFormat();
    
    /**
     * Gets (as xml) the "dateFormat" element
     */
    gov.nasa.gsfc.spdf.ssc.DateFormat xgetDateFormat();
    
    /**
     * True if has "dateFormat" element
     */
    boolean isSetDateFormat();
    
    /**
     * Sets the "dateFormat" element
     */
    void setDateFormat(gov.nasa.gsfc.spdf.ssc.DateFormat.Enum dateFormat);
    
    /**
     * Sets (as xml) the "dateFormat" element
     */
    void xsetDateFormat(gov.nasa.gsfc.spdf.ssc.DateFormat dateFormat);
    
    /**
     * Unsets the "dateFormat" element
     */
    void unsetDateFormat();
    
    /**
     * Gets the "degreeFormat" element
     */
    gov.nasa.gsfc.spdf.ssc.DegreeFormat.Enum getDegreeFormat();
    
    /**
     * Gets (as xml) the "degreeFormat" element
     */
    gov.nasa.gsfc.spdf.ssc.DegreeFormat xgetDegreeFormat();
    
    /**
     * True if has "degreeFormat" element
     */
    boolean isSetDegreeFormat();
    
    /**
     * Sets the "degreeFormat" element
     */
    void setDegreeFormat(gov.nasa.gsfc.spdf.ssc.DegreeFormat.Enum degreeFormat);
    
    /**
     * Sets (as xml) the "degreeFormat" element
     */
    void xsetDegreeFormat(gov.nasa.gsfc.spdf.ssc.DegreeFormat degreeFormat);
    
    /**
     * Unsets the "degreeFormat" element
     */
    void unsetDegreeFormat();
    
    /**
     * Gets the "degreePrecision" element
     */
    short getDegreePrecision();
    
    /**
     * Gets (as xml) the "degreePrecision" element
     */
    org.apache.xmlbeans.XmlShort xgetDegreePrecision();
    
    /**
     * Sets the "degreePrecision" element
     */
    void setDegreePrecision(short degreePrecision);
    
    /**
     * Sets (as xml) the "degreePrecision" element
     */
    void xsetDegreePrecision(org.apache.xmlbeans.XmlShort degreePrecision);
    
    /**
     * Gets the "distancePrecision" element
     */
    short getDistancePrecision();
    
    /**
     * Gets (as xml) the "distancePrecision" element
     */
    org.apache.xmlbeans.XmlShort xgetDistancePrecision();
    
    /**
     * Sets the "distancePrecision" element
     */
    void setDistancePrecision(short distancePrecision);
    
    /**
     * Sets (as xml) the "distancePrecision" element
     */
    void xsetDistancePrecision(org.apache.xmlbeans.XmlShort distancePrecision);
    
    /**
     * Gets the "distanceUnits" element
     */
    gov.nasa.gsfc.spdf.ssc.DistanceUnits.Enum getDistanceUnits();
    
    /**
     * Gets (as xml) the "distanceUnits" element
     */
    gov.nasa.gsfc.spdf.ssc.DistanceUnits xgetDistanceUnits();
    
    /**
     * True if has "distanceUnits" element
     */
    boolean isSetDistanceUnits();
    
    /**
     * Sets the "distanceUnits" element
     */
    void setDistanceUnits(gov.nasa.gsfc.spdf.ssc.DistanceUnits.Enum distanceUnits);
    
    /**
     * Sets (as xml) the "distanceUnits" element
     */
    void xsetDistanceUnits(gov.nasa.gsfc.spdf.ssc.DistanceUnits distanceUnits);
    
    /**
     * Unsets the "distanceUnits" element
     */
    void unsetDistanceUnits();
    
    /**
     * Gets the "latLonFormat" element
     */
    gov.nasa.gsfc.spdf.ssc.LatLonFormat.Enum getLatLonFormat();
    
    /**
     * Gets (as xml) the "latLonFormat" element
     */
    gov.nasa.gsfc.spdf.ssc.LatLonFormat xgetLatLonFormat();
    
    /**
     * True if has "latLonFormat" element
     */
    boolean isSetLatLonFormat();
    
    /**
     * Sets the "latLonFormat" element
     */
    void setLatLonFormat(gov.nasa.gsfc.spdf.ssc.LatLonFormat.Enum latLonFormat);
    
    /**
     * Sets (as xml) the "latLonFormat" element
     */
    void xsetLatLonFormat(gov.nasa.gsfc.spdf.ssc.LatLonFormat latLonFormat);
    
    /**
     * Unsets the "latLonFormat" element
     */
    void unsetLatLonFormat();
    
    /**
     * Gets the "linesPerPage" element
     */
    short getLinesPerPage();
    
    /**
     * Gets (as xml) the "linesPerPage" element
     */
    org.apache.xmlbeans.XmlShort xgetLinesPerPage();
    
    /**
     * Sets the "linesPerPage" element
     */
    void setLinesPerPage(short linesPerPage);
    
    /**
     * Sets (as xml) the "linesPerPage" element
     */
    void xsetLinesPerPage(org.apache.xmlbeans.XmlShort linesPerPage);
    
    /**
     * Gets the "timeFormat" element
     */
    gov.nasa.gsfc.spdf.ssc.TimeFormat.Enum getTimeFormat();
    
    /**
     * Gets (as xml) the "timeFormat" element
     */
    gov.nasa.gsfc.spdf.ssc.TimeFormat xgetTimeFormat();
    
    /**
     * True if has "timeFormat" element
     */
    boolean isSetTimeFormat();
    
    /**
     * Sets the "timeFormat" element
     */
    void setTimeFormat(gov.nasa.gsfc.spdf.ssc.TimeFormat.Enum timeFormat);
    
    /**
     * Sets (as xml) the "timeFormat" element
     */
    void xsetTimeFormat(gov.nasa.gsfc.spdf.ssc.TimeFormat timeFormat);
    
    /**
     * Unsets the "timeFormat" element
     */
    void unsetTimeFormat();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nasa.gsfc.spdf.ssc.FormatOptions newInstance() {
          return (gov.nasa.gsfc.spdf.ssc.FormatOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FormatOptions newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nasa.gsfc.spdf.ssc.FormatOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nasa.gsfc.spdf.ssc.FormatOptions parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.FormatOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FormatOptions parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.FormatOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nasa.gsfc.spdf.ssc.FormatOptions parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.FormatOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FormatOptions parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.FormatOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FormatOptions parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.FormatOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FormatOptions parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.FormatOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FormatOptions parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.FormatOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FormatOptions parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.FormatOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FormatOptions parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.FormatOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FormatOptions parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.FormatOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FormatOptions parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.FormatOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FormatOptions parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.FormatOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FormatOptions parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.FormatOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FormatOptions parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.FormatOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.FormatOptions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.FormatOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.FormatOptions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.FormatOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
