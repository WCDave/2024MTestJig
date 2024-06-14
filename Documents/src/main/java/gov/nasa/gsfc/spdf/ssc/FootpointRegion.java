/*
 * XML Type:  footpointRegion
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.FootpointRegion
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc;


/**
 * An XML footpointRegion(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is an atomic type that is a restriction of gov.nasa.gsfc.spdf.ssc.FootpointRegion.
 */
public interface FootpointRegion extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FootpointRegion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("footpointregion330etype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NOT_APPLICABLE = Enum.forString("NOT_APPLICABLE");
    static final Enum NORTH_CUSP = Enum.forString("NORTH_CUSP");
    static final Enum SOUTH_CUSP = Enum.forString("SOUTH_CUSP");
    static final Enum NORTH_CLEFT = Enum.forString("NORTH_CLEFT");
    static final Enum SOUTH_CLEFT = Enum.forString("SOUTH_CLEFT");
    static final Enum NORTH_AURORAL_OVAL = Enum.forString("NORTH_AURORAL_OVAL");
    static final Enum SOUTH_AURORAL_OVAL = Enum.forString("SOUTH_AURORAL_OVAL");
    static final Enum NORTH_POLAR_CAP = Enum.forString("NORTH_POLAR_CAP");
    static final Enum SOUTH_POLAR_CAP = Enum.forString("SOUTH_POLAR_CAP");
    static final Enum NORTH_MID_LATITUDE = Enum.forString("NORTH_MID_LATITUDE");
    static final Enum SOUTH_MID_LATITUDE = Enum.forString("SOUTH_MID_LATITUDE");
    static final Enum LOW_LATITUDE = Enum.forString("LOW_LATITUDE");
    
    static final int INT_NOT_APPLICABLE = Enum.INT_NOT_APPLICABLE;
    static final int INT_NORTH_CUSP = Enum.INT_NORTH_CUSP;
    static final int INT_SOUTH_CUSP = Enum.INT_SOUTH_CUSP;
    static final int INT_NORTH_CLEFT = Enum.INT_NORTH_CLEFT;
    static final int INT_SOUTH_CLEFT = Enum.INT_SOUTH_CLEFT;
    static final int INT_NORTH_AURORAL_OVAL = Enum.INT_NORTH_AURORAL_OVAL;
    static final int INT_SOUTH_AURORAL_OVAL = Enum.INT_SOUTH_AURORAL_OVAL;
    static final int INT_NORTH_POLAR_CAP = Enum.INT_NORTH_POLAR_CAP;
    static final int INT_SOUTH_POLAR_CAP = Enum.INT_SOUTH_POLAR_CAP;
    static final int INT_NORTH_MID_LATITUDE = Enum.INT_NORTH_MID_LATITUDE;
    static final int INT_SOUTH_MID_LATITUDE = Enum.INT_SOUTH_MID_LATITUDE;
    static final int INT_LOW_LATITUDE = Enum.INT_LOW_LATITUDE;
    
    /**
     * Enumeration value class for gov.nasa.gsfc.spdf.ssc.FootpointRegion.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_NOT_APPLICABLE
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
        
        static final int INT_NOT_APPLICABLE = 1;
        static final int INT_NORTH_CUSP = 2;
        static final int INT_SOUTH_CUSP = 3;
        static final int INT_NORTH_CLEFT = 4;
        static final int INT_SOUTH_CLEFT = 5;
        static final int INT_NORTH_AURORAL_OVAL = 6;
        static final int INT_SOUTH_AURORAL_OVAL = 7;
        static final int INT_NORTH_POLAR_CAP = 8;
        static final int INT_SOUTH_POLAR_CAP = 9;
        static final int INT_NORTH_MID_LATITUDE = 10;
        static final int INT_SOUTH_MID_LATITUDE = 11;
        static final int INT_LOW_LATITUDE = 12;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("NOT_APPLICABLE", INT_NOT_APPLICABLE),
                new Enum("NORTH_CUSP", INT_NORTH_CUSP),
                new Enum("SOUTH_CUSP", INT_SOUTH_CUSP),
                new Enum("NORTH_CLEFT", INT_NORTH_CLEFT),
                new Enum("SOUTH_CLEFT", INT_SOUTH_CLEFT),
                new Enum("NORTH_AURORAL_OVAL", INT_NORTH_AURORAL_OVAL),
                new Enum("SOUTH_AURORAL_OVAL", INT_SOUTH_AURORAL_OVAL),
                new Enum("NORTH_POLAR_CAP", INT_NORTH_POLAR_CAP),
                new Enum("SOUTH_POLAR_CAP", INT_SOUTH_POLAR_CAP),
                new Enum("NORTH_MID_LATITUDE", INT_NORTH_MID_LATITUDE),
                new Enum("SOUTH_MID_LATITUDE", INT_SOUTH_MID_LATITUDE),
                new Enum("LOW_LATITUDE", INT_LOW_LATITUDE),
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
        public static gov.nasa.gsfc.spdf.ssc.FootpointRegion newValue(java.lang.Object obj) {
          return (gov.nasa.gsfc.spdf.ssc.FootpointRegion) type.newValue( obj ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FootpointRegion newInstance() {
          return (gov.nasa.gsfc.spdf.ssc.FootpointRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FootpointRegion newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nasa.gsfc.spdf.ssc.FootpointRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nasa.gsfc.spdf.ssc.FootpointRegion parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.FootpointRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FootpointRegion parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.FootpointRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nasa.gsfc.spdf.ssc.FootpointRegion parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.FootpointRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FootpointRegion parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.FootpointRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FootpointRegion parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.FootpointRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FootpointRegion parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.FootpointRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FootpointRegion parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.FootpointRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FootpointRegion parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.FootpointRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FootpointRegion parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.FootpointRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FootpointRegion parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.FootpointRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FootpointRegion parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.FootpointRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FootpointRegion parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.FootpointRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FootpointRegion parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.FootpointRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.FootpointRegion parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.FootpointRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.FootpointRegion parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.FootpointRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.FootpointRegion parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.FootpointRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
