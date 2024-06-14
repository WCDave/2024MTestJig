/*
 * XML Type:  formatOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.FormatOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML formatOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class FormatOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.FormatOptions
{
    private static final long serialVersionUID = 1L;
    
    public FormatOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CDF$0 = 
        new javax.xml.namespace.QName("", "cdf");
    private static final javax.xml.namespace.QName DATEFORMAT$2 = 
        new javax.xml.namespace.QName("", "dateFormat");
    private static final javax.xml.namespace.QName DEGREEFORMAT$4 = 
        new javax.xml.namespace.QName("", "degreeFormat");
    private static final javax.xml.namespace.QName DEGREEPRECISION$6 = 
        new javax.xml.namespace.QName("", "degreePrecision");
    private static final javax.xml.namespace.QName DISTANCEPRECISION$8 = 
        new javax.xml.namespace.QName("", "distancePrecision");
    private static final javax.xml.namespace.QName DISTANCEUNITS$10 = 
        new javax.xml.namespace.QName("", "distanceUnits");
    private static final javax.xml.namespace.QName LATLONFORMAT$12 = 
        new javax.xml.namespace.QName("", "latLonFormat");
    private static final javax.xml.namespace.QName LINESPERPAGE$14 = 
        new javax.xml.namespace.QName("", "linesPerPage");
    private static final javax.xml.namespace.QName TIMEFORMAT$16 = 
        new javax.xml.namespace.QName("", "timeFormat");
    
    
    /**
     * Gets the "cdf" element
     */
    public boolean getCdf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDF$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "cdf" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCdf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CDF$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "cdf" element
     */
    public void setCdf(boolean cdf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CDF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CDF$0);
            }
            target.setBooleanValue(cdf);
        }
    }
    
    /**
     * Sets (as xml) the "cdf" element
     */
    public void xsetCdf(org.apache.xmlbeans.XmlBoolean cdf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CDF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CDF$0);
            }
            target.set(cdf);
        }
    }
    
    /**
     * Gets the "dateFormat" element
     */
    public gov.nasa.gsfc.spdf.ssc.DateFormat.Enum getDateFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEFORMAT$2, 0);
            if (target == null)
            {
                return null;
            }
            return (gov.nasa.gsfc.spdf.ssc.DateFormat.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateFormat" element
     */
    public gov.nasa.gsfc.spdf.ssc.DateFormat xgetDateFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.DateFormat target = null;
            target = (gov.nasa.gsfc.spdf.ssc.DateFormat)get_store().find_element_user(DATEFORMAT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "dateFormat" element
     */
    public boolean isSetDateFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEFORMAT$2) != 0;
        }
    }
    
    /**
     * Sets the "dateFormat" element
     */
    public void setDateFormat(gov.nasa.gsfc.spdf.ssc.DateFormat.Enum dateFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEFORMAT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEFORMAT$2);
            }
            target.setEnumValue(dateFormat);
        }
    }
    
    /**
     * Sets (as xml) the "dateFormat" element
     */
    public void xsetDateFormat(gov.nasa.gsfc.spdf.ssc.DateFormat dateFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.DateFormat target = null;
            target = (gov.nasa.gsfc.spdf.ssc.DateFormat)get_store().find_element_user(DATEFORMAT$2, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.DateFormat)get_store().add_element_user(DATEFORMAT$2);
            }
            target.set(dateFormat);
        }
    }
    
    /**
     * Unsets the "dateFormat" element
     */
    public void unsetDateFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEFORMAT$2, 0);
        }
    }
    
    /**
     * Gets the "degreeFormat" element
     */
    public gov.nasa.gsfc.spdf.ssc.DegreeFormat.Enum getDegreeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEGREEFORMAT$4, 0);
            if (target == null)
            {
                return null;
            }
            return (gov.nasa.gsfc.spdf.ssc.DegreeFormat.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "degreeFormat" element
     */
    public gov.nasa.gsfc.spdf.ssc.DegreeFormat xgetDegreeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.DegreeFormat target = null;
            target = (gov.nasa.gsfc.spdf.ssc.DegreeFormat)get_store().find_element_user(DEGREEFORMAT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "degreeFormat" element
     */
    public boolean isSetDegreeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEGREEFORMAT$4) != 0;
        }
    }
    
    /**
     * Sets the "degreeFormat" element
     */
    public void setDegreeFormat(gov.nasa.gsfc.spdf.ssc.DegreeFormat.Enum degreeFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEGREEFORMAT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEGREEFORMAT$4);
            }
            target.setEnumValue(degreeFormat);
        }
    }
    
    /**
     * Sets (as xml) the "degreeFormat" element
     */
    public void xsetDegreeFormat(gov.nasa.gsfc.spdf.ssc.DegreeFormat degreeFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.DegreeFormat target = null;
            target = (gov.nasa.gsfc.spdf.ssc.DegreeFormat)get_store().find_element_user(DEGREEFORMAT$4, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.DegreeFormat)get_store().add_element_user(DEGREEFORMAT$4);
            }
            target.set(degreeFormat);
        }
    }
    
    /**
     * Unsets the "degreeFormat" element
     */
    public void unsetDegreeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEGREEFORMAT$4, 0);
        }
    }
    
    /**
     * Gets the "degreePrecision" element
     */
    public short getDegreePrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEGREEPRECISION$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "degreePrecision" element
     */
    public org.apache.xmlbeans.XmlShort xgetDegreePrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(DEGREEPRECISION$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "degreePrecision" element
     */
    public void setDegreePrecision(short degreePrecision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEGREEPRECISION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEGREEPRECISION$6);
            }
            target.setShortValue(degreePrecision);
        }
    }
    
    /**
     * Sets (as xml) the "degreePrecision" element
     */
    public void xsetDegreePrecision(org.apache.xmlbeans.XmlShort degreePrecision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(DEGREEPRECISION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(DEGREEPRECISION$6);
            }
            target.set(degreePrecision);
        }
    }
    
    /**
     * Gets the "distancePrecision" element
     */
    public short getDistancePrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCEPRECISION$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "distancePrecision" element
     */
    public org.apache.xmlbeans.XmlShort xgetDistancePrecision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(DISTANCEPRECISION$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "distancePrecision" element
     */
    public void setDistancePrecision(short distancePrecision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCEPRECISION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCEPRECISION$8);
            }
            target.setShortValue(distancePrecision);
        }
    }
    
    /**
     * Sets (as xml) the "distancePrecision" element
     */
    public void xsetDistancePrecision(org.apache.xmlbeans.XmlShort distancePrecision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(DISTANCEPRECISION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(DISTANCEPRECISION$8);
            }
            target.set(distancePrecision);
        }
    }
    
    /**
     * Gets the "distanceUnits" element
     */
    public gov.nasa.gsfc.spdf.ssc.DistanceUnits.Enum getDistanceUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCEUNITS$10, 0);
            if (target == null)
            {
                return null;
            }
            return (gov.nasa.gsfc.spdf.ssc.DistanceUnits.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "distanceUnits" element
     */
    public gov.nasa.gsfc.spdf.ssc.DistanceUnits xgetDistanceUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.DistanceUnits target = null;
            target = (gov.nasa.gsfc.spdf.ssc.DistanceUnits)get_store().find_element_user(DISTANCEUNITS$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "distanceUnits" element
     */
    public boolean isSetDistanceUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTANCEUNITS$10) != 0;
        }
    }
    
    /**
     * Sets the "distanceUnits" element
     */
    public void setDistanceUnits(gov.nasa.gsfc.spdf.ssc.DistanceUnits.Enum distanceUnits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTANCEUNITS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTANCEUNITS$10);
            }
            target.setEnumValue(distanceUnits);
        }
    }
    
    /**
     * Sets (as xml) the "distanceUnits" element
     */
    public void xsetDistanceUnits(gov.nasa.gsfc.spdf.ssc.DistanceUnits distanceUnits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.DistanceUnits target = null;
            target = (gov.nasa.gsfc.spdf.ssc.DistanceUnits)get_store().find_element_user(DISTANCEUNITS$10, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.DistanceUnits)get_store().add_element_user(DISTANCEUNITS$10);
            }
            target.set(distanceUnits);
        }
    }
    
    /**
     * Unsets the "distanceUnits" element
     */
    public void unsetDistanceUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTANCEUNITS$10, 0);
        }
    }
    
    /**
     * Gets the "latLonFormat" element
     */
    public gov.nasa.gsfc.spdf.ssc.LatLonFormat.Enum getLatLonFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATLONFORMAT$12, 0);
            if (target == null)
            {
                return null;
            }
            return (gov.nasa.gsfc.spdf.ssc.LatLonFormat.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "latLonFormat" element
     */
    public gov.nasa.gsfc.spdf.ssc.LatLonFormat xgetLatLonFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LatLonFormat target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LatLonFormat)get_store().find_element_user(LATLONFORMAT$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "latLonFormat" element
     */
    public boolean isSetLatLonFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LATLONFORMAT$12) != 0;
        }
    }
    
    /**
     * Sets the "latLonFormat" element
     */
    public void setLatLonFormat(gov.nasa.gsfc.spdf.ssc.LatLonFormat.Enum latLonFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATLONFORMAT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATLONFORMAT$12);
            }
            target.setEnumValue(latLonFormat);
        }
    }
    
    /**
     * Sets (as xml) the "latLonFormat" element
     */
    public void xsetLatLonFormat(gov.nasa.gsfc.spdf.ssc.LatLonFormat latLonFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.LatLonFormat target = null;
            target = (gov.nasa.gsfc.spdf.ssc.LatLonFormat)get_store().find_element_user(LATLONFORMAT$12, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.LatLonFormat)get_store().add_element_user(LATLONFORMAT$12);
            }
            target.set(latLonFormat);
        }
    }
    
    /**
     * Unsets the "latLonFormat" element
     */
    public void unsetLatLonFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LATLONFORMAT$12, 0);
        }
    }
    
    /**
     * Gets the "linesPerPage" element
     */
    public short getLinesPerPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINESPERPAGE$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "linesPerPage" element
     */
    public org.apache.xmlbeans.XmlShort xgetLinesPerPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(LINESPERPAGE$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "linesPerPage" element
     */
    public void setLinesPerPage(short linesPerPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINESPERPAGE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINESPERPAGE$14);
            }
            target.setShortValue(linesPerPage);
        }
    }
    
    /**
     * Sets (as xml) the "linesPerPage" element
     */
    public void xsetLinesPerPage(org.apache.xmlbeans.XmlShort linesPerPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(LINESPERPAGE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(LINESPERPAGE$14);
            }
            target.set(linesPerPage);
        }
    }
    
    /**
     * Gets the "timeFormat" element
     */
    public gov.nasa.gsfc.spdf.ssc.TimeFormat.Enum getTimeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEFORMAT$16, 0);
            if (target == null)
            {
                return null;
            }
            return (gov.nasa.gsfc.spdf.ssc.TimeFormat.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "timeFormat" element
     */
    public gov.nasa.gsfc.spdf.ssc.TimeFormat xgetTimeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.TimeFormat target = null;
            target = (gov.nasa.gsfc.spdf.ssc.TimeFormat)get_store().find_element_user(TIMEFORMAT$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "timeFormat" element
     */
    public boolean isSetTimeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEFORMAT$16) != 0;
        }
    }
    
    /**
     * Sets the "timeFormat" element
     */
    public void setTimeFormat(gov.nasa.gsfc.spdf.ssc.TimeFormat.Enum timeFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEFORMAT$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMEFORMAT$16);
            }
            target.setEnumValue(timeFormat);
        }
    }
    
    /**
     * Sets (as xml) the "timeFormat" element
     */
    public void xsetTimeFormat(gov.nasa.gsfc.spdf.ssc.TimeFormat timeFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.TimeFormat target = null;
            target = (gov.nasa.gsfc.spdf.ssc.TimeFormat)get_store().find_element_user(TIMEFORMAT$16, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.TimeFormat)get_store().add_element_user(TIMEFORMAT$16);
            }
            target.set(timeFormat);
        }
    }
    
    /**
     * Unsets the "timeFormat" element
     */
    public void unsetTimeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEFORMAT$16, 0);
        }
    }
}
