/*
 * An XML document type.
 * Localname: planet
 * Namespace: orbitData
 * Java type: orbitData.PlanetDocument
 *
 * Automatically generated - do not modify.
 */
package orbitData;


/**
 * A document containing one planet(@orbitData) element.
 *
 * This is a complex type.
 */
public interface PlanetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PlanetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("planet40e5doctype");
    
    /**
     * Gets the "planet" element
     */
    orbitData.PlanetDocument.Planet getPlanet();
    
    /**
     * Sets the "planet" element
     */
    void setPlanet(orbitData.PlanetDocument.Planet planet);
    
    /**
     * Appends and returns a new empty "planet" element
     */
    orbitData.PlanetDocument.Planet addNewPlanet();
    
    /**
     * An XML planet(@orbitData).
     *
     * This is a complex type.
     */
    public interface Planet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Planet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("planet2431elemtype");
        
        /**
         * Gets the "planet-name" element
         */
        java.lang.String getPlanetName();
        
        /**
         * Gets (as xml) the "planet-name" element
         */
        org.apache.xmlbeans.XmlString xgetPlanetName();
        
        /**
         * Sets the "planet-name" element
         */
        void setPlanetName(java.lang.String planetName);
        
        /**
         * Sets (as xml) the "planet-name" element
         */
        void xsetPlanetName(org.apache.xmlbeans.XmlString planetName);
        
        /**
         * Gets the "color" element
         */
        orbitData.PlanetDocument.Planet.Color getColor();
        
        /**
         * Sets the "color" element
         */
        void setColor(orbitData.PlanetDocument.Planet.Color color);
        
        /**
         * Appends and returns a new empty "color" element
         */
        orbitData.PlanetDocument.Planet.Color addNewColor();
        
        /**
         * Gets the "eccentricity" attribute
         */
        double getEccentricity();
        
        /**
         * Gets (as xml) the "eccentricity" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetEccentricity();
        
        /**
         * Sets the "eccentricity" attribute
         */
        void setEccentricity(double eccentricity);
        
        /**
         * Sets (as xml) the "eccentricity" attribute
         */
        void xsetEccentricity(org.apache.xmlbeans.XmlDouble eccentricity);
        
        /**
         * Gets the "eccentricityDelta" attribute
         */
        double getEccentricityDelta();
        
        /**
         * Gets (as xml) the "eccentricityDelta" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetEccentricityDelta();
        
        /**
         * Sets the "eccentricityDelta" attribute
         */
        void setEccentricityDelta(double eccentricityDelta);
        
        /**
         * Sets (as xml) the "eccentricityDelta" attribute
         */
        void xsetEccentricityDelta(org.apache.xmlbeans.XmlDouble eccentricityDelta);
        
        /**
         * Gets the "true-anamoly" attribute
         */
        double getTrueAnamoly();
        
        /**
         * Gets (as xml) the "true-anamoly" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetTrueAnamoly();
        
        /**
         * Sets the "true-anamoly" attribute
         */
        void setTrueAnamoly(double trueAnamoly);
        
        /**
         * Sets (as xml) the "true-anamoly" attribute
         */
        void xsetTrueAnamoly(org.apache.xmlbeans.XmlDouble trueAnamoly);
        
        /**
         * Gets the "ascending-node" attribute
         */
        double getAscendingNode();
        
        /**
         * Gets (as xml) the "ascending-node" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetAscendingNode();
        
        /**
         * Sets the "ascending-node" attribute
         */
        void setAscendingNode(double ascendingNode);
        
        /**
         * Sets (as xml) the "ascending-node" attribute
         */
        void xsetAscendingNode(org.apache.xmlbeans.XmlDouble ascendingNode);
        
        /**
         * Gets the "ascending-nodeDelta" attribute
         */
        double getAscendingNodeDelta();
        
        /**
         * Gets (as xml) the "ascending-nodeDelta" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetAscendingNodeDelta();
        
        /**
         * Sets the "ascending-nodeDelta" attribute
         */
        void setAscendingNodeDelta(double ascendingNodeDelta);
        
        /**
         * Sets (as xml) the "ascending-nodeDelta" attribute
         */
        void xsetAscendingNodeDelta(org.apache.xmlbeans.XmlDouble ascendingNodeDelta);
        
        /**
         * Gets the "inclination" attribute
         */
        double getInclination();
        
        /**
         * Gets (as xml) the "inclination" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetInclination();
        
        /**
         * Sets the "inclination" attribute
         */
        void setInclination(double inclination);
        
        /**
         * Sets (as xml) the "inclination" attribute
         */
        void xsetInclination(org.apache.xmlbeans.XmlDouble inclination);
        
        /**
         * Gets the "inclinationDelta" attribute
         */
        double getInclinationDelta();
        
        /**
         * Gets (as xml) the "inclinationDelta" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetInclinationDelta();
        
        /**
         * Sets the "inclinationDelta" attribute
         */
        void setInclinationDelta(double inclinationDelta);
        
        /**
         * Sets (as xml) the "inclinationDelta" attribute
         */
        void xsetInclinationDelta(org.apache.xmlbeans.XmlDouble inclinationDelta);
        
        /**
         * Gets the "mean-anamoly" attribute
         */
        double getMeanAnamoly();
        
        /**
         * Gets (as xml) the "mean-anamoly" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetMeanAnamoly();
        
        /**
         * Sets the "mean-anamoly" attribute
         */
        void setMeanAnamoly(double meanAnamoly);
        
        /**
         * Sets (as xml) the "mean-anamoly" attribute
         */
        void xsetMeanAnamoly(org.apache.xmlbeans.XmlDouble meanAnamoly);
        
        /**
         * Gets the "rotational-period" attribute
         */
        double getRotationalPeriod();
        
        /**
         * Gets (as xml) the "rotational-period" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetRotationalPeriod();
        
        /**
         * Sets the "rotational-period" attribute
         */
        void setRotationalPeriod(double rotationalPeriod);
        
        /**
         * Sets (as xml) the "rotational-period" attribute
         */
        void xsetRotationalPeriod(org.apache.xmlbeans.XmlDouble rotationalPeriod);
        
        /**
         * Gets the "radius" attribute
         */
        double getRadius();
        
        /**
         * Gets (as xml) the "radius" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetRadius();
        
        /**
         * Sets the "radius" attribute
         */
        void setRadius(double radius);
        
        /**
         * Sets (as xml) the "radius" attribute
         */
        void xsetRadius(org.apache.xmlbeans.XmlDouble radius);
        
        /**
         * Gets the "oblateness" attribute
         */
        double getOblateness();
        
        /**
         * Gets (as xml) the "oblateness" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetOblateness();
        
        /**
         * Sets the "oblateness" attribute
         */
        void setOblateness(double oblateness);
        
        /**
         * Sets (as xml) the "oblateness" attribute
         */
        void xsetOblateness(org.apache.xmlbeans.XmlDouble oblateness);
        
        /**
         * Gets the "obliquity" attribute
         */
        double getObliquity();
        
        /**
         * Gets (as xml) the "obliquity" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetObliquity();
        
        /**
         * Sets the "obliquity" attribute
         */
        void setObliquity(double obliquity);
        
        /**
         * Sets (as xml) the "obliquity" attribute
         */
        void xsetObliquity(org.apache.xmlbeans.XmlDouble obliquity);
        
        /**
         * Gets the "atmo" attribute
         */
        boolean getAtmo();
        
        /**
         * Gets (as xml) the "atmo" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetAtmo();
        
        /**
         * Sets the "atmo" attribute
         */
        void setAtmo(boolean atmo);
        
        /**
         * Sets (as xml) the "atmo" attribute
         */
        void xsetAtmo(org.apache.xmlbeans.XmlBoolean atmo);
        
        /**
         * Gets the "semi-major-axis" attribute
         */
        double getSemiMajorAxis();
        
        /**
         * Gets (as xml) the "semi-major-axis" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetSemiMajorAxis();
        
        /**
         * Sets the "semi-major-axis" attribute
         */
        void setSemiMajorAxis(double semiMajorAxis);
        
        /**
         * Sets (as xml) the "semi-major-axis" attribute
         */
        void xsetSemiMajorAxis(org.apache.xmlbeans.XmlDouble semiMajorAxis);
        
        /**
         * Gets the "semi-major-axisDelta" attribute
         */
        double getSemiMajorAxisDelta();
        
        /**
         * Gets (as xml) the "semi-major-axisDelta" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetSemiMajorAxisDelta();
        
        /**
         * Sets the "semi-major-axisDelta" attribute
         */
        void setSemiMajorAxisDelta(double semiMajorAxisDelta);
        
        /**
         * Sets (as xml) the "semi-major-axisDelta" attribute
         */
        void xsetSemiMajorAxisDelta(org.apache.xmlbeans.XmlDouble semiMajorAxisDelta);
        
        /**
         * Gets the "mass" attribute
         */
        double getMass();
        
        /**
         * Gets (as xml) the "mass" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetMass();
        
        /**
         * Sets the "mass" attribute
         */
        void setMass(double mass);
        
        /**
         * Sets (as xml) the "mass" attribute
         */
        void xsetMass(org.apache.xmlbeans.XmlDouble mass);
        
        /**
         * Gets the "arg-of-perhelion" attribute
         */
        double getArgOfPerhelion();
        
        /**
         * Gets (as xml) the "arg-of-perhelion" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetArgOfPerhelion();
        
        /**
         * Sets the "arg-of-perhelion" attribute
         */
        void setArgOfPerhelion(double argOfPerhelion);
        
        /**
         * Sets (as xml) the "arg-of-perhelion" attribute
         */
        void xsetArgOfPerhelion(org.apache.xmlbeans.XmlDouble argOfPerhelion);
        
        /**
         * Gets the "arg-of-perhelionDelta" attribute
         */
        double getArgOfPerhelionDelta();
        
        /**
         * Gets (as xml) the "arg-of-perhelionDelta" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetArgOfPerhelionDelta();
        
        /**
         * Sets the "arg-of-perhelionDelta" attribute
         */
        void setArgOfPerhelionDelta(double argOfPerhelionDelta);
        
        /**
         * Sets (as xml) the "arg-of-perhelionDelta" attribute
         */
        void xsetArgOfPerhelionDelta(org.apache.xmlbeans.XmlDouble argOfPerhelionDelta);
        
        /**
         * Gets the "dm" attribute
         */
        double getDm();
        
        /**
         * Gets (as xml) the "dm" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetDm();
        
        /**
         * Sets the "dm" attribute
         */
        void setDm(double dm);
        
        /**
         * Sets (as xml) the "dm" attribute
         */
        void xsetDm(org.apache.xmlbeans.XmlDouble dm);
        
        /**
         * Gets the "period" attribute
         */
        double getPeriod();
        
        /**
         * Gets (as xml) the "period" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetPeriod();
        
        /**
         * Sets the "period" attribute
         */
        void setPeriod(double period);
        
        /**
         * Sets (as xml) the "period" attribute
         */
        void xsetPeriod(org.apache.xmlbeans.XmlDouble period);
        
        /**
         * Gets the "epoch-longitude" attribute
         */
        double getEpochLongitude();
        
        /**
         * Gets (as xml) the "epoch-longitude" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetEpochLongitude();
        
        /**
         * Sets the "epoch-longitude" attribute
         */
        void setEpochLongitude(double epochLongitude);
        
        /**
         * Sets (as xml) the "epoch-longitude" attribute
         */
        void xsetEpochLongitude(org.apache.xmlbeans.XmlDouble epochLongitude);
        
        /**
         * Gets the "epoch-longitudeDelta" attribute
         */
        double getEpochLongitudeDelta();
        
        /**
         * Gets (as xml) the "epoch-longitudeDelta" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetEpochLongitudeDelta();
        
        /**
         * Sets the "epoch-longitudeDelta" attribute
         */
        void setEpochLongitudeDelta(double epochLongitudeDelta);
        
        /**
         * Sets (as xml) the "epoch-longitudeDelta" attribute
         */
        void xsetEpochLongitudeDelta(org.apache.xmlbeans.XmlDouble epochLongitudeDelta);
        
        /**
         * Gets the "perihelion-angle" attribute
         */
        double getPerihelionAngle();
        
        /**
         * Gets (as xml) the "perihelion-angle" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetPerihelionAngle();
        
        /**
         * Sets the "perihelion-angle" attribute
         */
        void setPerihelionAngle(double perihelionAngle);
        
        /**
         * Sets (as xml) the "perihelion-angle" attribute
         */
        void xsetPerihelionAngle(org.apache.xmlbeans.XmlDouble perihelionAngle);
        
        /**
         * Gets the "mean-anamoly0" attribute
         */
        double getMeanAnamoly0();
        
        /**
         * Gets (as xml) the "mean-anamoly0" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetMeanAnamoly0();
        
        /**
         * Sets the "mean-anamoly0" attribute
         */
        void setMeanAnamoly0(double meanAnamoly0);
        
        /**
         * Sets (as xml) the "mean-anamoly0" attribute
         */
        void xsetMeanAnamoly0(org.apache.xmlbeans.XmlDouble meanAnamoly0);
        
        /**
         * Gets the "epochDateTime" attribute
         */
        java.util.Calendar getEpochDateTime();
        
        /**
         * Gets (as xml) the "epochDateTime" attribute
         */
        org.apache.xmlbeans.XmlDateTime xgetEpochDateTime();
        
        /**
         * True if has "epochDateTime" attribute
         */
        boolean isSetEpochDateTime();
        
        /**
         * Sets the "epochDateTime" attribute
         */
        void setEpochDateTime(java.util.Calendar epochDateTime);
        
        /**
         * Sets (as xml) the "epochDateTime" attribute
         */
        void xsetEpochDateTime(org.apache.xmlbeans.XmlDateTime epochDateTime);
        
        /**
         * Unsets the "epochDateTime" attribute
         */
        void unsetEpochDateTime();
        
        /**
         * An XML color(@orbitData).
         *
         * This is a complex type.
         */
        public interface Color extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Color.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("color2d80elemtype");
            
            /**
             * Gets the "red" attribute
             */
            int getRed();
            
            /**
             * Gets (as xml) the "red" attribute
             */
            org.apache.xmlbeans.XmlInt xgetRed();
            
            /**
             * True if has "red" attribute
             */
            boolean isSetRed();
            
            /**
             * Sets the "red" attribute
             */
            void setRed(int red);
            
            /**
             * Sets (as xml) the "red" attribute
             */
            void xsetRed(org.apache.xmlbeans.XmlInt red);
            
            /**
             * Unsets the "red" attribute
             */
            void unsetRed();
            
            /**
             * Gets the "green" attribute
             */
            int getGreen();
            
            /**
             * Gets (as xml) the "green" attribute
             */
            org.apache.xmlbeans.XmlInt xgetGreen();
            
            /**
             * True if has "green" attribute
             */
            boolean isSetGreen();
            
            /**
             * Sets the "green" attribute
             */
            void setGreen(int green);
            
            /**
             * Sets (as xml) the "green" attribute
             */
            void xsetGreen(org.apache.xmlbeans.XmlInt green);
            
            /**
             * Unsets the "green" attribute
             */
            void unsetGreen();
            
            /**
             * Gets the "blue" attribute
             */
            int getBlue();
            
            /**
             * Gets (as xml) the "blue" attribute
             */
            org.apache.xmlbeans.XmlInt xgetBlue();
            
            /**
             * True if has "blue" attribute
             */
            boolean isSetBlue();
            
            /**
             * Sets the "blue" attribute
             */
            void setBlue(int blue);
            
            /**
             * Sets (as xml) the "blue" attribute
             */
            void xsetBlue(org.apache.xmlbeans.XmlInt blue);
            
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
                public static orbitData.PlanetDocument.Planet.Color newInstance() {
                  return (orbitData.PlanetDocument.Planet.Color) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static orbitData.PlanetDocument.Planet.Color newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (orbitData.PlanetDocument.Planet.Color) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static orbitData.PlanetDocument.Planet newInstance() {
              return (orbitData.PlanetDocument.Planet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static orbitData.PlanetDocument.Planet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (orbitData.PlanetDocument.Planet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static orbitData.PlanetDocument newInstance() {
          return (orbitData.PlanetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static orbitData.PlanetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (orbitData.PlanetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static orbitData.PlanetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (orbitData.PlanetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static orbitData.PlanetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (orbitData.PlanetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static orbitData.PlanetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (orbitData.PlanetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static orbitData.PlanetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (orbitData.PlanetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static orbitData.PlanetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (orbitData.PlanetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static orbitData.PlanetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (orbitData.PlanetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static orbitData.PlanetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (orbitData.PlanetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static orbitData.PlanetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (orbitData.PlanetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static orbitData.PlanetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (orbitData.PlanetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static orbitData.PlanetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (orbitData.PlanetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static orbitData.PlanetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (orbitData.PlanetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static orbitData.PlanetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (orbitData.PlanetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static orbitData.PlanetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (orbitData.PlanetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static orbitData.PlanetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (orbitData.PlanetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static orbitData.PlanetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (orbitData.PlanetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static orbitData.PlanetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (orbitData.PlanetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
