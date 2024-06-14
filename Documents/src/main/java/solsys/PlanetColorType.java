/*
 * XML Type:  PlanetColorType
 * Namespace: solsys
 * Java type: solsys.PlanetColorType
 *
 * Automatically generated - do not modify.
 */
package solsys;


/**
 * An XML PlanetColorType(@solsys).
 *
 * This is an atomic type that is a restriction of solsys.PlanetColorType.
 */
public interface PlanetColorType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PlanetColorType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("planetcolortype8721type");
    
    /**
     * Gets the "red" attribute
     */
    short getRed();
    
    /**
     * Gets (as xml) the "red" attribute
     */
    org.apache.xmlbeans.XmlShort xgetRed();
    
    /**
     * True if has "red" attribute
     */
    boolean isSetRed();
    
    /**
     * Sets the "red" attribute
     */
    void setRed(short red);
    
    /**
     * Sets (as xml) the "red" attribute
     */
    void xsetRed(org.apache.xmlbeans.XmlShort red);
    
    /**
     * Unsets the "red" attribute
     */
    void unsetRed();
    
    /**
     * Gets the "green" attribute
     */
    short getGreen();
    
    /**
     * Gets (as xml) the "green" attribute
     */
    org.apache.xmlbeans.XmlShort xgetGreen();
    
    /**
     * True if has "green" attribute
     */
    boolean isSetGreen();
    
    /**
     * Sets the "green" attribute
     */
    void setGreen(short green);
    
    /**
     * Sets (as xml) the "green" attribute
     */
    void xsetGreen(org.apache.xmlbeans.XmlShort green);
    
    /**
     * Unsets the "green" attribute
     */
    void unsetGreen();
    
    /**
     * Gets the "blue" attribute
     */
    short getBlue();
    
    /**
     * Gets (as xml) the "blue" attribute
     */
    org.apache.xmlbeans.XmlShort xgetBlue();
    
    /**
     * True if has "blue" attribute
     */
    boolean isSetBlue();
    
    /**
     * Sets the "blue" attribute
     */
    void setBlue(short blue);
    
    /**
     * Sets (as xml) the "blue" attribute
     */
    void xsetBlue(org.apache.xmlbeans.XmlShort blue);
    
    /**
     * Unsets the "blue" attribute
     */
    void unsetBlue();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static solsys.PlanetColorType newInstance() {
          return (solsys.PlanetColorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static solsys.PlanetColorType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (solsys.PlanetColorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static solsys.PlanetColorType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (solsys.PlanetColorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static solsys.PlanetColorType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (solsys.PlanetColorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static solsys.PlanetColorType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (solsys.PlanetColorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static solsys.PlanetColorType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (solsys.PlanetColorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static solsys.PlanetColorType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (solsys.PlanetColorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static solsys.PlanetColorType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (solsys.PlanetColorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static solsys.PlanetColorType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (solsys.PlanetColorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static solsys.PlanetColorType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (solsys.PlanetColorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static solsys.PlanetColorType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (solsys.PlanetColorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static solsys.PlanetColorType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (solsys.PlanetColorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static solsys.PlanetColorType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (solsys.PlanetColorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static solsys.PlanetColorType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (solsys.PlanetColorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static solsys.PlanetColorType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (solsys.PlanetColorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static solsys.PlanetColorType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (solsys.PlanetColorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static solsys.PlanetColorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (solsys.PlanetColorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static solsys.PlanetColorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (solsys.PlanetColorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
