/*
 * XML Type:  coordinateData
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.CoordinateData
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML coordinateData(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class CoordinateDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.CoordinateData
{
    private static final long serialVersionUID = 1L;
    
    public CoordinateDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDINATESYSTEM$0 = 
        new javax.xml.namespace.QName("", "coordinateSystem");
    private static final javax.xml.namespace.QName LATITUDE$2 = 
        new javax.xml.namespace.QName("", "latitude");
    private static final javax.xml.namespace.QName LOCALTIME$4 = 
        new javax.xml.namespace.QName("", "localTime");
    private static final javax.xml.namespace.QName LONGITUDE$6 = 
        new javax.xml.namespace.QName("", "longitude");
    private static final javax.xml.namespace.QName X$8 = 
        new javax.xml.namespace.QName("", "x");
    private static final javax.xml.namespace.QName Y$10 = 
        new javax.xml.namespace.QName("", "y");
    private static final javax.xml.namespace.QName Z$12 = 
        new javax.xml.namespace.QName("", "z");
    
    
    /**
     * Gets the "coordinateSystem" element
     */
    public gov.nasa.gsfc.spdf.ssc.CoordinateSystem.Enum getCoordinateSystem()
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
            target = (gov.nasa.gsfc.spdf.ssc.CoordinateSystem)get_store().find_element_user(COORDINATESYSTEM$0, 0);
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
    public void setCoordinateSystem(gov.nasa.gsfc.spdf.ssc.CoordinateSystem.Enum coordinateSystem)
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
    public void xsetCoordinateSystem(gov.nasa.gsfc.spdf.ssc.CoordinateSystem coordinateSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.CoordinateSystem target = null;
            target = (gov.nasa.gsfc.spdf.ssc.CoordinateSystem)get_store().find_element_user(COORDINATESYSTEM$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.CoordinateSystem)get_store().add_element_user(COORDINATESYSTEM$0);
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
     * Gets array of all "latitude" elements
     */
    public float[] getLatitudeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LATITUDE$2, targetList);
            float[] result = new float[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getFloatValue();
            return result;
        }
    }
    
    /**
     * Gets ith "latitude" element
     */
    public float getLatitudeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "latitude" elements
     */
    public org.apache.xmlbeans.XmlFloat[] xgetLatitudeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LATITUDE$2, targetList);
            org.apache.xmlbeans.XmlFloat[] result = new org.apache.xmlbeans.XmlFloat[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "latitude" element
     */
    public org.apache.xmlbeans.XmlFloat xgetLatitudeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LATITUDE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlFloat)target;
        }
    }
    
    /**
     * Tests for nil ith "latitude" element
     */
    public boolean isNilLatitudeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LATITUDE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "latitude" element
     */
    public int sizeOfLatitudeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LATITUDE$2);
        }
    }
    
    /**
     * Sets array of all "latitude" element
     */
    public void setLatitudeArray(float[] latitudeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(latitudeArray, LATITUDE$2);
        }
    }
    
    /**
     * Sets ith "latitude" element
     */
    public void setLatitudeArray(int i, float latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setFloatValue(latitude);
        }
    }
    
    /**
     * Sets (as xml) array of all "latitude" element
     */
    public void xsetLatitudeArray(org.apache.xmlbeans.XmlFloat[]latitudeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(latitudeArray, LATITUDE$2);
        }
    }
    
    /**
     * Sets (as xml) ith "latitude" element
     */
    public void xsetLatitudeArray(int i, org.apache.xmlbeans.XmlFloat latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LATITUDE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(latitude);
        }
    }
    
    /**
     * Nils the ith "latitude" element
     */
    public void setNilLatitudeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LATITUDE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "latitude" element
     */
    public void insertLatitude(int i, float latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(LATITUDE$2, i);
            target.setFloatValue(latitude);
        }
    }
    
    /**
     * Appends the value as the last "latitude" element
     */
    public void addLatitude(float latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATITUDE$2);
            target.setFloatValue(latitude);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "latitude" element
     */
    public org.apache.xmlbeans.XmlFloat insertNewLatitude(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().insert_element_user(LATITUDE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "latitude" element
     */
    public org.apache.xmlbeans.XmlFloat addNewLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(LATITUDE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "latitude" element
     */
    public void removeLatitude(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LATITUDE$2, i);
        }
    }
    
    /**
     * Gets array of all "localTime" elements
     */
    public double[] getLocalTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCALTIME$4, targetList);
            double[] result = new double[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
            return result;
        }
    }
    
    /**
     * Gets ith "localTime" element
     */
    public double getLocalTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALTIME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "localTime" elements
     */
    public org.apache.xmlbeans.XmlDouble[] xgetLocalTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCALTIME$4, targetList);
            org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "localTime" element
     */
    public org.apache.xmlbeans.XmlDouble xgetLocalTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LOCALTIME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDouble)target;
        }
    }
    
    /**
     * Tests for nil ith "localTime" element
     */
    public boolean isNilLocalTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LOCALTIME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "localTime" element
     */
    public int sizeOfLocalTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALTIME$4);
        }
    }
    
    /**
     * Sets array of all "localTime" element
     */
    public void setLocalTimeArray(double[] localTimeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(localTimeArray, LOCALTIME$4);
        }
    }
    
    /**
     * Sets ith "localTime" element
     */
    public void setLocalTimeArray(int i, double localTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALTIME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(localTime);
        }
    }
    
    /**
     * Sets (as xml) array of all "localTime" element
     */
    public void xsetLocalTimeArray(org.apache.xmlbeans.XmlDouble[]localTimeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(localTimeArray, LOCALTIME$4);
        }
    }
    
    /**
     * Sets (as xml) ith "localTime" element
     */
    public void xsetLocalTimeArray(int i, org.apache.xmlbeans.XmlDouble localTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LOCALTIME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(localTime);
        }
    }
    
    /**
     * Nils the ith "localTime" element
     */
    public void setNilLocalTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LOCALTIME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "localTime" element
     */
    public void insertLocalTime(int i, double localTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(LOCALTIME$4, i);
            target.setDoubleValue(localTime);
        }
    }
    
    /**
     * Appends the value as the last "localTime" element
     */
    public void addLocalTime(double localTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALTIME$4);
            target.setDoubleValue(localTime);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "localTime" element
     */
    public org.apache.xmlbeans.XmlDouble insertNewLocalTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(LOCALTIME$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "localTime" element
     */
    public org.apache.xmlbeans.XmlDouble addNewLocalTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(LOCALTIME$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "localTime" element
     */
    public void removeLocalTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALTIME$4, i);
        }
    }
    
    /**
     * Gets array of all "longitude" elements
     */
    public float[] getLongitudeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LONGITUDE$6, targetList);
            float[] result = new float[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getFloatValue();
            return result;
        }
    }
    
    /**
     * Gets ith "longitude" element
     */
    public float getLongitudeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "longitude" elements
     */
    public org.apache.xmlbeans.XmlFloat[] xgetLongitudeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LONGITUDE$6, targetList);
            org.apache.xmlbeans.XmlFloat[] result = new org.apache.xmlbeans.XmlFloat[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "longitude" element
     */
    public org.apache.xmlbeans.XmlFloat xgetLongitudeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LONGITUDE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlFloat)target;
        }
    }
    
    /**
     * Tests for nil ith "longitude" element
     */
    public boolean isNilLongitudeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LONGITUDE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "longitude" element
     */
    public int sizeOfLongitudeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LONGITUDE$6);
        }
    }
    
    /**
     * Sets array of all "longitude" element
     */
    public void setLongitudeArray(float[] longitudeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(longitudeArray, LONGITUDE$6);
        }
    }
    
    /**
     * Sets ith "longitude" element
     */
    public void setLongitudeArray(int i, float longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setFloatValue(longitude);
        }
    }
    
    /**
     * Sets (as xml) array of all "longitude" element
     */
    public void xsetLongitudeArray(org.apache.xmlbeans.XmlFloat[]longitudeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(longitudeArray, LONGITUDE$6);
        }
    }
    
    /**
     * Sets (as xml) ith "longitude" element
     */
    public void xsetLongitudeArray(int i, org.apache.xmlbeans.XmlFloat longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LONGITUDE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(longitude);
        }
    }
    
    /**
     * Nils the ith "longitude" element
     */
    public void setNilLongitudeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LONGITUDE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "longitude" element
     */
    public void insertLongitude(int i, float longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(LONGITUDE$6, i);
            target.setFloatValue(longitude);
        }
    }
    
    /**
     * Appends the value as the last "longitude" element
     */
    public void addLongitude(float longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONGITUDE$6);
            target.setFloatValue(longitude);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "longitude" element
     */
    public org.apache.xmlbeans.XmlFloat insertNewLongitude(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().insert_element_user(LONGITUDE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "longitude" element
     */
    public org.apache.xmlbeans.XmlFloat addNewLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(LONGITUDE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "longitude" element
     */
    public void removeLongitude(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LONGITUDE$6, i);
        }
    }
    
    /**
     * Gets array of all "x" elements
     */
    public double[] getXArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(X$8, targetList);
            double[] result = new double[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
            return result;
        }
    }
    
    /**
     * Gets ith "x" element
     */
    public double getXArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(X$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "x" elements
     */
    public org.apache.xmlbeans.XmlDouble[] xgetXArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(X$8, targetList);
            org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "x" element
     */
    public org.apache.xmlbeans.XmlDouble xgetXArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(X$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDouble)target;
        }
    }
    
    /**
     * Tests for nil ith "x" element
     */
    public boolean isNilXArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(X$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "x" element
     */
    public int sizeOfXArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(X$8);
        }
    }
    
    /**
     * Sets array of all "x" element
     */
    public void setXArray(double[] xArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xArray, X$8);
        }
    }
    
    /**
     * Sets ith "x" element
     */
    public void setXArray(int i, double x)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(X$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(x);
        }
    }
    
    /**
     * Sets (as xml) array of all "x" element
     */
    public void xsetXArray(org.apache.xmlbeans.XmlDouble[]xArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xArray, X$8);
        }
    }
    
    /**
     * Sets (as xml) ith "x" element
     */
    public void xsetXArray(int i, org.apache.xmlbeans.XmlDouble x)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(X$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(x);
        }
    }
    
    /**
     * Nils the ith "x" element
     */
    public void setNilXArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(X$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "x" element
     */
    public void insertX(int i, double x)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(X$8, i);
            target.setDoubleValue(x);
        }
    }
    
    /**
     * Appends the value as the last "x" element
     */
    public void addX(double x)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(X$8);
            target.setDoubleValue(x);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "x" element
     */
    public org.apache.xmlbeans.XmlDouble insertNewX(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(X$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "x" element
     */
    public org.apache.xmlbeans.XmlDouble addNewX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(X$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "x" element
     */
    public void removeX(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(X$8, i);
        }
    }
    
    /**
     * Gets array of all "y" elements
     */
    public double[] getYArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(Y$10, targetList);
            double[] result = new double[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
            return result;
        }
    }
    
    /**
     * Gets ith "y" element
     */
    public double getYArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Y$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "y" elements
     */
    public org.apache.xmlbeans.XmlDouble[] xgetYArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(Y$10, targetList);
            org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "y" element
     */
    public org.apache.xmlbeans.XmlDouble xgetYArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(Y$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDouble)target;
        }
    }
    
    /**
     * Tests for nil ith "y" element
     */
    public boolean isNilYArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(Y$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "y" element
     */
    public int sizeOfYArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(Y$10);
        }
    }
    
    /**
     * Sets array of all "y" element
     */
    public void setYArray(double[] yArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(yArray, Y$10);
        }
    }
    
    /**
     * Sets ith "y" element
     */
    public void setYArray(int i, double y)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Y$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(y);
        }
    }
    
    /**
     * Sets (as xml) array of all "y" element
     */
    public void xsetYArray(org.apache.xmlbeans.XmlDouble[]yArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(yArray, Y$10);
        }
    }
    
    /**
     * Sets (as xml) ith "y" element
     */
    public void xsetYArray(int i, org.apache.xmlbeans.XmlDouble y)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(Y$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(y);
        }
    }
    
    /**
     * Nils the ith "y" element
     */
    public void setNilYArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(Y$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "y" element
     */
    public void insertY(int i, double y)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(Y$10, i);
            target.setDoubleValue(y);
        }
    }
    
    /**
     * Appends the value as the last "y" element
     */
    public void addY(double y)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(Y$10);
            target.setDoubleValue(y);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "y" element
     */
    public org.apache.xmlbeans.XmlDouble insertNewY(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(Y$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "y" element
     */
    public org.apache.xmlbeans.XmlDouble addNewY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(Y$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "y" element
     */
    public void removeY(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(Y$10, i);
        }
    }
    
    /**
     * Gets array of all "z" elements
     */
    public double[] getZArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(Z$12, targetList);
            double[] result = new double[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
            return result;
        }
    }
    
    /**
     * Gets ith "z" element
     */
    public double getZArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Z$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "z" elements
     */
    public org.apache.xmlbeans.XmlDouble[] xgetZArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(Z$12, targetList);
            org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "z" element
     */
    public org.apache.xmlbeans.XmlDouble xgetZArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(Z$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDouble)target;
        }
    }
    
    /**
     * Tests for nil ith "z" element
     */
    public boolean isNilZArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(Z$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "z" element
     */
    public int sizeOfZArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(Z$12);
        }
    }
    
    /**
     * Sets array of all "z" element
     */
    public void setZArray(double[] zArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(zArray, Z$12);
        }
    }
    
    /**
     * Sets ith "z" element
     */
    public void setZArray(int i, double z)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Z$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(z);
        }
    }
    
    /**
     * Sets (as xml) array of all "z" element
     */
    public void xsetZArray(org.apache.xmlbeans.XmlDouble[]zArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(zArray, Z$12);
        }
    }
    
    /**
     * Sets (as xml) ith "z" element
     */
    public void xsetZArray(int i, org.apache.xmlbeans.XmlDouble z)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(Z$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(z);
        }
    }
    
    /**
     * Nils the ith "z" element
     */
    public void setNilZArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(Z$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "z" element
     */
    public void insertZ(int i, double z)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(Z$12, i);
            target.setDoubleValue(z);
        }
    }
    
    /**
     * Appends the value as the last "z" element
     */
    public void addZ(double z)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(Z$12);
            target.setDoubleValue(z);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "z" element
     */
    public org.apache.xmlbeans.XmlDouble insertNewZ(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(Z$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "z" element
     */
    public org.apache.xmlbeans.XmlDouble addNewZ()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(Z$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "z" element
     */
    public void removeZ(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(Z$12, i);
        }
    }
}
