/*
 * An XML document type.
 * Localname: solar-system
 * Namespace: orbitData
 * Java type: orbitData.SolarSystemDocument
 *
 * Automatically generated - do not modify.
 */
package orbitData;


/**
 * A document containing one solar-system(@orbitData) element.
 *
 * This is a complex type.
 */
public interface SolarSystemDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SolarSystemDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("solarsystemac88doctype");
    
    /**
     * Gets the "solar-system" element
     */
    orbitData.SolarSystemDocument.SolarSystem getSolarSystem();
    
    /**
     * Sets the "solar-system" element
     */
    void setSolarSystem(orbitData.SolarSystemDocument.SolarSystem solarSystem);
    
    /**
     * Appends and returns a new empty "solar-system" element
     */
    orbitData.SolarSystemDocument.SolarSystem addNewSolarSystem();
    
    /**
     * An XML solar-system(@orbitData).
     *
     * This is a complex type.
     */
    public interface SolarSystem extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SolarSystem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("solarsystem9c11elemtype");
        
        /**
         * Gets array of all "planet" elements
         */
        orbitData.PlanetDocument.Planet[] getPlanetArray();
        
        /**
         * Gets ith "planet" element
         */
        orbitData.PlanetDocument.Planet getPlanetArray(int i);
        
        /**
         * Returns number of "planet" element
         */
        int sizeOfPlanetArray();
        
        /**
         * Sets array of all "planet" element
         */
        void setPlanetArray(orbitData.PlanetDocument.Planet[] planetArray);
        
        /**
         * Sets ith "planet" element
         */
        void setPlanetArray(int i, orbitData.PlanetDocument.Planet planet);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "planet" element
         */
        orbitData.PlanetDocument.Planet insertNewPlanet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "planet" element
         */
        orbitData.PlanetDocument.Planet addNewPlanet();
        
        /**
         * Removes the ith "planet" element
         */
        void removePlanet(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static orbitData.SolarSystemDocument.SolarSystem newInstance() {
              return (orbitData.SolarSystemDocument.SolarSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static orbitData.SolarSystemDocument.SolarSystem newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (orbitData.SolarSystemDocument.SolarSystem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static orbitData.SolarSystemDocument newInstance() {
          return (orbitData.SolarSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static orbitData.SolarSystemDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (orbitData.SolarSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static orbitData.SolarSystemDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (orbitData.SolarSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static orbitData.SolarSystemDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (orbitData.SolarSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static orbitData.SolarSystemDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (orbitData.SolarSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static orbitData.SolarSystemDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (orbitData.SolarSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static orbitData.SolarSystemDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (orbitData.SolarSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static orbitData.SolarSystemDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (orbitData.SolarSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static orbitData.SolarSystemDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (orbitData.SolarSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static orbitData.SolarSystemDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (orbitData.SolarSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static orbitData.SolarSystemDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (orbitData.SolarSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static orbitData.SolarSystemDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (orbitData.SolarSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static orbitData.SolarSystemDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (orbitData.SolarSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static orbitData.SolarSystemDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (orbitData.SolarSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static orbitData.SolarSystemDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (orbitData.SolarSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static orbitData.SolarSystemDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (orbitData.SolarSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static orbitData.SolarSystemDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (orbitData.SolarSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static orbitData.SolarSystemDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (orbitData.SolarSystemDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
