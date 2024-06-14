/*
 * XML Type:  orbitGraphOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc;


/**
 * An XML orbitGraphOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public interface OrbitGraphOptions extends gov.nasa.gsfc.spdf.ssc.GraphOptions
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrbitGraphOptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("orbitgraphoptions20eatype");
    
    /**
     * Gets the "combined" element
     */
    boolean getCombined();
    
    /**
     * Gets (as xml) the "combined" element
     */
    org.apache.xmlbeans.XmlBoolean xgetCombined();
    
    /**
     * Sets the "combined" element
     */
    void setCombined(boolean combined);
    
    /**
     * Sets (as xml) the "combined" element
     */
    void xsetCombined(org.apache.xmlbeans.XmlBoolean combined);
    
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
     * Gets the "evenAxesScales" element
     */
    boolean getEvenAxesScales();
    
    /**
     * Gets (as xml) the "evenAxesScales" element
     */
    org.apache.xmlbeans.XmlBoolean xgetEvenAxesScales();
    
    /**
     * Sets the "evenAxesScales" element
     */
    void setEvenAxesScales(boolean evenAxesScales);
    
    /**
     * Sets (as xml) the "evenAxesScales" element
     */
    void xsetEvenAxesScales(org.apache.xmlbeans.XmlBoolean evenAxesScales);
    
    /**
     * Gets the "formatOptions" element
     */
    gov.nasa.gsfc.spdf.ssc.GraphFormatOptions getFormatOptions();
    
    /**
     * True if has "formatOptions" element
     */
    boolean isSetFormatOptions();
    
    /**
     * Sets the "formatOptions" element
     */
    void setFormatOptions(gov.nasa.gsfc.spdf.ssc.GraphFormatOptions formatOptions);
    
    /**
     * Appends and returns a new empty "formatOptions" element
     */
    gov.nasa.gsfc.spdf.ssc.GraphFormatOptions addNewFormatOptions();
    
    /**
     * Unsets the "formatOptions" element
     */
    void unsetFormatOptions();
    
    /**
     * Gets the "imfBz" element
     */
    float getImfBz();
    
    /**
     * Gets (as xml) the "imfBz" element
     */
    org.apache.xmlbeans.XmlFloat xgetImfBz();
    
    /**
     * Sets the "imfBz" element
     */
    void setImfBz(float imfBz);
    
    /**
     * Sets (as xml) the "imfBz" element
     */
    void xsetImfBz(org.apache.xmlbeans.XmlFloat imfBz);
    
    /**
     * Gets the "manualScale" element
     */
    gov.nasa.gsfc.spdf.ssc.GraphScale getManualScale();
    
    /**
     * True if has "manualScale" element
     */
    boolean isSetManualScale();
    
    /**
     * Sets the "manualScale" element
     */
    void setManualScale(gov.nasa.gsfc.spdf.ssc.GraphScale manualScale);
    
    /**
     * Appends and returns a new empty "manualScale" element
     */
    gov.nasa.gsfc.spdf.ssc.GraphScale addNewManualScale();
    
    /**
     * Unsets the "manualScale" element
     */
    void unsetManualScale();
    
    /**
     * Gets the "showBowShockMagnetopause" element
     */
    boolean getShowBowShockMagnetopause();
    
    /**
     * Gets (as xml) the "showBowShockMagnetopause" element
     */
    org.apache.xmlbeans.XmlBoolean xgetShowBowShockMagnetopause();
    
    /**
     * Sets the "showBowShockMagnetopause" element
     */
    void setShowBowShockMagnetopause(boolean showBowShockMagnetopause);
    
    /**
     * Sets (as xml) the "showBowShockMagnetopause" element
     */
    void xsetShowBowShockMagnetopause(org.apache.xmlbeans.XmlBoolean showBowShockMagnetopause);
    
    /**
     * Gets the "solarWindPressure" element
     */
    float getSolarWindPressure();
    
    /**
     * Gets (as xml) the "solarWindPressure" element
     */
    org.apache.xmlbeans.XmlFloat xgetSolarWindPressure();
    
    /**
     * Sets the "solarWindPressure" element
     */
    void setSolarWindPressure(float solarWindPressure);
    
    /**
     * Sets (as xml) the "solarWindPressure" element
     */
    void xsetSolarWindPressure(org.apache.xmlbeans.XmlFloat solarWindPressure);
    
    /**
     * Gets the "sunToRight" element
     */
    boolean getSunToRight();
    
    /**
     * Gets (as xml) the "sunToRight" element
     */
    org.apache.xmlbeans.XmlBoolean xgetSunToRight();
    
    /**
     * Sets the "sunToRight" element
     */
    void setSunToRight(boolean sunToRight);
    
    /**
     * Sets (as xml) the "sunToRight" element
     */
    void xsetSunToRight(org.apache.xmlbeans.XmlBoolean sunToRight);
    
    /**
     * Gets the "xrView" element
     */
    boolean getXrView();
    
    /**
     * Gets (as xml) the "xrView" element
     */
    org.apache.xmlbeans.XmlBoolean xgetXrView();
    
    /**
     * Sets the "xrView" element
     */
    void setXrView(boolean xrView);
    
    /**
     * Sets (as xml) the "xrView" element
     */
    void xsetXrView(org.apache.xmlbeans.XmlBoolean xrView);
    
    /**
     * Gets the "xyView" element
     */
    boolean getXyView();
    
    /**
     * Gets (as xml) the "xyView" element
     */
    org.apache.xmlbeans.XmlBoolean xgetXyView();
    
    /**
     * Sets the "xyView" element
     */
    void setXyView(boolean xyView);
    
    /**
     * Sets (as xml) the "xyView" element
     */
    void xsetXyView(org.apache.xmlbeans.XmlBoolean xyView);
    
    /**
     * Gets the "xzView" element
     */
    boolean getXzView();
    
    /**
     * Gets (as xml) the "xzView" element
     */
    org.apache.xmlbeans.XmlBoolean xgetXzView();
    
    /**
     * Sets the "xzView" element
     */
    void setXzView(boolean xzView);
    
    /**
     * Sets (as xml) the "xzView" element
     */
    void xsetXzView(org.apache.xmlbeans.XmlBoolean xzView);
    
    /**
     * Gets the "yzView" element
     */
    boolean getYzView();
    
    /**
     * Gets (as xml) the "yzView" element
     */
    org.apache.xmlbeans.XmlBoolean xgetYzView();
    
    /**
     * Sets the "yzView" element
     */
    void setYzView(boolean yzView);
    
    /**
     * Sets (as xml) the "yzView" element
     */
    void xsetYzView(org.apache.xmlbeans.XmlBoolean yzView);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions newInstance() {
          return (gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
