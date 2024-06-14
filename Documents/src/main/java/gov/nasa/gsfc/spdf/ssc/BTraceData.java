/*
 * XML Type:  bTraceData
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.BTraceData
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc;


/**
 * An XML bTraceData(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public interface BTraceData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BTraceData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("btracedata8465type");
    
    /**
     * Gets array of all "arcLength" elements
     */
    double[] getArcLengthArray();
    
    /**
     * Gets ith "arcLength" element
     */
    double getArcLengthArray(int i);
    
    /**
     * Gets (as xml) array of all "arcLength" elements
     */
    org.apache.xmlbeans.XmlDouble[] xgetArcLengthArray();
    
    /**
     * Gets (as xml) ith "arcLength" element
     */
    org.apache.xmlbeans.XmlDouble xgetArcLengthArray(int i);
    
    /**
     * Tests for nil ith "arcLength" element
     */
    boolean isNilArcLengthArray(int i);
    
    /**
     * Returns number of "arcLength" element
     */
    int sizeOfArcLengthArray();
    
    /**
     * Sets array of all "arcLength" element
     */
    void setArcLengthArray(double[] arcLengthArray);
    
    /**
     * Sets ith "arcLength" element
     */
    void setArcLengthArray(int i, double arcLength);
    
    /**
     * Sets (as xml) array of all "arcLength" element
     */
    void xsetArcLengthArray(org.apache.xmlbeans.XmlDouble[] arcLengthArray);
    
    /**
     * Sets (as xml) ith "arcLength" element
     */
    void xsetArcLengthArray(int i, org.apache.xmlbeans.XmlDouble arcLength);
    
    /**
     * Nils the ith "arcLength" element
     */
    void setNilArcLengthArray(int i);
    
    /**
     * Inserts the value as the ith "arcLength" element
     */
    void insertArcLength(int i, double arcLength);
    
    /**
     * Appends the value as the last "arcLength" element
     */
    void addArcLength(double arcLength);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "arcLength" element
     */
    org.apache.xmlbeans.XmlDouble insertNewArcLength(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "arcLength" element
     */
    org.apache.xmlbeans.XmlDouble addNewArcLength();
    
    /**
     * Removes the ith "arcLength" element
     */
    void removeArcLength(int i);
    
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
     * Gets array of all "latitude" elements
     */
    float[] getLatitudeArray();
    
    /**
     * Gets ith "latitude" element
     */
    float getLatitudeArray(int i);
    
    /**
     * Gets (as xml) array of all "latitude" elements
     */
    org.apache.xmlbeans.XmlFloat[] xgetLatitudeArray();
    
    /**
     * Gets (as xml) ith "latitude" element
     */
    org.apache.xmlbeans.XmlFloat xgetLatitudeArray(int i);
    
    /**
     * Tests for nil ith "latitude" element
     */
    boolean isNilLatitudeArray(int i);
    
    /**
     * Returns number of "latitude" element
     */
    int sizeOfLatitudeArray();
    
    /**
     * Sets array of all "latitude" element
     */
    void setLatitudeArray(float[] latitudeArray);
    
    /**
     * Sets ith "latitude" element
     */
    void setLatitudeArray(int i, float latitude);
    
    /**
     * Sets (as xml) array of all "latitude" element
     */
    void xsetLatitudeArray(org.apache.xmlbeans.XmlFloat[] latitudeArray);
    
    /**
     * Sets (as xml) ith "latitude" element
     */
    void xsetLatitudeArray(int i, org.apache.xmlbeans.XmlFloat latitude);
    
    /**
     * Nils the ith "latitude" element
     */
    void setNilLatitudeArray(int i);
    
    /**
     * Inserts the value as the ith "latitude" element
     */
    void insertLatitude(int i, float latitude);
    
    /**
     * Appends the value as the last "latitude" element
     */
    void addLatitude(float latitude);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "latitude" element
     */
    org.apache.xmlbeans.XmlFloat insertNewLatitude(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "latitude" element
     */
    org.apache.xmlbeans.XmlFloat addNewLatitude();
    
    /**
     * Removes the ith "latitude" element
     */
    void removeLatitude(int i);
    
    /**
     * Gets array of all "longitude" elements
     */
    float[] getLongitudeArray();
    
    /**
     * Gets ith "longitude" element
     */
    float getLongitudeArray(int i);
    
    /**
     * Gets (as xml) array of all "longitude" elements
     */
    org.apache.xmlbeans.XmlFloat[] xgetLongitudeArray();
    
    /**
     * Gets (as xml) ith "longitude" element
     */
    org.apache.xmlbeans.XmlFloat xgetLongitudeArray(int i);
    
    /**
     * Tests for nil ith "longitude" element
     */
    boolean isNilLongitudeArray(int i);
    
    /**
     * Returns number of "longitude" element
     */
    int sizeOfLongitudeArray();
    
    /**
     * Sets array of all "longitude" element
     */
    void setLongitudeArray(float[] longitudeArray);
    
    /**
     * Sets ith "longitude" element
     */
    void setLongitudeArray(int i, float longitude);
    
    /**
     * Sets (as xml) array of all "longitude" element
     */
    void xsetLongitudeArray(org.apache.xmlbeans.XmlFloat[] longitudeArray);
    
    /**
     * Sets (as xml) ith "longitude" element
     */
    void xsetLongitudeArray(int i, org.apache.xmlbeans.XmlFloat longitude);
    
    /**
     * Nils the ith "longitude" element
     */
    void setNilLongitudeArray(int i);
    
    /**
     * Inserts the value as the ith "longitude" element
     */
    void insertLongitude(int i, float longitude);
    
    /**
     * Appends the value as the last "longitude" element
     */
    void addLongitude(float longitude);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "longitude" element
     */
    org.apache.xmlbeans.XmlFloat insertNewLongitude(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "longitude" element
     */
    org.apache.xmlbeans.XmlFloat addNewLongitude();
    
    /**
     * Removes the ith "longitude" element
     */
    void removeLongitude(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nasa.gsfc.spdf.ssc.BTraceData newInstance() {
          return (gov.nasa.gsfc.spdf.ssc.BTraceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BTraceData newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nasa.gsfc.spdf.ssc.BTraceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nasa.gsfc.spdf.ssc.BTraceData parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.BTraceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BTraceData parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.BTraceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nasa.gsfc.spdf.ssc.BTraceData parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.BTraceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BTraceData parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.BTraceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BTraceData parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.BTraceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BTraceData parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.BTraceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BTraceData parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.BTraceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BTraceData parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.BTraceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BTraceData parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.BTraceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BTraceData parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.BTraceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BTraceData parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.BTraceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BTraceData parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.BTraceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BTraceData parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.BTraceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BTraceData parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.BTraceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.BTraceData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.BTraceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.BTraceData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.BTraceData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
