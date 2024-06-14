/*
 * XML Type:  outputOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.OutputOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML outputOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class OutputOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.OutputOptions
{
    private static final long serialVersionUID = 1L;
    
    public OutputOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALLLOCATIONFILTERS$0 = 
        new javax.xml.namespace.QName("", "allLocationFilters");
    private static final javax.xml.namespace.QName BFIELDTRACEOPTIONS$2 = 
        new javax.xml.namespace.QName("", "BFieldTraceOptions");
    private static final javax.xml.namespace.QName COORDINATEOPTIONS$4 = 
        new javax.xml.namespace.QName("", "coordinateOptions");
    private static final javax.xml.namespace.QName DISTANCEFROMOPTIONS$6 = 
        new javax.xml.namespace.QName("", "distanceFromOptions");
    private static final javax.xml.namespace.QName MINMAXPOINTS$8 = 
        new javax.xml.namespace.QName("", "minMaxPoints");
    private static final javax.xml.namespace.QName REGIONOPTIONS$10 = 
        new javax.xml.namespace.QName("", "regionOptions");
    private static final javax.xml.namespace.QName VALUEOPTIONS$12 = 
        new javax.xml.namespace.QName("", "valueOptions");
    
    
    /**
     * Gets the "allLocationFilters" element
     */
    public boolean getAllLocationFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLLOCATIONFILTERS$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "allLocationFilters" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAllLocationFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ALLLOCATIONFILTERS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "allLocationFilters" element
     */
    public void setAllLocationFilters(boolean allLocationFilters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLLOCATIONFILTERS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALLLOCATIONFILTERS$0);
            }
            target.setBooleanValue(allLocationFilters);
        }
    }
    
    /**
     * Sets (as xml) the "allLocationFilters" element
     */
    public void xsetAllLocationFilters(org.apache.xmlbeans.XmlBoolean allLocationFilters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ALLLOCATIONFILTERS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ALLLOCATIONFILTERS$0);
            }
            target.set(allLocationFilters);
        }
    }
    
    /**
     * Gets array of all "BFieldTraceOptions" elements
     */
    public gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions[] getBFieldTraceOptionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BFIELDTRACEOPTIONS$2, targetList);
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
            target = (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions)get_store().find_element_user(BFIELDTRACEOPTIONS$2, i);
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
            target = (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions)get_store().find_element_user(BFIELDTRACEOPTIONS$2, i);
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
            return get_store().count_elements(BFIELDTRACEOPTIONS$2);
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
            arraySetterHelper(bFieldTraceOptionsArray, BFIELDTRACEOPTIONS$2);
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
            target = (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions)get_store().find_element_user(BFIELDTRACEOPTIONS$2, i);
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
            target = (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions)get_store().find_element_user(BFIELDTRACEOPTIONS$2, i);
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
            target = (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions)get_store().insert_element_user(BFIELDTRACEOPTIONS$2, i);
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
            target = (gov.nasa.gsfc.spdf.ssc.BFieldTraceOptions)get_store().add_element_user(BFIELDTRACEOPTIONS$2);
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
            get_store().remove_element(BFIELDTRACEOPTIONS$2, i);
        }
    }
    
    /**
     * Gets array of all "coordinateOptions" elements
     */
    public gov.nasa.gsfc.spdf.ssc.FilteredCoordinateOptions[] getCoordinateOptionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COORDINATEOPTIONS$4, targetList);
            gov.nasa.gsfc.spdf.ssc.FilteredCoordinateOptions[] result = new gov.nasa.gsfc.spdf.ssc.FilteredCoordinateOptions[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "coordinateOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.FilteredCoordinateOptions getCoordinateOptionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FilteredCoordinateOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FilteredCoordinateOptions)get_store().find_element_user(COORDINATEOPTIONS$4, i);
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
            gov.nasa.gsfc.spdf.ssc.FilteredCoordinateOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FilteredCoordinateOptions)get_store().find_element_user(COORDINATEOPTIONS$4, i);
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
            return get_store().count_elements(COORDINATEOPTIONS$4);
        }
    }
    
    /**
     * Sets array of all "coordinateOptions" element
     */
    public void setCoordinateOptionsArray(gov.nasa.gsfc.spdf.ssc.FilteredCoordinateOptions[] coordinateOptionsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(coordinateOptionsArray, COORDINATEOPTIONS$4);
        }
    }
    
    /**
     * Sets ith "coordinateOptions" element
     */
    public void setCoordinateOptionsArray(int i, gov.nasa.gsfc.spdf.ssc.FilteredCoordinateOptions coordinateOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FilteredCoordinateOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FilteredCoordinateOptions)get_store().find_element_user(COORDINATEOPTIONS$4, i);
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
            gov.nasa.gsfc.spdf.ssc.FilteredCoordinateOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FilteredCoordinateOptions)get_store().find_element_user(COORDINATEOPTIONS$4, i);
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
    public gov.nasa.gsfc.spdf.ssc.FilteredCoordinateOptions insertNewCoordinateOptions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FilteredCoordinateOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FilteredCoordinateOptions)get_store().insert_element_user(COORDINATEOPTIONS$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "coordinateOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.FilteredCoordinateOptions addNewCoordinateOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.FilteredCoordinateOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.FilteredCoordinateOptions)get_store().add_element_user(COORDINATEOPTIONS$4);
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
            get_store().remove_element(COORDINATEOPTIONS$4, i);
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
            target = (gov.nasa.gsfc.spdf.ssc.DistanceFromOptions)get_store().find_element_user(DISTANCEFROMOPTIONS$6, 0);
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
            return get_store().count_elements(DISTANCEFROMOPTIONS$6) != 0;
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
            target = (gov.nasa.gsfc.spdf.ssc.DistanceFromOptions)get_store().find_element_user(DISTANCEFROMOPTIONS$6, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.DistanceFromOptions)get_store().add_element_user(DISTANCEFROMOPTIONS$6);
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
            target = (gov.nasa.gsfc.spdf.ssc.DistanceFromOptions)get_store().add_element_user(DISTANCEFROMOPTIONS$6);
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
            get_store().remove_element(DISTANCEFROMOPTIONS$6, 0);
        }
    }
    
    /**
     * Gets the "minMaxPoints" element
     */
    public int getMinMaxPoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINMAXPOINTS$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "minMaxPoints" element
     */
    public org.apache.xmlbeans.XmlInt xgetMinMaxPoints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINMAXPOINTS$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "minMaxPoints" element
     */
    public void setMinMaxPoints(int minMaxPoints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINMAXPOINTS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINMAXPOINTS$8);
            }
            target.setIntValue(minMaxPoints);
        }
    }
    
    /**
     * Sets (as xml) the "minMaxPoints" element
     */
    public void xsetMinMaxPoints(org.apache.xmlbeans.XmlInt minMaxPoints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINMAXPOINTS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MINMAXPOINTS$8);
            }
            target.set(minMaxPoints);
        }
    }
    
    /**
     * Gets the "regionOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.RegionOptions getRegionOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.RegionOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.RegionOptions)get_store().find_element_user(REGIONOPTIONS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "regionOptions" element
     */
    public boolean isSetRegionOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGIONOPTIONS$10) != 0;
        }
    }
    
    /**
     * Sets the "regionOptions" element
     */
    public void setRegionOptions(gov.nasa.gsfc.spdf.ssc.RegionOptions regionOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.RegionOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.RegionOptions)get_store().find_element_user(REGIONOPTIONS$10, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.RegionOptions)get_store().add_element_user(REGIONOPTIONS$10);
            }
            target.set(regionOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "regionOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.RegionOptions addNewRegionOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.RegionOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.RegionOptions)get_store().add_element_user(REGIONOPTIONS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "regionOptions" element
     */
    public void unsetRegionOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGIONOPTIONS$10, 0);
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
            target = (gov.nasa.gsfc.spdf.ssc.ValueOptions)get_store().find_element_user(VALUEOPTIONS$12, 0);
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
            return get_store().count_elements(VALUEOPTIONS$12) != 0;
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
            target = (gov.nasa.gsfc.spdf.ssc.ValueOptions)get_store().find_element_user(VALUEOPTIONS$12, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.ValueOptions)get_store().add_element_user(VALUEOPTIONS$12);
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
            target = (gov.nasa.gsfc.spdf.ssc.ValueOptions)get_store().add_element_user(VALUEOPTIONS$12);
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
            get_store().remove_element(VALUEOPTIONS$12, 0);
        }
    }
}
