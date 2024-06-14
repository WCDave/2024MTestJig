/*
 * XML Type:  coordinateData
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.CoordinateData
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc;


/**
 * An XML coordinateData(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public interface CoordinateData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CoordinateData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("coordinatedataad50type");
    
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
     * Gets array of all "localTime" elements
     */
    double[] getLocalTimeArray();
    
    /**
     * Gets ith "localTime" element
     */
    double getLocalTimeArray(int i);
    
    /**
     * Gets (as xml) array of all "localTime" elements
     */
    org.apache.xmlbeans.XmlDouble[] xgetLocalTimeArray();
    
    /**
     * Gets (as xml) ith "localTime" element
     */
    org.apache.xmlbeans.XmlDouble xgetLocalTimeArray(int i);
    
    /**
     * Tests for nil ith "localTime" element
     */
    boolean isNilLocalTimeArray(int i);
    
    /**
     * Returns number of "localTime" element
     */
    int sizeOfLocalTimeArray();
    
    /**
     * Sets array of all "localTime" element
     */
    void setLocalTimeArray(double[] localTimeArray);
    
    /**
     * Sets ith "localTime" element
     */
    void setLocalTimeArray(int i, double localTime);
    
    /**
     * Sets (as xml) array of all "localTime" element
     */
    void xsetLocalTimeArray(org.apache.xmlbeans.XmlDouble[] localTimeArray);
    
    /**
     * Sets (as xml) ith "localTime" element
     */
    void xsetLocalTimeArray(int i, org.apache.xmlbeans.XmlDouble localTime);
    
    /**
     * Nils the ith "localTime" element
     */
    void setNilLocalTimeArray(int i);
    
    /**
     * Inserts the value as the ith "localTime" element
     */
    void insertLocalTime(int i, double localTime);
    
    /**
     * Appends the value as the last "localTime" element
     */
    void addLocalTime(double localTime);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "localTime" element
     */
    org.apache.xmlbeans.XmlDouble insertNewLocalTime(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "localTime" element
     */
    org.apache.xmlbeans.XmlDouble addNewLocalTime();
    
    /**
     * Removes the ith "localTime" element
     */
    void removeLocalTime(int i);
    
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
     * Gets array of all "x" elements
     */
    double[] getXArray();
    
    /**
     * Gets ith "x" element
     */
    double getXArray(int i);
    
    /**
     * Gets (as xml) array of all "x" elements
     */
    org.apache.xmlbeans.XmlDouble[] xgetXArray();
    
    /**
     * Gets (as xml) ith "x" element
     */
    org.apache.xmlbeans.XmlDouble xgetXArray(int i);
    
    /**
     * Tests for nil ith "x" element
     */
    boolean isNilXArray(int i);
    
    /**
     * Returns number of "x" element
     */
    int sizeOfXArray();
    
    /**
     * Sets array of all "x" element
     */
    void setXArray(double[] xArray);
    
    /**
     * Sets ith "x" element
     */
    void setXArray(int i, double x);
    
    /**
     * Sets (as xml) array of all "x" element
     */
    void xsetXArray(org.apache.xmlbeans.XmlDouble[] xArray);
    
    /**
     * Sets (as xml) ith "x" element
     */
    void xsetXArray(int i, org.apache.xmlbeans.XmlDouble x);
    
    /**
     * Nils the ith "x" element
     */
    void setNilXArray(int i);
    
    /**
     * Inserts the value as the ith "x" element
     */
    void insertX(int i, double x);
    
    /**
     * Appends the value as the last "x" element
     */
    void addX(double x);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "x" element
     */
    org.apache.xmlbeans.XmlDouble insertNewX(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "x" element
     */
    org.apache.xmlbeans.XmlDouble addNewX();
    
    /**
     * Removes the ith "x" element
     */
    void removeX(int i);
    
    /**
     * Gets array of all "y" elements
     */
    double[] getYArray();
    
    /**
     * Gets ith "y" element
     */
    double getYArray(int i);
    
    /**
     * Gets (as xml) array of all "y" elements
     */
    org.apache.xmlbeans.XmlDouble[] xgetYArray();
    
    /**
     * Gets (as xml) ith "y" element
     */
    org.apache.xmlbeans.XmlDouble xgetYArray(int i);
    
    /**
     * Tests for nil ith "y" element
     */
    boolean isNilYArray(int i);
    
    /**
     * Returns number of "y" element
     */
    int sizeOfYArray();
    
    /**
     * Sets array of all "y" element
     */
    void setYArray(double[] yArray);
    
    /**
     * Sets ith "y" element
     */
    void setYArray(int i, double y);
    
    /**
     * Sets (as xml) array of all "y" element
     */
    void xsetYArray(org.apache.xmlbeans.XmlDouble[] yArray);
    
    /**
     * Sets (as xml) ith "y" element
     */
    void xsetYArray(int i, org.apache.xmlbeans.XmlDouble y);
    
    /**
     * Nils the ith "y" element
     */
    void setNilYArray(int i);
    
    /**
     * Inserts the value as the ith "y" element
     */
    void insertY(int i, double y);
    
    /**
     * Appends the value as the last "y" element
     */
    void addY(double y);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "y" element
     */
    org.apache.xmlbeans.XmlDouble insertNewY(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "y" element
     */
    org.apache.xmlbeans.XmlDouble addNewY();
    
    /**
     * Removes the ith "y" element
     */
    void removeY(int i);
    
    /**
     * Gets array of all "z" elements
     */
    double[] getZArray();
    
    /**
     * Gets ith "z" element
     */
    double getZArray(int i);
    
    /**
     * Gets (as xml) array of all "z" elements
     */
    org.apache.xmlbeans.XmlDouble[] xgetZArray();
    
    /**
     * Gets (as xml) ith "z" element
     */
    org.apache.xmlbeans.XmlDouble xgetZArray(int i);
    
    /**
     * Tests for nil ith "z" element
     */
    boolean isNilZArray(int i);
    
    /**
     * Returns number of "z" element
     */
    int sizeOfZArray();
    
    /**
     * Sets array of all "z" element
     */
    void setZArray(double[] zArray);
    
    /**
     * Sets ith "z" element
     */
    void setZArray(int i, double z);
    
    /**
     * Sets (as xml) array of all "z" element
     */
    void xsetZArray(org.apache.xmlbeans.XmlDouble[] zArray);
    
    /**
     * Sets (as xml) ith "z" element
     */
    void xsetZArray(int i, org.apache.xmlbeans.XmlDouble z);
    
    /**
     * Nils the ith "z" element
     */
    void setNilZArray(int i);
    
    /**
     * Inserts the value as the ith "z" element
     */
    void insertZ(int i, double z);
    
    /**
     * Appends the value as the last "z" element
     */
    void addZ(double z);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "z" element
     */
    org.apache.xmlbeans.XmlDouble insertNewZ(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "z" element
     */
    org.apache.xmlbeans.XmlDouble addNewZ();
    
    /**
     * Removes the ith "z" element
     */
    void removeZ(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nasa.gsfc.spdf.ssc.CoordinateData newInstance() {
          return (gov.nasa.gsfc.spdf.ssc.CoordinateData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.CoordinateData newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nasa.gsfc.spdf.ssc.CoordinateData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nasa.gsfc.spdf.ssc.CoordinateData parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.CoordinateData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.CoordinateData parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.CoordinateData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nasa.gsfc.spdf.ssc.CoordinateData parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.CoordinateData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.CoordinateData parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.CoordinateData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.CoordinateData parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.CoordinateData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.CoordinateData parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.CoordinateData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.CoordinateData parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.CoordinateData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.CoordinateData parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.CoordinateData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.CoordinateData parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.CoordinateData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.CoordinateData parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.CoordinateData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.CoordinateData parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.CoordinateData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.CoordinateData parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.CoordinateData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.CoordinateData parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.CoordinateData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.CoordinateData parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.CoordinateData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.CoordinateData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.CoordinateData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.CoordinateData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.CoordinateData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
