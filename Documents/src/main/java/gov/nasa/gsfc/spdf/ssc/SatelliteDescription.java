/*
 * XML Type:  satelliteDescription
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.SatelliteDescription
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc;


/**
 * An XML satelliteDescription(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public interface SatelliteDescription extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SatelliteDescription.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("satellitedescription55b1type");
    
    /**
     * Gets the "endTime" element
     */
    java.util.Calendar getEndTime();
    
    /**
     * Gets (as xml) the "endTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetEndTime();
    
    /**
     * True if has "endTime" element
     */
    boolean isSetEndTime();
    
    /**
     * Sets the "endTime" element
     */
    void setEndTime(java.util.Calendar endTime);
    
    /**
     * Sets (as xml) the "endTime" element
     */
    void xsetEndTime(org.apache.xmlbeans.XmlDateTime endTime);
    
    /**
     * Unsets the "endTime" element
     */
    void unsetEndTime();
    
    /**
     * Gets the "geometry" element
     */
    java.lang.String getGeometry();
    
    /**
     * Gets (as xml) the "geometry" element
     */
    org.apache.xmlbeans.XmlString xgetGeometry();
    
    /**
     * True if has "geometry" element
     */
    boolean isSetGeometry();
    
    /**
     * Sets the "geometry" element
     */
    void setGeometry(java.lang.String geometry);
    
    /**
     * Sets (as xml) the "geometry" element
     */
    void xsetGeometry(org.apache.xmlbeans.XmlString geometry);
    
    /**
     * Unsets the "geometry" element
     */
    void unsetGeometry();
    
    /**
     * Gets the "id" element
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" element
     */
    org.apache.xmlbeans.XmlString xgetId();
    
    /**
     * True if has "id" element
     */
    boolean isSetId();
    
    /**
     * Sets the "id" element
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" element
     */
    void xsetId(org.apache.xmlbeans.XmlString id);
    
    /**
     * Unsets the "id" element
     */
    void unsetId();
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "name" element
     */
    void unsetName();
    
    /**
     * Gets the "resolution" element
     */
    int getResolution();
    
    /**
     * Gets (as xml) the "resolution" element
     */
    org.apache.xmlbeans.XmlInt xgetResolution();
    
    /**
     * Sets the "resolution" element
     */
    void setResolution(int resolution);
    
    /**
     * Sets (as xml) the "resolution" element
     */
    void xsetResolution(org.apache.xmlbeans.XmlInt resolution);
    
    /**
     * Gets the "startTime" element
     */
    java.util.Calendar getStartTime();
    
    /**
     * Gets (as xml) the "startTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetStartTime();
    
    /**
     * True if has "startTime" element
     */
    boolean isSetStartTime();
    
    /**
     * Sets the "startTime" element
     */
    void setStartTime(java.util.Calendar startTime);
    
    /**
     * Sets (as xml) the "startTime" element
     */
    void xsetStartTime(org.apache.xmlbeans.XmlDateTime startTime);
    
    /**
     * Unsets the "startTime" element
     */
    void unsetStartTime();
    
    /**
     * Gets the "trajectoryGeometry" element
     */
    java.lang.String getTrajectoryGeometry();
    
    /**
     * Gets (as xml) the "trajectoryGeometry" element
     */
    org.apache.xmlbeans.XmlString xgetTrajectoryGeometry();
    
    /**
     * True if has "trajectoryGeometry" element
     */
    boolean isSetTrajectoryGeometry();
    
    /**
     * Sets the "trajectoryGeometry" element
     */
    void setTrajectoryGeometry(java.lang.String trajectoryGeometry);
    
    /**
     * Sets (as xml) the "trajectoryGeometry" element
     */
    void xsetTrajectoryGeometry(org.apache.xmlbeans.XmlString trajectoryGeometry);
    
    /**
     * Unsets the "trajectoryGeometry" element
     */
    void unsetTrajectoryGeometry();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nasa.gsfc.spdf.ssc.SatelliteDescription newInstance() {
          return (gov.nasa.gsfc.spdf.ssc.SatelliteDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SatelliteDescription newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nasa.gsfc.spdf.ssc.SatelliteDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nasa.gsfc.spdf.ssc.SatelliteDescription parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.SatelliteDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SatelliteDescription parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.SatelliteDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nasa.gsfc.spdf.ssc.SatelliteDescription parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.SatelliteDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SatelliteDescription parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.SatelliteDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SatelliteDescription parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.SatelliteDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SatelliteDescription parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.SatelliteDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SatelliteDescription parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.SatelliteDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SatelliteDescription parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.SatelliteDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SatelliteDescription parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.SatelliteDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SatelliteDescription parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.SatelliteDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SatelliteDescription parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.SatelliteDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SatelliteDescription parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.SatelliteDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SatelliteDescription parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.SatelliteDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SatelliteDescription parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.SatelliteDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.SatelliteDescription parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.SatelliteDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.SatelliteDescription parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.SatelliteDescription) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
