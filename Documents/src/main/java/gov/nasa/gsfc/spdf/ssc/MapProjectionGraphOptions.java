/*
 * XML Type:  mapProjectionGraphOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc;


/**
 * An XML mapProjectionGraphOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public interface MapProjectionGraphOptions extends gov.nasa.gsfc.spdf.ssc.GraphOptions
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MapProjectionGraphOptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("mapprojectiongraphoptionsf8c9type");
    
    /**
     * Gets the "coordinateSystem" element
     */
    gov.nasa.gsfc.spdf.ssc.ProjectionCoordinateSystem.Enum getCoordinateSystem();
    
    /**
     * Gets (as xml) the "coordinateSystem" element
     */
    gov.nasa.gsfc.spdf.ssc.ProjectionCoordinateSystem xgetCoordinateSystem();
    
    /**
     * True if has "coordinateSystem" element
     */
    boolean isSetCoordinateSystem();
    
    /**
     * Sets the "coordinateSystem" element
     */
    void setCoordinateSystem(gov.nasa.gsfc.spdf.ssc.ProjectionCoordinateSystem.Enum coordinateSystem);
    
    /**
     * Sets (as xml) the "coordinateSystem" element
     */
    void xsetCoordinateSystem(gov.nasa.gsfc.spdf.ssc.ProjectionCoordinateSystem coordinateSystem);
    
    /**
     * Unsets the "coordinateSystem" element
     */
    void unsetCoordinateSystem();
    
    /**
     * Gets the "formatOptions" element
     */
    gov.nasa.gsfc.spdf.ssc.GraphFormatOptions getFormatOptions();
    
    /**
     * True if has "formatOptions" element
     */
    boolean isSetFormatOptions();
    
    /**
     * Sets the "formatOptions" element
     */
    void setFormatOptions(gov.nasa.gsfc.spdf.ssc.GraphFormatOptions formatOptions);
    
    /**
     * Appends and returns a new empty "formatOptions" element
     */
    gov.nasa.gsfc.spdf.ssc.GraphFormatOptions addNewFormatOptions();
    
    /**
     * Unsets the "formatOptions" element
     */
    void unsetFormatOptions();
    
    /**
     * Gets array of all "groundStations" elements
     */
    java.lang.String[] getGroundStationsArray();
    
    /**
     * Gets ith "groundStations" element
     */
    java.lang.String getGroundStationsArray(int i);
    
    /**
     * Gets (as xml) array of all "groundStations" elements
     */
    org.apache.xmlbeans.XmlString[] xgetGroundStationsArray();
    
    /**
     * Gets (as xml) ith "groundStations" element
     */
    org.apache.xmlbeans.XmlString xgetGroundStationsArray(int i);
    
    /**
     * Tests for nil ith "groundStations" element
     */
    boolean isNilGroundStationsArray(int i);
    
    /**
     * Returns number of "groundStations" element
     */
    int sizeOfGroundStationsArray();
    
    /**
     * Sets array of all "groundStations" element
     */
    void setGroundStationsArray(java.lang.String[] groundStationsArray);
    
    /**
     * Sets ith "groundStations" element
     */
    void setGroundStationsArray(int i, java.lang.String groundStations);
    
    /**
     * Sets (as xml) array of all "groundStations" element
     */
    void xsetGroundStationsArray(org.apache.xmlbeans.XmlString[] groundStationsArray);
    
    /**
     * Sets (as xml) ith "groundStations" element
     */
    void xsetGroundStationsArray(int i, org.apache.xmlbeans.XmlString groundStations);
    
    /**
     * Nils the ith "groundStations" element
     */
    void setNilGroundStationsArray(int i);
    
    /**
     * Inserts the value as the ith "groundStations" element
     */
    void insertGroundStations(int i, java.lang.String groundStations);
    
    /**
     * Appends the value as the last "groundStations" element
     */
    void addGroundStations(java.lang.String groundStations);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "groundStations" element
     */
    org.apache.xmlbeans.XmlString insertNewGroundStations(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "groundStations" element
     */
    org.apache.xmlbeans.XmlString addNewGroundStations();
    
    /**
     * Removes the ith "groundStations" element
     */
    void removeGroundStations(int i);
    
    /**
     * Gets the "longitudeVerticalDown" element
     */
    float getLongitudeVerticalDown();
    
    /**
     * Gets (as xml) the "longitudeVerticalDown" element
     */
    org.apache.xmlbeans.XmlFloat xgetLongitudeVerticalDown();
    
    /**
     * Sets the "longitudeVerticalDown" element
     */
    void setLongitudeVerticalDown(float longitudeVerticalDown);
    
    /**
     * Sets (as xml) the "longitudeVerticalDown" element
     */
    void xsetLongitudeVerticalDown(org.apache.xmlbeans.XmlFloat longitudeVerticalDown);
    
    /**
     * Gets the "mapLimits" element
     */
    gov.nasa.gsfc.spdf.ssc.MapLimits getMapLimits();
    
    /**
     * True if has "mapLimits" element
     */
    boolean isSetMapLimits();
    
    /**
     * Sets the "mapLimits" element
     */
    void setMapLimits(gov.nasa.gsfc.spdf.ssc.MapLimits mapLimits);
    
    /**
     * Appends and returns a new empty "mapLimits" element
     */
    gov.nasa.gsfc.spdf.ssc.MapLimits addNewMapLimits();
    
    /**
     * Unsets the "mapLimits" element
     */
    void unsetMapLimits();
    
    /**
     * Gets the "polarMapOrientation" element
     */
    gov.nasa.gsfc.spdf.ssc.PolarMapOrientation.Enum getPolarMapOrientation();
    
    /**
     * Gets (as xml) the "polarMapOrientation" element
     */
    gov.nasa.gsfc.spdf.ssc.PolarMapOrientation xgetPolarMapOrientation();
    
    /**
     * True if has "polarMapOrientation" element
     */
    boolean isSetPolarMapOrientation();
    
    /**
     * Sets the "polarMapOrientation" element
     */
    void setPolarMapOrientation(gov.nasa.gsfc.spdf.ssc.PolarMapOrientation.Enum polarMapOrientation);
    
    /**
     * Sets (as xml) the "polarMapOrientation" element
     */
    void xsetPolarMapOrientation(gov.nasa.gsfc.spdf.ssc.PolarMapOrientation polarMapOrientation);
    
    /**
     * Unsets the "polarMapOrientation" element
     */
    void unsetPolarMapOrientation();
    
    /**
     * Gets the "projection" element
     */
    gov.nasa.gsfc.spdf.ssc.MapProjection.Enum getProjection();
    
    /**
     * Gets (as xml) the "projection" element
     */
    gov.nasa.gsfc.spdf.ssc.MapProjection xgetProjection();
    
    /**
     * True if has "projection" element
     */
    boolean isSetProjection();
    
    /**
     * Sets the "projection" element
     */
    void setProjection(gov.nasa.gsfc.spdf.ssc.MapProjection.Enum projection);
    
    /**
     * Sets (as xml) the "projection" element
     */
    void xsetProjection(gov.nasa.gsfc.spdf.ssc.MapProjection projection);
    
    /**
     * Unsets the "projection" element
     */
    void unsetProjection();
    
    /**
     * Gets the "showContinents" element
     */
    boolean getShowContinents();
    
    /**
     * Gets (as xml) the "showContinents" element
     */
    org.apache.xmlbeans.XmlBoolean xgetShowContinents();
    
    /**
     * Sets the "showContinents" element
     */
    void setShowContinents(boolean showContinents);
    
    /**
     * Sets (as xml) the "showContinents" element
     */
    void xsetShowContinents(org.apache.xmlbeans.XmlBoolean showContinents);
    
    /**
     * Gets the "title" element
     */
    java.lang.String getTitle();
    
    /**
     * Gets (as xml) the "title" element
     */
    org.apache.xmlbeans.XmlString xgetTitle();
    
    /**
     * True if has "title" element
     */
    boolean isSetTitle();
    
    /**
     * Sets the "title" element
     */
    void setTitle(java.lang.String title);
    
    /**
     * Sets (as xml) the "title" element
     */
    void xsetTitle(org.apache.xmlbeans.XmlString title);
    
    /**
     * Unsets the "title" element
     */
    void unsetTitle();
    
    /**
     * Gets the "trace" element
     */
    gov.nasa.gsfc.spdf.ssc.Trace.Enum getTrace();
    
    /**
     * Gets (as xml) the "trace" element
     */
    gov.nasa.gsfc.spdf.ssc.Trace xgetTrace();
    
    /**
     * True if has "trace" element
     */
    boolean isSetTrace();
    
    /**
     * Sets the "trace" element
     */
    void setTrace(gov.nasa.gsfc.spdf.ssc.Trace.Enum trace);
    
    /**
     * Sets (as xml) the "trace" element
     */
    void xsetTrace(gov.nasa.gsfc.spdf.ssc.Trace trace);
    
    /**
     * Unsets the "trace" element
     */
    void unsetTrace();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions newInstance() {
          return (gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
