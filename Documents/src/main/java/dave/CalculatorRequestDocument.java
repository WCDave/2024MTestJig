/*
 * An XML document type.
 * Localname: CalculatorRequest
 * Namespace: dave
 * Java type: dave.CalculatorRequestDocument
 *
 * Automatically generated - do not modify.
 */
package dave;


/**
 * A document containing one CalculatorRequest(@dave) element.
 *
 * This is a complex type.
 */
public interface CalculatorRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CalculatorRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("calculatorrequest8ef8doctype");
    
    /**
     * Gets the "CalculatorRequest" element
     */
    dave.CalculatorRequestDocument.CalculatorRequest getCalculatorRequest();
    
    /**
     * Sets the "CalculatorRequest" element
     */
    void setCalculatorRequest(dave.CalculatorRequestDocument.CalculatorRequest calculatorRequest);
    
    /**
     * Appends and returns a new empty "CalculatorRequest" element
     */
    dave.CalculatorRequestDocument.CalculatorRequest addNewCalculatorRequest();
    
    /**
     * An XML CalculatorRequest(@dave).
     *
     * This is a complex type.
     */
    public interface CalculatorRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CalculatorRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("calculatorrequesta59felemtype");
        
        /**
         * Gets the "firstOperand" element
         */
        float getFirstOperand();
        
        /**
         * Gets (as xml) the "firstOperand" element
         */
        org.apache.xmlbeans.XmlFloat xgetFirstOperand();
        
        /**
         * Sets the "firstOperand" element
         */
        void setFirstOperand(float firstOperand);
        
        /**
         * Sets (as xml) the "firstOperand" element
         */
        void xsetFirstOperand(org.apache.xmlbeans.XmlFloat firstOperand);
        
        /**
         * Gets the "secondOperand" element
         */
        float getSecondOperand();
        
        /**
         * Gets (as xml) the "secondOperand" element
         */
        org.apache.xmlbeans.XmlFloat xgetSecondOperand();
        
        /**
         * Sets the "secondOperand" element
         */
        void setSecondOperand(float secondOperand);
        
        /**
         * Sets (as xml) the "secondOperand" element
         */
        void xsetSecondOperand(org.apache.xmlbeans.XmlFloat secondOperand);
        
        /**
         * Gets the "operation" element
         */
        dave.Operation.Enum getOperation();
        
        /**
         * Gets (as xml) the "operation" element
         */
        dave.Operation xgetOperation();
        
        /**
         * Sets the "operation" element
         */
        void setOperation(dave.Operation.Enum operation);
        
        /**
         * Sets (as xml) the "operation" element
         */
        void xsetOperation(dave.Operation operation);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static dave.CalculatorRequestDocument.CalculatorRequest newInstance() {
              return (dave.CalculatorRequestDocument.CalculatorRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static dave.CalculatorRequestDocument.CalculatorRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (dave.CalculatorRequestDocument.CalculatorRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static dave.CalculatorRequestDocument newInstance() {
          return (dave.CalculatorRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static dave.CalculatorRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (dave.CalculatorRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static dave.CalculatorRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (dave.CalculatorRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static dave.CalculatorRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dave.CalculatorRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static dave.CalculatorRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dave.CalculatorRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static dave.CalculatorRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dave.CalculatorRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static dave.CalculatorRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dave.CalculatorRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static dave.CalculatorRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dave.CalculatorRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static dave.CalculatorRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dave.CalculatorRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static dave.CalculatorRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dave.CalculatorRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static dave.CalculatorRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dave.CalculatorRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static dave.CalculatorRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dave.CalculatorRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static dave.CalculatorRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (dave.CalculatorRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static dave.CalculatorRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dave.CalculatorRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static dave.CalculatorRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (dave.CalculatorRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static dave.CalculatorRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dave.CalculatorRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static dave.CalculatorRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (dave.CalculatorRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static dave.CalculatorRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (dave.CalculatorRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
