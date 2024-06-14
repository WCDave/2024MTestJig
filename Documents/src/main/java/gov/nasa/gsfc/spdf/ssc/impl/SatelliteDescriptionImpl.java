/*
 * XML Type:  satelliteDescription
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.SatelliteDescription
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML satelliteDescription(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class SatelliteDescriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.SatelliteDescription
{
    private static final long serialVersionUID = 1L;
    
    public SatelliteDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDTIME$0 = 
        new javax.xml.namespace.QName("", "endTime");
    private static final javax.xml.namespace.QName GEOMETRY$2 = 
        new javax.xml.namespace.QName("", "geometry");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName RESOLUTION$8 = 
        new javax.xml.namespace.QName("", "resolution");
    private static final javax.xml.namespace.QName STARTTIME$10 = 
        new javax.xml.namespace.QName("", "startTime");
    private static final javax.xml.namespace.QName TRAJECTORYGEOMETRY$12 = 
        new javax.xml.namespace.QName("", "trajectoryGeometry");
    
    
    /**
     * Gets the "endTime" element
     */
    public java.util.Calendar getEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "endTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDTIME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "endTime" element
     */
    public boolean isSetEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDTIME$0) != 0;
        }
    }
    
    /**
     * Sets the "endTime" element
     */
    public void setEndTime(java.util.Calendar endTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDTIME$0);
            }
            target.setCalendarValue(endTime);
        }
    }
    
    /**
     * Sets (as xml) the "endTime" element
     */
    public void xsetEndTime(org.apache.xmlbeans.XmlDateTime endTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDTIME$0);
            }
            target.set(endTime);
        }
    }
    
    /**
     * Unsets the "endTime" element
     */
    public void unsetEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDTIME$0, 0);
        }
    }
    
    /**
     * Gets the "geometry" element
     */
    public java.lang.String getGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GEOMETRY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "geometry" element
     */
    public org.apache.xmlbeans.XmlString xgetGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GEOMETRY$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "geometry" element
     */
    public boolean isSetGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOMETRY$2) != 0;
        }
    }
    
    /**
     * Sets the "geometry" element
     */
    public void setGeometry(java.lang.String geometry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GEOMETRY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GEOMETRY$2);
            }
            target.setStringValue(geometry);
        }
    }
    
    /**
     * Sets (as xml) the "geometry" element
     */
    public void xsetGeometry(org.apache.xmlbeans.XmlString geometry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GEOMETRY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GEOMETRY$2);
            }
            target.set(geometry);
        }
    }
    
    /**
     * Unsets the "geometry" element
     */
    public void unsetGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOMETRY$2, 0);
        }
    }
    
    /**
     * Gets the "id" element
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" element
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "id" element
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$4) != 0;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$4);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" element
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$4);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" element
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$4, 0);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$6) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$6);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$6);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$6, 0);
        }
    }
    
    /**
     * Gets the "resolution" element
     */
    public int getResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOLUTION$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "resolution" element
     */
    public org.apache.xmlbeans.XmlInt xgetResolution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RESOLUTION$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "resolution" element
     */
    public void setResolution(int resolution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOLUTION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOLUTION$8);
            }
            target.setIntValue(resolution);
        }
    }
    
    /**
     * Sets (as xml) the "resolution" element
     */
    public void xsetResolution(org.apache.xmlbeans.XmlInt resolution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RESOLUTION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RESOLUTION$8);
            }
            target.set(resolution);
        }
    }
    
    /**
     * Gets the "startTime" element
     */
    public java.util.Calendar getStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "startTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTTIME$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "startTime" element
     */
    public boolean isSetStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTTIME$10) != 0;
        }
    }
    
    /**
     * Sets the "startTime" element
     */
    public void setStartTime(java.util.Calendar startTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTTIME$10);
            }
            target.setCalendarValue(startTime);
        }
    }
    
    /**
     * Sets (as xml) the "startTime" element
     */
    public void xsetStartTime(org.apache.xmlbeans.XmlDateTime startTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTTIME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(STARTTIME$10);
            }
            target.set(startTime);
        }
    }
    
    /**
     * Unsets the "startTime" element
     */
    public void unsetStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTTIME$10, 0);
        }
    }
    
    /**
     * Gets the "trajectoryGeometry" element
     */
    public java.lang.String getTrajectoryGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRAJECTORYGEOMETRY$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "trajectoryGeometry" element
     */
    public org.apache.xmlbeans.XmlString xgetTrajectoryGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRAJECTORYGEOMETRY$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "trajectoryGeometry" element
     */
    public boolean isSetTrajectoryGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRAJECTORYGEOMETRY$12) != 0;
        }
    }
    
    /**
     * Sets the "trajectoryGeometry" element
     */
    public void setTrajectoryGeometry(java.lang.String trajectoryGeometry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRAJECTORYGEOMETRY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRAJECTORYGEOMETRY$12);
            }
            target.setStringValue(trajectoryGeometry);
        }
    }
    
    /**
     * Sets (as xml) the "trajectoryGeometry" element
     */
    public void xsetTrajectoryGeometry(org.apache.xmlbeans.XmlString trajectoryGeometry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRAJECTORYGEOMETRY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRAJECTORYGEOMETRY$12);
            }
            target.set(trajectoryGeometry);
        }
    }
    
    /**
     * Unsets the "trajectoryGeometry" element
     */
    public void unsetTrajectoryGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRAJECTORYGEOMETRY$12, 0);
        }
    }
}
