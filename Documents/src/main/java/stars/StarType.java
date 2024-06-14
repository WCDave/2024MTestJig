/*
 * XML Type:  starType
 * Namespace: stars
 * Java type: stars.StarType
 *
 * Automatically generated - do not modify.
 */
package stars;


/**
 * An XML starType(@stars).
 *
 * This is a complex type.
 */
public interface StarType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StarType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("startype6a76type");
    
    /**
     * Gets the "x" element
     */
    float getX();
    
    /**
     * Gets (as xml) the "x" element
     */
    org.apache.xmlbeans.XmlFloat xgetX();
    
    /**
     * Sets the "x" element
     */
    void setX(float x);
    
    /**
     * Sets (as xml) the "x" element
     */
    void xsetX(org.apache.xmlbeans.XmlFloat x);
    
    /**
     * Gets the "brightness" element
     */
    float getBrightness();
    
    /**
     * Gets (as xml) the "brightness" element
     */
    org.apache.xmlbeans.XmlFloat xgetBrightness();
    
    /**
     * Sets the "brightness" element
     */
    void setBrightness(float brightness);
    
    /**
     * Sets (as xml) the "brightness" element
     */
    void xsetBrightness(org.apache.xmlbeans.XmlFloat brightness);
    
    /**
     * Gets the "z" element
     */
    float getZ();
    
    /**
     * Gets (as xml) the "z" element
     */
    org.apache.xmlbeans.XmlFloat xgetZ();
    
    /**
     * Sets the "z" element
     */
    void setZ(float z);
    
    /**
     * Sets (as xml) the "z" element
     */
    void xsetZ(org.apache.xmlbeans.XmlFloat z);
    
    /**
     * Gets the "y" element
     */
    float getY();
    
    /**
     * Gets (as xml) the "y" element
     */
    org.apache.xmlbeans.XmlFloat xgetY();
    
    /**
     * Sets the "y" element
     */
    void setY(float y);
    
    /**
     * Sets (as xml) the "y" element
     */
    void xsetY(org.apache.xmlbeans.XmlFloat y);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static stars.StarType newInstance() {
          return (stars.StarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static stars.StarType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (stars.StarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static stars.StarType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (stars.StarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static stars.StarType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (stars.StarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static stars.StarType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stars.StarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static stars.StarType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stars.StarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static stars.StarType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stars.StarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static stars.StarType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stars.StarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static stars.StarType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stars.StarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static stars.StarType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stars.StarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static stars.StarType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stars.StarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static stars.StarType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (stars.StarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static stars.StarType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (stars.StarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static stars.StarType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (stars.StarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static stars.StarType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (stars.StarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static stars.StarType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (stars.StarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static stars.StarType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (stars.StarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static stars.StarType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (stars.StarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
