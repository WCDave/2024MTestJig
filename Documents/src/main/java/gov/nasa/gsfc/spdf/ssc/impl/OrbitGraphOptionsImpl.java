/*
 * XML Type:  orbitGraphOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML orbitGraphOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class OrbitGraphOptionsImpl extends gov.nasa.gsfc.spdf.ssc.impl.GraphOptionsImpl implements gov.nasa.gsfc.spdf.ssc.OrbitGraphOptions
{
    private static final long serialVersionUID = 1L;
    
    public OrbitGraphOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMBINED$0 = 
        new javax.xml.namespace.QName("", "combined");
    private static final javax.xml.namespace.QName COORDINATESYSTEM$2 = 
        new javax.xml.namespace.QName("", "coordinateSystem");
    private static final javax.xml.namespace.QName EVENAXESSCALES$4 = 
        new javax.xml.namespace.QName("", "evenAxesScales");
    private static final javax.xml.namespace.QName FORMATOPTIONS$6 = 
        new javax.xml.namespace.QName("", "formatOptions");
    private static final javax.xml.namespace.QName IMFBZ$8 = 
        new javax.xml.namespace.QName("", "imfBz");
    private static final javax.xml.namespace.QName MANUALSCALE$10 = 
        new javax.xml.namespace.QName("", "manualScale");
    private static final javax.xml.namespace.QName SHOWBOWSHOCKMAGNETOPAUSE$12 = 
        new javax.xml.namespace.QName("", "showBowShockMagnetopause");
    private static final javax.xml.namespace.QName SOLARWINDPRESSURE$14 = 
        new javax.xml.namespace.QName("", "solarWindPressure");
    private static final javax.xml.namespace.QName SUNTORIGHT$16 = 
        new javax.xml.namespace.QName("", "sunToRight");
    private static final javax.xml.namespace.QName XRVIEW$18 = 
        new javax.xml.namespace.QName("", "xrView");
    private static final javax.xml.namespace.QName XYVIEW$20 = 
        new javax.xml.namespace.QName("", "xyView");
    private static final javax.xml.namespace.QName XZVIEW$22 = 
        new javax.xml.namespace.QName("", "xzView");
    private static final javax.xml.namespace.QName YZVIEW$24 = 
        new javax.xml.namespace.QName("", "yzView");
    
    
    /**
     * Gets the "combined" element
     */
    public boolean getCombined()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMBINED$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "combined" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCombined()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(COMBINED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "combined" element
     */
    public void setCombined(boolean combined)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMBINED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMBINED$0);
            }
            target.setBooleanValue(combined);
        }
    }
    
    /**
     * Sets (as xml) the "combined" element
     */
    public void xsetCombined(org.apache.xmlbeans.XmlBoolean combined)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(COMBINED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(COMBINED$0);
            }
            target.set(combined);
        }
    }
    
    /**
     * Gets the "coordinateSystem" element
     */
    public gov.nasa.gsfc.spdf.ssc.CoordinateSystem.Enum getCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COORDINATESYSTEM$2, 0);
            if (target == null)
            {
                return null;
            }
            return (gov.nasa.gsfc.spdf.ssc.CoordinateSystem.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "coordinateSystem" element
     */
    public gov.nasa.gsfc.spdf.ssc.CoordinateSystem xgetCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.CoordinateSystem target = null;
            target = (gov.nasa.gsfc.spdf.ssc.CoordinateSystem)get_store().find_element_user(COORDINATESYSTEM$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "coordinateSystem" element
     */
    public boolean isSetCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COORDINATESYSTEM$2) != 0;
        }
    }
    
    /**
     * Sets the "coordinateSystem" element
     */
    public void setCoordinateSystem(gov.nasa.gsfc.spdf.ssc.CoordinateSystem.Enum coordinateSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COORDINATESYSTEM$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COORDINATESYSTEM$2);
            }
            target.setEnumValue(coordinateSystem);
        }
    }
    
    /**
     * Sets (as xml) the "coordinateSystem" element
     */
    public void xsetCoordinateSystem(gov.nasa.gsfc.spdf.ssc.CoordinateSystem coordinateSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.CoordinateSystem target = null;
            target = (gov.nasa.gsfc.spdf.ssc.CoordinateSystem)get_store().find_element_user(COORDINATESYSTEM$2, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.CoordinateSystem)get_store().add_element_user(COORDINATESYSTEM$2);
            }
            target.set(coordinateSystem);
        }
    }
    
    /**
     * Unsets the "coordinateSystem" element
     */
    public void unsetCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COORDINATESYSTEM$2, 0);
        }
    }
    
    /**
     * Gets the "evenAxesScales" element
     */
    public boolean getEvenAxesScales()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENAXESSCALES$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "evenAxesScales" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetEvenAxesScales()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EVENAXESSCALES$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "evenAxesScales" element
     */
    public void setEvenAxesScales(boolean evenAxesScales)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENAXESSCALES$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENAXESSCALES$4);
            }
            target.setBooleanValue(evenAxesScales);
        }
    }
    
    /**
     * Sets (as xml) the "evenAxesScales" element
     */
    public void xsetEvenAxesScales(org.apache.xmlbeans.XmlBoolean evenAxesScales)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EVENAXESSCALES$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(EVENAXESSCALES$4);
            }
            target.set(evenAxesScales);
        }
    }
    
    /**
     * Gets the "formatOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.GraphFormatOptions getFormatOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GraphFormatOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GraphFormatOptions)get_store().find_element_user(FORMATOPTIONS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "formatOptions" element
     */
    public boolean isSetFormatOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMATOPTIONS$6) != 0;
        }
    }
    
    /**
     * Sets the "formatOptions" element
     */
    public void setFormatOptions(gov.nasa.gsfc.spdf.ssc.GraphFormatOptions formatOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GraphFormatOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GraphFormatOptions)get_store().find_element_user(FORMATOPTIONS$6, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.GraphFormatOptions)get_store().add_element_user(FORMATOPTIONS$6);
            }
            target.set(formatOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "formatOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.GraphFormatOptions addNewFormatOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GraphFormatOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GraphFormatOptions)get_store().add_element_user(FORMATOPTIONS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "formatOptions" element
     */
    public void unsetFormatOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMATOPTIONS$6, 0);
        }
    }
    
    /**
     * Gets the "imfBz" element
     */
    public float getImfBz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMFBZ$8, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "imfBz" element
     */
    public org.apache.xmlbeans.XmlFloat xgetImfBz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(IMFBZ$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "imfBz" element
     */
    public void setImfBz(float imfBz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMFBZ$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMFBZ$8);
            }
            target.setFloatValue(imfBz);
        }
    }
    
    /**
     * Sets (as xml) the "imfBz" element
     */
    public void xsetImfBz(org.apache.xmlbeans.XmlFloat imfBz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(IMFBZ$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(IMFBZ$8);
            }
            target.set(imfBz);
        }
    }
    
    /**
     * Gets the "manualScale" element
     */
    public gov.nasa.gsfc.spdf.ssc.GraphScale getManualScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GraphScale target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GraphScale)get_store().find_element_user(MANUALSCALE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "manualScale" element
     */
    public boolean isSetManualScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANUALSCALE$10) != 0;
        }
    }
    
    /**
     * Sets the "manualScale" element
     */
    public void setManualScale(gov.nasa.gsfc.spdf.ssc.GraphScale manualScale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GraphScale target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GraphScale)get_store().find_element_user(MANUALSCALE$10, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.GraphScale)get_store().add_element_user(MANUALSCALE$10);
            }
            target.set(manualScale);
        }
    }
    
    /**
     * Appends and returns a new empty "manualScale" element
     */
    public gov.nasa.gsfc.spdf.ssc.GraphScale addNewManualScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GraphScale target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GraphScale)get_store().add_element_user(MANUALSCALE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "manualScale" element
     */
    public void unsetManualScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANUALSCALE$10, 0);
        }
    }
    
    /**
     * Gets the "showBowShockMagnetopause" element
     */
    public boolean getShowBowShockMagnetopause()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHOWBOWSHOCKMAGNETOPAUSE$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showBowShockMagnetopause" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowBowShockMagnetopause()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SHOWBOWSHOCKMAGNETOPAUSE$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "showBowShockMagnetopause" element
     */
    public void setShowBowShockMagnetopause(boolean showBowShockMagnetopause)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHOWBOWSHOCKMAGNETOPAUSE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHOWBOWSHOCKMAGNETOPAUSE$12);
            }
            target.setBooleanValue(showBowShockMagnetopause);
        }
    }
    
    /**
     * Sets (as xml) the "showBowShockMagnetopause" element
     */
    public void xsetShowBowShockMagnetopause(org.apache.xmlbeans.XmlBoolean showBowShockMagnetopause)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SHOWBOWSHOCKMAGNETOPAUSE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SHOWBOWSHOCKMAGNETOPAUSE$12);
            }
            target.set(showBowShockMagnetopause);
        }
    }
    
    /**
     * Gets the "solarWindPressure" element
     */
    public float getSolarWindPressure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOLARWINDPRESSURE$14, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "solarWindPressure" element
     */
    public org.apache.xmlbeans.XmlFloat xgetSolarWindPressure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(SOLARWINDPRESSURE$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "solarWindPressure" element
     */
    public void setSolarWindPressure(float solarWindPressure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOLARWINDPRESSURE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOLARWINDPRESSURE$14);
            }
            target.setFloatValue(solarWindPressure);
        }
    }
    
    /**
     * Sets (as xml) the "solarWindPressure" element
     */
    public void xsetSolarWindPressure(org.apache.xmlbeans.XmlFloat solarWindPressure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(SOLARWINDPRESSURE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(SOLARWINDPRESSURE$14);
            }
            target.set(solarWindPressure);
        }
    }
    
    /**
     * Gets the "sunToRight" element
     */
    public boolean getSunToRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUNTORIGHT$16, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "sunToRight" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSunToRight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUNTORIGHT$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sunToRight" element
     */
    public void setSunToRight(boolean sunToRight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUNTORIGHT$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUNTORIGHT$16);
            }
            target.setBooleanValue(sunToRight);
        }
    }
    
    /**
     * Sets (as xml) the "sunToRight" element
     */
    public void xsetSunToRight(org.apache.xmlbeans.XmlBoolean sunToRight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUNTORIGHT$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SUNTORIGHT$16);
            }
            target.set(sunToRight);
        }
    }
    
    /**
     * Gets the "xrView" element
     */
    public boolean getXrView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XRVIEW$18, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "xrView" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetXrView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(XRVIEW$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "xrView" element
     */
    public void setXrView(boolean xrView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XRVIEW$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(XRVIEW$18);
            }
            target.setBooleanValue(xrView);
        }
    }
    
    /**
     * Sets (as xml) the "xrView" element
     */
    public void xsetXrView(org.apache.xmlbeans.XmlBoolean xrView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(XRVIEW$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(XRVIEW$18);
            }
            target.set(xrView);
        }
    }
    
    /**
     * Gets the "xyView" element
     */
    public boolean getXyView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XYVIEW$20, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "xyView" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetXyView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(XYVIEW$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "xyView" element
     */
    public void setXyView(boolean xyView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XYVIEW$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(XYVIEW$20);
            }
            target.setBooleanValue(xyView);
        }
    }
    
    /**
     * Sets (as xml) the "xyView" element
     */
    public void xsetXyView(org.apache.xmlbeans.XmlBoolean xyView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(XYVIEW$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(XYVIEW$20);
            }
            target.set(xyView);
        }
    }
    
    /**
     * Gets the "xzView" element
     */
    public boolean getXzView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XZVIEW$22, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "xzView" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetXzView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(XZVIEW$22, 0);
            return target;
        }
    }
    
    /**
     * Sets the "xzView" element
     */
    public void setXzView(boolean xzView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XZVIEW$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(XZVIEW$22);
            }
            target.setBooleanValue(xzView);
        }
    }
    
    /**
     * Sets (as xml) the "xzView" element
     */
    public void xsetXzView(org.apache.xmlbeans.XmlBoolean xzView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(XZVIEW$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(XZVIEW$22);
            }
            target.set(xzView);
        }
    }
    
    /**
     * Gets the "yzView" element
     */
    public boolean getYzView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YZVIEW$24, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "yzView" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetYzView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(YZVIEW$24, 0);
            return target;
        }
    }
    
    /**
     * Sets the "yzView" element
     */
    public void setYzView(boolean yzView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YZVIEW$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YZVIEW$24);
            }
            target.setBooleanValue(yzView);
        }
    }
    
    /**
     * Sets (as xml) the "yzView" element
     */
    public void xsetYzView(org.apache.xmlbeans.XmlBoolean yzView)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(YZVIEW$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(YZVIEW$24);
            }
            target.set(yzView);
        }
    }
}
