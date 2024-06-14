/*
 * XML Type:  mappedRegionFilterOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc;


/**
 * An XML mappedRegionFilterOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public interface MappedRegionFilterOptions extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MappedRegionFilterOptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("mappedregionfilteroptions69e5type");
    
    /**
     * Gets the "auroralOval" element
     */
    gov.nasa.gsfc.spdf.ssc.HemisphereOptions getAuroralOval();
    
    /**
     * True if has "auroralOval" element
     */
    boolean isSetAuroralOval();
    
    /**
     * Sets the "auroralOval" element
     */
    void setAuroralOval(gov.nasa.gsfc.spdf.ssc.HemisphereOptions auroralOval);
    
    /**
     * Appends and returns a new empty "auroralOval" element
     */
    gov.nasa.gsfc.spdf.ssc.HemisphereOptions addNewAuroralOval();
    
    /**
     * Unsets the "auroralOval" element
     */
    void unsetAuroralOval();
    
    /**
     * Gets the "cleft" element
     */
    gov.nasa.gsfc.spdf.ssc.HemisphereOptions getCleft();
    
    /**
     * True if has "cleft" element
     */
    boolean isSetCleft();
    
    /**
     * Sets the "cleft" element
     */
    void setCleft(gov.nasa.gsfc.spdf.ssc.HemisphereOptions cleft);
    
    /**
     * Appends and returns a new empty "cleft" element
     */
    gov.nasa.gsfc.spdf.ssc.HemisphereOptions addNewCleft();
    
    /**
     * Unsets the "cleft" element
     */
    void unsetCleft();
    
    /**
     * Gets the "cusp" element
     */
    gov.nasa.gsfc.spdf.ssc.HemisphereOptions getCusp();
    
    /**
     * True if has "cusp" element
     */
    boolean isSetCusp();
    
    /**
     * Sets the "cusp" element
     */
    void setCusp(gov.nasa.gsfc.spdf.ssc.HemisphereOptions cusp);
    
    /**
     * Appends and returns a new empty "cusp" element
     */
    gov.nasa.gsfc.spdf.ssc.HemisphereOptions addNewCusp();
    
    /**
     * Unsets the "cusp" element
     */
    void unsetCusp();
    
    /**
     * Gets the "lowLatitude" element
     */
    boolean getLowLatitude();
    
    /**
     * Gets (as xml) the "lowLatitude" element
     */
    org.apache.xmlbeans.XmlBoolean xgetLowLatitude();
    
    /**
     * Sets the "lowLatitude" element
     */
    void setLowLatitude(boolean lowLatitude);
    
    /**
     * Sets (as xml) the "lowLatitude" element
     */
    void xsetLowLatitude(org.apache.xmlbeans.XmlBoolean lowLatitude);
    
    /**
     * Gets the "midLatitude" element
     */
    gov.nasa.gsfc.spdf.ssc.HemisphereOptions getMidLatitude();
    
    /**
     * True if has "midLatitude" element
     */
    boolean isSetMidLatitude();
    
    /**
     * Sets the "midLatitude" element
     */
    void setMidLatitude(gov.nasa.gsfc.spdf.ssc.HemisphereOptions midLatitude);
    
    /**
     * Appends and returns a new empty "midLatitude" element
     */
    gov.nasa.gsfc.spdf.ssc.HemisphereOptions addNewMidLatitude();
    
    /**
     * Unsets the "midLatitude" element
     */
    void unsetMidLatitude();
    
    /**
     * Gets the "polarCap" element
     */
    gov.nasa.gsfc.spdf.ssc.HemisphereOptions getPolarCap();
    
    /**
     * True if has "polarCap" element
     */
    boolean isSetPolarCap();
    
    /**
     * Sets the "polarCap" element
     */
    void setPolarCap(gov.nasa.gsfc.spdf.ssc.HemisphereOptions polarCap);
    
    /**
     * Appends and returns a new empty "polarCap" element
     */
    gov.nasa.gsfc.spdf.ssc.HemisphereOptions addNewPolarCap();
    
    /**
     * Unsets the "polarCap" element
     */
    void unsetPolarCap();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions newInstance() {
          return (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.MappedRegionFilterOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
