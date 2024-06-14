/*
 * An XML document type.
 * Localname: quality_control_flags
 * Namespace: met
 * Java type: met.QualityControlFlagsDocument
 *
 * Automatically generated - do not modify.
 */
package met;


/**
 * A document containing one quality_control_flags(@met) element.
 *
 * This is a complex type.
 */
public interface QualityControlFlagsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QualityControlFlagsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("qualitycontrolflags6aa8doctype");
    
    /**
     * Gets the "quality_control_flags" element
     */
    met.QualityControlFlagsDocument.QualityControlFlags getQualityControlFlags();
    
    /**
     * Sets the "quality_control_flags" element
     */
    void setQualityControlFlags(met.QualityControlFlagsDocument.QualityControlFlags qualityControlFlags);
    
    /**
     * Appends and returns a new empty "quality_control_flags" element
     */
    met.QualityControlFlagsDocument.QualityControlFlags addNewQualityControlFlags();
    
    /**
     * An XML quality_control_flags(@met).
     *
     * This is a complex type.
     */
    public interface QualityControlFlags extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QualityControlFlags.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("qualitycontrolflags6379elemtype");
        
        /**
         * Gets the "corrected" element
         */
        java.lang.String getCorrected();
        
        /**
         * Gets (as xml) the "corrected" element
         */
        org.apache.xmlbeans.XmlString xgetCorrected();
        
        /**
         * True if has "corrected" element
         */
        boolean isSetCorrected();
        
        /**
         * Sets the "corrected" element
         */
        void setCorrected(java.lang.String corrected);
        
        /**
         * Sets (as xml) the "corrected" element
         */
        void xsetCorrected(org.apache.xmlbeans.XmlString corrected);
        
        /**
         * Unsets the "corrected" element
         */
        void unsetCorrected();
        
        /**
         * Gets the "auto" element
         */
        java.lang.String getAuto();
        
        /**
         * Gets (as xml) the "auto" element
         */
        org.apache.xmlbeans.XmlString xgetAuto();
        
        /**
         * True if has "auto" element
         */
        boolean isSetAuto();
        
        /**
         * Sets the "auto" element
         */
        void setAuto(java.lang.String auto);
        
        /**
         * Sets (as xml) the "auto" element
         */
        void xsetAuto(org.apache.xmlbeans.XmlString auto);
        
        /**
         * Unsets the "auto" element
         */
        void unsetAuto();
        
        /**
         * Gets the "auto_station" element
         */
        java.lang.String getAutoStation();
        
        /**
         * Gets (as xml) the "auto_station" element
         */
        org.apache.xmlbeans.XmlString xgetAutoStation();
        
        /**
         * True if has "auto_station" element
         */
        boolean isSetAutoStation();
        
        /**
         * Sets the "auto_station" element
         */
        void setAutoStation(java.lang.String autoStation);
        
        /**
         * Sets (as xml) the "auto_station" element
         */
        void xsetAutoStation(org.apache.xmlbeans.XmlString autoStation);
        
        /**
         * Unsets the "auto_station" element
         */
        void unsetAutoStation();
        
        /**
         * Gets the "maintenance_indicator_on" element
         */
        java.lang.String getMaintenanceIndicatorOn();
        
        /**
         * Gets (as xml) the "maintenance_indicator_on" element
         */
        org.apache.xmlbeans.XmlString xgetMaintenanceIndicatorOn();
        
        /**
         * True if has "maintenance_indicator_on" element
         */
        boolean isSetMaintenanceIndicatorOn();
        
        /**
         * Sets the "maintenance_indicator_on" element
         */
        void setMaintenanceIndicatorOn(java.lang.String maintenanceIndicatorOn);
        
        /**
         * Sets (as xml) the "maintenance_indicator_on" element
         */
        void xsetMaintenanceIndicatorOn(org.apache.xmlbeans.XmlString maintenanceIndicatorOn);
        
        /**
         * Unsets the "maintenance_indicator_on" element
         */
        void unsetMaintenanceIndicatorOn();
        
        /**
         * Gets the "no_signal" element
         */
        java.lang.String getNoSignal();
        
        /**
         * Gets (as xml) the "no_signal" element
         */
        org.apache.xmlbeans.XmlString xgetNoSignal();
        
        /**
         * True if has "no_signal" element
         */
        boolean isSetNoSignal();
        
        /**
         * Sets the "no_signal" element
         */
        void setNoSignal(java.lang.String noSignal);
        
        /**
         * Sets (as xml) the "no_signal" element
         */
        void xsetNoSignal(org.apache.xmlbeans.XmlString noSignal);
        
        /**
         * Unsets the "no_signal" element
         */
        void unsetNoSignal();
        
        /**
         * Gets the "lightning_sensor_off" element
         */
        java.lang.String getLightningSensorOff();
        
        /**
         * Gets (as xml) the "lightning_sensor_off" element
         */
        org.apache.xmlbeans.XmlString xgetLightningSensorOff();
        
        /**
         * True if has "lightning_sensor_off" element
         */
        boolean isSetLightningSensorOff();
        
        /**
         * Sets the "lightning_sensor_off" element
         */
        void setLightningSensorOff(java.lang.String lightningSensorOff);
        
        /**
         * Sets (as xml) the "lightning_sensor_off" element
         */
        void xsetLightningSensorOff(org.apache.xmlbeans.XmlString lightningSensorOff);
        
        /**
         * Unsets the "lightning_sensor_off" element
         */
        void unsetLightningSensorOff();
        
        /**
         * Gets the "freezing_rain_sensor_off" element
         */
        java.lang.String getFreezingRainSensorOff();
        
        /**
         * Gets (as xml) the "freezing_rain_sensor_off" element
         */
        org.apache.xmlbeans.XmlString xgetFreezingRainSensorOff();
        
        /**
         * True if has "freezing_rain_sensor_off" element
         */
        boolean isSetFreezingRainSensorOff();
        
        /**
         * Sets the "freezing_rain_sensor_off" element
         */
        void setFreezingRainSensorOff(java.lang.String freezingRainSensorOff);
        
        /**
         * Sets (as xml) the "freezing_rain_sensor_off" element
         */
        void xsetFreezingRainSensorOff(org.apache.xmlbeans.XmlString freezingRainSensorOff);
        
        /**
         * Unsets the "freezing_rain_sensor_off" element
         */
        void unsetFreezingRainSensorOff();
        
        /**
         * Gets the "present_weather_sensor_off" element
         */
        java.lang.String getPresentWeatherSensorOff();
        
        /**
         * Gets (as xml) the "present_weather_sensor_off" element
         */
        org.apache.xmlbeans.XmlString xgetPresentWeatherSensorOff();
        
        /**
         * True if has "present_weather_sensor_off" element
         */
        boolean isSetPresentWeatherSensorOff();
        
        /**
         * Sets the "present_weather_sensor_off" element
         */
        void setPresentWeatherSensorOff(java.lang.String presentWeatherSensorOff);
        
        /**
         * Sets (as xml) the "present_weather_sensor_off" element
         */
        void xsetPresentWeatherSensorOff(org.apache.xmlbeans.XmlString presentWeatherSensorOff);
        
        /**
         * Unsets the "present_weather_sensor_off" element
         */
        void unsetPresentWeatherSensorOff();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static met.QualityControlFlagsDocument.QualityControlFlags newInstance() {
              return (met.QualityControlFlagsDocument.QualityControlFlags) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static met.QualityControlFlagsDocument.QualityControlFlags newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (met.QualityControlFlagsDocument.QualityControlFlags) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static met.QualityControlFlagsDocument newInstance() {
          return (met.QualityControlFlagsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static met.QualityControlFlagsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (met.QualityControlFlagsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static met.QualityControlFlagsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (met.QualityControlFlagsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static met.QualityControlFlagsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (met.QualityControlFlagsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static met.QualityControlFlagsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (met.QualityControlFlagsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static met.QualityControlFlagsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (met.QualityControlFlagsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static met.QualityControlFlagsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (met.QualityControlFlagsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static met.QualityControlFlagsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (met.QualityControlFlagsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static met.QualityControlFlagsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (met.QualityControlFlagsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static met.QualityControlFlagsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (met.QualityControlFlagsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static met.QualityControlFlagsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (met.QualityControlFlagsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static met.QualityControlFlagsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (met.QualityControlFlagsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static met.QualityControlFlagsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (met.QualityControlFlagsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static met.QualityControlFlagsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (met.QualityControlFlagsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static met.QualityControlFlagsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (met.QualityControlFlagsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static met.QualityControlFlagsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (met.QualityControlFlagsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static met.QualityControlFlagsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (met.QualityControlFlagsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static met.QualityControlFlagsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (met.QualityControlFlagsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
