/*
 * An XML document type.
 * Localname: quality_control_flags
 * Namespace: met
 * Java type: met.QualityControlFlagsDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one quality_control_flags(@met) element.
 *
 * This is a complex type.
 */
public class QualityControlFlagsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.QualityControlFlagsDocument
{
    private static final long serialVersionUID = 1L;
    
    public QualityControlFlagsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUALITYCONTROLFLAGS$0 = 
        new javax.xml.namespace.QName("met", "quality_control_flags");
    
    
    /**
     * Gets the "quality_control_flags" element
     */
    public met.QualityControlFlagsDocument.QualityControlFlags getQualityControlFlags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.QualityControlFlagsDocument.QualityControlFlags target = null;
            target = (met.QualityControlFlagsDocument.QualityControlFlags)get_store().find_element_user(QUALITYCONTROLFLAGS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (met.QualityControlFlagsDocument.QualityControlFlags)get_store().find_element_user(QUALITYCONTROLFLAGS$0, 0);
            if (target == null)
            {
                target = (met.QualityControlFlagsDocument.QualityControlFlags)get_store().add_element_user(QUALITYCONTROLFLAGS$0);
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
            target = (met.QualityControlFlagsDocument.QualityControlFlags)get_store().add_element_user(QUALITYCONTROLFLAGS$0);
            return target;
        }
    }
    /**
     * An XML quality_control_flags(@met).
     *
     * This is a complex type.
     */
    public static class QualityControlFlagsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.QualityControlFlagsDocument.QualityControlFlags
    {
        private static final long serialVersionUID = 1L;
        
