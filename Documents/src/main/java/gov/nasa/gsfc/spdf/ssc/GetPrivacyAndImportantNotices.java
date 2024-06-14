/*
 * XML Type:  getPrivacyAndImportantNotices
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc;


/**
 * An XML getPrivacyAndImportantNotices(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public interface GetPrivacyAndImportantNotices extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetPrivacyAndImportantNotices.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("getprivacyandimportantnotices0c66type");
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices newInstance() {
          return (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nasa.gsfc.spdf.ssc.GetPrivacyAndImportantNotices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
