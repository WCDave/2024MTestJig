/*
 * XML Type:  mapProjectionGraphOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML mapProjectionGraphOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class MapProjectionGraphOptionsImpl extends gov.nasa.gsfc.spdf.ssc.impl.GraphOptionsImpl implements gov.nasa.gsfc.spdf.ssc.MapProjectionGraphOptions
{
    private static final long serialVersionUID = 1L;
    
    public MapProjectionGraphOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDINATESYSTEM$0 = 
        new javax.xml.namespace.QName("", "coordinateSystem");
    private static final javax.xml.namespace.QName FORMATOPTIONS$2 = 
        new javax.xml.namespace.QName("", "formatOptions");
    private static final javax.xml.namespace.QName GROUNDSTATIONS$4 = 
        new javax.xml.namespace.QName("", "groundStations");
    private static final javax.xml.namespace.QName LONGITUDEVERTICALDOWN$6 = 
        new javax.xml.namespace.QName("", "longitudeVerticalDown");
    private static final javax.xml.namespace.QName MAPLIMITS$8 = 
        new javax.xml.namespace.QName("", "mapLimits");
    private static final javax.xml.namespace.QName POLARMAPORIENTATION$10 = 
        new javax.xml.namespace.QName("", "polarMapOrientation");
    private static final javax.xml.namespace.QName PROJECTION$12 = 
        new javax.xml.namespace.QName("", "projection");
    private static final javax.xml.namespace.QName SHOWCONTINENTS$14 = 
        new javax.xml.namespace.QName("", "showContinents");
    private static final javax.xml.namespace.QName TITLE$16 = 
        new javax.xml.namespace.QName("", "title");
    private static final javax.xml.namespace.QName TRACE$18 = 
        new javax.xml.namespace.QName("", "trace");
    
    
    /**
     * Gets the "coordinateSystem" element
     */
    public gov.nasa.gsfc.spdf.ssc.ProjectionCoordinateSystem.Enum getCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COORDINATESYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return (gov.nasa.gsfc.spdf.ssc.ProjectionCoordinateSystem.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "coordinateSystem" element
     */
    public gov.nasa.gsfc.spdf.ssc.ProjectionCoordinateSystem xgetCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.ProjectionCoordinateSystem target = null;
            target = (gov.nasa.gsfc.spdf.ssc.ProjectionCoordinateSystem)get_store().find_element_user(COORDINATESYSTEM$0, 0);
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
            return get_store().count_elements(COORDINATESYSTEM$0) != 0;
        }
    }
    
    /**
     * Sets the "coordinateSystem" element
     */
    public void setCoordinateSystem(gov.nasa.gsfc.spdf.ssc.ProjectionCoordinateSystem.Enum coordinateSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COORDINATESYSTEM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COORDINATESYSTEM$0);
            }
            target.setEnumValue(coordinateSystem);
        }
    }
    
    /**
     * Sets (as xml) the "coordinateSystem" element
     */
    public void xsetCoordinateSystem(gov.nasa.gsfc.spdf.ssc.ProjectionCoordinateSystem coordinateSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.ProjectionCoordinateSystem target = null;
            target = (gov.nasa.gsfc.spdf.ssc.ProjectionCoordinateSystem)get_store().find_element_user(COORDINATESYSTEM$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.ProjectionCoordinateSystem)get_store().add_element_user(COORDINATESYSTEM$0);
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
            get_store().remove_element(COORDINATESYSTEM$0, 0);
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
            target = (gov.nasa.gsfc.spdf.ssc.GraphFormatOptions)get_store().find_element_user(FORMATOPTIONS$2, 0);
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
            return get_store().count_elements(FORMATOPTIONS$2) != 0;
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
            target = (gov.nasa.gsfc.spdf.ssc.GraphFormatOptions)get_store().find_element_user(FORMATOPTIONS$2, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.GraphFormatOptions)get_store().add_element_user(FORMATOPTIONS$2);
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
            target = (gov.nasa.gsfc.spdf.ssc.GraphFormatOptions)get_store().add_element_user(FORMATOPTIONS$2);
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
            get_store().remove_element(FORMATOPTIONS$2, 0);
        }
    }
    
    /**
     * Gets array of all "groundStations" elements
     */
    public java.lang.String[] getGroundStationsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GROUNDSTATIONS$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "groundStations" element
     */
    public java.lang.String getGroundStationsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUNDSTATIONS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "groundStations" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetGroundStationsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GROUNDSTATIONS$4, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "groundStations" element
     */
    public org.apache.xmlbeans.XmlString xgetGroundStationsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUNDSTATIONS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Tests for nil ith "groundStations" element
     */
    public boolean isNilGroundStationsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUNDSTATIONS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "groundStations" element
     */
    public int sizeOfGroundStationsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUNDSTATIONS$4);
        }
    }
    
    /**
     * Sets array of all "groundStations" element
     */
    public void setGroundStationsArray(java.lang.String[] groundStationsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(groundStationsArray, GROUNDSTATIONS$4);
        }
    }
    
    /**
     * Sets ith "groundStations" element
     */
    public void setGroundStationsArray(int i, java.lang.String groundStations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUNDSTATIONS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(groundStations);
        }
    }
    
    /**
     * Sets (as xml) array of all "groundStations" element
     */
    public void xsetGroundStationsArray(org.apache.xmlbeans.XmlString[]groundStationsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(groundStationsArray, GROUNDSTATIONS$4);
        }
    }
    
    /**
     * Sets (as xml) ith "groundStations" element
     */
    public void xsetGroundStationsArray(int i, org.apache.xmlbeans.XmlString groundStations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUNDSTATIONS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(groundStations);
        }
    }
    
    /**
     * Nils the ith "groundStations" element
     */
    public void setNilGroundStationsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUNDSTATIONS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "groundStations" element
     */
    public void insertGroundStations(int i, java.lang.String groundStations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(GROUNDSTATIONS$4, i);
            target.setStringValue(groundStations);
        }
    }
    
    /**
     * Appends the value as the last "groundStations" element
     */
    public void addGroundStations(java.lang.String groundStations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUNDSTATIONS$4);
            target.setStringValue(groundStations);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "groundStations" element
     */
    public org.apache.xmlbeans.XmlString insertNewGroundStations(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(GROUNDSTATIONS$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "groundStations" element
     */
    public org.apache.xmlbeans.XmlString addNewGroundStations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROUNDSTATIONS$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "groundStations" element
     */
    public void removeGroundStations(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUNDSTATIONS$4, i);
        }
    }
    
    /**
     * Gets the "longitudeVerticalDown" element
     */
    public float getLongitudeVerticalDown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDEVERTICALDOWN$6, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "longitudeVerticalDown" element
     */
    public org.apache.xmlbeans.XmlFloat xgetLongitudeVerticalDown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LONGITUDEVERTICALDOWN$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "longitudeVerticalDown" element
     */
    public void setLongitudeVerticalDown(float longitudeVerticalDown)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDEVERTICALDOWN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONGITUDEVERTICALDOWN$6);
            }
            target.setFloatValue(longitudeVerticalDown);
        }
    }
    
    /**
     * Sets (as xml) the "longitudeVerticalDown" element
     */
    public void xsetLongitudeVerticalDown(org.apache.xmlbeans.XmlFloat longitudeVerticalDown)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LONGITUDEVERTICALDOWN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(LONGITUDEVERTICALDOWN$6);
            }
            target.set(longitudeVerticalDown);
        }
    }
    
    /**
     * Gets the "mapLimits" element
     */
    public gov.nasa.gsfc.spdf.ssc.MapLimits getMapLimits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.MapLimits target = null;
            target = (gov.nasa.gsfc.spdf.ssc.MapLimits)get_store().find_element_user(MAPLIMITS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mapLimits" element
     */
    public boolean isSetMapLimits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPLIMITS$8) != 0;
        }
    }
    
    /**
     * Sets the "mapLimits" element
     */
    public void setMapLimits(gov.nasa.gsfc.spdf.ssc.MapLimits mapLimits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.MapLimits target = null;
            target = (gov.nasa.gsfc.spdf.ssc.MapLimits)get_store().find_element_user(MAPLIMITS$8, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.MapLimits)get_store().add_element_user(MAPLIMITS$8);
            }
            target.set(mapLimits);
        }
    }
    
    /**
     * Appends and returns a new empty "mapLimits" element
     */
    public gov.nasa.gsfc.spdf.ssc.MapLimits addNewMapLimits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.MapLimits target = null;
            target = (gov.nasa.gsfc.spdf.ssc.MapLimits)get_store().add_element_user(MAPLIMITS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "mapLimits" element
     */
    public void unsetMapLimits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPLIMITS$8, 0);
        }
    }
    
    /**
     * Gets the "polarMapOrientation" element
     */
    public gov.nasa.gsfc.spdf.ssc.PolarMapOrientation.Enum getPolarMapOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLARMAPORIENTATION$10, 0);
            if (target == null)
            {
                return null;
            }
            return (gov.nasa.gsfc.spdf.ssc.PolarMapOrientation.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "polarMapOrientation" element
     */
    public gov.nasa.gsfc.spdf.ssc.PolarMapOrientation xgetPolarMapOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.PolarMapOrientation target = null;
            target = (gov.nasa.gsfc.spdf.ssc.PolarMapOrientation)get_store().find_element_user(POLARMAPORIENTATION$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "polarMapOrientation" element
     */
    public boolean isSetPolarMapOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POLARMAPORIENTATION$10) != 0;
        }
    }
    
    /**
     * Sets the "polarMapOrientation" element
     */
    public void setPolarMapOrientation(gov.nasa.gsfc.spdf.ssc.PolarMapOrientation.Enum polarMapOrientation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLARMAPORIENTATION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POLARMAPORIENTATION$10);
            }
            target.setEnumValue(polarMapOrientation);
        }
    }
    
    /**
     * Sets (as xml) the "polarMapOrientation" element
     */
    public void xsetPolarMapOrientation(gov.nasa.gsfc.spdf.ssc.PolarMapOrientation polarMapOrientation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.PolarMapOrientation target = null;
            target = (gov.nasa.gsfc.spdf.ssc.PolarMapOrientation)get_store().find_element_user(POLARMAPORIENTATION$10, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.PolarMapOrientation)get_store().add_element_user(POLARMAPORIENTATION$10);
            }
            target.set(polarMapOrientation);
        }
    }
    
    /**
     * Unsets the "polarMapOrientation" element
     */
    public void unsetPolarMapOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POLARMAPORIENTATION$10, 0);
        }
    }
    
    /**
     * Gets the "projection" element
     */
    public gov.nasa.gsfc.spdf.ssc.MapProjection.Enum getProjection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROJECTION$12, 0);
            if (target == null)
            {
                return null;
            }
            return (gov.nasa.gsfc.spdf.ssc.MapProjection.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "projection" element
     */
    public gov.nasa.gsfc.spdf.ssc.MapProjection xgetProjection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.MapProjection target = null;
            target = (gov.nasa.gsfc.spdf.ssc.MapProjection)get_store().find_element_user(PROJECTION$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "projection" element
     */
    public boolean isSetProjection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROJECTION$12) != 0;
        }
    }
    
    /**
     * Sets the "projection" element
     */
    public void setProjection(gov.nasa.gsfc.spdf.ssc.MapProjection.Enum projection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROJECTION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROJECTION$12);
            }
            target.setEnumValue(projection);
        }
    }
    
    /**
     * Sets (as xml) the "projection" element
     */
    public void xsetProjection(gov.nasa.gsfc.spdf.ssc.MapProjection projection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.MapProjection target = null;
            target = (gov.nasa.gsfc.spdf.ssc.MapProjection)get_store().find_element_user(PROJECTION$12, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.MapProjection)get_store().add_element_user(PROJECTION$12);
            }
            target.set(projection);
        }
    }
    
    /**
     * Unsets the "projection" element
     */
    public void unsetProjection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROJECTION$12, 0);
        }
    }
    
    /**
     * Gets the "showContinents" element
     */
    public boolean getShowContinents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHOWCONTINENTS$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "showContinents" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetShowContinents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SHOWCONTINENTS$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "showContinents" element
     */
    public void setShowContinents(boolean showContinents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHOWCONTINENTS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHOWCONTINENTS$14);
            }
            target.setBooleanValue(showContinents);
        }
    }
    
    /**
     * Sets (as xml) the "showContinents" element
     */
    public void xsetShowContinents(org.apache.xmlbeans.XmlBoolean showContinents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SHOWCONTINENTS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SHOWCONTINENTS$14);
            }
            target.set(showContinents);
        }
    }
    
    /**
     * Gets the "title" element
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" element
     */
    public org.apache.xmlbeans.XmlString xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "title" element
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLE$16) != 0;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$16);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" element
     */
    public void xsetTitle(org.apache.xmlbeans.XmlString title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$16);
            }
            target.set(title);
        }
    }
    
    /**
     * Unsets the "title" element
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLE$16, 0);
        }
    }
    
    /**
     * Gets the "trace" element
     */
    public gov.nasa.gsfc.spdf.ssc.Trace.Enum getTrace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACE$18, 0);
            if (target == null)
            {
                return null;
            }
            return (gov.nasa.gsfc.spdf.ssc.Trace.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "trace" element
     */
    public gov.nasa.gsfc.spdf.ssc.Trace xgetTrace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.Trace target = null;
            target = (gov.nasa.gsfc.spdf.ssc.Trace)get_store().find_element_user(TRACE$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "trace" element
     */
    public boolean isSetTrace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRACE$18) != 0;
        }
    }
    
    /**
     * Sets the "trace" element
     */
    public void setTrace(gov.nasa.gsfc.spdf.ssc.Trace.Enum trace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRACE$18);
            }
            target.setEnumValue(trace);
        }
    }
    
    /**
     * Sets (as xml) the "trace" element
     */
    public void xsetTrace(gov.nasa.gsfc.spdf.ssc.Trace trace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.Trace target = null;
            target = (gov.nasa.gsfc.spdf.ssc.Trace)get_store().find_element_user(TRACE$18, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.Trace)get_store().add_element_user(TRACE$18);
            }
            target.set(trace);
        }
    }
    
    /**
     * Unsets the "trace" element
     */
    public void unsetTrace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRACE$18, 0);
        }
    }
}
