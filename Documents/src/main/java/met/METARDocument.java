/*
 * An XML document type.
 * Localname: METAR
 * Namespace: met
 * Java type: met.METARDocument
 *
 * Automatically generated - do not modify.
 */
package met;


/**
 * A document containing one METAR(@met) element.
 *
 * This is a complex type.
 */
public interface METARDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(METARDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("metara1b0doctype");
    
    /**
     * Gets the "METAR" element
     */
    met.METARDocument.METAR getMETAR();
    
    /**
     * Sets the "METAR" element
     */
    void setMETAR(met.METARDocument.METAR metar);
    
    /**
     * Appends and returns a new empty "METAR" element
     */
    met.METARDocument.METAR addNewMETAR();
    
    /**
     * An XML METAR(@met).
     *
     * This is a complex type.
     */
    public interface METAR extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(METAR.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s925F987B8990D8587B71CEF9ECF56712").resolveHandle("metarad89elemtype");
        
        /**
         * Gets the "raw_text" element
         */
        java.lang.String getRawText();
        
        /**
         * Gets (as xml) the "raw_text" element
         */
        org.apache.xmlbeans.XmlString xgetRawText();
        
        /**
         * True if has "raw_text" element
         */
        boolean isSetRawText();
        
        /**
         * Sets the "raw_text" element
         */
        void setRawText(java.lang.String rawText);
        
        /**
         * Sets (as xml) the "raw_text" element
         */
        void xsetRawText(org.apache.xmlbeans.XmlString rawText);
        
        /**
         * Unsets the "raw_text" element
         */
        void unsetRawText();
        
        /**
         * Gets the "station_id" element
         */
        java.lang.String getStationId();
        
        /**
         * Gets (as xml) the "station_id" element
         */
        org.apache.xmlbeans.XmlString xgetStationId();
        
        /**
         * True if has "station_id" element
         */
        boolean isSetStationId();
        
        /**
         * Sets the "station_id" element
         */
        void setStationId(java.lang.String stationId);
        
        /**
         * Sets (as xml) the "station_id" element
         */
        void xsetStationId(org.apache.xmlbeans.XmlString stationId);
        
        /**
         * Unsets the "station_id" element
         */
        void unsetStationId();
        
        /**
         * Gets the "longitude" element
         */
        float getLongitude();
        
        /**
         * Gets (as xml) the "longitude" element
         */
        org.apache.xmlbeans.XmlFloat xgetLongitude();
        
        /**
         * True if has "longitude" element
         */
        boolean isSetLongitude();
        
        /**
         * Sets the "longitude" element
         */
        void setLongitude(float longitude);
        
        /**
         * Sets (as xml) the "longitude" element
         */
        void xsetLongitude(org.apache.xmlbeans.XmlFloat longitude);
        
        /**
         * Unsets the "longitude" element
         */
        void unsetLongitude();
        
        /**
         * Gets the "latitude" element
         */
        float getLatitude();
        
        /**
         * Gets (as xml) the "latitude" element
         */
        org.apache.xmlbeans.XmlFloat xgetLatitude();
        
        /**
         * True if has "latitude" element
         */
        boolean isSetLatitude();
        
        /**
         * Sets the "latitude" element
         */
        void setLatitude(float latitude);
        
        /**
         * Sets (as xml) the "latitude" element
         */
        void xsetLatitude(org.apache.xmlbeans.XmlFloat latitude);
        
        /**
         * Unsets the "latitude" element
         */
        void unsetLatitude();
        
        /**
         * Gets the "temp_c" element
         */
        float getTempC();
        
        /**
         * Gets (as xml) the "temp_c" element
         */
        org.apache.xmlbeans.XmlFloat xgetTempC();
        
        /**
         * True if has "temp_c" element
         */
        boolean isSetTempC();
        
        /**
         * Sets the "temp_c" element
         */
        void setTempC(float tempC);
        
        /**
         * Sets (as xml) the "temp_c" element
         */
        void xsetTempC(org.apache.xmlbeans.XmlFloat tempC);
        
        /**
         * Unsets the "temp_c" element
         */
        void unsetTempC();
        
        /**
         * Gets the "dewpoint_c" element
         */
        float getDewpointC();
        
        /**
         * Gets (as xml) the "dewpoint_c" element
         */
        org.apache.xmlbeans.XmlFloat xgetDewpointC();
        
        /**
         * True if has "dewpoint_c" element
         */
        boolean isSetDewpointC();
        
        /**
         * Sets the "dewpoint_c" element
         */
        void setDewpointC(float dewpointC);
        
        /**
         * Sets (as xml) the "dewpoint_c" element
         */
        void xsetDewpointC(org.apache.xmlbeans.XmlFloat dewpointC);
        
        /**
         * Unsets the "dewpoint_c" element
         */
        void unsetDewpointC();
        
        /**
         * Gets the "wind_dir_degrees" element
         */
        int getWindDirDegrees();
        
        /**
         * Gets (as xml) the "wind_dir_degrees" element
         */
        org.apache.xmlbeans.XmlInt xgetWindDirDegrees();
        
        /**
         * True if has "wind_dir_degrees" element
         */
        boolean isSetWindDirDegrees();
        
        /**
         * Sets the "wind_dir_degrees" element
         */
        void setWindDirDegrees(int windDirDegrees);
        
        /**
         * Sets (as xml) the "wind_dir_degrees" element
         */
        void xsetWindDirDegrees(org.apache.xmlbeans.XmlInt windDirDegrees);
        
        /**
         * Unsets the "wind_dir_degrees" element
         */
        void unsetWindDirDegrees();
        
        /**
         * Gets the "wind_speed_kt" element
         */
        int getWindSpeedKt();
        
        /**
         * Gets (as xml) the "wind_speed_kt" element
         */
        org.apache.xmlbeans.XmlInt xgetWindSpeedKt();
        
        /**
         * True if has "wind_speed_kt" element
         */
        boolean isSetWindSpeedKt();
        
        /**
         * Sets the "wind_speed_kt" element
         */
        void setWindSpeedKt(int windSpeedKt);
        
        /**
         * Sets (as xml) the "wind_speed_kt" element
         */
        void xsetWindSpeedKt(org.apache.xmlbeans.XmlInt windSpeedKt);
        
        /**
         * Unsets the "wind_speed_kt" element
         */
        void unsetWindSpeedKt();
        
        /**
         * Gets the "wind_gust_kt" element
         */
        int getWindGustKt();
        
        /**
         * Gets (as xml) the "wind_gust_kt" element
         */
        org.apache.xmlbeans.XmlInt xgetWindGustKt();
        
        /**
         * True if has "wind_gust_kt" element
         */
        boolean isSetWindGustKt();
        
        /**
         * Sets the "wind_gust_kt" element
         */
        void setWindGustKt(int windGustKt);
        
        /**
         * Sets (as xml) the "wind_gust_kt" element
         */
        void xsetWindGustKt(org.apache.xmlbeans.XmlInt windGustKt);
        
        /**
         * Unsets the "wind_gust_kt" element
         */
        void unsetWindGustKt();
        
        /**
         * Gets the "visibility_statute_mi" element
         */
        float getVisibilityStatuteMi();
        
        /**
         * Gets (as xml) the "visibility_statute_mi" element
         */
        org.apache.xmlbeans.XmlFloat xgetVisibilityStatuteMi();
        
        /**
         * True if has "visibility_statute_mi" element
         */
        boolean isSetVisibilityStatuteMi();
        
        /**
         * Sets the "visibility_statute_mi" element
         */
        void setVisibilityStatuteMi(float visibilityStatuteMi);
        
        /**
         * Sets (as xml) the "visibility_statute_mi" element
         */
        void xsetVisibilityStatuteMi(org.apache.xmlbeans.XmlFloat visibilityStatuteMi);
        
        /**
         * Unsets the "visibility_statute_mi" element
         */
        void unsetVisibilityStatuteMi();
        
        /**
         * Gets the "altim_in_hg" element
         */
        float getAltimInHg();
        
        /**
         * Gets (as xml) the "altim_in_hg" element
         */
        org.apache.xmlbeans.XmlFloat xgetAltimInHg();
        
        /**
         * True if has "altim_in_hg" element
         */
        boolean isSetAltimInHg();
        
        /**
         * Sets the "altim_in_hg" element
         */
        void setAltimInHg(float altimInHg);
        
        /**
         * Sets (as xml) the "altim_in_hg" element
         */
        void xsetAltimInHg(org.apache.xmlbeans.XmlFloat altimInHg);
        
        /**
         * Unsets the "altim_in_hg" element
         */
        void unsetAltimInHg();
        
        /**
         * Gets the "sea_level_pressure_mb" element
         */
        float getSeaLevelPressureMb();
        
        /**
         * Gets (as xml) the "sea_level_pressure_mb" element
         */
        org.apache.xmlbeans.XmlFloat xgetSeaLevelPressureMb();
        
        /**
         * True if has "sea_level_pressure_mb" element
         */
        boolean isSetSeaLevelPressureMb();
        
        /**
         * Sets the "sea_level_pressure_mb" element
         */
        void setSeaLevelPressureMb(float seaLevelPressureMb);
        
        /**
         * Sets (as xml) the "sea_level_pressure_mb" element
         */
        void xsetSeaLevelPressureMb(org.apache.xmlbeans.XmlFloat seaLevelPressureMb);
        
        /**
         * Unsets the "sea_level_pressure_mb" element
         */
        void unsetSeaLevelPressureMb();
        
        /**
         * Gets the "quality_control_flags" element
         */
        met.QualityControlFlagsDocument.QualityControlFlags getQualityControlFlags();
        
        /**
         * True if has "quality_control_flags" element
         */
        boolean isSetQualityControlFlags();
        
        /**
         * Sets the "quality_control_flags" element
         */
        void setQualityControlFlags(met.QualityControlFlagsDocument.QualityControlFlags qualityControlFlags);
        
        /**
         * Appends and returns a new empty "quality_control_flags" element
         */
        met.QualityControlFlagsDocument.QualityControlFlags addNewQualityControlFlags();
        
        /**
         * Unsets the "quality_control_flags" element
         */
        void unsetQualityControlFlags();
        
        /**
         * Gets the "wx_string" element
         */
        java.lang.String getWxString();
        
        /**
         * Gets (as xml) the "wx_string" element
         */
        org.apache.xmlbeans.XmlString xgetWxString();
        
        /**
         * True if has "wx_string" element
         */
        boolean isSetWxString();
        
        /**
         * Sets the "wx_string" element
         */
        void setWxString(java.lang.String wxString);
        
        /**
         * Sets (as xml) the "wx_string" element
         */
        void xsetWxString(org.apache.xmlbeans.XmlString wxString);
        
        /**
         * Unsets the "wx_string" element
         */
        void unsetWxString();
        
        /**
         * Gets array of all "sky_condition" elements
         */
        met.SkyConditionDocument.SkyCondition[] getSkyConditionArray();
        
        /**
         * Gets ith "sky_condition" element
         */
        met.SkyConditionDocument.SkyCondition getSkyConditionArray(int i);
        
        /**
         * Returns number of "sky_condition" element
         */
        int sizeOfSkyConditionArray();
        
        /**
         * Sets array of all "sky_condition" element
         */
        void setSkyConditionArray(met.SkyConditionDocument.SkyCondition[] skyConditionArray);
        
        /**
         * Sets ith "sky_condition" element
         */
        void setSkyConditionArray(int i, met.SkyConditionDocument.SkyCondition skyCondition);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sky_condition" element
         */
        met.SkyConditionDocument.SkyCondition insertNewSkyCondition(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sky_condition" element
         */
        met.SkyConditionDocument.SkyCondition addNewSkyCondition();
        
        /**
         * Removes the ith "sky_condition" element
         */
        void removeSkyCondition(int i);
        
        /**
         * Gets the "flight_category" element
         */
        java.lang.String getFlightCategory();
        
        /**
         * Gets (as xml) the "flight_category" element
         */
        org.apache.xmlbeans.XmlString xgetFlightCategory();
        
        /**
         * True if has "flight_category" element
         */
        boolean isSetFlightCategory();
        
        /**
         * Sets the "flight_category" element
         */
        void setFlightCategory(java.lang.String flightCategory);
        
        /**
         * Sets (as xml) the "flight_category" element
         */
        void xsetFlightCategory(org.apache.xmlbeans.XmlString flightCategory);
        
        /**
         * Unsets the "flight_category" element
         */
        void unsetFlightCategory();
        
        /**
         * Gets the "three_hr_pressure_tendency_mb" element
         */
        float getThreeHrPressureTendencyMb();
        
        /**
         * Gets (as xml) the "three_hr_pressure_tendency_mb" element
         */
        org.apache.xmlbeans.XmlFloat xgetThreeHrPressureTendencyMb();
        
        /**
         * True if has "three_hr_pressure_tendency_mb" element
         */
        boolean isSetThreeHrPressureTendencyMb();
        
        /**
         * Sets the "three_hr_pressure_tendency_mb" element
         */
        void setThreeHrPressureTendencyMb(float threeHrPressureTendencyMb);
        
        /**
         * Sets (as xml) the "three_hr_pressure_tendency_mb" element
         */
        void xsetThreeHrPressureTendencyMb(org.apache.xmlbeans.XmlFloat threeHrPressureTendencyMb);
        
        /**
         * Unsets the "three_hr_pressure_tendency_mb" element
         */
        void unsetThreeHrPressureTendencyMb();
        
        /**
         * Gets the "maxT_c" element
         */
        float getMaxTC();
        
        /**
         * Gets (as xml) the "maxT_c" element
         */
        org.apache.xmlbeans.XmlFloat xgetMaxTC();
        
        /**
         * True if has "maxT_c" element
         */
        boolean isSetMaxTC();
        
        /**
         * Sets the "maxT_c" element
         */
        void setMaxTC(float maxTC);
        
        /**
         * Sets (as xml) the "maxT_c" element
         */
        void xsetMaxTC(org.apache.xmlbeans.XmlFloat maxTC);
        
        /**
         * Unsets the "maxT_c" element
         */
        void unsetMaxTC();
        
        /**
         * Gets the "minT_c" element
         */
        float getMinTC();
        
        /**
         * Gets (as xml) the "minT_c" element
         */
        org.apache.xmlbeans.XmlFloat xgetMinTC();
        
        /**
         * True if has "minT_c" element
         */
        boolean isSetMinTC();
        
        /**
         * Sets the "minT_c" element
         */
        void setMinTC(float minTC);
        
        /**
         * Sets (as xml) the "minT_c" element
         */
        void xsetMinTC(org.apache.xmlbeans.XmlFloat minTC);
        
        /**
         * Unsets the "minT_c" element
         */
        void unsetMinTC();
        
        /**
         * Gets the "maxT24hr_c" element
         */
        float getMaxT24HrC();
        
        /**
         * Gets (as xml) the "maxT24hr_c" element
         */
        org.apache.xmlbeans.XmlFloat xgetMaxT24HrC();
        
        /**
         * True if has "maxT24hr_c" element
         */
        boolean isSetMaxT24HrC();
        
        /**
         * Sets the "maxT24hr_c" element
         */
        void setMaxT24HrC(float maxT24HrC);
        
        /**
         * Sets (as xml) the "maxT24hr_c" element
         */
        void xsetMaxT24HrC(org.apache.xmlbeans.XmlFloat maxT24HrC);
        
        /**
         * Unsets the "maxT24hr_c" element
         */
        void unsetMaxT24HrC();
        
        /**
         * Gets the "minT24hr_c" element
         */
        float getMinT24HrC();
        
        /**
         * Gets (as xml) the "minT24hr_c" element
         */
        org.apache.xmlbeans.XmlFloat xgetMinT24HrC();
        
        /**
         * True if has "minT24hr_c" element
         */
        boolean isSetMinT24HrC();
        
        /**
         * Sets the "minT24hr_c" element
         */
        void setMinT24HrC(float minT24HrC);
        
        /**
         * Sets (as xml) the "minT24hr_c" element
         */
        void xsetMinT24HrC(org.apache.xmlbeans.XmlFloat minT24HrC);
        
        /**
         * Unsets the "minT24hr_c" element
         */
        void unsetMinT24HrC();
        
        /**
         * Gets the "precip_in" element
         */
        float getPrecipIn();
        
        /**
         * Gets (as xml) the "precip_in" element
         */
        org.apache.xmlbeans.XmlFloat xgetPrecipIn();
        
        /**
         * True if has "precip_in" element
         */
        boolean isSetPrecipIn();
        
        /**
         * Sets the "precip_in" element
         */
        void setPrecipIn(float precipIn);
        
        /**
         * Sets (as xml) the "precip_in" element
         */
        void xsetPrecipIn(org.apache.xmlbeans.XmlFloat precipIn);
        
        /**
         * Unsets the "precip_in" element
         */
        void unsetPrecipIn();
        
        /**
         * Gets the "pcp3hr_in" element
         */
        float getPcp3HrIn();
        
        /**
         * Gets (as xml) the "pcp3hr_in" element
         */
        org.apache.xmlbeans.XmlFloat xgetPcp3HrIn();
        
        /**
         * True if has "pcp3hr_in" element
         */
        boolean isSetPcp3HrIn();
        
        /**
         * Sets the "pcp3hr_in" element
         */
        void setPcp3HrIn(float pcp3HrIn);
        
        /**
         * Sets (as xml) the "pcp3hr_in" element
         */
        void xsetPcp3HrIn(org.apache.xmlbeans.XmlFloat pcp3HrIn);
        
        /**
         * Unsets the "pcp3hr_in" element
         */
        void unsetPcp3HrIn();
        
        /**
         * Gets the "pcp6hr_in" element
         */
        float getPcp6HrIn();
        
        /**
         * Gets (as xml) the "pcp6hr_in" element
         */
        org.apache.xmlbeans.XmlFloat xgetPcp6HrIn();
        
        /**
         * True if has "pcp6hr_in" element
         */
        boolean isSetPcp6HrIn();
        
        /**
         * Sets the "pcp6hr_in" element
         */
        void setPcp6HrIn(float pcp6HrIn);
        
        /**
         * Sets (as xml) the "pcp6hr_in" element
         */
        void xsetPcp6HrIn(org.apache.xmlbeans.XmlFloat pcp6HrIn);
        
        /**
         * Unsets the "pcp6hr_in" element
         */
        void unsetPcp6HrIn();
        
        /**
         * Gets the "pcp24hr_in" element
         */
        float getPcp24HrIn();
        
        /**
         * Gets (as xml) the "pcp24hr_in" element
         */
        org.apache.xmlbeans.XmlFloat xgetPcp24HrIn();
        
        /**
         * True if has "pcp24hr_in" element
         */
        boolean isSetPcp24HrIn();
        
        /**
         * Sets the "pcp24hr_in" element
         */
        void setPcp24HrIn(float pcp24HrIn);
        
        /**
         * Sets (as xml) the "pcp24hr_in" element
         */
        void xsetPcp24HrIn(org.apache.xmlbeans.XmlFloat pcp24HrIn);
        
        /**
         * Unsets the "pcp24hr_in" element
         */
        void unsetPcp24HrIn();
        
        /**
         * Gets the "snow_in" element
         */
        float getSnowIn();
        
        /**
         * Gets (as xml) the "snow_in" element
         */
        org.apache.xmlbeans.XmlFloat xgetSnowIn();
        
        /**
         * True if has "snow_in" element
         */
        boolean isSetSnowIn();
        
        /**
         * Sets the "snow_in" element
         */
        void setSnowIn(float snowIn);
        
        /**
         * Sets (as xml) the "snow_in" element
         */
        void xsetSnowIn(org.apache.xmlbeans.XmlFloat snowIn);
        
        /**
         * Unsets the "snow_in" element
         */
        void unsetSnowIn();
        
        /**
         * Gets the "vert_vis_ft" element
         */
        int getVertVisFt();
        
        /**
         * Gets (as xml) the "vert_vis_ft" element
         */
        org.apache.xmlbeans.XmlInt xgetVertVisFt();
        
        /**
         * True if has "vert_vis_ft" element
         */
        boolean isSetVertVisFt();
        
        /**
         * Sets the "vert_vis_ft" element
         */
        void setVertVisFt(int vertVisFt);
        
        /**
         * Sets (as xml) the "vert_vis_ft" element
         */
        void xsetVertVisFt(org.apache.xmlbeans.XmlInt vertVisFt);
        
        /**
         * Unsets the "vert_vis_ft" element
         */
        void unsetVertVisFt();
        
        /**
         * Gets the "metar_type" element
         */
        java.lang.String getMetarType();
        
        /**
         * Gets (as xml) the "metar_type" element
         */
        org.apache.xmlbeans.XmlString xgetMetarType();
        
        /**
         * True if has "metar_type" element
         */
        boolean isSetMetarType();
        
        /**
         * Sets the "metar_type" element
         */
        void setMetarType(java.lang.String metarType);
        
        /**
         * Sets (as xml) the "metar_type" element
         */
        void xsetMetarType(org.apache.xmlbeans.XmlString metarType);
        
        /**
         * Unsets the "metar_type" element
         */
        void unsetMetarType();
        
        /**
         * Gets the "elevation_m" element
         */
        float getElevationM();
        
        /**
         * Gets (as xml) the "elevation_m" element
         */
        org.apache.xmlbeans.XmlFloat xgetElevationM();
        
        /**
         * True if has "elevation_m" element
         */
        boolean isSetElevationM();
        
        /**
         * Sets the "elevation_m" element
         */
        void setElevationM(float elevationM);
        
        /**
         * Sets (as xml) the "elevation_m" element
         */
        void xsetElevationM(org.apache.xmlbeans.XmlFloat elevationM);
        
        /**
         * Unsets the "elevation_m" element
         */
        void unsetElevationM();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static met.METARDocument.METAR newInstance() {
              return (met.METARDocument.METAR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static met.METARDocument.METAR newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (met.METARDocument.METAR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static met.METARDocument newInstance() {
          return (met.METARDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static met.METARDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (met.METARDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static met.METARDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (met.METARDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static met.METARDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (met.METARDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static met.METARDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (met.METARDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static met.METARDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (met.METARDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static met.METARDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (met.METARDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static met.METARDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (met.METARDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static met.METARDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (met.METARDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static met.METARDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (met.METARDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static met.METARDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (met.METARDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static met.METARDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (met.METARDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static met.METARDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (met.METARDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static met.METARDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (met.METARDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static met.METARDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (met.METARDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static met.METARDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (met.METARDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static met.METARDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (met.METARDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static met.METARDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (met.METARDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
