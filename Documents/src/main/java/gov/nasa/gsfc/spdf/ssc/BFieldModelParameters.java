/*
 * XML Type:  bFieldModelParameters
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.BFieldModelParameters
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc;


/**
 * An XML bFieldModelParameters(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public interface BFieldModelParameters extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BFieldModelParameters.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("bfieldmodelparameters6e09type");
    
    /**
     * Gets the "byImf" element
     */
    float getByImf();
    
    /**
     * Gets (as xml) the "byImf" element
     */
    org.apache.xmlbeans.XmlFloat xgetByImf();
    
    /**
     * Sets the "byImf" element
     */
    void setByImf(float byImf);
    
    /**
     * Sets (as xml) the "byImf" element
     */
    void xsetByImf(org.apache.xmlbeans.XmlFloat byImf);
    
    /**
     * Gets the "bzImf" element
     */
    float getBzImf();
    
    /**
     * Gets (as xml) the "bzImf" element
     */
    org.apache.xmlbeans.XmlFloat xgetBzImf();
    
    /**
     * Sets the "bzImf" element
     */
    void setBzImf(float bzImf);
    
    /**
     * Sets (as xml) the "bzImf" element
     */
    void xsetBzImf(org.apache.xmlbeans.XmlFloat bzImf);
    
    /**
     * Gets the "dst" element
     */
    int getDst();
    
    /**
     * Gets (as xml) the "dst" element
     */
    org.apache.xmlbeans.XmlInt xgetDst();
    
    /**
     * Sets the "dst" element
     */
    void setDst(int dst);
    
    /**
     * Sets (as xml) the "dst" element
     */
    void xsetDst(org.apache.xmlbeans.XmlInt dst);
    
    /**
     * Gets the "model" element
     */
    gov.nasa.gsfc.spdf.ssc.ExternalBFieldModel.Enum getModel();
    
    /**
     * Gets (as xml) the "model" element
     */
    gov.nasa.gsfc.spdf.ssc.ExternalBFieldModel xgetModel();
    
    /**
     * True if has "model" element
     */
    boolean isSetModel();
    
    /**
     * Sets the "model" element
     */
    void setModel(gov.nasa.gsfc.spdf.ssc.ExternalBFieldModel.Enum model);
    
    /**
     * Sets (as xml) the "model" element
     */
    void xsetModel(gov.nasa.gsfc.spdf.ssc.ExternalBFieldModel model);
    
    /**
     * Unsets the "model" element
     */
    void unsetModel();
    
    /**
     * Gets the "parameterValues" element
     */
    short getParameterValues();
    
    /**
     * Gets (as xml) the "parameterValues" element
     */
    org.apache.xmlbeans.XmlShort xgetParameterValues();
    
    /**
     * Sets the "parameterValues" element
     */
    void setParameterValues(short parameterValues);
    
    /**
     * Sets (as xml) the "parameterValues" element
     */
    void xsetParameterValues(org.apache.xmlbeans.XmlShort parameterValues);
    
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
     * Gets the "useFixedValues" element
     */
    boolean getUseFixedValues();
    
    /**
     * Gets (as xml) the "useFixedValues" element
     */
    org.apache.xmlbeans.XmlBoolean xgetUseFixedValues();
    
    /**
     * Sets the "useFixedValues" element
     */
    void setUseFixedValues(boolean useFixedValues);
    
    /**
     * Sets (as xml) the "useFixedValues" element
     */
    void xsetUseFixedValues(org.apache.xmlbeans.XmlBoolean useFixedValues);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nasa.gsfc.spdf.ssc.BFieldModelParameters newInstance() {
          return (gov.nasa.gsfc.spdf.ssc.BFieldModelParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldModelParameters newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nasa.gsfc.spdf.ssc.BFieldModelParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nasa.gsfc.spdf.ssc.BFieldModelParameters parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldModelParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldModelParameters parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldModelParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nasa.gsfc.spdf.ssc.BFieldModelParameters parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldModelParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldModelParameters parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldModelParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldModelParameters parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldModelParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldModelParameters parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldModelParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldModelParameters parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldModelParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldModelParameters parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldModelParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldModelParameters parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldModelParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldModelParameters parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldModelParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldModelParameters parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldModelParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldModelParameters parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldModelParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldModelParameters parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldModelParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.BFieldModelParameters parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldModelParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.BFieldModelParameters parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldModelParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.BFieldModelParameters parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.BFieldModelParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