        public QualityControlFlagsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CORRECTED$0 = 
            new javax.xml.namespace.QName("met", "corrected");
        private static final javax.xml.namespace.QName AUTO$2 = 
            new javax.xml.namespace.QName("met", "auto");
        private static final javax.xml.namespace.QName AUTOSTATION$4 = 
            new javax.xml.namespace.QName("met", "auto_station");
        private static final javax.xml.namespace.QName MAINTENANCEINDICATORON$6 = 
            new javax.xml.namespace.QName("met", "maintenance_indicator_on");
        private static final javax.xml.namespace.QName NOSIGNAL$8 = 
            new javax.xml.namespace.QName("met", "no_signal");
        private static final javax.xml.namespace.QName LIGHTNINGSENSOROFF$10 = 
            new javax.xml.namespace.QName("met", "lightning_sensor_off");
        private static final javax.xml.namespace.QName FREEZINGRAINSENSOROFF$12 = 
            new javax.xml.namespace.QName("met", "freezing_rain_sensor_off");
        private static final javax.xml.namespace.QName PRESENTWEATHERSENSOROFF$14 = 
            new javax.xml.namespace.QName("met", "present_weather_sensor_off");
        
        
        /**
         * Gets the "corrected" element
         */
        public java.lang.String getCorrected()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRECTED$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "corrected" element
         */
        public org.apache.xmlbeans.XmlString xgetCorrected()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORRECTED$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "corrected" element
         */
        public boolean isSetCorrected()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CORRECTED$0) != 0;
            }
        }
        
        /**
         * Sets the "corrected" element
         */
        public void setCorrected(java.lang.String corrected)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRECTED$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORRECTED$0);
                }
                target.setStringValue(corrected);
            }
        }
        
        /**
         * Sets (as xml) the "corrected" element
         */
        public void xsetCorrected(org.apache.xmlbeans.XmlString corrected)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORRECTED$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORRECTED$0);
                }
                target.set(corrected);
            }
        }
        
        /**
         * Unsets the "corrected" element
         */
        public void unsetCorrected()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CORRECTED$0, 0);
            }
        }
        
        /**
         * Gets the "auto" element
         */
        public java.lang.String getAuto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTO$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "auto" element
         */
        public org.apache.xmlbeans.XmlString xgetAuto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTO$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "auto" element
         */
        public boolean isSetAuto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AUTO$2) != 0;
            }
        }
        
        /**
         * Sets the "auto" element
         */
        public void setAuto(java.lang.String auto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTO$2);
                }
                target.setStringValue(auto);
            }
        }
        
        /**
         * Sets (as xml) the "auto" element
         */
        public void xsetAuto(org.apache.xmlbeans.XmlString auto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTO$2);
                }
                target.set(auto);
            }
        }
        
        /**
         * Unsets the "auto" element
         */
        public void unsetAuto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AUTO$2, 0);
            }
        }
        
        /**
         * Gets the "auto_station" element
         */
        public java.lang.String getAutoStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOSTATION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "auto_station" element
         */
        public org.apache.xmlbeans.XmlString xgetAutoStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTOSTATION$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "auto_station" element
         */
        public boolean isSetAutoStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AUTOSTATION$4) != 0;
            }
        }
        
        /**
         * Sets the "auto_station" element
         */
        public void setAutoStation(java.lang.String autoStation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOSTATION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTOSTATION$4);
                }
                target.setStringValue(autoStation);
            }
        }
        
        /**
         * Sets (as xml) the "auto_station" element
         */
        public void xsetAutoStation(org.apache.xmlbeans.XmlString autoStation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTOSTATION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTOSTATION$4);
                }
                target.set(autoStation);
            }
        }
        
        /**
         * Unsets the "auto_station" element
         */
        public void unsetAutoStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AUTOSTATION$4, 0);
            }
        }
        
        /**
         * Gets the "maintenance_indicator_on" element
         */
        public java.lang.String getMaintenanceIndicatorOn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAINTENANCEINDICATORON$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "maintenance_indicator_on" element
         */
        public org.apache.xmlbeans.XmlString xgetMaintenanceIndicatorOn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAINTENANCEINDICATORON$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "maintenance_indicator_on" element
         */
        public boolean isSetMaintenanceIndicatorOn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MAINTENANCEINDICATORON$6) != 0;
            }
        }
        
        /**
         * Sets the "maintenance_indicator_on" element
         */
        public void setMaintenanceIndicatorOn(java.lang.String maintenanceIndicatorOn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAINTENANCEINDICATORON$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAINTENANCEINDICATORON$6);
                }
                target.setStringValue(maintenanceIndicatorOn);
            }
        }
        
        /**
         * Sets (as xml) the "maintenance_indicator_on" element
         */
        public void xsetMaintenanceIndicatorOn(org.apache.xmlbeans.XmlString maintenanceIndicatorOn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAINTENANCEINDICATORON$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAINTENANCEINDICATORON$6);
                }
                target.set(maintenanceIndicatorOn);
            }
        }
        
        /**
         * Unsets the "maintenance_indicator_on" element
         */
        public void unsetMaintenanceIndicatorOn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MAINTENANCEINDICATORON$6, 0);
            }
        }
        
        /**
         * Gets the "no_signal" element
         */
        public java.lang.String getNoSignal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOSIGNAL$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "no_signal" element
         */
        public org.apache.xmlbeans.XmlString xgetNoSignal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOSIGNAL$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "no_signal" element
         */
        public boolean isSetNoSignal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NOSIGNAL$8) != 0;
            }
        }
        
        /**
         * Sets the "no_signal" element
         */
        public void setNoSignal(java.lang.String noSignal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOSIGNAL$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOSIGNAL$8);
                }
                target.setStringValue(noSignal);
            }
        }
        
        /**
         * Sets (as xml) the "no_signal" element
         */
        public void xsetNoSignal(org.apache.xmlbeans.XmlString noSignal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOSIGNAL$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOSIGNAL$8);
                }
                target.set(noSignal);
            }
        }
        
        /**
         * Unsets the "no_signal" element
         */
        public void unsetNoSignal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NOSIGNAL$8, 0);
            }
        }
        
        /**
         * Gets the "lightning_sensor_off" element
         */
        public java.lang.String getLightningSensorOff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIGHTNINGSENSOROFF$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lightning_sensor_off" element
         */
        public org.apache.xmlbeans.XmlString xgetLightningSensorOff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LIGHTNINGSENSOROFF$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "lightning_sensor_off" element
         */
        public boolean isSetLightningSensorOff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LIGHTNINGSENSOROFF$10) != 0;
            }
        }
        
        /**
         * Sets the "lightning_sensor_off" element
         */
        public void setLightningSensorOff(java.lang.String lightningSensorOff)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIGHTNINGSENSOROFF$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIGHTNINGSENSOROFF$10);
                }
                target.setStringValue(lightningSensorOff);
            }
        }
        
        /**
         * Sets (as xml) the "lightning_sensor_off" element
         */
        public void xsetLightningSensorOff(org.apache.xmlbeans.XmlString lightningSensorOff)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LIGHTNINGSENSOROFF$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LIGHTNINGSENSOROFF$10);
                }
                target.set(lightningSensorOff);
            }
        }
        
        /**
         * Unsets the "lightning_sensor_off" element
         */
        public void unsetLightningSensorOff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LIGHTNINGSENSOROFF$10, 0);
            }
        }
        
        /**
         * Gets the "freezing_rain_sensor_off" element
         */
        public java.lang.String getFreezingRainSensorOff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEZINGRAINSENSOROFF$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "freezing_rain_sensor_off" element
         */
        public org.apache.xmlbeans.XmlString xgetFreezingRainSensorOff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FREEZINGRAINSENSOROFF$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "freezing_rain_sensor_off" element
         */
        public boolean isSetFreezingRainSensorOff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FREEZINGRAINSENSOROFF$12) != 0;
            }
        }
        
        /**
         * Sets the "freezing_rain_sensor_off" element
         */
        public void setFreezingRainSensorOff(java.lang.String freezingRainSensorOff)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREEZINGRAINSENSOROFF$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FREEZINGRAINSENSOROFF$12);
                }
                target.setStringValue(freezingRainSensorOff);
            }
        }
        
        /**
         * Sets (as xml) the "freezing_rain_sensor_off" element
         */
        public void xsetFreezingRainSensorOff(org.apache.xmlbeans.XmlString freezingRainSensorOff)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FREEZINGRAINSENSOROFF$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FREEZINGRAINSENSOROFF$12);
                }
                target.set(freezingRainSensorOff);
            }
        }
        
        /**
         * Unsets the "freezing_rain_sensor_off" element
         */
        public void unsetFreezingRainSensorOff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FREEZINGRAINSENSOROFF$12, 0);
            }
        }
        
        /**
         * Gets the "present_weather_sensor_off" element
         */
        public java.lang.String getPresentWeatherSensorOff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTWEATHERSENSOROFF$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "present_weather_sensor_off" element
         */
        public org.apache.xmlbeans.XmlString xgetPresentWeatherSensorOff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRESENTWEATHERSENSOROFF$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "present_weather_sensor_off" element
         */
        public boolean isSetPresentWeatherSensorOff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRESENTWEATHERSENSOROFF$14) != 0;
            }
        }
        
        /**
         * Sets the "present_weather_sensor_off" element
         */
        public void setPresentWeatherSensorOff(java.lang.String presentWeatherSensorOff)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRESENTWEATHERSENSOROFF$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRESENTWEATHERSENSOROFF$14);
                }
                target.setStringValue(presentWeatherSensorOff);
            }
        }
        
        /**
         * Sets (as xml) the "present_weather_sensor_off" element
         */
        public void xsetPresentWeatherSensorOff(org.apache.xmlbeans.XmlString presentWeatherSensorOff)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRESENTWEATHERSENSOROFF$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRESENTWEATHERSENSOROFF$14);
                }
                target.set(presentWeatherSensorOff);
            }
        }
        
        /**
         * Unsets the "present_weather_sensor_off" element
         */
        public void unsetPresentWeatherSensorOff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRESENTWEATHERSENSOROFF$14, 0);
            }
        }
    }
}
