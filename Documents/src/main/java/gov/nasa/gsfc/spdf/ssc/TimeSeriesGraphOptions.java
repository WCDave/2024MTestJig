/*
 * XML Type:  timeSeriesGraphOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc;


/**
 * An XML timeSeriesGraphOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public interface TimeSeriesGraphOptions extends gov.nasa.gsfc.spdf.ssc.GraphOptions
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TimeSeriesGraphOptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("timeseriesgraphoptions0e1etype");
    
    /**
     * Gets array of all "BFieldTraceOptions" elements
     */
    gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions[] getBFieldTraceOptionsArray();
    
    /**
     * Gets ith "BFieldTraceOptions" element
     */
    gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions getBFieldTraceOptionsArray(int i);
    
    /**
     * Tests for nil ith "BFieldTraceOptions" element
     */
    boolean isNilBFieldTraceOptionsArray(int i);
    
    /**
     * Returns number of "BFieldTraceOptions" element
     */
    int sizeOfBFieldTraceOptionsArray();
    
    /**
     * Sets array of all "BFieldTraceOptions" element
     */
    void setBFieldTraceOptionsArray(gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions[] bFieldTraceOptionsArray);
    
    /**
     * Sets ith "BFieldTraceOptions" element
     */
    void setBFieldTraceOptionsArray(int i, gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions bFieldTraceOptions);
    
    /**
     * Nils the ith "BFieldTraceOptions" element
     */
    void setNilBFieldTraceOptionsArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BFieldTraceOptions" element
     */
    gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions insertNewBFieldTraceOptions(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BFieldTraceOptions" element
     */
    gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions addNewBFieldTraceOptions();
    
    /**
     * Removes the ith "BFieldTraceOptions" element
     */
    void removeBFieldTraceOptions(int i);
    
    /**
     * Gets array of all "coordinateOptions" elements
     */
    gov.nasa.gsfc.spdf.ssc.CoordinateOptions[] getCoordinateOptionsArray();
    
    /**
     * Gets ith "coordinateOptions" element
     */
    gov.nasa.gsfc.spdf.ssc.CoordinateOptions getCoordinateOptionsArray(int i);
    
    /**
     * Tests for nil ith "coordinateOptions" element
     */
    boolean isNilCoordinateOptionsArray(int i);
    
    /**
     * Returns number of "coordinateOptions" element
     */
    int sizeOfCoordinateOptionsArray();
    
    /**
     * Sets array of all "coordinateOptions" element
     */
    void setCoordinateOptionsArray(gov.nasa.gsfc.spdf.ssc.CoordinateOptions[] coordinateOptionsArray);
    
    /**
     * Sets ith "coordinateOptions" element
     */
    void setCoordinateOptionsArray(int i, gov.nasa.gsfc.spdf.ssc.CoordinateOptions coordinateOptions);
    
    /**
     * Nils the ith "coordinateOptions" element
     */
    void setNilCoordinateOptionsArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "coordinateOptions" element
     */
    gov.nasa.gsfc.spdf.ssc.CoordinateOptions insertNewCoordinateOptions(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "coordinateOptions" element
     */
    gov.nasa.gsfc.spdf.ssc.CoordinateOptions addNewCoordinateOptions();
    
    /**
     * Removes the ith "coordinateOptions" element
     */
    void removeCoordinateOptions(int i);
    
    /**
     * Gets the "distanceFromOptions" element
     */
    gov.nasa.gsfc.spdf.ssc.DistanceFromOptions getDistanceFromOptions();
    
    /**
     * True if has "distanceFromOptions" element
     */
    boolean isSetDistanceFromOptions();
    
    /**
     * Sets the "distanceFromOptions" element
     */
    void setDistanceFromOptions(gov.nasa.gsfc.spdf.ssc.DistanceFromOptions distanceFromOptions);
    
    /**
     * Appends and returns a new empty "distanceFromOptions" element
     */
    gov.nasa.gsfc.spdf.ssc.DistanceFromOptions addNewDistanceFromOptions();
    
    /**
     * Unsets the "distanceFromOptions" element
     */
    void unsetDistanceFromOptions();
    
    /**
     * Gets the "valueOptions" element
     */
    gov.nasa.gsfc.spdf.ssc.ValueOptions getValueOptions();
    
    /**
     * True if has "valueOptions" element
     */
    boolean isSetValueOptions();
    
    /**
     * Sets the "valueOptions" element
     */
    void setValueOptions(gov.nasa.gsfc.spdf.ssc.ValueOptions valueOptions);
    
    /**
     * Appends and returns a new empty "valueOptions" element
     */
    gov.nasa.gsfc.spdf.ssc.ValueOptions addNewValueOptions();
    
    /**
     * Unsets the "valueOptions" element
     */
    void unsetValueOptions();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions newInstance() {
          return (gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
