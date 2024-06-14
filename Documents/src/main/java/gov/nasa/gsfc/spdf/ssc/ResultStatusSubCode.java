/*
 * XML Type:  resultStatusSubCode
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc;


/**
 * An XML resultStatusSubCode(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is an atomic type that is a restriction of gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode.
 */
public interface ResultStatusSubCode extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResultStatusSubCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("resultstatussubcode7626type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum SUCCESS = Enum.forString("SUCCESS");
    static final Enum MISSING_REQUEST = Enum.forString("MISSING_REQUEST");
    static final Enum MISSING_SATELLITES = Enum.forString("MISSING_SATELLITES");
    static final Enum INVALID_BEGIN_TIME = Enum.forString("INVALID_BEGIN_TIME");
    static final Enum INVALID_END_TIME = Enum.forString("INVALID_END_TIME");
    static final Enum INVALID_SATELLITE = Enum.forString("INVALID_SATELLITE");
    static final Enum INVALID_TIME_RANGE = Enum.forString("INVALID_TIME_RANGE");
    static final Enum INVALID_RESOLUTION_FACTOR = Enum.forString("INVALID_RESOLUTION_FACTOR");
    static final Enum MISSING_OUTPUT_OPTIONS = Enum.forString("MISSING_OUTPUT_OPTIONS");
    static final Enum MISSING_COORD_OPTIONS = Enum.forString("MISSING_COORD_OPTIONS");
    static final Enum MISSING_COORD_SYSTEM = Enum.forString("MISSING_COORD_SYSTEM");
    static final Enum INVALID_COORD_SYSTEM = Enum.forString("INVALID_COORD_SYSTEM");
    static final Enum MISSING_COORD_COMPONENT = Enum.forString("MISSING_COORD_COMPONENT");
    static final Enum MISSING_GRAPH_OPTIONS = Enum.forString("MISSING_GRAPH_OPTIONS");
    static final Enum MISSING_COORDINATE_SYSTEM = Enum.forString("MISSING_COORDINATE_SYSTEM");
    static final Enum MISSING_COORDINATE_COMPONENT = Enum.forString("MISSING_COORDINATE_COMPONENT");
    static final Enum SERVER_ERROR = Enum.forString("SERVER_ERROR");
    
    static final int INT_SUCCESS = Enum.INT_SUCCESS;
    static final int INT_MISSING_REQUEST = Enum.INT_MISSING_REQUEST;
    static final int INT_MISSING_SATELLITES = Enum.INT_MISSING_SATELLITES;
    static final int INT_INVALID_BEGIN_TIME = Enum.INT_INVALID_BEGIN_TIME;
    static final int INT_INVALID_END_TIME = Enum.INT_INVALID_END_TIME;
    static final int INT_INVALID_SATELLITE = Enum.INT_INVALID_SATELLITE;
    static final int INT_INVALID_TIME_RANGE = Enum.INT_INVALID_TIME_RANGE;
    static final int INT_INVALID_RESOLUTION_FACTOR = Enum.INT_INVALID_RESOLUTION_FACTOR;
    static final int INT_MISSING_OUTPUT_OPTIONS = Enum.INT_MISSING_OUTPUT_OPTIONS;
    static final int INT_MISSING_COORD_OPTIONS = Enum.INT_MISSING_COORD_OPTIONS;
    static final int INT_MISSING_COORD_SYSTEM = Enum.INT_MISSING_COORD_SYSTEM;
    static final int INT_INVALID_COORD_SYSTEM = Enum.INT_INVALID_COORD_SYSTEM;
    static final int INT_MISSING_COORD_COMPONENT = Enum.INT_MISSING_COORD_COMPONENT;
    static final int INT_MISSING_GRAPH_OPTIONS = Enum.INT_MISSING_GRAPH_OPTIONS;
    static final int INT_MISSING_COORDINATE_SYSTEM = Enum.INT_MISSING_COORDINATE_SYSTEM;
    static final int INT_MISSING_COORDINATE_COMPONENT = Enum.INT_MISSING_COORDINATE_COMPONENT;
    static final int INT_SERVER_ERROR = Enum.INT_SERVER_ERROR;
    
    /**
     * Enumeration value class for gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_SUCCESS
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_SUCCESS = 1;
        static final int INT_MISSING_REQUEST = 2;
        static final int INT_MISSING_SATELLITES = 3;
        static final int INT_INVALID_BEGIN_TIME = 4;
        static final int INT_INVALID_END_TIME = 5;
        static final int INT_INVALID_SATELLITE = 6;
        static final int INT_INVALID_TIME_RANGE = 7;
        static final int INT_INVALID_RESOLUTION_FACTOR = 8;
        static final int INT_MISSING_OUTPUT_OPTIONS = 9;
        static final int INT_MISSING_COORD_OPTIONS = 10;
        static final int INT_MISSING_COORD_SYSTEM = 11;
        static final int INT_INVALID_COORD_SYSTEM = 12;
        static final int INT_MISSING_COORD_COMPONENT = 13;
        static final int INT_MISSING_GRAPH_OPTIONS = 14;
        static final int INT_MISSING_COORDINATE_SYSTEM = 15;
        static final int INT_MISSING_COORDINATE_COMPONENT = 16;
        static final int INT_SERVER_ERROR = 17;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("SUCCESS", INT_SUCCESS),
                new Enum("MISSING_REQUEST", INT_MISSING_REQUEST),
                new Enum("MISSING_SATELLITES", INT_MISSING_SATELLITES),
                new Enum("INVALID_BEGIN_TIME", INT_INVALID_BEGIN_TIME),
                new Enum("INVALID_END_TIME", INT_INVALID_END_TIME),
                new Enum("INVALID_SATELLITE", INT_INVALID_SATELLITE),
                new Enum("INVALID_TIME_RANGE", INT_INVALID_TIME_RANGE),
                new Enum("INVALID_RESOLUTION_FACTOR", INT_INVALID_RESOLUTION_FACTOR),
                new Enum("MISSING_OUTPUT_OPTIONS", INT_MISSING_OUTPUT_OPTIONS),
                new Enum("MISSING_COORD_OPTIONS", INT_MISSING_COORD_OPTIONS),
                new Enum("MISSING_COORD_SYSTEM", INT_MISSING_COORD_SYSTEM),
                new Enum("INVALID_COORD_SYSTEM", INT_INVALID_COORD_SYSTEM),
                new Enum("MISSING_COORD_COMPONENT", INT_MISSING_COORD_COMPONENT),
                new Enum("MISSING_GRAPH_OPTIONS", INT_MISSING_GRAPH_OPTIONS),
                new Enum("MISSING_COORDINATE_SYSTEM", INT_MISSING_COORDINATE_SYSTEM),
                new Enum("MISSING_COORDINATE_COMPONENT", INT_MISSING_COORDINATE_COMPONENT),
                new Enum("SERVER_ERROR", INT_SERVER_ERROR),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode newValue(java.lang.Object obj) {
          return (gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode) type.newValue( obj ); }
        
        public static gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode newInstance() {
          return (gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
