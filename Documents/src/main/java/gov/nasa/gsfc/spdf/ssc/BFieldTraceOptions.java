/*
 * XML Type:  bFieldTraceOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc;


/**
 * An XML bFieldTraceOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public interface BFieldTraceOptions extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BFieldTraceOptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("bfieldtraceoptionscdc1type");
    
    /**
     * Gets the "coordinateSystem" element
     */
    gov.nasa.gsfc.spdf.ssc.CoordinateSystem.Enum getCoordinateSystem();
    
    /**
     * Gets (as xml) the "coordinateSystem" element
     */
    gov.nasa.gsfc.spdf.ssc.CoordinateSystem xgetCoordinateSystem();
    
    /**
     * True if has "coordinateSystem" element
     */
    boolean isSetCoordinateSystem();
    
    /**
     * Sets the "coordinateSystem" element
     */
    void setCoordinateSystem(gov.nasa.gsfc.spdf.ssc.CoordinateSystem.Enum coordinateSystem);
    
    /**
     * Sets (as xml) the "coordinateSystem" element
     */
    void xsetCoordinateSystem(gov.nasa.gsfc.spdf.ssc.CoordinateSystem coordinateSystem);
    
    /**
     * Unsets the "coordinateSystem" element
     */
    void unsetCoordinateSystem();
    
    /**
     * Gets the "fieldLineLength" element
     */
    boolean getFieldLineLength();
    
    /**
     * Gets (as xml) the "fieldLineLength" element
     */
    org.apache.xmlbeans.XmlBoolean xgetFieldLineLength();
    
    /**
     * Sets the "fieldLineLength" element
     */
    void setFieldLineLength(boolean fieldLineLength);
    
    /**
     * Sets (as xml) the "fieldLineLength" element
     */
    void xsetFieldLineLength(org.apache.xmlbeans.XmlBoolean fieldLineLength);
    
    /**
     * Gets the "footpointLatitude" element
     */
    boolean getFootpointLatitude();
    
    /**
     * Gets (as xml) the "footpointLatitude" element
     */
    org.apache.xmlbeans.XmlBoolean xgetFootpointLatitude();
    
    /**
     * Sets the "footpointLatitude" element
     */
    void setFootpointLatitude(boolean footpointLatitude);
    
    /**
     * Sets (as xml) the "footpointLatitude" element
     */
    void xsetFootpointLatitude(org.apache.xmlbeans.XmlBoolean footpointLatitude);
    
    /**
     * Gets the "footpointLongitude" element
     */
    boolean getFootpointLongitude();
    
    /**
     * Gets (as xml) the "footpointLongitude" element
     */
    org.apache.xmlbeans.XmlBoolean xgetFootpointLongitude();
    
    /**
     * Sets the "footpointLongitude" element
     */
    void setFootpointLongitude(boolean footpointLongitude);
    
    /**
     * Sets (as xml) the "footpointLongitude" element
     */
    void xsetFootpointLongitude(org.apache.xmlbeans.XmlBoolean footpointLongitude);
    
    /**
     * Gets the "hemisphere" element
     */
    gov.nasa.gsfc.spdf.ssc.Hemisphere.Enum getHemisphere();
    
    /**
     * Gets (as xml) the "hemisphere" element
     */
    gov.nasa.gsfc.spdf.ssc.Hemisphere xgetHemisphere();
    
    /**
     * True if has "hemisphere" element
     */
    boolean isSetHemisphere();
    
    /**
     * Sets the "hemisphere" element
     */
    void setHemisphere(gov.nasa.gsfc.spdf.ssc.Hemisphere.Enum hemisphere);
    
    /**
     * Sets (as xml) the "hemisphere" element
     */
    void xsetHemisphere(gov.nasa.gsfc.spdf.ssc.Hemisphere hemisphere);
    
    /**
     * Unsets the "hemisphere" element
     */
    void unsetHemisphere();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions newInstance() {
          return (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
