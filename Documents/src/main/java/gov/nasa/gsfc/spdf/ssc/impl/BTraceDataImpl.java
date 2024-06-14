/*
 * XML Type:  bTraceData
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.BTraceData
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML bTraceData(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class BTraceDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.BTraceData
{
    private static final long serialVersionUID = 1L;
    
    public BTraceDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCLENGTH$0 = 
        new javax.xml.namespace.QName("", "arcLength");
    private static final javax.xml.namespace.QName COORDINATESYSTEM$2 = 
        new javax.xml.namespace.QName("", "coordinateSystem");
    private static final javax.xml.namespace.QName HEMISPHERE$4 = 
        new javax.xml.namespace.QName("", "hemisphere");
    private static final javax.xml.namespace.QName LATITUDE$6 = 
        new javax.xml.namespace.QName("", "latitude");
    private static final javax.xml.namespace.QName LONGITUDE$8 = 
        new javax.xml.namespace.QName("", "longitude");
    
    
    /**
     * Gets array of all "arcLength" elements
     */
    public double[] getArcLengthArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARCLENGTH$0, targetList);
            double[] result = new double[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
            return result;
        }
    }
    
    /**
     * Gets ith "arcLength" element
     */
    public double getArcLengthArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARCLENGTH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "arcLength" elements
     */
    public org.apache.xmlbeans.XmlDouble[] xgetArcLengthArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARCLENGTH$0, targetList);
            org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "arcLength" element
     */
    public org.apache.xmlbeans.XmlDouble xgetArcLengthArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ARCLENGTH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDouble)target;
        }
    }
    
    /**
     * Tests for nil ith "arcLength" element
     */
    public boolean isNilArcLengthArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ARCLENGTH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "arcLength" element
     */
    public int sizeOfArcLengthArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARCLENGTH$0);
        }
    }
    
    /**
     * Sets array of all "arcLength" element
     */
    public void setArcLengthArray(double[] arcLengthArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(arcLengthArray, ARCLENGTH$0);
        }
    }
    
    /**
     * Sets ith "arcLength" element
     */
    public void setArcLengthArray(int i, double arcLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARCLENGTH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(arcLength);
        }
    }
    
    /**
     * Sets (as xml) array of all "arcLength" element
     */
    public void xsetArcLengthArray(org.apache.xmlbeans.XmlDouble[]arcLengthArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(arcLengthArray, ARCLENGTH$0);
        }
    }
    
    /**
     * Sets (as xml) ith "arcLength" element
     */
    public void xsetArcLengthArray(int i, org.apache.xmlbeans.XmlDouble arcLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ARCLENGTH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(arcLength);
        }
    }
    
    /**
     * Nils the ith "arcLength" element
     */
    public void setNilArcLengthArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ARCLENGTH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "arcLength" element
     */
    public void insertArcLength(int i, double arcLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ARCLENGTH$0, i);
            target.setDoubleValue(arcLength);
        }
    }
    
    /**
     * Appends the value as the last "arcLength" element
     */
    public void addArcLength(double arcLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARCLENGTH$0);
            target.setDoubleValue(arcLength);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "arcLength" element
     */
    public org.apache.xmlbeans.XmlDouble insertNewArcLength(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(ARCLENGTH$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "arcLength" element
     */
    public org.apache.xmlbeans.XmlDouble addNewArcLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(ARCLENGTH$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "arcLength" element
     */
    public void removeArcLength(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARCLENGTH$0, i);
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
     * Gets the "hemisphere" element
     */
    public gov.nasa.gsfc.spdf.ssc.Hemisphere.Enum getHemisphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEMISPHERE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (gov.nasa.gsfc.spdf.ssc.Hemisphere.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "hemisphere" element
     */
    public gov.nasa.gsfc.spdf.ssc.Hemisphere xgetHemisphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.Hemisphere target = null;
            target = (gov.nasa.gsfc.spdf.ssc.Hemisphere)get_store().find_element_user(HEMISPHERE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "hemisphere" element
     */
    public boolean isSetHemisphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEMISPHERE$4) != 0;
        }
    }
    
    /**
     * Sets the "hemisphere" element
     */
    public void setHemisphere(gov.nasa.gsfc.spdf.ssc.Hemisphere.Enum hemisphere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEMISPHERE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEMISPHERE$4);
            }
            target.setEnumValue(hemisphere);
        }
    }
    
    /**
     * Sets (as xml) the "hemisphere" element
     */
    public void xsetHemisphere(gov.nasa.gsfc.spdf.ssc.Hemisphere hemisphere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.Hemisphere target = null;
            target = (gov.nasa.gsfc.spdf.ssc.Hemisphere)get_store().find_element_user(HEMISPHERE$4, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.Hemisphere)get_store().add_element_user(HEMISPHERE$4);
            }
            target.set(hemisphere);
        }
    }
    
    /**
     * Unsets the "hemisphere" element
     */
    public void unsetHemisphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEMISPHERE$4, 0);
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
            get_store().find_all_element_users(LATITUDE$6, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$6, i);
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
            get_store().find_all_element_users(LATITUDE$6, targetList);
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
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LATITUDE$6, i);
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
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LATITUDE$6, i);
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
            return get_store().count_elements(LATITUDE$6);
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
            arraySetterHelper(latitudeArray, LATITUDE$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$6, i);
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
            arraySetterHelper(latitudeArray, LATITUDE$6);
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
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LATITUDE$6, i);
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
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LATITUDE$6, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(LATITUDE$6, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATITUDE$6);
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
            target = (org.apache.xmlbeans.XmlFloat)get_store().insert_element_user(LATITUDE$6, i);
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
            target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(LATITUDE$6);
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
            get_store().remove_element(LATITUDE$6, i);
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
            get_store().find_all_element_users(LONGITUDE$8, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$8, i);
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
            get_store().find_all_element_users(LONGITUDE$8, targetList);
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
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LONGITUDE$8, i);
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
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LONGITUDE$8, i);
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
            return get_store().count_elements(LONGITUDE$8);
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
            arraySetterHelper(longitudeArray, LONGITUDE$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$8, i);
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
            arraySetterHelper(longitudeArray, LONGITUDE$8);
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
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LONGITUDE$8, i);
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
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(LONGITUDE$8, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(LONGITUDE$8, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONGITUDE$8);
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
            target = (org.apache.xmlbeans.XmlFloat)get_store().insert_element_user(LONGITUDE$8, i);
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
            target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(LONGITUDE$8);
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
            get_store().remove_element(LONGITUDE$8, i);
        }
    }
}
