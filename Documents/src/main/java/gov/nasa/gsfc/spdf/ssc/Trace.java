/*
 * XML Type:  trace
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.Trace
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc;


/**
 * An XML trace(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is an atomic type that is a restriction of gov.nasa.gsfc.spdf.ssc.Trace.
 */
public interface Trace extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Trace.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("traced69ftype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum RADIAL = Enum.forString("RADIAL");
    static final Enum B_FIELD_NORTH = Enum.forString("B_FIELD_NORTH");
    static final Enum B_FIELD_SOUTH = Enum.forString("B_FIELD_SOUTH");
    
    static final int INT_RADIAL = Enum.INT_RADIAL;
    static final int INT_B_FIELD_NORTH = Enum.INT_B_FIELD_NORTH;
    static final int INT_B_FIELD_SOUTH = Enum.INT_B_FIELD_SOUTH;
    
    /**
     * Enumeration value class for gov.nasa.gsfc.spdf.ssc.Trace.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_RADIAL
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
        
        static final int INT_RADIAL = 1;
        static final int INT_B_FIELD_NORTH = 2;
        static final int INT_B_FIELD_SOUTH = 3;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("RADIAL", INT_RADIAL),
                new Enum("B_FIELD_NORTH", INT_B_FIELD_NORTH),
                new Enum("B_FIELD_SOUTH", INT_B_FIELD_SOUTH),
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
        public static gov.nasa.gsfc.spdf.ssc.Trace newValue(java.lang.Object obj) {
          return (gov.nasa.gsfc.spdf.ssc.Trace) type.newValue( obj ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Trace newInstance() {
          return (gov.nasa.gsfc.spdf.ssc.Trace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Trace newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nasa.gsfc.spdf.ssc.Trace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nasa.gsfc.spdf.ssc.Trace parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.Trace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Trace parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.Trace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nasa.gsfc.spdf.ssc.Trace parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.Trace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Trace parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.Trace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Trace parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.Trace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Trace parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.Trace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Trace parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.Trace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Trace parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.Trace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Trace parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.Trace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Trace parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.Trace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Trace parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.Trace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Trace parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.Trace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Trace parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.Trace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.Trace parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.Trace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.Trace parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.Trace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.Trace parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.Trace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
