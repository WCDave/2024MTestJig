/*
 * XML Type:  graphScale
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GraphScale
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc;


/**
 * An XML graphScale(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public interface GraphScale extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GraphScale.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("graphscaleda36type");
    
    /**
     * Gets the "maxR" element
     */
    int getMaxR();
    
    /**
     * Gets (as xml) the "maxR" element
     */
    org.apache.xmlbeans.XmlInt xgetMaxR();
    
    /**
     * Sets the "maxR" element
     */
    void setMaxR(int maxR);
    
    /**
     * Sets (as xml) the "maxR" element
     */
    void xsetMaxR(org.apache.xmlbeans.XmlInt maxR);
    
    /**
     * Gets the "maxX" element
     */
    int getMaxX();
    
    /**
     * Gets (as xml) the "maxX" element
     */
    org.apache.xmlbeans.XmlInt xgetMaxX();
    
    /**
     * Sets the "maxX" element
     */
    void setMaxX(int maxX);
    
    /**
     * Sets (as xml) the "maxX" element
     */
    void xsetMaxX(org.apache.xmlbeans.XmlInt maxX);
    
    /**
     * Gets the "maxY" element
     */
    int getMaxY();
    
    /**
     * Gets (as xml) the "maxY" element
     */
    org.apache.xmlbeans.XmlInt xgetMaxY();
    
    /**
     * Sets the "maxY" element
     */
    void setMaxY(int maxY);
    
    /**
     * Sets (as xml) the "maxY" element
     */
    void xsetMaxY(org.apache.xmlbeans.XmlInt maxY);
    
    /**
     * Gets the "maxZ" element
     */
    int getMaxZ();
    
    /**
     * Gets (as xml) the "maxZ" element
     */
    org.apache.xmlbeans.XmlInt xgetMaxZ();
    
    /**
     * Sets the "maxZ" element
     */
    void setMaxZ(int maxZ);
    
    /**
     * Sets (as xml) the "maxZ" element
     */
    void xsetMaxZ(org.apache.xmlbeans.XmlInt maxZ);
    
    /**
     * Gets the "minR" element
     */
    int getMinR();
    
    /**
     * Gets (as xml) the "minR" element
     */
    org.apache.xmlbeans.XmlInt xgetMinR();
    
    /**
     * Sets the "minR" element
     */
    void setMinR(int minR);
    
    /**
     * Sets (as xml) the "minR" element
     */
    void xsetMinR(org.apache.xmlbeans.XmlInt minR);
    
    /**
     * Gets the "minX" element
     */
    int getMinX();
    
    /**
     * Gets (as xml) the "minX" element
     */
    org.apache.xmlbeans.XmlInt xgetMinX();
    
    /**
     * Sets the "minX" element
     */
    void setMinX(int minX);
    
    /**
     * Sets (as xml) the "minX" element
     */
    void xsetMinX(org.apache.xmlbeans.XmlInt minX);
    
    /**
     * Gets the "minY" element
     */
    int getMinY();
    
    /**
     * Gets (as xml) the "minY" element
     */
    org.apache.xmlbeans.XmlInt xgetMinY();
    
    /**
     * Sets the "minY" element
     */
    void setMinY(int minY);
    
    /**
     * Sets (as xml) the "minY" element
     */
    void xsetMinY(org.apache.xmlbeans.XmlInt minY);
    
    /**
     * Gets the "minZ" element
     */
    int getMinZ();
    
    /**
     * Gets (as xml) the "minZ" element
     */
    org.apache.xmlbeans.XmlInt xgetMinZ();
    
    /**
     * Sets the "minZ" element
     */
    void setMinZ(int minZ);
    
    /**
     * Sets (as xml) the "minZ" element
     */
    void xsetMinZ(org.apache.xmlbeans.XmlInt minZ);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nasa.gsfc.spdf.ssc.GraphScale newInstance() {
          return (gov.nasa.gsfc.spdf.ssc.GraphScale) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphScale newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nasa.gsfc.spdf.ssc.GraphScale) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nasa.gsfc.spdf.ssc.GraphScale parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.GraphScale) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphScale parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.GraphScale) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nasa.gsfc.spdf.ssc.GraphScale parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.GraphScale) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphScale parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.GraphScale) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphScale parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.GraphScale) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphScale parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.GraphScale) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphScale parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.GraphScale) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphScale parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.GraphScale) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphScale parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.GraphScale) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphScale parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.GraphScale) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphScale parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.GraphScale) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphScale parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.GraphScale) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphScale parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.GraphScale) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphScale parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.GraphScale) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.GraphScale parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.GraphScale) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.GraphScale parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.GraphScale) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
