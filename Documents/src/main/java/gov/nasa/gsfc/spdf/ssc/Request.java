/*
 * XML Type:  request
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.Request
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc;


/**
 * An XML request(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public interface Request extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Request.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("request55d5type");
    
    /**
     * Gets the "BFieldModelOptions" element
     */
    gov.nasa.gsfc.spdf.ssc.BFieldModelOptions getBFieldModelOptions();
    
    /**
     * True if has "BFieldModelOptions" element
     */
    boolean isSetBFieldModelOptions();
    
    /**
     * Sets the "BFieldModelOptions" element
     */
    void setBFieldModelOptions(gov.nasa.gsfc.spdf.ssc.BFieldModelOptions bFieldModelOptions);
    
    /**
     * Appends and returns a new empty "BFieldModelOptions" element
     */
    gov.nasa.gsfc.spdf.ssc.BFieldModelOptions addNewBFieldModelOptions();
    
    /**
     * Unsets the "BFieldModelOptions" element
     */
    void unsetBFieldModelOptions();
    
    /**
     * Gets the "beginTime" element
     */
    java.util.Calendar getBeginTime();
    
    /**
     * Gets (as xml) the "beginTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetBeginTime();
    
    /**
     * True if has "beginTime" element
     */
    boolean isSetBeginTime();
    
    /**
     * Sets the "beginTime" element
     */
    void setBeginTime(java.util.Calendar beginTime);
    
    /**
     * Sets (as xml) the "beginTime" element
     */
    void xsetBeginTime(org.apache.xmlbeans.XmlDateTime beginTime);
    
    /**
     * Unsets the "beginTime" element
     */
    void unsetBeginTime();
    
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
     * Gets array of all "satellites" elements
     */
    gov.nasa.gsfc.spdf.ssc.SatelliteSpecification[] getSatellitesArray();
    
    /**
     * Gets ith "satellites" element
     */
    gov.nasa.gsfc.spdf.ssc.SatelliteSpecification getSatellitesArray(int i);
    
    /**
     * Tests for nil ith "satellites" element
     */
    boolean isNilSatellitesArray(int i);
    
    /**
     * Returns number of "satellites" element
     */
    int sizeOfSatellitesArray();
    
    /**
     * Sets array of all "satellites" element
     */
    void setSatellitesArray(gov.nasa.gsfc.spdf.ssc.SatelliteSpecification[] satellitesArray);
    
    /**
     * Sets ith "satellites" element
     */
    void setSatellitesArray(int i, gov.nasa.gsfc.spdf.ssc.SatelliteSpecification satellites);
    
    /**
     * Nils the ith "satellites" element
     */
    void setNilSatellitesArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "satellites" element
     */
    gov.nasa.gsfc.spdf.ssc.SatelliteSpecification insertNewSatellites(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "satellites" element
     */
    gov.nasa.gsfc.spdf.ssc.SatelliteSpecification addNewSatellites();
    
    /**
     * Removes the ith "satellites" element
     */
    void removeSatellites(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nasa.gsfc.spdf.ssc.Request newInstance() {
          return (gov.nasa.gsfc.spdf.ssc.Request) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Request newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nasa.gsfc.spdf.ssc.Request) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nasa.gsfc.spdf.ssc.Request parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.Request) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Request parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.Request) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nasa.gsfc.spdf.ssc.Request parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.Request) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Request parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.Request) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Request parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.Request) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Request parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.Request) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Request parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.Request) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Request parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.Request) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Request parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.Request) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Request parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.Request) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Request parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.Request) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Request parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.Request) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Request parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.Request) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Request parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.Request) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.Request parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.Request) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.Request parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.Request) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
