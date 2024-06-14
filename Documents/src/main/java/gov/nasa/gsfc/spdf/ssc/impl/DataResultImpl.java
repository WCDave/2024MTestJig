/*
 * XML Type:  dataResult
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.DataResult
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML dataResult(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class DataResultImpl extends gov.nasa.gsfc.spdf.ssc.impl.ResultImpl implements gov.nasa.gsfc.spdf.ssc.DataResult
{
    private static final long serialVersionUID = 1L;
    
    public DataResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATA$0 = 
        new javax.xml.namespace.QName("", "data");
    
    
    /**
     * Gets array of all "data" elements
     */
    public gov.nasa.gsfc.spdf.ssc.SatelliteData[] getDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATA$0, targetList);
            gov.nasa.gsfc.spdf.ssc.SatelliteData[] result = new gov.nasa.gsfc.spdf.ssc.SatelliteData[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "data" element
     */
    public gov.nasa.gsfc.spdf.ssc.SatelliteData getDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SatelliteData target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SatelliteData)get_store().find_element_user(DATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "data" element
     */
    public boolean isNilDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SatelliteData target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SatelliteData)get_store().find_element_user(DATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "data" element
     */
    public int sizeOfDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATA$0);
        }
    }
    
    /**
     * Sets array of all "data" element
     */
    public void setDataArray(gov.nasa.gsfc.spdf.ssc.SatelliteData[] dataArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataArray, DATA$0);
        }
    }
    
    /**
     * Sets ith "data" element
     */
    public void setDataArray(int i, gov.nasa.gsfc.spdf.ssc.SatelliteData data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SatelliteData target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SatelliteData)get_store().find_element_user(DATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(data);
        }
    }
    
    /**
     * Nils the ith "data" element
     */
    public void setNilDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SatelliteData target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SatelliteData)get_store().find_element_user(DATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "data" element
     */
    public gov.nasa.gsfc.spdf.ssc.SatelliteData insertNewData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SatelliteData target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SatelliteData)get_store().insert_element_user(DATA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "data" element
     */
    public gov.nasa.gsfc.spdf.ssc.SatelliteData addNewData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.SatelliteData target = null;
            target = (gov.nasa.gsfc.spdf.ssc.SatelliteData)get_store().add_element_user(DATA$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "data" element
     */
    public void removeData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATA$0, i);
        }
    }
}
