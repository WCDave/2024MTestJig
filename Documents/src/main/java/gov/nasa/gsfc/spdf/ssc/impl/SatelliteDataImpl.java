/*
 * XML Type:  satelliteData
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.SatelliteData
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML satelliteData(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class SatelliteDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.SatelliteData
{
    private static final long serialVersionUID = 1L;
    
    public SatelliteDataImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BGSEX$0 = 
        new javax.xml.namespace.QName("", "BGseX");
    private static final javax.xml.namespace.QName BGSEY$2 = 
        new javax.xml.namespace.QName("", "BGseY");
    private static final javax.xml.namespace.QName BGSEZ$4 = 
        new javax.xml.namespace.QName("", "BGseZ");
    private static final javax.xml.namespace.QName BTRACEDATA$6 = 
        new javax.xml.namespace.QName("", "BTraceData");
    private static final javax.xml.namespace.QName BOWSHOCKDISTANCE$8 = 
        new javax.xml.namespace.QName("", "bowShockDistance");
    private static final javax.xml.namespace.QName COORDINATES$10 = 
        new javax.xml.namespace.QName("", "coordinates");
    private static final javax.xml.namespace.QName DIPOLEINVARIANTLATITUDE$12 = 
        new javax.xml.namespace.QName("", "dipoleInvariantLatitude");
    private static final javax.xml.namespace.QName DIPOLELVALUE$14 = 
        new javax.xml.namespace.QName("", "dipoleLValue");
    private static final javax.xml.namespace.QName ID$16 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName MAGNETICSTRENGTH$18 = 
        new javax.xml.namespace.QName("", "magneticStrength");
    private static final javax.xml.namespace.QName MAGNETOPAUSEDISTANCE$20 = 
        new javax.xml.namespace.QName("", "magnetoPauseDistance");
    private static final javax.xml.namespace.QName NEUTRALSHEETDISTANCE$22 = 
        new javax.xml.namespace.QName("", "neutralSheetDistance");
    private static final javax.xml.namespace.QName NORTHBTRACEDREGIONS$24 = 
        new javax.xml.namespace.QName("", "northBTracedRegions");
    private static final javax.xml.namespace.QName RADIALLENGTH$26 = 
        new javax.xml.namespace.QName("", "radialLength");
    private static final javax.xml.namespace.QName RADIALTRACEFOOTPOINTREGION$28 = 
        new javax.xml.namespace.QName("", "radialTraceFootpointRegion");
    private static final javax.xml.namespace.QName SOUTHBTRACEDREGIONS$30 = 
        new javax.xml.namespace.QName("", "southBTracedRegions");
    private static final javax.xml.namespace.QName SPACECRAFTREGION$32 = 
        new javax.xml.namespace.QName("", "spacecraftRegion");
    private static final javax.xml.namespace.QName TIME$34 = 
        new javax.xml.namespace.QName("", "time");
    
    
    /**
     * Gets array of all "BGseX" elements
     */
    public double[] getBGseXArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BGSEX$0, targetList);
            double[] result = new double[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
            return result;
        }
    }
    
    /**
     * Gets ith "BGseX" element
     */
    public double getBGseXArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BGSEX$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "BGseX" elements
     */
    public org.apache.xmlbeans.XmlDouble[] xgetBGseXArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BGSEX$0, targetList);
            org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "BGseX" element
     */
    public org.apache.xmlbeans.XmlDouble xgetBGseXArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BGSEX$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDouble)target;
        }
    }
    
    /**
     * Tests for nil ith "BGseX" element
     */
    public boolean isNilBGseXArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BGSEX$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "BGseX" element
     */
    public int sizeOfBGseXArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BGSEX$0);
        }
    }
    
    /**
     * Sets array of all "BGseX" element
     */
    public void setBGseXArray(double[] bGseXArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bGseXArray, BGSEX$0);
        }
    }
    
    /**
     * Sets ith "BGseX" element
     */
    public void setBGseXArray(int i, double bGseX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BGSEX$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(bGseX);
        }
    }
    
    /**
     * Sets (as xml) array of all "BGseX" element
     */
    public void xsetBGseXArray(org.apache.xmlbeans.XmlDouble[]bGseXArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bGseXArray, BGSEX$0);
        }
    }
    
    /**
     * Sets (as xml) ith "BGseX" element
     */
    public void xsetBGseXArray(int i, org.apache.xmlbeans.XmlDouble bGseX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BGSEX$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bGseX);
        }
    }
    
    /**
     * Nils the ith "BGseX" element
     */
    public void setNilBGseXArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BGSEX$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "BGseX" element
     */
    public void insertBGseX(int i, double bGseX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BGSEX$0, i);
            target.setDoubleValue(bGseX);
        }
    }
    
    /**
     * Appends the value as the last "BGseX" element
     */
    public void addBGseX(double bGseX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BGSEX$0);
            target.setDoubleValue(bGseX);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BGseX" element
     */
    public org.apache.xmlbeans.XmlDouble insertNewBGseX(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(BGSEX$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BGseX" element
     */
    public org.apache.xmlbeans.XmlDouble addNewBGseX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(BGSEX$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "BGseX" element
     */
    public void removeBGseX(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BGSEX$0, i);
        }
    }
    
    /**
     * Gets array of all "BGseY" elements
     */
    public double[] getBGseYArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BGSEY$2, targetList);
            double[] result = new double[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
            return result;
        }
    }
    
    /**
     * Gets ith "BGseY" element
     */
    public double getBGseYArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BGSEY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "BGseY" elements
     */
    public org.apache.xmlbeans.XmlDouble[] xgetBGseYArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BGSEY$2, targetList);
            org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "BGseY" element
     */
    public org.apache.xmlbeans.XmlDouble xgetBGseYArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BGSEY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDouble)target;
        }
    }
    
    /**
     * Tests for nil ith "BGseY" element
     */
    public boolean isNilBGseYArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BGSEY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "BGseY" element
     */
    public int sizeOfBGseYArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BGSEY$2);
        }
    }
    
    /**
     * Sets array of all "BGseY" element
     */
    public void setBGseYArray(double[] bGseYArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bGseYArray, BGSEY$2);
        }
    }
    
    /**
     * Sets ith "BGseY" element
     */
    public void setBGseYArray(int i, double bGseY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BGSEY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(bGseY);
        }
    }
    
    /**
     * Sets (as xml) array of all "BGseY" element
     */
    public void xsetBGseYArray(org.apache.xmlbeans.XmlDouble[]bGseYArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bGseYArray, BGSEY$2);
        }
    }
    
    /**
     * Sets (as xml) ith "BGseY" element
     */
    public void xsetBGseYArray(int i, org.apache.xmlbeans.XmlDouble bGseY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BGSEY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bGseY);
        }
    }
    
    /**
     * Nils the ith "BGseY" element
     */
    public void setNilBGseYArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BGSEY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "BGseY" element
     */
    public void insertBGseY(int i, double bGseY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BGSEY$2, i);
            target.setDoubleValue(bGseY);
        }
    }
    
    /**
     * Appends the value as the last "BGseY" element
     */
    public void addBGseY(double bGseY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BGSEY$2);
            target.setDoubleValue(bGseY);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BGseY" element
     */
    public org.apache.xmlbeans.XmlDouble insertNewBGseY(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(BGSEY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BGseY" element
     */
    public org.apache.xmlbeans.XmlDouble addNewBGseY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(BGSEY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "BGseY" element
     */
    public void removeBGseY(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BGSEY$2, i);
        }
    }
    
    /**
     * Gets array of all "BGseZ" elements
     */
    public double[] getBGseZArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BGSEZ$4, targetList);
            double[] result = new double[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
            return result;
        }
    }
    
    /**
     * Gets ith "BGseZ" element
     */
    public double getBGseZArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BGSEZ$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "BGseZ" elements
     */
    public org.apache.xmlbeans.XmlDouble[] xgetBGseZArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BGSEZ$4, targetList);
            org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "BGseZ" element
     */
    public org.apache.xmlbeans.XmlDouble xgetBGseZArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BGSEZ$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDouble)target;
        }
    }
    
    /**
     * Tests for nil ith "BGseZ" element
     */
    public boolean isNilBGseZArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BGSEZ$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "BGseZ" element
     */
    public int sizeOfBGseZArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BGSEZ$4);
        }
    }
    
    /**
     * Sets array of all "BGseZ" element
     */
    public void setBGseZArray(double[] bGseZArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bGseZArray, BGSEZ$4);
        }
    }
    
    /**
     * Sets ith "BGseZ" element
     */
    public void setBGseZArray(int i, double bGseZ)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BGSEZ$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(bGseZ);
        }
    }
    
    /**
     * Sets (as xml) array of all "BGseZ" element
     */
    public void xsetBGseZArray(org.apache.xmlbeans.XmlDouble[]bGseZArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bGseZArray, BGSEZ$4);
        }
    }
    
    /**
     * Sets (as xml) ith "BGseZ" element
     */
    public void xsetBGseZArray(int i, org.apache.xmlbeans.XmlDouble bGseZ)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BGSEZ$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bGseZ);
        }
    }
    
    /**
     * Nils the ith "BGseZ" element
     */
    public void setNilBGseZArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BGSEZ$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "BGseZ" element
     */
    public void insertBGseZ(int i, double bGseZ)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BGSEZ$4, i);
            target.setDoubleValue(bGseZ);
        }
    }
    
    /**
     * Appends the value as the last "BGseZ" element
     */
    public void addBGseZ(double bGseZ)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BGSEZ$4);
            target.setDoubleValue(bGseZ);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BGseZ" element
     */
    public org.apache.xmlbeans.XmlDouble insertNewBGseZ(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(BGSEZ$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BGseZ" element
     */
    public org.apache.xmlbeans.XmlDouble addNewBGseZ()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(BGSEZ$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "BGseZ" element
     */
    public void removeBGseZ(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BGSEZ$4, i);
        }
    }
    
    /**
     * Gets array of all "BTraceData" elements
     */
    public gov.nasa.gsfc.spdf.ssc.BTraceData[] getBTraceDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BTRACEDATA$6, targetList);
            gov.nasa.gsfc.spdf.ssc.BTraceData[] result = new gov.nasa.gsfc.spdf.ssc.BTraceData[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "BTraceData" element
     */
    public gov.nasa.gsfc.spdf.ssc.BTraceData getBTraceDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.BTraceData target = null;
            target = (gov.nasa.gsfc.spdf.ssc.BTraceData)get_store().find_element_user(BTRACEDATA$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "BTraceData" element
     */
    public boolean isNilBTraceDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.BTraceData target = null;
            target = (gov.nasa.gsfc.spdf.ssc.BTraceData)get_store().find_element_user(BTRACEDATA$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "BTraceData" element
     */
    public int sizeOfBTraceDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BTRACEDATA$6);
        }
    }
    
    /**
     * Sets array of all "BTraceData" element
     */
    public void setBTraceDataArray(gov.nasa.gsfc.spdf.ssc.BTraceData[] bTraceDataArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bTraceDataArray, BTRACEDATA$6);
        }
    }
    
    /**
     * Sets ith "BTraceData" element
     */
    public void setBTraceDataArray(int i, gov.nasa.gsfc.spdf.ssc.BTraceData bTraceData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.BTraceData target = null;
            target = (gov.nasa.gsfc.spdf.ssc.BTraceData)get_store().find_element_user(BTRACEDATA$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bTraceData);
        }
    }
    
    /**
     * Nils the ith "BTraceData" element
     */
    public void setNilBTraceDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.BTraceData target = null;
            target = (gov.nasa.gsfc.spdf.ssc.BTraceData)get_store().find_element_user(BTRACEDATA$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BTraceData" element
     */
    public gov.nasa.gsfc.spdf.ssc.BTraceData insertNewBTraceData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.BTraceData target = null;
            target = (gov.nasa.gsfc.spdf.ssc.BTraceData)get_store().insert_element_user(BTRACEDATA$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BTraceData" element
     */
    public gov.nasa.gsfc.spdf.ssc.BTraceData addNewBTraceData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.BTraceData target = null;
            target = (gov.nasa.gsfc.spdf.ssc.BTraceData)get_store().add_element_user(BTRACEDATA$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "BTraceData" element
     */
    public void removeBTraceData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BTRACEDATA$6, i);
        }
    }
    
    /**
     * Gets array of all "bowShockDistance" elements
     */
    public double[] getBowShockDistanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BOWSHOCKDISTANCE$8, targetList);
            double[] result = new double[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
            return result;
        }
    }
    
    /**
     * Gets ith "bowShockDistance" element
     */
    public double getBowShockDistanceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOWSHOCKDISTANCE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "bowShockDistance" elements
     */
    public org.apache.xmlbeans.XmlDouble[] xgetBowShockDistanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BOWSHOCKDISTANCE$8, targetList);
            org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "bowShockDistance" element
     */
    public org.apache.xmlbeans.XmlDouble xgetBowShockDistanceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BOWSHOCKDISTANCE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDouble)target;
        }
    }
    
    /**
     * Tests for nil ith "bowShockDistance" element
     */
    public boolean isNilBowShockDistanceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BOWSHOCKDISTANCE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "bowShockDistance" element
     */
    public int sizeOfBowShockDistanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOWSHOCKDISTANCE$8);
        }
    }
    
    /**
     * Sets array of all "bowShockDistance" element
     */
    public void setBowShockDistanceArray(double[] bowShockDistanceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bowShockDistanceArray, BOWSHOCKDISTANCE$8);
        }
    }
    
    /**
     * Sets ith "bowShockDistance" element
     */
    public void setBowShockDistanceArray(int i, double bowShockDistance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOWSHOCKDISTANCE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(bowShockDistance);
        }
    }
    
    /**
     * Sets (as xml) array of all "bowShockDistance" element
     */
    public void xsetBowShockDistanceArray(org.apache.xmlbeans.XmlDouble[]bowShockDistanceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bowShockDistanceArray, BOWSHOCKDISTANCE$8);
        }
    }
    
    /**
     * Sets (as xml) ith "bowShockDistance" element
     */
    public void xsetBowShockDistanceArray(int i, org.apache.xmlbeans.XmlDouble bowShockDistance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BOWSHOCKDISTANCE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bowShockDistance);
        }
    }
    
    /**
     * Nils the ith "bowShockDistance" element
     */
    public void setNilBowShockDistanceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(BOWSHOCKDISTANCE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "bowShockDistance" element
     */
    public void insertBowShockDistance(int i, double bowShockDistance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BOWSHOCKDISTANCE$8, i);
            target.setDoubleValue(bowShockDistance);
        }
    }
    
    /**
     * Appends the value as the last "bowShockDistance" element
     */
    public void addBowShockDistance(double bowShockDistance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOWSHOCKDISTANCE$8);
            target.setDoubleValue(bowShockDistance);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bowShockDistance" element
     */
    public org.apache.xmlbeans.XmlDouble insertNewBowShockDistance(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(BOWSHOCKDISTANCE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bowShockDistance" element
     */
    public org.apache.xmlbeans.XmlDouble addNewBowShockDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(BOWSHOCKDISTANCE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "bowShockDistance" element
     */
    public void removeBowShockDistance(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOWSHOCKDISTANCE$8, i);
        }
    }
    
    /**
     * Gets array of all "coordinates" elements
     */
    public gov.nasa.gsfc.spdf.ssc.CoordinateData[] getCoordinatesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COORDINATES$10, targetList);
            gov.nasa.gsfc.spdf.ssc.CoordinateData[] result = new gov.nasa.gsfc.spdf.ssc.CoordinateData[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "coordinates" element
     */
    public gov.nasa.gsfc.spdf.ssc.CoordinateData getCoordinatesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.CoordinateData target = null;
            target = (gov.nasa.gsfc.spdf.ssc.CoordinateData)get_store().find_element_user(COORDINATES$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "coordinates" element
     */
    public boolean isNilCoordinatesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.CoordinateData target = null;
            target = (gov.nasa.gsfc.spdf.ssc.CoordinateData)get_store().find_element_user(COORDINATES$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "coordinates" element
     */
    public int sizeOfCoordinatesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COORDINATES$10);
        }
    }
    
    /**
     * Sets array of all "coordinates" element
     */
    public void setCoordinatesArray(gov.nasa.gsfc.spdf.ssc.CoordinateData[] coordinatesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(coordinatesArray, COORDINATES$10);
        }
    }
    
    /**
     * Sets ith "coordinates" element
     */
    public void setCoordinatesArray(int i, gov.nasa.gsfc.spdf.ssc.CoordinateData coordinates)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.CoordinateData target = null;
            target = (gov.nasa.gsfc.spdf.ssc.CoordinateData)get_store().find_element_user(COORDINATES$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(coordinates);
        }
    }
    
    /**
     * Nils the ith "coordinates" element
     */
    public void setNilCoordinatesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.CoordinateData target = null;
            target = (gov.nasa.gsfc.spdf.ssc.CoordinateData)get_store().find_element_user(COORDINATES$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "coordinates" element
     */
    public gov.nasa.gsfc.spdf.ssc.CoordinateData insertNewCoordinates(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.CoordinateData target = null;
            target = (gov.nasa.gsfc.spdf.ssc.CoordinateData)get_store().insert_element_user(COORDINATES$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "coordinates" element
     */
    public gov.nasa.gsfc.spdf.ssc.CoordinateData addNewCoordinates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.CoordinateData target = null;
            target = (gov.nasa.gsfc.spdf.ssc.CoordinateData)get_store().add_element_user(COORDINATES$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "coordinates" element
     */
    public void removeCoordinates(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COORDINATES$10, i);
        }
    }
    
    /**
     * Gets array of all "dipoleInvariantLatitude" elements
     */
    public float[] getDipoleInvariantLatitudeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIPOLEINVARIANTLATITUDE$12, targetList);
            float[] result = new float[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getFloatValue();
            return result;
        }
    }
    
    /**
     * Gets ith "dipoleInvariantLatitude" element
     */
    public float getDipoleInvariantLatitudeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIPOLEINVARIANTLATITUDE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "dipoleInvariantLatitude" elements
     */
    public org.apache.xmlbeans.XmlFloat[] xgetDipoleInvariantLatitudeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIPOLEINVARIANTLATITUDE$12, targetList);
            org.apache.xmlbeans.XmlFloat[] result = new org.apache.xmlbeans.XmlFloat[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "dipoleInvariantLatitude" element
     */
    public org.apache.xmlbeans.XmlFloat xgetDipoleInvariantLatitudeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(DIPOLEINVARIANTLATITUDE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlFloat)target;
        }
    }
    
    /**
     * Tests for nil ith "dipoleInvariantLatitude" element
     */
    public boolean isNilDipoleInvariantLatitudeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(DIPOLEINVARIANTLATITUDE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "dipoleInvariantLatitude" element
     */
    public int sizeOfDipoleInvariantLatitudeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIPOLEINVARIANTLATITUDE$12);
        }
    }
    
    /**
     * Sets array of all "dipoleInvariantLatitude" element
     */
    public void setDipoleInvariantLatitudeArray(float[] dipoleInvariantLatitudeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dipoleInvariantLatitudeArray, DIPOLEINVARIANTLATITUDE$12);
        }
    }
    
    /**
     * Sets ith "dipoleInvariantLatitude" element
     */
    public void setDipoleInvariantLatitudeArray(int i, float dipoleInvariantLatitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIPOLEINVARIANTLATITUDE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setFloatValue(dipoleInvariantLatitude);
        }
    }
    
    /**
     * Sets (as xml) array of all "dipoleInvariantLatitude" element
     */
    public void xsetDipoleInvariantLatitudeArray(org.apache.xmlbeans.XmlFloat[]dipoleInvariantLatitudeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dipoleInvariantLatitudeArray, DIPOLEINVARIANTLATITUDE$12);
        }
    }
    
    /**
     * Sets (as xml) ith "dipoleInvariantLatitude" element
     */
    public void xsetDipoleInvariantLatitudeArray(int i, org.apache.xmlbeans.XmlFloat dipoleInvariantLatitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(DIPOLEINVARIANTLATITUDE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dipoleInvariantLatitude);
        }
    }
    
    /**
     * Nils the ith "dipoleInvariantLatitude" element
     */
    public void setNilDipoleInvariantLatitudeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(DIPOLEINVARIANTLATITUDE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "dipoleInvariantLatitude" element
     */
    public void insertDipoleInvariantLatitude(int i, float dipoleInvariantLatitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DIPOLEINVARIANTLATITUDE$12, i);
            target.setFloatValue(dipoleInvariantLatitude);
        }
    }
    
    /**
     * Appends the value as the last "dipoleInvariantLatitude" element
     */
    public void addDipoleInvariantLatitude(float dipoleInvariantLatitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIPOLEINVARIANTLATITUDE$12);
            target.setFloatValue(dipoleInvariantLatitude);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dipoleInvariantLatitude" element
     */
    public org.apache.xmlbeans.XmlFloat insertNewDipoleInvariantLatitude(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().insert_element_user(DIPOLEINVARIANTLATITUDE$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dipoleInvariantLatitude" element
     */
    public org.apache.xmlbeans.XmlFloat addNewDipoleInvariantLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(DIPOLEINVARIANTLATITUDE$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "dipoleInvariantLatitude" element
     */
    public void removeDipoleInvariantLatitude(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIPOLEINVARIANTLATITUDE$12, i);
        }
    }
    
    /**
     * Gets array of all "dipoleLValue" elements
     */
    public double[] getDipoleLValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIPOLELVALUE$14, targetList);
            double[] result = new double[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
            return result;
        }
    }
    
    /**
     * Gets ith "dipoleLValue" element
     */
    public double getDipoleLValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIPOLELVALUE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "dipoleLValue" elements
     */
    public org.apache.xmlbeans.XmlDouble[] xgetDipoleLValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIPOLELVALUE$14, targetList);
            org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "dipoleLValue" element
     */
    public org.apache.xmlbeans.XmlDouble xgetDipoleLValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(DIPOLELVALUE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDouble)target;
        }
    }
    
    /**
     * Tests for nil ith "dipoleLValue" element
     */
    public boolean isNilDipoleLValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(DIPOLELVALUE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "dipoleLValue" element
     */
    public int sizeOfDipoleLValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIPOLELVALUE$14);
        }
    }
    
    /**
     * Sets array of all "dipoleLValue" element
     */
    public void setDipoleLValueArray(double[] dipoleLValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dipoleLValueArray, DIPOLELVALUE$14);
        }
    }
    
    /**
     * Sets ith "dipoleLValue" element
     */
    public void setDipoleLValueArray(int i, double dipoleLValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIPOLELVALUE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(dipoleLValue);
        }
    }
    
    /**
     * Sets (as xml) array of all "dipoleLValue" element
     */
    public void xsetDipoleLValueArray(org.apache.xmlbeans.XmlDouble[]dipoleLValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dipoleLValueArray, DIPOLELVALUE$14);
        }
    }
    
    /**
     * Sets (as xml) ith "dipoleLValue" element
     */
    public void xsetDipoleLValueArray(int i, org.apache.xmlbeans.XmlDouble dipoleLValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(DIPOLELVALUE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dipoleLValue);
        }
    }
    
    /**
     * Nils the ith "dipoleLValue" element
     */
    public void setNilDipoleLValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(DIPOLELVALUE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "dipoleLValue" element
     */
    public void insertDipoleLValue(int i, double dipoleLValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DIPOLELVALUE$14, i);
            target.setDoubleValue(dipoleLValue);
        }
    }
    
    /**
     * Appends the value as the last "dipoleLValue" element
     */
    public void addDipoleLValue(double dipoleLValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIPOLELVALUE$14);
            target.setDoubleValue(dipoleLValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dipoleLValue" element
     */
    public org.apache.xmlbeans.XmlDouble insertNewDipoleLValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(DIPOLELVALUE$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dipoleLValue" element
     */
    public org.apache.xmlbeans.XmlDouble addNewDipoleLValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(DIPOLELVALUE$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "dipoleLValue" element
     */
    public void removeDipoleLValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIPOLELVALUE$14, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$16, 0);
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
            return get_store().count_elements(ID$16) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$16);
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
            get_store().remove_element(ID$16, 0);
        }
    }
    
    /**
     * Gets array of all "magneticStrength" elements
     */
    public double[] getMagneticStrengthArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAGNETICSTRENGTH$18, targetList);
            double[] result = new double[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
            return result;
        }
    }
    
    /**
     * Gets ith "magneticStrength" element
     */
    public double getMagneticStrengthArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAGNETICSTRENGTH$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "magneticStrength" elements
     */
    public org.apache.xmlbeans.XmlDouble[] xgetMagneticStrengthArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAGNETICSTRENGTH$18, targetList);
            org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "magneticStrength" element
     */
    public org.apache.xmlbeans.XmlDouble xgetMagneticStrengthArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAGNETICSTRENGTH$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDouble)target;
        }
    }
    
    /**
     * Tests for nil ith "magneticStrength" element
     */
    public boolean isNilMagneticStrengthArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAGNETICSTRENGTH$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "magneticStrength" element
     */
    public int sizeOfMagneticStrengthArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAGNETICSTRENGTH$18);
        }
    }
    
    /**
     * Sets array of all "magneticStrength" element
     */
    public void setMagneticStrengthArray(double[] magneticStrengthArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(magneticStrengthArray, MAGNETICSTRENGTH$18);
        }
    }
    
    /**
     * Sets ith "magneticStrength" element
     */
    public void setMagneticStrengthArray(int i, double magneticStrength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAGNETICSTRENGTH$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(magneticStrength);
        }
    }
    
    /**
     * Sets (as xml) array of all "magneticStrength" element
     */
    public void xsetMagneticStrengthArray(org.apache.xmlbeans.XmlDouble[]magneticStrengthArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(magneticStrengthArray, MAGNETICSTRENGTH$18);
        }
    }
    
    /**
     * Sets (as xml) ith "magneticStrength" element
     */
    public void xsetMagneticStrengthArray(int i, org.apache.xmlbeans.XmlDouble magneticStrength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAGNETICSTRENGTH$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(magneticStrength);
        }
    }
    
    /**
     * Nils the ith "magneticStrength" element
     */
    public void setNilMagneticStrengthArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAGNETICSTRENGTH$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "magneticStrength" element
     */
    public void insertMagneticStrength(int i, double magneticStrength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(MAGNETICSTRENGTH$18, i);
            target.setDoubleValue(magneticStrength);
        }
    }
    
    /**
     * Appends the value as the last "magneticStrength" element
     */
    public void addMagneticStrength(double magneticStrength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAGNETICSTRENGTH$18);
            target.setDoubleValue(magneticStrength);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "magneticStrength" element
     */
    public org.apache.xmlbeans.XmlDouble insertNewMagneticStrength(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(MAGNETICSTRENGTH$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "magneticStrength" element
     */
    public org.apache.xmlbeans.XmlDouble addNewMagneticStrength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MAGNETICSTRENGTH$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "magneticStrength" element
     */
    public void removeMagneticStrength(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAGNETICSTRENGTH$18, i);
        }
    }
    
    /**
     * Gets array of all "magnetoPauseDistance" elements
     */
    public double[] getMagnetoPauseDistanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAGNETOPAUSEDISTANCE$20, targetList);
            double[] result = new double[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
            return result;
        }
    }
    
    /**
     * Gets ith "magnetoPauseDistance" element
     */
    public double getMagnetoPauseDistanceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAGNETOPAUSEDISTANCE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "magnetoPauseDistance" elements
     */
    public org.apache.xmlbeans.XmlDouble[] xgetMagnetoPauseDistanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAGNETOPAUSEDISTANCE$20, targetList);
            org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "magnetoPauseDistance" element
     */
    public org.apache.xmlbeans.XmlDouble xgetMagnetoPauseDistanceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAGNETOPAUSEDISTANCE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDouble)target;
        }
    }
    
    /**
     * Tests for nil ith "magnetoPauseDistance" element
     */
    public boolean isNilMagnetoPauseDistanceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAGNETOPAUSEDISTANCE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "magnetoPauseDistance" element
     */
    public int sizeOfMagnetoPauseDistanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAGNETOPAUSEDISTANCE$20);
        }
    }
    
    /**
     * Sets array of all "magnetoPauseDistance" element
     */
    public void setMagnetoPauseDistanceArray(double[] magnetoPauseDistanceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(magnetoPauseDistanceArray, MAGNETOPAUSEDISTANCE$20);
        }
    }
    
    /**
     * Sets ith "magnetoPauseDistance" element
     */
    public void setMagnetoPauseDistanceArray(int i, double magnetoPauseDistance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAGNETOPAUSEDISTANCE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(magnetoPauseDistance);
        }
    }
    
    /**
     * Sets (as xml) array of all "magnetoPauseDistance" element
     */
    public void xsetMagnetoPauseDistanceArray(org.apache.xmlbeans.XmlDouble[]magnetoPauseDistanceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(magnetoPauseDistanceArray, MAGNETOPAUSEDISTANCE$20);
        }
    }
    
    /**
     * Sets (as xml) ith "magnetoPauseDistance" element
     */
    public void xsetMagnetoPauseDistanceArray(int i, org.apache.xmlbeans.XmlDouble magnetoPauseDistance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAGNETOPAUSEDISTANCE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(magnetoPauseDistance);
        }
    }
    
    /**
     * Nils the ith "magnetoPauseDistance" element
     */
    public void setNilMagnetoPauseDistanceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MAGNETOPAUSEDISTANCE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "magnetoPauseDistance" element
     */
    public void insertMagnetoPauseDistance(int i, double magnetoPauseDistance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(MAGNETOPAUSEDISTANCE$20, i);
            target.setDoubleValue(magnetoPauseDistance);
        }
    }
    
    /**
     * Appends the value as the last "magnetoPauseDistance" element
     */
    public void addMagnetoPauseDistance(double magnetoPauseDistance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAGNETOPAUSEDISTANCE$20);
            target.setDoubleValue(magnetoPauseDistance);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "magnetoPauseDistance" element
     */
    public org.apache.xmlbeans.XmlDouble insertNewMagnetoPauseDistance(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(MAGNETOPAUSEDISTANCE$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "magnetoPauseDistance" element
     */
    public org.apache.xmlbeans.XmlDouble addNewMagnetoPauseDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MAGNETOPAUSEDISTANCE$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "magnetoPauseDistance" element
     */
    public void removeMagnetoPauseDistance(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAGNETOPAUSEDISTANCE$20, i);
        }
    }
    
    /**
     * Gets array of all "neutralSheetDistance" elements
     */
    public double[] getNeutralSheetDistanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NEUTRALSHEETDISTANCE$22, targetList);
            double[] result = new double[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
            return result;
        }
    }
    
    /**
     * Gets ith "neutralSheetDistance" element
     */
    public double getNeutralSheetDistanceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEUTRALSHEETDISTANCE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "neutralSheetDistance" elements
     */
    public org.apache.xmlbeans.XmlDouble[] xgetNeutralSheetDistanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NEUTRALSHEETDISTANCE$22, targetList);
            org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "neutralSheetDistance" element
     */
    public org.apache.xmlbeans.XmlDouble xgetNeutralSheetDistanceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(NEUTRALSHEETDISTANCE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDouble)target;
        }
    }
    
    /**
     * Tests for nil ith "neutralSheetDistance" element
     */
    public boolean isNilNeutralSheetDistanceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(NEUTRALSHEETDISTANCE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "neutralSheetDistance" element
     */
    public int sizeOfNeutralSheetDistanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEUTRALSHEETDISTANCE$22);
        }
    }
    
    /**
     * Sets array of all "neutralSheetDistance" element
     */
    public void setNeutralSheetDistanceArray(double[] neutralSheetDistanceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(neutralSheetDistanceArray, NEUTRALSHEETDISTANCE$22);
        }
    }
    
    /**
     * Sets ith "neutralSheetDistance" element
     */
    public void setNeutralSheetDistanceArray(int i, double neutralSheetDistance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEUTRALSHEETDISTANCE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(neutralSheetDistance);
        }
    }
    
    /**
     * Sets (as xml) array of all "neutralSheetDistance" element
     */
    public void xsetNeutralSheetDistanceArray(org.apache.xmlbeans.XmlDouble[]neutralSheetDistanceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(neutralSheetDistanceArray, NEUTRALSHEETDISTANCE$22);
        }
    }
    
    /**
     * Sets (as xml) ith "neutralSheetDistance" element
     */
    public void xsetNeutralSheetDistanceArray(int i, org.apache.xmlbeans.XmlDouble neutralSheetDistance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(NEUTRALSHEETDISTANCE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(neutralSheetDistance);
        }
    }
    
    /**
     * Nils the ith "neutralSheetDistance" element
     */
    public void setNilNeutralSheetDistanceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(NEUTRALSHEETDISTANCE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "neutralSheetDistance" element
     */
    public void insertNeutralSheetDistance(int i, double neutralSheetDistance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NEUTRALSHEETDISTANCE$22, i);
            target.setDoubleValue(neutralSheetDistance);
        }
    }
    
    /**
     * Appends the value as the last "neutralSheetDistance" element
     */
    public void addNeutralSheetDistance(double neutralSheetDistance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEUTRALSHEETDISTANCE$22);
            target.setDoubleValue(neutralSheetDistance);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "neutralSheetDistance" element
     */
    public org.apache.xmlbeans.XmlDouble insertNewNeutralSheetDistance(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(NEUTRALSHEETDISTANCE$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "neutralSheetDistance" element
     */
    public org.apache.xmlbeans.XmlDouble addNewNeutralSheetDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(NEUTRALSHEETDISTANCE$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "neutralSheetDistance" element
     */
    public void removeNeutralSheetDistance(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEUTRALSHEETDISTANCE$22, i);
        }
    }
    
    /**
     * Gets array of all "northBTracedRegions" elements
     */
    public gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum[] getNorthBTracedRegionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NORTHBTRACEDREGIONS$24, targetList);
            gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum[] result = new gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "northBTracedRegions" element
     */
    public gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum getNorthBTracedRegionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NORTHBTRACEDREGIONS$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "northBTracedRegions" elements
     */
    public gov.nasa.gsfc.spdf.ssc.FootpointRegion[] xgetNorthBTracedRegionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NORTHBTRACEDREGIONS$24, targetList);
            gov.nasa.gsfc.spdf.ssc.FootpointRegion[] result = new gov.nasa.gsfc.spdf.ssc.FootpointRegion[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "northBTracedRegions" element
     */
    public gov.nasa.gsfc.spdf.ssc.FootpointRegion xgetNorthBTracedRegionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FootpointRegion target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FootpointRegion)get_store().find_element_user(NORTHBTRACEDREGIONS$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (gov.nasa.gsfc.spdf.ssc.FootpointRegion)target;
        }
    }
    
    /**
     * Tests for nil ith "northBTracedRegions" element
     */
    public boolean isNilNorthBTracedRegionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FootpointRegion target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FootpointRegion)get_store().find_element_user(NORTHBTRACEDREGIONS$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "northBTracedRegions" element
     */
    public int sizeOfNorthBTracedRegionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NORTHBTRACEDREGIONS$24);
        }
    }
    
    /**
     * Sets array of all "northBTracedRegions" element
     */
    public void setNorthBTracedRegionsArray(gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum[] northBTracedRegionsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(northBTracedRegionsArray, NORTHBTRACEDREGIONS$24);
        }
    }
    
    /**
     * Sets ith "northBTracedRegions" element
     */
    public void setNorthBTracedRegionsArray(int i, gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum northBTracedRegions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NORTHBTRACEDREGIONS$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(northBTracedRegions);
        }
    }
    
    /**
     * Sets (as xml) array of all "northBTracedRegions" element
     */
    public void xsetNorthBTracedRegionsArray(gov.nasa.gsfc.spdf.ssc.FootpointRegion[]northBTracedRegionsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(northBTracedRegionsArray, NORTHBTRACEDREGIONS$24);
        }
    }
    
    /**
     * Sets (as xml) ith "northBTracedRegions" element
     */
    public void xsetNorthBTracedRegionsArray(int i, gov.nasa.gsfc.spdf.ssc.FootpointRegion northBTracedRegions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FootpointRegion target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FootpointRegion)get_store().find_element_user(NORTHBTRACEDREGIONS$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(northBTracedRegions);
        }
    }
    
    /**
     * Nils the ith "northBTracedRegions" element
     */
    public void setNilNorthBTracedRegionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FootpointRegion target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FootpointRegion)get_store().find_element_user(NORTHBTRACEDREGIONS$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "northBTracedRegions" element
     */
    public void insertNorthBTracedRegions(int i, gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum northBTracedRegions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NORTHBTRACEDREGIONS$24, i);
            target.setEnumValue(northBTracedRegions);
        }
    }
    
    /**
     * Appends the value as the last "northBTracedRegions" element
     */
    public void addNorthBTracedRegions(gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum northBTracedRegions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NORTHBTRACEDREGIONS$24);
            target.setEnumValue(northBTracedRegions);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "northBTracedRegions" element
     */
    public gov.nasa.gsfc.spdf.ssc.FootpointRegion insertNewNorthBTracedRegions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FootpointRegion target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FootpointRegion)get_store().insert_element_user(NORTHBTRACEDREGIONS$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "northBTracedRegions" element
     */
    public gov.nasa.gsfc.spdf.ssc.FootpointRegion addNewNorthBTracedRegions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FootpointRegion target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FootpointRegion)get_store().add_element_user(NORTHBTRACEDREGIONS$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "northBTracedRegions" element
     */
    public void removeNorthBTracedRegions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NORTHBTRACEDREGIONS$24, i);
        }
    }
    
    /**
     * Gets array of all "radialLength" elements
     */
    public double[] getRadialLengthArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RADIALLENGTH$26, targetList);
            double[] result = new double[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getDoubleValue();
            return result;
        }
    }
    
    /**
     * Gets ith "radialLength" element
     */
    public double getRadialLengthArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RADIALLENGTH$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "radialLength" elements
     */
    public org.apache.xmlbeans.XmlDouble[] xgetRadialLengthArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RADIALLENGTH$26, targetList);
            org.apache.xmlbeans.XmlDouble[] result = new org.apache.xmlbeans.XmlDouble[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "radialLength" element
     */
    public org.apache.xmlbeans.XmlDouble xgetRadialLengthArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(RADIALLENGTH$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDouble)target;
        }
    }
    
    /**
     * Tests for nil ith "radialLength" element
     */
    public boolean isNilRadialLengthArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(RADIALLENGTH$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "radialLength" element
     */
    public int sizeOfRadialLengthArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RADIALLENGTH$26);
        }
    }
    
    /**
     * Sets array of all "radialLength" element
     */
    public void setRadialLengthArray(double[] radialLengthArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(radialLengthArray, RADIALLENGTH$26);
        }
    }
    
    /**
     * Sets ith "radialLength" element
     */
    public void setRadialLengthArray(int i, double radialLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RADIALLENGTH$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(radialLength);
        }
    }
    
    /**
     * Sets (as xml) array of all "radialLength" element
     */
    public void xsetRadialLengthArray(org.apache.xmlbeans.XmlDouble[]radialLengthArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(radialLengthArray, RADIALLENGTH$26);
        }
    }
    
    /**
     * Sets (as xml) ith "radialLength" element
     */
    public void xsetRadialLengthArray(int i, org.apache.xmlbeans.XmlDouble radialLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(RADIALLENGTH$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(radialLength);
        }
    }
    
    /**
     * Nils the ith "radialLength" element
     */
    public void setNilRadialLengthArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(RADIALLENGTH$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "radialLength" element
     */
    public void insertRadialLength(int i, double radialLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(RADIALLENGTH$26, i);
            target.setDoubleValue(radialLength);
        }
    }
    
    /**
     * Appends the value as the last "radialLength" element
     */
    public void addRadialLength(double radialLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RADIALLENGTH$26);
            target.setDoubleValue(radialLength);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "radialLength" element
     */
    public org.apache.xmlbeans.XmlDouble insertNewRadialLength(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(RADIALLENGTH$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "radialLength" element
     */
    public org.apache.xmlbeans.XmlDouble addNewRadialLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(RADIALLENGTH$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "radialLength" element
     */
    public void removeRadialLength(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RADIALLENGTH$26, i);
        }
    }
    
    /**
     * Gets array of all "radialTraceFootpointRegion" elements
     */
    public gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum[] getRadialTraceFootpointRegionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RADIALTRACEFOOTPOINTREGION$28, targetList);
            gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum[] result = new gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "radialTraceFootpointRegion" element
     */
    public gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum getRadialTraceFootpointRegionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RADIALTRACEFOOTPOINTREGION$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "radialTraceFootpointRegion" elements
     */
    public gov.nasa.gsfc.spdf.ssc.FootpointRegion[] xgetRadialTraceFootpointRegionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RADIALTRACEFOOTPOINTREGION$28, targetList);
            gov.nasa.gsfc.spdf.ssc.FootpointRegion[] result = new gov.nasa.gsfc.spdf.ssc.FootpointRegion[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "radialTraceFootpointRegion" element
     */
    public gov.nasa.gsfc.spdf.ssc.FootpointRegion xgetRadialTraceFootpointRegionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FootpointRegion target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FootpointRegion)get_store().find_element_user(RADIALTRACEFOOTPOINTREGION$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (gov.nasa.gsfc.spdf.ssc.FootpointRegion)target;
        }
    }
    
    /**
     * Tests for nil ith "radialTraceFootpointRegion" element
     */
    public boolean isNilRadialTraceFootpointRegionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FootpointRegion target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FootpointRegion)get_store().find_element_user(RADIALTRACEFOOTPOINTREGION$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "radialTraceFootpointRegion" element
     */
    public int sizeOfRadialTraceFootpointRegionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RADIALTRACEFOOTPOINTREGION$28);
        }
    }
    
    /**
     * Sets array of all "radialTraceFootpointRegion" element
     */
    public void setRadialTraceFootpointRegionArray(gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum[] radialTraceFootpointRegionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(radialTraceFootpointRegionArray, RADIALTRACEFOOTPOINTREGION$28);
        }
    }
    
    /**
     * Sets ith "radialTraceFootpointRegion" element
     */
    public void setRadialTraceFootpointRegionArray(int i, gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum radialTraceFootpointRegion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RADIALTRACEFOOTPOINTREGION$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(radialTraceFootpointRegion);
        }
    }
    
    /**
     * Sets (as xml) array of all "radialTraceFootpointRegion" element
     */
    public void xsetRadialTraceFootpointRegionArray(gov.nasa.gsfc.spdf.ssc.FootpointRegion[]radialTraceFootpointRegionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(radialTraceFootpointRegionArray, RADIALTRACEFOOTPOINTREGION$28);
        }
    }
    
    /**
     * Sets (as xml) ith "radialTraceFootpointRegion" element
     */
    public void xsetRadialTraceFootpointRegionArray(int i, gov.nasa.gsfc.spdf.ssc.FootpointRegion radialTraceFootpointRegion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FootpointRegion target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FootpointRegion)get_store().find_element_user(RADIALTRACEFOOTPOINTREGION$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(radialTraceFootpointRegion);
        }
    }
    
    /**
     * Nils the ith "radialTraceFootpointRegion" element
     */
    public void setNilRadialTraceFootpointRegionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FootpointRegion target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FootpointRegion)get_store().find_element_user(RADIALTRACEFOOTPOINTREGION$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "radialTraceFootpointRegion" element
     */
    public void insertRadialTraceFootpointRegion(int i, gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum radialTraceFootpointRegion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(RADIALTRACEFOOTPOINTREGION$28, i);
            target.setEnumValue(radialTraceFootpointRegion);
        }
    }
    
    /**
     * Appends the value as the last "radialTraceFootpointRegion" element
     */
    public void addRadialTraceFootpointRegion(gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum radialTraceFootpointRegion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RADIALTRACEFOOTPOINTREGION$28);
            target.setEnumValue(radialTraceFootpointRegion);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "radialTraceFootpointRegion" element
     */
    public gov.nasa.gsfc.spdf.ssc.FootpointRegion insertNewRadialTraceFootpointRegion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FootpointRegion target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FootpointRegion)get_store().insert_element_user(RADIALTRACEFOOTPOINTREGION$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "radialTraceFootpointRegion" element
     */
    public gov.nasa.gsfc.spdf.ssc.FootpointRegion addNewRadialTraceFootpointRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FootpointRegion target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FootpointRegion)get_store().add_element_user(RADIALTRACEFOOTPOINTREGION$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "radialTraceFootpointRegion" element
     */
    public void removeRadialTraceFootpointRegion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RADIALTRACEFOOTPOINTREGION$28, i);
        }
    }
    
    /**
     * Gets array of all "southBTracedRegions" elements
     */
    public gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum[] getSouthBTracedRegionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOUTHBTRACEDREGIONS$30, targetList);
            gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum[] result = new gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "southBTracedRegions" element
     */
    public gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum getSouthBTracedRegionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOUTHBTRACEDREGIONS$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "southBTracedRegions" elements
     */
    public gov.nasa.gsfc.spdf.ssc.FootpointRegion[] xgetSouthBTracedRegionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOUTHBTRACEDREGIONS$30, targetList);
            gov.nasa.gsfc.spdf.ssc.FootpointRegion[] result = new gov.nasa.gsfc.spdf.ssc.FootpointRegion[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "southBTracedRegions" element
     */
    public gov.nasa.gsfc.spdf.ssc.FootpointRegion xgetSouthBTracedRegionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FootpointRegion target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FootpointRegion)get_store().find_element_user(SOUTHBTRACEDREGIONS$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (gov.nasa.gsfc.spdf.ssc.FootpointRegion)target;
        }
    }
    
    /**
     * Tests for nil ith "southBTracedRegions" element
     */
    public boolean isNilSouthBTracedRegionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FootpointRegion target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FootpointRegion)get_store().find_element_user(SOUTHBTRACEDREGIONS$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "southBTracedRegions" element
     */
    public int sizeOfSouthBTracedRegionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOUTHBTRACEDREGIONS$30);
        }
    }
    
    /**
     * Sets array of all "southBTracedRegions" element
     */
    public void setSouthBTracedRegionsArray(gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum[] southBTracedRegionsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(southBTracedRegionsArray, SOUTHBTRACEDREGIONS$30);
        }
    }
    
    /**
     * Sets ith "southBTracedRegions" element
     */
    public void setSouthBTracedRegionsArray(int i, gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum southBTracedRegions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOUTHBTRACEDREGIONS$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(southBTracedRegions);
        }
    }
    
    /**
     * Sets (as xml) array of all "southBTracedRegions" element
     */
    public void xsetSouthBTracedRegionsArray(gov.nasa.gsfc.spdf.ssc.FootpointRegion[]southBTracedRegionsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(southBTracedRegionsArray, SOUTHBTRACEDREGIONS$30);
        }
    }
    
    /**
     * Sets (as xml) ith "southBTracedRegions" element
     */
    public void xsetSouthBTracedRegionsArray(int i, gov.nasa.gsfc.spdf.ssc.FootpointRegion southBTracedRegions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FootpointRegion target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FootpointRegion)get_store().find_element_user(SOUTHBTRACEDREGIONS$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(southBTracedRegions);
        }
    }
    
    /**
     * Nils the ith "southBTracedRegions" element
     */
    public void setNilSouthBTracedRegionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FootpointRegion target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FootpointRegion)get_store().find_element_user(SOUTHBTRACEDREGIONS$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "southBTracedRegions" element
     */
    public void insertSouthBTracedRegions(int i, gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum southBTracedRegions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SOUTHBTRACEDREGIONS$30, i);
            target.setEnumValue(southBTracedRegions);
        }
    }
    
    /**
     * Appends the value as the last "southBTracedRegions" element
     */
    public void addSouthBTracedRegions(gov.nasa.gsfc.spdf.ssc.FootpointRegion.Enum southBTracedRegions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOUTHBTRACEDREGIONS$30);
            target.setEnumValue(southBTracedRegions);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "southBTracedRegions" element
     */
    public gov.nasa.gsfc.spdf.ssc.FootpointRegion insertNewSouthBTracedRegions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FootpointRegion target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FootpointRegion)get_store().insert_element_user(SOUTHBTRACEDREGIONS$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "southBTracedRegions" element
     */
    public gov.nasa.gsfc.spdf.ssc.FootpointRegion addNewSouthBTracedRegions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FootpointRegion target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FootpointRegion)get_store().add_element_user(SOUTHBTRACEDREGIONS$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "southBTracedRegions" element
     */
    public void removeSouthBTracedRegions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOUTHBTRACEDREGIONS$30, i);
        }
    }
    
    /**
     * Gets array of all "spacecraftRegion" elements
     */
    public gov.nasa.gsfc.spdf.ssc.SpaceRegion.Enum[] getSpacecraftRegionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SPACECRAFTREGION$32, targetList);
            gov.nasa.gsfc.spdf.ssc.SpaceRegion.Enum[] result = new gov.nasa.gsfc.spdf.ssc.SpaceRegion.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (gov.nasa.gsfc.spdf.ssc.SpaceRegion.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "spacecraftRegion" element
     */
    public gov.nasa.gsfc.spdf.ssc.SpaceRegion.Enum getSpacecraftRegionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPACECRAFTREGION$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (gov.nasa.gsfc.spdf.ssc.SpaceRegion.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "spacecraftRegion" elements
     */
    public gov.nasa.gsfc.spdf.ssc.SpaceRegion[] xgetSpacecraftRegionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SPACECRAFTREGION$32, targetList);
            gov.nasa.gsfc.spdf.ssc.SpaceRegion[] result = new gov.nasa.gsfc.spdf.ssc.SpaceRegion[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "spacecraftRegion" element
     */
    public gov.nasa.gsfc.spdf.ssc.SpaceRegion xgetSpacecraftRegionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SpaceRegion target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SpaceRegion)get_store().find_element_user(SPACECRAFTREGION$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (gov.nasa.gsfc.spdf.ssc.SpaceRegion)target;
        }
    }
    
    /**
     * Tests for nil ith "spacecraftRegion" element
     */
    public boolean isNilSpacecraftRegionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SpaceRegion target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SpaceRegion)get_store().find_element_user(SPACECRAFTREGION$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "spacecraftRegion" element
     */
    public int sizeOfSpacecraftRegionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPACECRAFTREGION$32);
        }
    }
    
    /**
     * Sets array of all "spacecraftRegion" element
     */
    public void setSpacecraftRegionArray(gov.nasa.gsfc.spdf.ssc.SpaceRegion.Enum[] spacecraftRegionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(spacecraftRegionArray, SPACECRAFTREGION$32);
        }
    }
    
    /**
     * Sets ith "spacecraftRegion" element
     */
    public void setSpacecraftRegionArray(int i, gov.nasa.gsfc.spdf.ssc.SpaceRegion.Enum spacecraftRegion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPACECRAFTREGION$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(spacecraftRegion);
        }
    }
    
    /**
     * Sets (as xml) array of all "spacecraftRegion" element
     */
    public void xsetSpacecraftRegionArray(gov.nasa.gsfc.spdf.ssc.SpaceRegion[]spacecraftRegionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(spacecraftRegionArray, SPACECRAFTREGION$32);
        }
    }
    
    /**
     * Sets (as xml) ith "spacecraftRegion" element
     */
    public void xsetSpacecraftRegionArray(int i, gov.nasa.gsfc.spdf.ssc.SpaceRegion spacecraftRegion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SpaceRegion target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SpaceRegion)get_store().find_element_user(SPACECRAFTREGION$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(spacecraftRegion);
        }
    }
    
    /**
     * Nils the ith "spacecraftRegion" element
     */
    public void setNilSpacecraftRegionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SpaceRegion target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SpaceRegion)get_store().find_element_user(SPACECRAFTREGION$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "spacecraftRegion" element
     */
    public void insertSpacecraftRegion(int i, gov.nasa.gsfc.spdf.ssc.SpaceRegion.Enum spacecraftRegion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SPACECRAFTREGION$32, i);
            target.setEnumValue(spacecraftRegion);
        }
    }
    
    /**
     * Appends the value as the last "spacecraftRegion" element
     */
    public void addSpacecraftRegion(gov.nasa.gsfc.spdf.ssc.SpaceRegion.Enum spacecraftRegion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPACECRAFTREGION$32);
            target.setEnumValue(spacecraftRegion);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "spacecraftRegion" element
     */
    public gov.nasa.gsfc.spdf.ssc.SpaceRegion insertNewSpacecraftRegion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SpaceRegion target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SpaceRegion)get_store().insert_element_user(SPACECRAFTREGION$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "spacecraftRegion" element
     */
    public gov.nasa.gsfc.spdf.ssc.SpaceRegion addNewSpacecraftRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SpaceRegion target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SpaceRegion)get_store().add_element_user(SPACECRAFTREGION$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "spacecraftRegion" element
     */
    public void removeSpacecraftRegion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPACECRAFTREGION$32, i);
        }
    }
    
    /**
     * Gets array of all "time" elements
     */
    public java.util.Calendar[] getTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIME$34, targetList);
            java.util.Calendar[] result = new java.util.Calendar[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getCalendarValue();
            return result;
        }
    }
    
    /**
     * Gets ith "time" element
     */
    public java.util.Calendar getTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIME$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "time" elements
     */
    public org.apache.xmlbeans.XmlDateTime[] xgetTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIME$34, targetList);
            org.apache.xmlbeans.XmlDateTime[] result = new org.apache.xmlbeans.XmlDateTime[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "time" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIME$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDateTime)target;
        }
    }
    
    /**
     * Tests for nil ith "time" element
     */
    public boolean isNilTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIME$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "time" element
     */
    public int sizeOfTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIME$34);
        }
    }
    
    /**
     * Sets array of all "time" element
     */
    public void setTimeArray(java.util.Calendar[] timeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(timeArray, TIME$34);
        }
    }
    
    /**
     * Sets ith "time" element
     */
    public void setTimeArray(int i, java.util.Calendar time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIME$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setCalendarValue(time);
        }
    }
    
    /**
     * Sets (as xml) array of all "time" element
     */
    public void xsetTimeArray(org.apache.xmlbeans.XmlDateTime[]timeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(timeArray, TIME$34);
        }
    }
    
    /**
     * Sets (as xml) ith "time" element
     */
    public void xsetTimeArray(int i, org.apache.xmlbeans.XmlDateTime time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIME$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(time);
        }
    }
    
    /**
     * Nils the ith "time" element
     */
    public void setNilTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIME$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "time" element
     */
    public void insertTime(int i, java.util.Calendar time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TIME$34, i);
            target.setCalendarValue(time);
        }
    }
    
    /**
     * Appends the value as the last "time" element
     */
    public void addTime(java.util.Calendar time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIME$34);
            target.setCalendarValue(time);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "time" element
     */
    public org.apache.xmlbeans.XmlDateTime insertNewTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().insert_element_user(TIME$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "time" element
     */
    public org.apache.xmlbeans.XmlDateTime addNewTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TIME$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "time" element
     */
    public void removeTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIME$34, i);
        }
    }
}
