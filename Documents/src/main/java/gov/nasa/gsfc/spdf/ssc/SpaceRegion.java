/*
 * XML Type:  spaceRegion
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.SpaceRegion
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc;


/**
 * An XML spaceRegion(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is an atomic type that is a restriction of gov.nasa.gsfc.spdf.ssc.SpaceRegion.
 */
public interface SpaceRegion extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SpaceRegion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("spaceregionc2eatype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum INTERPLANETARY_MEDIUM = Enum.forString("INTERPLANETARY_MEDIUM");
    static final Enum DAYSIDE_MAGNETOSHEATH = Enum.forString("DAYSIDE_MAGNETOSHEATH");
    static final Enum NIGHTSIDE_MAGNETOSHEATH = Enum.forString("NIGHTSIDE_MAGNETOSHEATH");
    static final Enum DAYSIDE_MAGNETOSPHERE = Enum.forString("DAYSIDE_MAGNETOSPHERE");
    static final Enum NIGHTSIDE_MAGNETOSPHERE = Enum.forString("NIGHTSIDE_MAGNETOSPHERE");
    static final Enum PLASMA_SHEET = Enum.forString("PLASMA_SHEET");
    static final Enum TAIL_LOBE = Enum.forString("TAIL_LOBE");
    static final Enum LOW_LATITUDE_BOUNDARY_LAYER = Enum.forString("LOW_LATITUDE_BOUNDARY_LAYER");
    static final Enum HIGH_LATITUDE_BOUNDARY_LAYER = Enum.forString("HIGH_LATITUDE_BOUNDARY_LAYER");
    static final Enum DAYSIDE_PLASMASPHERE = Enum.forString("DAYSIDE_PLASMASPHERE");
    static final Enum NIGHTSIDE_PLASMASPHERE = Enum.forString("NIGHTSIDE_PLASMASPHERE");
    
    static final int INT_INTERPLANETARY_MEDIUM = Enum.INT_INTERPLANETARY_MEDIUM;
    static final int INT_DAYSIDE_MAGNETOSHEATH = Enum.INT_DAYSIDE_MAGNETOSHEATH;
    static final int INT_NIGHTSIDE_MAGNETOSHEATH = Enum.INT_NIGHTSIDE_MAGNETOSHEATH;
    static final int INT_DAYSIDE_MAGNETOSPHERE = Enum.INT_DAYSIDE_MAGNETOSPHERE;
    static final int INT_NIGHTSIDE_MAGNETOSPHERE = Enum.INT_NIGHTSIDE_MAGNETOSPHERE;
    static final int INT_PLASMA_SHEET = Enum.INT_PLASMA_SHEET;
    static final int INT_TAIL_LOBE = Enum.INT_TAIL_LOBE;
    static final int INT_LOW_LATITUDE_BOUNDARY_LAYER = Enum.INT_LOW_LATITUDE_BOUNDARY_LAYER;
    static final int INT_HIGH_LATITUDE_BOUNDARY_LAYER = Enum.INT_HIGH_LATITUDE_BOUNDARY_LAYER;
    static final int INT_DAYSIDE_PLASMASPHERE = Enum.INT_DAYSIDE_PLASMASPHERE;
    static final int INT_NIGHTSIDE_PLASMASPHERE = Enum.INT_NIGHTSIDE_PLASMASPHERE;
    
    /**
     * Enumeration value class for gov.nasa.gsfc.spdf.ssc.SpaceRegion.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_INTERPLANETARY_MEDIUM
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
        
        static final int INT_INTERPLANETARY_MEDIUM = 1;
        static final int INT_DAYSIDE_MAGNETOSHEATH = 2;
        static final int INT_NIGHTSIDE_MAGNETOSHEATH = 3;
        static final int INT_DAYSIDE_MAGNETOSPHERE = 4;
        static final int INT_NIGHTSIDE_MAGNETOSPHERE = 5;
        static final int INT_PLASMA_SHEET = 6;
        static final int INT_TAIL_LOBE = 7;
        static final int INT_LOW_LATITUDE_BOUNDARY_LAYER = 8;
        static final int INT_HIGH_LATITUDE_BOUNDARY_LAYER = 9;
        static final int INT_DAYSIDE_PLASMASPHERE = 10;
        static final int INT_NIGHTSIDE_PLASMASPHERE = 11;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("INTERPLANETARY_MEDIUM", INT_INTERPLANETARY_MEDIUM),
                new Enum("DAYSIDE_MAGNETOSHEATH", INT_DAYSIDE_MAGNETOSHEATH),
                new Enum("NIGHTSIDE_MAGNETOSHEATH", INT_NIGHTSIDE_MAGNETOSHEATH),
                new Enum("DAYSIDE_MAGNETOSPHERE", INT_DAYSIDE_MAGNETOSPHERE),
                new Enum("NIGHTSIDE_MAGNETOSPHERE", INT_NIGHTSIDE_MAGNETOSPHERE),
                new Enum("PLASMA_SHEET", INT_PLASMA_SHEET),
                new Enum("TAIL_LOBE", INT_TAIL_LOBE),
                new Enum("LOW_LATITUDE_BOUNDARY_LAYER", INT_LOW_LATITUDE_BOUNDARY_LAYER),
                new Enum("HIGH_LATITUDE_BOUNDARY_LAYER", INT_HIGH_LATITUDE_BOUNDARY_LAYER),
                new Enum("DAYSIDE_PLASMASPHERE", INT_DAYSIDE_PLASMASPHERE),
                new Enum("NIGHTSIDE_PLASMASPHERE", INT_NIGHTSIDE_PLASMASPHERE),
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
        public static gov.nasa.gsfc.spdf.ssc.SpaceRegion newValue(java.lang.Object obj) {
          return (gov.nasa.gsfc.spdf.ssc.SpaceRegion) type.newValue( obj ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SpaceRegion newInstance() {
          return (gov.nasa.gsfc.spdf.ssc.SpaceRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SpaceRegion newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nasa.gsfc.spdf.ssc.SpaceRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nasa.gsfc.spdf.ssc.SpaceRegion parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.SpaceRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SpaceRegion parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.SpaceRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nasa.gsfc.spdf.ssc.SpaceRegion parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.SpaceRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SpaceRegion parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.SpaceRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SpaceRegion parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.SpaceRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SpaceRegion parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.SpaceRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SpaceRegion parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.SpaceRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SpaceRegion parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.SpaceRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SpaceRegion parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.SpaceRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SpaceRegion parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.SpaceRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SpaceRegion parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.SpaceRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SpaceRegion parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.SpaceRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SpaceRegion parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.SpaceRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.SpaceRegion parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.SpaceRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.SpaceRegion parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.SpaceRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.SpaceRegion parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.SpaceRegion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
