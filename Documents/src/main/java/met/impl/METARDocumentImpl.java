/*
 * An XML document type.
 * Localname: METAR
 * Namespace: met
 * Java type: met.METARDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one METAR(@met) element.
 *
 * This is a complex type.
 */
public class METARDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.METARDocument
{
    private static final long serialVersionUID = 1L;
    
    public METARDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METAR$0 = 
        new javax.xml.namespace.QName("met", "METAR");
    
    
    /**
     * Gets the "METAR" element
     */
    public met.METARDocument.METAR getMETAR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.METARDocument.METAR target = null;
            target = (met.METARDocument.METAR)get_store().find_element_user(METAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "METAR" element
     */
    public void setMETAR(met.METARDocument.METAR metar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.METARDocument.METAR target = null;
            target = (met.METARDocument.METAR)get_store().find_element_user(METAR$0, 0);
            if (target == null)
            {
                target = (met.METARDocument.METAR)get_store().add_element_user(METAR$0);
            }
            target.set(metar);
        }
    }
    
    /**
     * Appends and returns a new empty "METAR" element
     */
    public met.METARDocument.METAR addNewMETAR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.METARDocument.METAR target = null;
            target = (met.METARDocument.METAR)get_store().add_element_user(METAR$0);
            return target;
        }
    }
    /**
     * An XML METAR(@met).
     *
     * This is a complex type.
     */
    public static class METARImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.METARDocument.METAR
    {
        private static final long serialVersionUID = 1L;
        
        public METARImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RAWTEXT$0 = 
            new javax.xml.namespace.QName("met", "raw_text");
        private static final javax.xml.namespace.QName STATIONID$2 = 
            new javax.xml.namespace.QName("met", "station_id");
        private static final javax.xml.namespace.QName LONGITUDE$4 = 
            new javax.xml.namespace.QName("met", "longitude");
        private static final javax.xml.namespace.QName LATITUDE$6 = 
            new javax.xml.namespace.QName("met", "latitude");
        private static final javax.xml.namespace.QName TEMPC$8 = 
            new javax.xml.namespace.QName("met", "temp_c");
        private static final javax.xml.namespace.QName DEWPOINTC$10 = 
            new javax.xml.namespace.QName("met", "dewpoint_c");
        private static final javax.xml.namespace.QName WINDDIRDEGREES$12 = 
            new javax.xml.namespace.QName("met", "wind_dir_degrees");
        private static final javax.xml.namespace.QName WINDSPEEDKT$14 = 
            new javax.xml.namespace.QName("met", "wind_speed_kt");
        private static final javax.xml.namespace.QName WINDGUSTKT$16 = 
            new javax.xml.namespace.QName("met", "wind_gust_kt");
        private static final javax.xml.namespace.QName VISIBILITYSTATUTEMI$18 = 
            new javax.xml.namespace.QName("met", "visibility_statute_mi");
        private static final javax.xml.namespace.QName ALTIMINHG$20 = 
            new javax.xml.namespace.QName("met", "altim_in_hg");
        private static final javax.xml.namespace.QName SEALEVELPRESSUREMB$22 = 
            new javax.xml.namespace.QName("met", "sea_level_pressure_mb");
        private static final javax.xml.namespace.QName QUALITYCONTROLFLAGS$24 = 
            new javax.xml.namespace.QName("met", "quality_control_flags");
        private static final javax.xml.namespace.QName WXSTRING$26 = 
            new javax.xml.namespace.QName("met", "wx_string");
        private static final javax.xml.namespace.QName SKYCONDITION$28 = 
            new javax.xml.namespace.QName("met", "sky_condition");
        private static final javax.xml.namespace.QName FLIGHTCATEGORY$30 = 
            new javax.xml.namespace.QName("met", "flight_category");
        private static final javax.xml.namespace.QName THREEHRPRESSURETENDENCYMB$32 = 
            new javax.xml.namespace.QName("met", "three_hr_pressure_tendency_mb");
        private static final javax.xml.namespace.QName MAXTC$34 = 
            new javax.xml.namespace.QName("met", "maxT_c");
        private static final javax.xml.namespace.QName MINTC$36 = 
            new javax.xml.namespace.QName("met", "minT_c");
        private static final javax.xml.namespace.QName MAXT24HRC$38 = 
            new javax.xml.namespace.QName("met", "maxT24hr_c");
        private static final javax.xml.namespace.QName MINT24HRC$40 = 
            new javax.xml.namespace.QName("met", "minT24hr_c");
        private static final javax.xml.namespace.QName PRECIPIN$42 = 
            new javax.xml.namespace.QName("met", "precip_in");
        private static final javax.xml.namespace.QName PCP3HRIN$44 = 
            new javax.xml.namespace.QName("met", "pcp3hr_in");
        private static final javax.xml.namespace.QName PCP6HRIN$46 = 
            new javax.xml.namespace.QName("met", "pcp6hr_in");
        private static final javax.xml.namespace.QName PCP24HRIN$48 = 
            new javax.xml.namespace.QName("met", "pcp24hr_in");
        private static final javax.xml.namespace.QName SNOWIN$50 = 
            new javax.xml.namespace.QName("met", "snow_in");
        private static final javax.xml.namespace.QName VERTVISFT$52 = 
            new javax.xml.namespace.QName("met", "vert_vis_ft");
        private static final javax.xml.namespace.QName METARTYPE$54 = 
            new javax.xml.namespace.QName("met", "metar_type");
        private static final javax.xml.namespace.QName ELEVATIONM$56 = 
            new javax.xml.namespace.QName("met", "elevation_m");
        
        
        /**
         * Gets the "raw_text" element
         */
        public java.lang.String getRawText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RAWTEXT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "raw_text" element
         */
        public org.apache.xmlbeans.XmlString xgetRawText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RAWTEXT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "raw_text" element
         */
        public boolean isSetRawText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RAWTEXT$0) != 0;
            }
        }
        
        /**
         * Sets the "raw_text" element
         */
        public void setRawText(java.lang.String rawText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RAWTEXT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RAWTEXT$0);
                }
                target.setStringValue(rawText);
            }
        }
        
        /**
         * Sets (as xml) the "raw_text" element
         */
        public void xsetRawText(org.apache.xmlbeans.XmlString rawText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RAWTEXT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RAWTEXT$0);
                }
                target.set(rawText);
            }
        }
        
        /**
         * Unsets the "raw_text" element
         */
        public void unsetRawText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RAWTEXT$0, 0);
            }
        }
        
        /**
         * Gets the "station_id" element
         */
        public java.lang.String getStationId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATIONID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "station_id" element
         */
        public org.apache.xmlbeans.XmlString xgetStationId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATIONID$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "station_id" element
         */
        public boolean isSetStationId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATIONID$2) != 0;
            }
        }
        
        /**
         * Sets the "station_id" element
         */
        public void setStationId(java.lang.String stationId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATIONID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATIONID$2);
                }
                target.setStringValue(stationId);
            }
        }
        
        /**
         * Sets (as xml) the "station_id" element
         */
        public void xsetStationId(org.apache.xmlbeans.XmlString stationId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATIONID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATIONID$2);
                }
                target.set(stationId);
            }
        }
        
        /**
         * Unsets the "station_id" element
         */
        public void unsetStationId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATIONID$2, 0);
            }
        }
        
        /**
         * Gets the "longitude" element
         */
        public float getLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$4, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "longitude" element
         */
        public org.apache.xmlbeans.XmlFloat xgetLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LONGITUDE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "longitude" element
         */
        public boolean isSetLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LONGITUDE$4) != 0;
            }
        }
        
        /**
         * Sets the "longitude" element
         */
        public void setLongitude(float longitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONGITUDE$4);
                }
                target.setFloatValue(longitude);
            }
        }
        
        /**
         * Sets (as xml) the "longitude" element
         */
        public void xsetLongitude(org.apache.xmlbeans.XmlFloat longitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LONGITUDE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(LONGITUDE$4);
                }
                target.set(longitude);
            }
        }
        
        /**
         * Unsets the "longitude" element
         */
        public void unsetLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LONGITUDE$4, 0);
            }
        }
        
        /**
         * Gets the "latitude" element
         */
        public float getLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$6, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "latitude" element
         */
        public org.apache.xmlbeans.XmlFloat xgetLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LATITUDE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "latitude" element
         */
        public boolean isSetLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LATITUDE$6) != 0;
            }
        }
        
        /**
         * Sets the "latitude" element
         */
        public void setLatitude(float latitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATITUDE$6);
                }
                target.setFloatValue(latitude);
            }
        }
        
        /**
         * Sets (as xml) the "latitude" element
         */
        public void xsetLatitude(org.apache.xmlbeans.XmlFloat latitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LATITUDE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(LATITUDE$6);
                }
                target.set(latitude);
            }
        }
        
        /**
         * Unsets the "latitude" element
         */
        public void unsetLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LATITUDE$6, 0);
            }
        }
        
        /**
         * Gets the "temp_c" element
         */
        public float getTempC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPC$8, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "temp_c" element
         */
        public org.apache.xmlbeans.XmlFloat xgetTempC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(TEMPC$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "temp_c" element
         */
        public boolean isSetTempC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TEMPC$8) != 0;
            }
        }
        
        /**
         * Sets the "temp_c" element
         */
        public void setTempC(float tempC)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPC$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEMPC$8);
                }
                target.setFloatValue(tempC);
            }
        }
        
        /**
         * Sets (as xml) the "temp_c" element
         */
        public void xsetTempC(org.apache.xmlbeans.XmlFloat tempC)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(TEMPC$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(TEMPC$8);
                }
                target.set(tempC);
            }
        }
        
        /**
         * Unsets the "temp_c" element
         */
        public void unsetTempC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TEMPC$8, 0);
            }
        }
        
        /**
         * Gets the "dewpoint_c" element
         */
        public float getDewpointC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEWPOINTC$10, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "dewpoint_c" element
         */
        public org.apache.xmlbeans.XmlFloat xgetDewpointC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(DEWPOINTC$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "dewpoint_c" element
         */
        public boolean isSetDewpointC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEWPOINTC$10) != 0;
            }
        }
        
        /**
         * Sets the "dewpoint_c" element
         */
        public void setDewpointC(float dewpointC)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEWPOINTC$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEWPOINTC$10);
                }
                target.setFloatValue(dewpointC);
            }
        }
        
        /**
         * Sets (as xml) the "dewpoint_c" element
         */
        public void xsetDewpointC(org.apache.xmlbeans.XmlFloat dewpointC)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(DEWPOINTC$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(DEWPOINTC$10);
                }
                target.set(dewpointC);
            }
        }
        
        /**
         * Unsets the "dewpoint_c" element
         */
        public void unsetDewpointC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEWPOINTC$10, 0);
            }
        }
        
        /**
         * Gets the "wind_dir_degrees" element
         */
        public int getWindDirDegrees()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WINDDIRDEGREES$12, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "wind_dir_degrees" element
         */
        public org.apache.xmlbeans.XmlInt xgetWindDirDegrees()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WINDDIRDEGREES$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "wind_dir_degrees" element
         */
        public boolean isSetWindDirDegrees()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WINDDIRDEGREES$12) != 0;
            }
        }
        
        /**
         * Sets the "wind_dir_degrees" element
         */
        public void setWindDirDegrees(int windDirDegrees)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WINDDIRDEGREES$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WINDDIRDEGREES$12);
                }
                target.setIntValue(windDirDegrees);
            }
        }
        
        /**
         * Sets (as xml) the "wind_dir_degrees" element
         */
        public void xsetWindDirDegrees(org.apache.xmlbeans.XmlInt windDirDegrees)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WINDDIRDEGREES$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(WINDDIRDEGREES$12);
                }
                target.set(windDirDegrees);
            }
        }
        
        /**
         * Unsets the "wind_dir_degrees" element
         */
        public void unsetWindDirDegrees()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WINDDIRDEGREES$12, 0);
            }
        }
        
        /**
         * Gets the "wind_speed_kt" element
         */
        public int getWindSpeedKt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WINDSPEEDKT$14, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "wind_speed_kt" element
         */
        public org.apache.xmlbeans.XmlInt xgetWindSpeedKt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WINDSPEEDKT$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "wind_speed_kt" element
         */
        public boolean isSetWindSpeedKt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WINDSPEEDKT$14) != 0;
            }
        }
        
        /**
         * Sets the "wind_speed_kt" element
         */
        public void setWindSpeedKt(int windSpeedKt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WINDSPEEDKT$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WINDSPEEDKT$14);
                }
                target.setIntValue(windSpeedKt);
            }
        }
        
        /**
         * Sets (as xml) the "wind_speed_kt" element
         */
        public void xsetWindSpeedKt(org.apache.xmlbeans.XmlInt windSpeedKt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WINDSPEEDKT$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(WINDSPEEDKT$14);
                }
                target.set(windSpeedKt);
            }
        }
        
        /**
         * Unsets the "wind_speed_kt" element
         */
        public void unsetWindSpeedKt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WINDSPEEDKT$14, 0);
            }
        }
        
        /**
         * Gets the "wind_gust_kt" element
         */
        public int getWindGustKt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WINDGUSTKT$16, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "wind_gust_kt" element
         */
        public org.apache.xmlbeans.XmlInt xgetWindGustKt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WINDGUSTKT$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "wind_gust_kt" element
         */
        public boolean isSetWindGustKt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WINDGUSTKT$16) != 0;
            }
        }
        
        /**
         * Sets the "wind_gust_kt" element
         */
        public void setWindGustKt(int windGustKt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WINDGUSTKT$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WINDGUSTKT$16);
                }
                target.setIntValue(windGustKt);
            }
        }
        
        /**
         * Sets (as xml) the "wind_gust_kt" element
         */
        public void xsetWindGustKt(org.apache.xmlbeans.XmlInt windGustKt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WINDGUSTKT$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(WINDGUSTKT$16);
                }
                target.set(windGustKt);
            }
        }
        
        /**
         * Unsets the "wind_gust_kt" element
         */
        public void unsetWindGustKt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WINDGUSTKT$16, 0);
            }
        }
        
        /**
         * Gets the "visibility_statute_mi" element
         */
        public float getVisibilityStatuteMi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VISIBILITYSTATUTEMI$18, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "visibility_statute_mi" element
         */
        public org.apache.xmlbeans.XmlFloat xgetVisibilityStatuteMi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(VISIBILITYSTATUTEMI$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "visibility_statute_mi" element
         */
        public boolean isSetVisibilityStatuteMi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VISIBILITYSTATUTEMI$18) != 0;
            }
        }
        
        /**
         * Sets the "visibility_statute_mi" element
         */
        public void setVisibilityStatuteMi(float visibilityStatuteMi)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VISIBILITYSTATUTEMI$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VISIBILITYSTATUTEMI$18);
                }
                target.setFloatValue(visibilityStatuteMi);
            }
        }
        
        /**
         * Sets (as xml) the "visibility_statute_mi" element
         */
        public void xsetVisibilityStatuteMi(org.apache.xmlbeans.XmlFloat visibilityStatuteMi)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(VISIBILITYSTATUTEMI$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(VISIBILITYSTATUTEMI$18);
                }
                target.set(visibilityStatuteMi);
            }
        }
        
        /**
         * Unsets the "visibility_statute_mi" element
         */
        public void unsetVisibilityStatuteMi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VISIBILITYSTATUTEMI$18, 0);
            }
        }
        
        /**
         * Gets the "altim_in_hg" element
         */
        public float getAltimInHg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTIMINHG$20, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "altim_in_hg" element
         */
        public org.apache.xmlbeans.XmlFloat xgetAltimInHg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(ALTIMINHG$20, 0);
                return target;
            }
        }
        
        /**
         * True if has "altim_in_hg" element
         */
        public boolean isSetAltimInHg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALTIMINHG$20) != 0;
            }
        }
        
        /**
         * Sets the "altim_in_hg" element
         */
        public void setAltimInHg(float altimInHg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTIMINHG$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALTIMINHG$20);
                }
                target.setFloatValue(altimInHg);
            }
        }
        
        /**
         * Sets (as xml) the "altim_in_hg" element
         */
        public void xsetAltimInHg(org.apache.xmlbeans.XmlFloat altimInHg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(ALTIMINHG$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(ALTIMINHG$20);
                }
                target.set(altimInHg);
            }
        }
        
        /**
         * Unsets the "altim_in_hg" element
         */
        public void unsetAltimInHg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALTIMINHG$20, 0);
            }
        }
        
        /**
         * Gets the "sea_level_pressure_mb" element
         */
        public float getSeaLevelPressureMb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEALEVELPRESSUREMB$22, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "sea_level_pressure_mb" element
         */
        public org.apache.xmlbeans.XmlFloat xgetSeaLevelPressureMb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(SEALEVELPRESSUREMB$22, 0);
                return target;
            }
        }
        
        /**
         * True if has "sea_level_pressure_mb" element
         */
        public boolean isSetSeaLevelPressureMb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SEALEVELPRESSUREMB$22) != 0;
            }
        }
        
        /**
         * Sets the "sea_level_pressure_mb" element
         */
        public void setSeaLevelPressureMb(float seaLevelPressureMb)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEALEVELPRESSUREMB$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEALEVELPRESSUREMB$22);
                }
                target.setFloatValue(seaLevelPressureMb);
            }
        }
        
        /**
         * Sets (as xml) the "sea_level_pressure_mb" element
         */
        public void xsetSeaLevelPressureMb(org.apache.xmlbeans.XmlFloat seaLevelPressureMb)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(SEALEVELPRESSUREMB$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(SEALEVELPRESSUREMB$22);
                }
                target.set(seaLevelPressureMb);
            }
        }
        
        /**
         * Unsets the "sea_level_pressure_mb" element
         */
        public void unsetSeaLevelPressureMb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SEALEVELPRESSUREMB$22, 0);
            }
        }
        
        /**
         * Gets the "quality_control_flags" element
         */
        public met.QualityControlFlagsDocument.QualityControlFlags getQualityControlFlags()
        {
            synchronized (monitor())
            {
                check_orphaned();
                met.QualityControlFlagsDocument.QualityControlFlags target = null;
                target = (met.QualityControlFlagsDocument.QualityControlFlags)get_store().find_element_user(QUALITYCONTROLFLAGS$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "quality_control_flags" element
         */
        public boolean isSetQualityControlFlags()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUALITYCONTROLFLAGS$24) != 0;
            }
        }
        
        /**
         * Sets the "quality_control_flags" element
         */
        public void setQualityControlFlags(met.QualityControlFlagsDocument.QualityControlFlags qualityControlFlags)
        {
            synchronized (monitor())
            {
                check_orphaned();
                met.QualityControlFlagsDocument.QualityControlFlags target = null;
                target = (met.QualityControlFlagsDocument.QualityControlFlags)get_store().find_element_user(QUALITYCONTROLFLAGS$24, 0);
                if (target == null)
                {
                    target = (met.QualityControlFlagsDocument.QualityControlFlags)get_store().add_element_user(QUALITYCONTROLFLAGS$24);
                }
                target.set(qualityControlFlags);
            }
        }
        
        /**
         * Appends and returns a new empty "quality_control_flags" element
         */
        public met.QualityControlFlagsDocument.QualityControlFlags addNewQualityControlFlags()
        {
            synchronized (monitor())
            {
                check_orphaned();
                met.QualityControlFlagsDocument.QualityControlFlags target = null;
                target = (met.QualityControlFlagsDocument.QualityControlFlags)get_store().add_element_user(QUALITYCONTROLFLAGS$24);
                return target;
            }
        }
        
        /**
         * Unsets the "quality_control_flags" element
         */
        public void unsetQualityControlFlags()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUALITYCONTROLFLAGS$24, 0);
            }
        }
        
        /**
         * Gets the "wx_string" element
         */
        public java.lang.String getWxString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WXSTRING$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "wx_string" element
         */
        public org.apache.xmlbeans.XmlString xgetWxString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WXSTRING$26, 0);
                return target;
            }
        }
        
        /**
         * True if has "wx_string" element
         */
        public boolean isSetWxString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WXSTRING$26) != 0;
            }
        }
        
        /**
         * Sets the "wx_string" element
         */
        public void setWxString(java.lang.String wxString)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WXSTRING$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WXSTRING$26);
                }
                target.setStringValue(wxString);
            }
        }
        
        /**
         * Sets (as xml) the "wx_string" element
         */
        public void xsetWxString(org.apache.xmlbeans.XmlString wxString)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WXSTRING$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WXSTRING$26);
                }
                target.set(wxString);
            }
        }
        
        /**
         * Unsets the "wx_string" element
         */
        public void unsetWxString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WXSTRING$26, 0);
            }
        }
        
        /**
         * Gets array of all "sky_condition" elements
         */
        public met.SkyConditionDocument.SkyCondition[] getSkyConditionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SKYCONDITION$28, targetList);
                met.SkyConditionDocument.SkyCondition[] result = new met.SkyConditionDocument.SkyCondition[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "sky_condition" element
         */
        public met.SkyConditionDocument.SkyCondition getSkyConditionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                met.SkyConditionDocument.SkyCondition target = null;
                target = (met.SkyConditionDocument.SkyCondition)get_store().find_element_user(SKYCONDITION$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "sky_condition" element
         */
        public int sizeOfSkyConditionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SKYCONDITION$28);
            }
        }
        
        /**
         * Sets array of all "sky_condition" element
         */
        public void setSkyConditionArray(met.SkyConditionDocument.SkyCondition[] skyConditionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(skyConditionArray, SKYCONDITION$28);
            }
        }
        
        /**
         * Sets ith "sky_condition" element
         */
        public void setSkyConditionArray(int i, met.SkyConditionDocument.SkyCondition skyCondition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                met.SkyConditionDocument.SkyCondition target = null;
                target = (met.SkyConditionDocument.SkyCondition)get_store().find_element_user(SKYCONDITION$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(skyCondition);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sky_condition" element
         */
        public met.SkyConditionDocument.SkyCondition insertNewSkyCondition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                met.SkyConditionDocument.SkyCondition target = null;
                target = (met.SkyConditionDocument.SkyCondition)get_store().insert_element_user(SKYCONDITION$28, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sky_condition" element
         */
        public met.SkyConditionDocument.SkyCondition addNewSkyCondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                met.SkyConditionDocument.SkyCondition target = null;
                target = (met.SkyConditionDocument.SkyCondition)get_store().add_element_user(SKYCONDITION$28);
                return target;
            }
        }
        
        /**
         * Removes the ith "sky_condition" element
         */
        public void removeSkyCondition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SKYCONDITION$28, i);
            }
        }
        
        /**
         * Gets the "flight_category" element
         */
        public java.lang.String getFlightCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTCATEGORY$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "flight_category" element
         */
        public org.apache.xmlbeans.XmlString xgetFlightCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FLIGHTCATEGORY$30, 0);
                return target;
            }
        }
        
        /**
         * True if has "flight_category" element
         */
        public boolean isSetFlightCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FLIGHTCATEGORY$30) != 0;
            }
        }
        
        /**
         * Sets the "flight_category" element
         */
        public void setFlightCategory(java.lang.String flightCategory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTCATEGORY$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLIGHTCATEGORY$30);
                }
                target.setStringValue(flightCategory);
            }
        }
        
        /**
         * Sets (as xml) the "flight_category" element
         */
        public void xsetFlightCategory(org.apache.xmlbeans.XmlString flightCategory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FLIGHTCATEGORY$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FLIGHTCATEGORY$30);
                }
                target.set(flightCategory);
            }
        }
        
        /**
         * Unsets the "flight_category" element
         */
        public void unsetFlightCategory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FLIGHTCATEGORY$30, 0);
            }
        }
        
        /**
         * Gets the "three_hr_pressure_tendency_mb" element
         */
        public float getThreeHrPressureTendencyMb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THREEHRPRESSURETENDENCYMB$32, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "three_hr_pressure_tendency_mb" element
         */
        public org.apache.xmlbeans.XmlFloat xgetThreeHrPressureTendencyMb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(THREEHRPRESSURETENDENCYMB$32, 0);
                return target;
            }
        }
        
        /**
         * True if has "three_hr_pressure_tendency_mb" element
         */
        public boolean isSetThreeHrPressureTendencyMb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(THREEHRPRESSURETENDENCYMB$32) != 0;
            }
        }
        
        /**
         * Sets the "three_hr_pressure_tendency_mb" element
         */
        public void setThreeHrPressureTendencyMb(float threeHrPressureTendencyMb)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THREEHRPRESSURETENDENCYMB$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(THREEHRPRESSURETENDENCYMB$32);
                }
                target.setFloatValue(threeHrPressureTendencyMb);
            }
        }
        
        /**
         * Sets (as xml) the "three_hr_pressure_tendency_mb" element
         */
        public void xsetThreeHrPressureTendencyMb(org.apache.xmlbeans.XmlFloat threeHrPressureTendencyMb)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(THREEHRPRESSURETENDENCYMB$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(THREEHRPRESSURETENDENCYMB$32);
                }
                target.set(threeHrPressureTendencyMb);
            }
        }
        
        /**
         * Unsets the "three_hr_pressure_tendency_mb" element
         */
        public void unsetThreeHrPressureTendencyMb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(THREEHRPRESSURETENDENCYMB$32, 0);
            }
        }
        
        /**
         * Gets the "maxT_c" element
         */
        public float getMaxTC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXTC$34, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "maxT_c" element
         */
        public org.apache.xmlbeans.XmlFloat xgetMaxTC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MAXTC$34, 0);
                return target;
            }
        }
        
        /**
         * True if has "maxT_c" element
         */
        public boolean isSetMaxTC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAXTC$34) != 0;
            }
        }
        
        /**
         * Sets the "maxT_c" element
         */
        public void setMaxTC(float maxTC)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXTC$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXTC$34);
                }
                target.setFloatValue(maxTC);
            }
        }
        
        /**
         * Sets (as xml) the "maxT_c" element
         */
        public void xsetMaxTC(org.apache.xmlbeans.XmlFloat maxTC)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MAXTC$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(MAXTC$34);
                }
                target.set(maxTC);
            }
        }
        
        /**
         * Unsets the "maxT_c" element
         */
        public void unsetMaxTC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAXTC$34, 0);
            }
        }
        
        /**
         * Gets the "minT_c" element
         */
        public float getMinTC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINTC$36, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "minT_c" element
         */
        public org.apache.xmlbeans.XmlFloat xgetMinTC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MINTC$36, 0);
                return target;
            }
        }
        
        /**
         * True if has "minT_c" element
         */
        public boolean isSetMinTC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MINTC$36) != 0;
            }
        }
        
        /**
         * Sets the "minT_c" element
         */
        public void setMinTC(float minTC)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINTC$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINTC$36);
                }
                target.setFloatValue(minTC);
            }
        }
        
        /**
         * Sets (as xml) the "minT_c" element
         */
        public void xsetMinTC(org.apache.xmlbeans.XmlFloat minTC)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MINTC$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(MINTC$36);
                }
                target.set(minTC);
            }
        }
        
        /**
         * Unsets the "minT_c" element
         */
        public void unsetMinTC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MINTC$36, 0);
            }
        }
        
        /**
         * Gets the "maxT24hr_c" element
         */
        public float getMaxT24HrC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXT24HRC$38, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "maxT24hr_c" element
         */
        public org.apache.xmlbeans.XmlFloat xgetMaxT24HrC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MAXT24HRC$38, 0);
                return target;
            }
        }
        
        /**
         * True if has "maxT24hr_c" element
         */
        public boolean isSetMaxT24HrC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAXT24HRC$38) != 0;
            }
        }
        
        /**
         * Sets the "maxT24hr_c" element
         */
        public void setMaxT24HrC(float maxT24HrC)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXT24HRC$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXT24HRC$38);
                }
                target.setFloatValue(maxT24HrC);
            }
        }
        
        /**
         * Sets (as xml) the "maxT24hr_c" element
         */
        public void xsetMaxT24HrC(org.apache.xmlbeans.XmlFloat maxT24HrC)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MAXT24HRC$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(MAXT24HRC$38);
                }
                target.set(maxT24HrC);
            }
        }
        
        /**
         * Unsets the "maxT24hr_c" element
         */
        public void unsetMaxT24HrC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAXT24HRC$38, 0);
            }
        }
        
        /**
         * Gets the "minT24hr_c" element
         */
        public float getMinT24HrC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINT24HRC$40, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "minT24hr_c" element
         */
        public org.apache.xmlbeans.XmlFloat xgetMinT24HrC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MINT24HRC$40, 0);
                return target;
            }
        }
        
        /**
         * True if has "minT24hr_c" element
         */
        public boolean isSetMinT24HrC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MINT24HRC$40) != 0;
            }
        }
        
        /**
         * Sets the "minT24hr_c" element
         */
        public void setMinT24HrC(float minT24HrC)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINT24HRC$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINT24HRC$40);
                }
                target.setFloatValue(minT24HrC);
            }
        }
        
        /**
         * Sets (as xml) the "minT24hr_c" element
         */
        public void xsetMinT24HrC(org.apache.xmlbeans.XmlFloat minT24HrC)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MINT24HRC$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(MINT24HRC$40);
                }
                target.set(minT24HrC);
            }
        }
        
        /**
         * Unsets the "minT24hr_c" element
         */
        public void unsetMinT24HrC()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MINT24HRC$40, 0);
            }
        }
        
        /**
         * Gets the "precip_in" element
         */
        public float getPrecipIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECIPIN$42, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "precip_in" element
         */
        public org.apache.xmlbeans.XmlFloat xgetPrecipIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PRECIPIN$42, 0);
                return target;
            }
        }
        
        /**
         * True if has "precip_in" element
         */
        public boolean isSetPrecipIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRECIPIN$42) != 0;
            }
        }
        
        /**
         * Sets the "precip_in" element
         */
        public void setPrecipIn(float precipIn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECIPIN$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRECIPIN$42);
                }
                target.setFloatValue(precipIn);
            }
        }
        
        /**
         * Sets (as xml) the "precip_in" element
         */
        public void xsetPrecipIn(org.apache.xmlbeans.XmlFloat precipIn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PRECIPIN$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(PRECIPIN$42);
                }
                target.set(precipIn);
            }
        }
        
        /**
         * Unsets the "precip_in" element
         */
        public void unsetPrecipIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRECIPIN$42, 0);
            }
        }
        
        /**
         * Gets the "pcp3hr_in" element
         */
        public float getPcp3HrIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PCP3HRIN$44, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "pcp3hr_in" element
         */
        public org.apache.xmlbeans.XmlFloat xgetPcp3HrIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PCP3HRIN$44, 0);
                return target;
            }
        }
        
        /**
         * True if has "pcp3hr_in" element
         */
        public boolean isSetPcp3HrIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PCP3HRIN$44) != 0;
            }
        }
        
        /**
         * Sets the "pcp3hr_in" element
         */
        public void setPcp3HrIn(float pcp3HrIn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PCP3HRIN$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PCP3HRIN$44);
                }
                target.setFloatValue(pcp3HrIn);
            }
        }
        
        /**
         * Sets (as xml) the "pcp3hr_in" element
         */
        public void xsetPcp3HrIn(org.apache.xmlbeans.XmlFloat pcp3HrIn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PCP3HRIN$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(PCP3HRIN$44);
                }
                target.set(pcp3HrIn);
            }
        }
        
        /**
         * Unsets the "pcp3hr_in" element
         */
        public void unsetPcp3HrIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PCP3HRIN$44, 0);
            }
        }
        
        /**
         * Gets the "pcp6hr_in" element
         */
        public float getPcp6HrIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PCP6HRIN$46, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "pcp6hr_in" element
         */
        public org.apache.xmlbeans.XmlFloat xgetPcp6HrIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PCP6HRIN$46, 0);
                return target;
            }
        }
        
        /**
         * True if has "pcp6hr_in" element
         */
        public boolean isSetPcp6HrIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PCP6HRIN$46) != 0;
            }
        }
        
        /**
         * Sets the "pcp6hr_in" element
         */
        public void setPcp6HrIn(float pcp6HrIn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PCP6HRIN$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PCP6HRIN$46);
                }
                target.setFloatValue(pcp6HrIn);
            }
        }
        
        /**
         * Sets (as xml) the "pcp6hr_in" element
         */
        public void xsetPcp6HrIn(org.apache.xmlbeans.XmlFloat pcp6HrIn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PCP6HRIN$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(PCP6HRIN$46);
                }
                target.set(pcp6HrIn);
            }
        }
        
        /**
         * Unsets the "pcp6hr_in" element
         */
        public void unsetPcp6HrIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PCP6HRIN$46, 0);
            }
        }
        
        /**
         * Gets the "pcp24hr_in" element
         */
        public float getPcp24HrIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PCP24HRIN$48, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "pcp24hr_in" element
         */
        public org.apache.xmlbeans.XmlFloat xgetPcp24HrIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PCP24HRIN$48, 0);
                return target;
            }
        }
        
        /**
         * True if has "pcp24hr_in" element
         */
        public boolean isSetPcp24HrIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PCP24HRIN$48) != 0;
            }
        }
        
        /**
         * Sets the "pcp24hr_in" element
         */
        public void setPcp24HrIn(float pcp24HrIn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PCP24HRIN$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PCP24HRIN$48);
                }
                target.setFloatValue(pcp24HrIn);
            }
        }
        
        /**
         * Sets (as xml) the "pcp24hr_in" element
         */
        public void xsetPcp24HrIn(org.apache.xmlbeans.XmlFloat pcp24HrIn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PCP24HRIN$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(PCP24HRIN$48);
                }
                target.set(pcp24HrIn);
            }
        }
        
        /**
         * Unsets the "pcp24hr_in" element
         */
        public void unsetPcp24HrIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PCP24HRIN$48, 0);
            }
        }
        
        /**
         * Gets the "snow_in" element
         */
        public float getSnowIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SNOWIN$50, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "snow_in" element
         */
        public org.apache.xmlbeans.XmlFloat xgetSnowIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(SNOWIN$50, 0);
                return target;
            }
        }
        
        /**
         * True if has "snow_in" element
         */
        public boolean isSetSnowIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SNOWIN$50) != 0;
            }
        }
        
        /**
         * Sets the "snow_in" element
         */
        public void setSnowIn(float snowIn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SNOWIN$50, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SNOWIN$50);
                }
                target.setFloatValue(snowIn);
            }
        }
        
        /**
         * Sets (as xml) the "snow_in" element
         */
        public void xsetSnowIn(org.apache.xmlbeans.XmlFloat snowIn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(SNOWIN$50, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(SNOWIN$50);
                }
                target.set(snowIn);
            }
        }
        
        /**
         * Unsets the "snow_in" element
         */
        public void unsetSnowIn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SNOWIN$50, 0);
            }
        }
        
        /**
         * Gets the "vert_vis_ft" element
         */
        public int getVertVisFt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERTVISFT$52, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "vert_vis_ft" element
         */
        public org.apache.xmlbeans.XmlInt xgetVertVisFt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VERTVISFT$52, 0);
                return target;
            }
        }
        
        /**
         * True if has "vert_vis_ft" element
         */
        public boolean isSetVertVisFt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VERTVISFT$52) != 0;
            }
        }
        
        /**
         * Sets the "vert_vis_ft" element
         */
        public void setVertVisFt(int vertVisFt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERTVISFT$52, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERTVISFT$52);
                }
                target.setIntValue(vertVisFt);
            }
        }
        
        /**
         * Sets (as xml) the "vert_vis_ft" element
         */
        public void xsetVertVisFt(org.apache.xmlbeans.XmlInt vertVisFt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VERTVISFT$52, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(VERTVISFT$52);
                }
                target.set(vertVisFt);
            }
        }
        
        /**
         * Unsets the "vert_vis_ft" element
         */
        public void unsetVertVisFt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VERTVISFT$52, 0);
            }
        }
        
        /**
         * Gets the "metar_type" element
         */
        public java.lang.String getMetarType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METARTYPE$54, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "metar_type" element
         */
        public org.apache.xmlbeans.XmlString xgetMetarType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METARTYPE$54, 0);
                return target;
            }
        }
        
        /**
         * True if has "metar_type" element
         */
        public boolean isSetMetarType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(METARTYPE$54) != 0;
            }
        }
        
        /**
         * Sets the "metar_type" element
         */
        public void setMetarType(java.lang.String metarType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METARTYPE$54, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METARTYPE$54);
                }
                target.setStringValue(metarType);
            }
        }
        
        /**
         * Sets (as xml) the "metar_type" element
         */
        public void xsetMetarType(org.apache.xmlbeans.XmlString metarType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METARTYPE$54, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(METARTYPE$54);
                }
                target.set(metarType);
            }
        }
        
        /**
         * Unsets the "metar_type" element
         */
        public void unsetMetarType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(METARTYPE$54, 0);
            }
        }
        
        /**
         * Gets the "elevation_m" element
         */
        public float getElevationM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELEVATIONM$56, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "elevation_m" element
         */
        public org.apache.xmlbeans.XmlFloat xgetElevationM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(ELEVATIONM$56, 0);
                return target;
            }
        }
        
        /**
         * True if has "elevation_m" element
         */
        public boolean isSetElevationM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ELEVATIONM$56) != 0;
            }
        }
        
        /**
         * Sets the "elevation_m" element
         */
        public void setElevationM(float elevationM)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELEVATIONM$56, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ELEVATIONM$56);
                }
                target.setFloatValue(elevationM);
            }
        }
        
        /**
         * Sets (as xml) the "elevation_m" element
         */
        public void xsetElevationM(org.apache.xmlbeans.XmlFloat elevationM)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(ELEVATIONM$56, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(ELEVATIONM$56);
                }
                target.set(elevationM);
            }
        }
        
        /**
         * Unsets the "elevation_m" element
         */
        public void unsetElevationM()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ELEVATIONM$56, 0);
            }
        }
    }
}
