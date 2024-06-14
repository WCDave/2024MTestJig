/*
 * XML Type:  timeSeriesGraphOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML timeSeriesGraphOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class TimeSeriesGraphOptionsImpl extends gov.nasa.gsfc.spdf.ssc.impl.GraphOptionsImpl implements gov.nasa.gsfc.spdf.ssc.TimeSeriesGraphOptions
{
    private static final long serialVersionUID = 1L;
    
    public TimeSeriesGraphOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BFIELDTRACEOPTIONS$0 = 
        new javax.xml.namespace.QName("", "BFieldTraceOptions");
    private static final javax.xml.namespace.QName COORDINATEOPTIONS$2 = 
        new javax.xml.namespace.QName("", "coordinateOptions");
    private static final javax.xml.namespace.QName DISTANCEFROMOPTIONS$4 = 
        new javax.xml.namespace.QName("", "distanceFromOptions");
    private static final javax.xml.namespace.QName VALUEOPTIONS$6 = 
        new javax.xml.namespace.QName("", "valueOptions");
    
    
    /**
     * Gets array of all "BFieldTraceOptions" elements
     */
    public gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions[] getBFieldTraceOptionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BFIELDTRACEOPTIONS$0, targetList);
            gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions[] result = new gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "BFieldTraceOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions getBFieldTraceOptionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions)get_store().find_element_user(BFIELDTRACEOPTIONS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "BFieldTraceOptions" element
     */
    public boolean isNilBFieldTraceOptionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions)get_store().find_element_user(BFIELDTRACEOPTIONS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "BFieldTraceOptions" element
     */
    public int sizeOfBFieldTraceOptionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BFIELDTRACEOPTIONS$0);
        }
    }
    
    /**
     * Sets array of all "BFieldTraceOptions" element
     */
    public void setBFieldTraceOptionsArray(gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions[] bFieldTraceOptionsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bFieldTraceOptionsArray, BFIELDTRACEOPTIONS$0);
        }
    }
    
    /**
     * Sets ith "BFieldTraceOptions" element
     */
    public void setBFieldTraceOptionsArray(int i, gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions bFieldTraceOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions)get_store().find_element_user(BFIELDTRACEOPTIONS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bFieldTraceOptions);
        }
    }
    
    /**
     * Nils the ith "BFieldTraceOptions" element
     */
    public void setNilBFieldTraceOptionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions)get_store().find_element_user(BFIELDTRACEOPTIONS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BFieldTraceOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions insertNewBFieldTraceOptions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions)get_store().insert_element_user(BFIELDTRACEOPTIONS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BFieldTraceOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions addNewBFieldTraceOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions)get_store().add_element_user(BFIELDTRACEOPTIONS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "BFieldTraceOptions" element
     */
    public void removeBFieldTraceOptions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BFIELDTRACEOPTIONS$0, i);
        }
    }
    
    /**
     * Gets array of all "coordinateOptions" elements
     */
    public gov.nasa.gsfc.spdf.ssc.CoordinateOptions[] getCoordinateOptionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COORDINATEOPTIONS$2, targetList);
            gov.nasa.gsfc.spdf.ssc.CoordinateOptions[] result = new gov.nasa.gsfc.spdf.ssc.CoordinateOptions[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "coordinateOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.CoordinateOptions getCoordinateOptionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.CoordinateOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.CoordinateOptions)get_store().find_element_user(COORDINATEOPTIONS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "coordinateOptions" element
     */
    public boolean isNilCoordinateOptionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.CoordinateOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.CoordinateOptions)get_store().find_element_user(COORDINATEOPTIONS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "coordinateOptions" element
     */
    public int sizeOfCoordinateOptionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COORDINATEOPTIONS$2);
        }
    }
    
    /**
     * Sets array of all "coordinateOptions" element
     */
    public void setCoordinateOptionsArray(gov.nasa.gsfc.spdf.ssc.CoordinateOptions[] coordinateOptionsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(coordinateOptionsArray, COORDINATEOPTIONS$2);
        }
    }
    
    /**
     * Sets ith "coordinateOptions" element
     */
    public void setCoordinateOptionsArray(int i, gov.nasa.gsfc.spdf.ssc.CoordinateOptions coordinateOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.CoordinateOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.CoordinateOptions)get_store().find_element_user(COORDINATEOPTIONS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(coordinateOptions);
        }
    }
    
    /**
     * Nils the ith "coordinateOptions" element
     */
    public void setNilCoordinateOptionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.CoordinateOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.CoordinateOptions)get_store().find_element_user(COORDINATEOPTIONS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "coordinateOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.CoordinateOptions insertNewCoordinateOptions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.CoordinateOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.CoordinateOptions)get_store().insert_element_user(COORDINATEOPTIONS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "coordinateOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.CoordinateOptions addNewCoordinateOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.CoordinateOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.CoordinateOptions)get_store().add_element_user(COORDINATEOPTIONS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "coordinateOptions" element
     */
    public void removeCoordinateOptions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COORDINATEOPTIONS$2, i);
        }
    }
    
    /**
     * Gets the "distanceFromOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.DistanceFromOptions getDistanceFromOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.DistanceFromOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.DistanceFromOptions)get_store().find_element_user(DISTANCEFROMOPTIONS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "distanceFromOptions" element
     */
    public boolean isSetDistanceFromOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTANCEFROMOPTIONS$4) != 0;
        }
    }
    
    /**
     * Sets the "distanceFromOptions" element
     */
    public void setDistanceFromOptions(gov.nasa.gsfc.spdf.ssc.DistanceFromOptions distanceFromOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.DistanceFromOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.DistanceFromOptions)get_store().find_element_user(DISTANCEFROMOPTIONS$4, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.DistanceFromOptions)get_store().add_element_user(DISTANCEFROMOPTIONS$4);
            }
            target.set(distanceFromOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "distanceFromOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.DistanceFromOptions addNewDistanceFromOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.DistanceFromOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.DistanceFromOptions)get_store().add_element_user(DISTANCEFROMOPTIONS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "distanceFromOptions" element
     */
    public void unsetDistanceFromOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTANCEFROMOPTIONS$4, 0);
        }
    }
    
    /**
     * Gets the "valueOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.ValueOptions getValueOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.ValueOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.ValueOptions)get_store().find_element_user(VALUEOPTIONS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueOptions" element
     */
    public boolean isSetValueOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEOPTIONS$6) != 0;
        }
    }
    
    /**
     * Sets the "valueOptions" element
     */
    public void setValueOptions(gov.nasa.gsfc.spdf.ssc.ValueOptions valueOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.ValueOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.ValueOptions)get_store().find_element_user(VALUEOPTIONS$6, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.ValueOptions)get_store().add_element_user(VALUEOPTIONS$6);
            }
            target.set(valueOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "valueOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.ValueOptions addNewValueOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.ValueOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.ValueOptions)get_store().add_element_user(VALUEOPTIONS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "valueOptions" element
     */
    public void unsetValueOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEOPTIONS$6, 0);
        }
    }
}
