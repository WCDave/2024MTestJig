/*
 * XML Type:  request
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.Request
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML request(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class RequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.Request
{
    private static final long serialVersionUID = 1L;
    
    public RequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BFIELDMODELOPTIONS$0 = 
        new javax.xml.namespace.QName("", "BFieldModelOptions");
    private static final javax.xml.namespace.QName BEGINTIME$2 = 
        new javax.xml.namespace.QName("", "beginTime");
    private static final javax.xml.namespace.QName ENDTIME$4 = 
        new javax.xml.namespace.QName("", "endTime");
    private static final javax.xml.namespace.QName SATELLITES$6 = 
        new javax.xml.namespace.QName("", "satellites");
    
    
    /**
     * Gets the "BFieldModelOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.BFieldModelOptions getBFieldModelOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.BFieldModelOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.BFieldModelOptions)get_store().find_element_user(BFIELDMODELOPTIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BFieldModelOptions" element
     */
    public boolean isSetBFieldModelOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BFIELDMODELOPTIONS$0) != 0;
        }
    }
    
    /**
     * Sets the "BFieldModelOptions" element
     */
    public void setBFieldModelOptions(gov.nasa.gsfc.spdf.ssc.BFieldModelOptions bFieldModelOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.BFieldModelOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.BFieldModelOptions)get_store().find_element_user(BFIELDMODELOPTIONS$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.BFieldModelOptions)get_store().add_element_user(BFIELDMODELOPTIONS$0);
            }
            target.set(bFieldModelOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "BFieldModelOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.BFieldModelOptions addNewBFieldModelOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.BFieldModelOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.BFieldModelOptions)get_store().add_element_user(BFIELDMODELOPTIONS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "BFieldModelOptions" element
     */
    public void unsetBFieldModelOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BFIELDMODELOPTIONS$0, 0);
        }
    }
    
    /**
     * Gets the "beginTime" element
     */
    public java.util.Calendar getBeginTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINTIME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "beginTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetBeginTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINTIME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "beginTime" element
     */
    public boolean isSetBeginTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEGINTIME$2) != 0;
        }
    }
    
    /**
     * Sets the "beginTime" element
     */
    public void setBeginTime(java.util.Calendar beginTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEGINTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEGINTIME$2);
            }
            target.setCalendarValue(beginTime);
        }
    }
    
    /**
     * Sets (as xml) the "beginTime" element
     */
    public void xsetBeginTime(org.apache.xmlbeans.XmlDateTime beginTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(BEGINTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(BEGINTIME$2);
            }
            target.set(beginTime);
        }
    }
    
    /**
     * Unsets the "beginTime" element
     */
    public void unsetBeginTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEGINTIME$2, 0);
        }
    }
    
    /**
     * Gets the "endTime" element
     */
    public java.util.Calendar getEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDTIME$4, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDTIME$4, 0);
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
            return get_store().count_elements(ENDTIME$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDTIME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDTIME$4);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDTIME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDTIME$4);
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
            get_store().remove_element(ENDTIME$4, 0);
        }
    }
    
    /**
     * Gets array of all "satellites" elements
     */
    public gov.nasa.gsfc.spdf.ssc.SatelliteSpecification[] getSatellitesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SATELLITES$6, targetList);
            gov.nasa.gsfc.spdf.ssc.SatelliteSpecification[] result = new gov.nasa.gsfc.spdf.ssc.SatelliteSpecification[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "satellites" element
     */
    public gov.nasa.gsfc.spdf.ssc.SatelliteSpecification getSatellitesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SatelliteSpecification target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SatelliteSpecification)get_store().find_element_user(SATELLITES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "satellites" element
     */
    public boolean isNilSatellitesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SatelliteSpecification target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SatelliteSpecification)get_store().find_element_user(SATELLITES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "satellites" element
     */
    public int sizeOfSatellitesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SATELLITES$6);
        }
    }
    
    /**
     * Sets array of all "satellites" element
     */
    public void setSatellitesArray(gov.nasa.gsfc.spdf.ssc.SatelliteSpecification[] satellitesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(satellitesArray, SATELLITES$6);
        }
    }
    
    /**
     * Sets ith "satellites" element
     */
    public void setSatellitesArray(int i, gov.nasa.gsfc.spdf.ssc.SatelliteSpecification satellites)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SatelliteSpecification target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SatelliteSpecification)get_store().find_element_user(SATELLITES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(satellites);
        }
    }
    
    /**
     * Nils the ith "satellites" element
     */
    public void setNilSatellitesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SatelliteSpecification target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SatelliteSpecification)get_store().find_element_user(SATELLITES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "satellites" element
     */
    public gov.nasa.gsfc.spdf.ssc.SatelliteSpecification insertNewSatellites(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SatelliteSpecification target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SatelliteSpecification)get_store().insert_element_user(SATELLITES$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "satellites" element
     */
    public gov.nasa.gsfc.spdf.ssc.SatelliteSpecification addNewSatellites()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SatelliteSpecification target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SatelliteSpecification)get_store().add_element_user(SATELLITES$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "satellites" element
     */
    public void removeSatellites(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SATELLITES$6, i);
        }
    }
}
