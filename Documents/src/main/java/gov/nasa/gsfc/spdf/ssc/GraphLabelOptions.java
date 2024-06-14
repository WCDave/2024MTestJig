/*
 * XML Type:  graphLabelOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GraphLabelOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc;


/**
 * An XML graphLabelOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public interface GraphLabelOptions extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GraphLabelOptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("graphlabeloptions368ctype");
    
    /**
     * Gets the "dayOfYearLabelFrequency" element
     */
    int getDayOfYearLabelFrequency();
    
    /**
     * Gets (as xml) the "dayOfYearLabelFrequency" element
     */
    org.apache.xmlbeans.XmlInt xgetDayOfYearLabelFrequency();
    
    /**
     * Sets the "dayOfYearLabelFrequency" element
     */
    void setDayOfYearLabelFrequency(int dayOfYearLabelFrequency);
    
    /**
     * Sets (as xml) the "dayOfYearLabelFrequency" element
     */
    void xsetDayOfYearLabelFrequency(org.apache.xmlbeans.XmlInt dayOfYearLabelFrequency);
    
    /**
     * Gets the "hourLabelFrequency" element
     */
    int getHourLabelFrequency();
    
    /**
     * Gets (as xml) the "hourLabelFrequency" element
     */
    org.apache.xmlbeans.XmlInt xgetHourLabelFrequency();
    
    /**
     * Sets the "hourLabelFrequency" element
     */
    void setHourLabelFrequency(int hourLabelFrequency);
    
    /**
     * Sets (as xml) the "hourLabelFrequency" element
     */
    void xsetHourLabelFrequency(org.apache.xmlbeans.XmlInt hourLabelFrequency);
    
    /**
     * Gets the "hourTickMarkFrequency" element
     */
    int getHourTickMarkFrequency();
    
    /**
     * Gets (as xml) the "hourTickMarkFrequency" element
     */
    org.apache.xmlbeans.XmlInt xgetHourTickMarkFrequency();
    
    /**
     * Sets the "hourTickMarkFrequency" element
     */
    void setHourTickMarkFrequency(int hourTickMarkFrequency);
    
    /**
     * Sets (as xml) the "hourTickMarkFrequency" element
     */
    void xsetHourTickMarkFrequency(org.apache.xmlbeans.XmlInt hourTickMarkFrequency);
    
    /**
     * Gets the "minuteLabelFrequency" element
     */
    int getMinuteLabelFrequency();
    
    /**
     * Gets (as xml) the "minuteLabelFrequency" element
     */
    org.apache.xmlbeans.XmlInt xgetMinuteLabelFrequency();
    
    /**
     * Sets the "minuteLabelFrequency" element
     */
    void setMinuteLabelFrequency(int minuteLabelFrequency);
    
    /**
     * Sets (as xml) the "minuteLabelFrequency" element
     */
    void xsetMinuteLabelFrequency(org.apache.xmlbeans.XmlInt minuteLabelFrequency);
    
    /**
     * Gets the "minuteTickMarkFrequency" element
     */
    int getMinuteTickMarkFrequency();
    
    /**
     * Gets (as xml) the "minuteTickMarkFrequency" element
     */
    org.apache.xmlbeans.XmlInt xgetMinuteTickMarkFrequency();
    
    /**
     * Sets the "minuteTickMarkFrequency" element
     */
    void setMinuteTickMarkFrequency(int minuteTickMarkFrequency);
    
    /**
     * Sets (as xml) the "minuteTickMarkFrequency" element
     */
    void xsetMinuteTickMarkFrequency(org.apache.xmlbeans.XmlInt minuteTickMarkFrequency);
    
    /**
     * Gets the "monthDayOfMonthLabel" element
     */
    boolean getMonthDayOfMonthLabel();
    
    /**
     * Gets (as xml) the "monthDayOfMonthLabel" element
     */
    org.apache.xmlbeans.XmlBoolean xgetMonthDayOfMonthLabel();
    
    /**
     * Sets the "monthDayOfMonthLabel" element
     */
    void setMonthDayOfMonthLabel(boolean monthDayOfMonthLabel);
    
    /**
     * Sets (as xml) the "monthDayOfMonthLabel" element
     */
    void xsetMonthDayOfMonthLabel(org.apache.xmlbeans.XmlBoolean monthDayOfMonthLabel);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nasa.gsfc.spdf.ssc.GraphLabelOptions newInstance() {
          return (gov.nasa.gsfc.spdf.ssc.GraphLabelOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphLabelOptions newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nasa.gsfc.spdf.ssc.GraphLabelOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nasa.gsfc.spdf.ssc.GraphLabelOptions parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.GraphLabelOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphLabelOptions parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.GraphLabelOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nasa.gsfc.spdf.ssc.GraphLabelOptions parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.GraphLabelOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphLabelOptions parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.GraphLabelOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphLabelOptions parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.GraphLabelOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphLabelOptions parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.GraphLabelOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphLabelOptions parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.GraphLabelOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphLabelOptions parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.GraphLabelOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphLabelOptions parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.GraphLabelOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphLabelOptions parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.GraphLabelOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphLabelOptions parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.GraphLabelOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphLabelOptions parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.GraphLabelOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphLabelOptions parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.GraphLabelOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GraphLabelOptions parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.GraphLabelOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.GraphLabelOptions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.GraphLabelOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.GraphLabelOptions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.GraphLabelOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
