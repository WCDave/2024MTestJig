/*
 * XML Type:  graphLabelOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GraphLabelOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML graphLabelOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class GraphLabelOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.GraphLabelOptions
{
    private static final long serialVersionUID = 1L;
    
    public GraphLabelOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DAYOFYEARLABELFREQUENCY$0 = 
        new javax.xml.namespace.QName("", "dayOfYearLabelFrequency");
    private static final javax.xml.namespace.QName HOURLABELFREQUENCY$2 = 
        new javax.xml.namespace.QName("", "hourLabelFrequency");
    private static final javax.xml.namespace.QName HOURTICKMARKFREQUENCY$4 = 
        new javax.xml.namespace.QName("", "hourTickMarkFrequency");
    private static final javax.xml.namespace.QName MINUTELABELFREQUENCY$6 = 
        new javax.xml.namespace.QName("", "minuteLabelFrequency");
    private static final javax.xml.namespace.QName MINUTETICKMARKFREQUENCY$8 = 
        new javax.xml.namespace.QName("", "minuteTickMarkFrequency");
    private static final javax.xml.namespace.QName MONTHDAYOFMONTHLABEL$10 = 
        new javax.xml.namespace.QName("", "monthDayOfMonthLabel");
    
    
    /**
     * Gets the "dayOfYearLabelFrequency" element
     */
    public int getDayOfYearLabelFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAYOFYEARLABELFREQUENCY$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "dayOfYearLabelFrequency" element
     */
    public org.apache.xmlbeans.XmlInt xgetDayOfYearLabelFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DAYOFYEARLABELFREQUENCY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dayOfYearLabelFrequency" element
     */
    public void setDayOfYearLabelFrequency(int dayOfYearLabelFrequency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAYOFYEARLABELFREQUENCY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DAYOFYEARLABELFREQUENCY$0);
            }
            target.setIntValue(dayOfYearLabelFrequency);
        }
    }
    
    /**
     * Sets (as xml) the "dayOfYearLabelFrequency" element
     */
    public void xsetDayOfYearLabelFrequency(org.apache.xmlbeans.XmlInt dayOfYearLabelFrequency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DAYOFYEARLABELFREQUENCY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DAYOFYEARLABELFREQUENCY$0);
            }
            target.set(dayOfYearLabelFrequency);
        }
    }
    
    /**
     * Gets the "hourLabelFrequency" element
     */
    public int getHourLabelFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOURLABELFREQUENCY$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "hourLabelFrequency" element
     */
    public org.apache.xmlbeans.XmlInt xgetHourLabelFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HOURLABELFREQUENCY$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "hourLabelFrequency" element
     */
    public void setHourLabelFrequency(int hourLabelFrequency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOURLABELFREQUENCY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOURLABELFREQUENCY$2);
            }
            target.setIntValue(hourLabelFrequency);
        }
    }
    
    /**
     * Sets (as xml) the "hourLabelFrequency" element
     */
    public void xsetHourLabelFrequency(org.apache.xmlbeans.XmlInt hourLabelFrequency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HOURLABELFREQUENCY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(HOURLABELFREQUENCY$2);
            }
            target.set(hourLabelFrequency);
        }
    }
    
    /**
     * Gets the "hourTickMarkFrequency" element
     */
    public int getHourTickMarkFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOURTICKMARKFREQUENCY$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "hourTickMarkFrequency" element
     */
    public org.apache.xmlbeans.XmlInt xgetHourTickMarkFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HOURTICKMARKFREQUENCY$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "hourTickMarkFrequency" element
     */
    public void setHourTickMarkFrequency(int hourTickMarkFrequency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOURTICKMARKFREQUENCY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOURTICKMARKFREQUENCY$4);
            }
            target.setIntValue(hourTickMarkFrequency);
        }
    }
    
    /**
     * Sets (as xml) the "hourTickMarkFrequency" element
     */
    public void xsetHourTickMarkFrequency(org.apache.xmlbeans.XmlInt hourTickMarkFrequency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HOURTICKMARKFREQUENCY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(HOURTICKMARKFREQUENCY$4);
            }
            target.set(hourTickMarkFrequency);
        }
    }
    
    /**
     * Gets the "minuteLabelFrequency" element
     */
    public int getMinuteLabelFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINUTELABELFREQUENCY$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "minuteLabelFrequency" element
     */
    public org.apache.xmlbeans.XmlInt xgetMinuteLabelFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINUTELABELFREQUENCY$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "minuteLabelFrequency" element
     */
    public void setMinuteLabelFrequency(int minuteLabelFrequency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINUTELABELFREQUENCY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINUTELABELFREQUENCY$6);
            }
            target.setIntValue(minuteLabelFrequency);
        }
    }
    
    /**
     * Sets (as xml) the "minuteLabelFrequency" element
     */
    public void xsetMinuteLabelFrequency(org.apache.xmlbeans.XmlInt minuteLabelFrequency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINUTELABELFREQUENCY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MINUTELABELFREQUENCY$6);
            }
            target.set(minuteLabelFrequency);
        }
    }
    
    /**
     * Gets the "minuteTickMarkFrequency" element
     */
    public int getMinuteTickMarkFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINUTETICKMARKFREQUENCY$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "minuteTickMarkFrequency" element
     */
    public org.apache.xmlbeans.XmlInt xgetMinuteTickMarkFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINUTETICKMARKFREQUENCY$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "minuteTickMarkFrequency" element
     */
    public void setMinuteTickMarkFrequency(int minuteTickMarkFrequency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINUTETICKMARKFREQUENCY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINUTETICKMARKFREQUENCY$8);
            }
            target.setIntValue(minuteTickMarkFrequency);
        }
    }
    
    /**
     * Sets (as xml) the "minuteTickMarkFrequency" element
     */
    public void xsetMinuteTickMarkFrequency(org.apache.xmlbeans.XmlInt minuteTickMarkFrequency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINUTETICKMARKFREQUENCY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MINUTETICKMARKFREQUENCY$8);
            }
            target.set(minuteTickMarkFrequency);
        }
    }
    
    /**
     * Gets the "monthDayOfMonthLabel" element
     */
    public boolean getMonthDayOfMonthLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTHDAYOFMONTHLABEL$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "monthDayOfMonthLabel" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetMonthDayOfMonthLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MONTHDAYOFMONTHLABEL$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "monthDayOfMonthLabel" element
     */
    public void setMonthDayOfMonthLabel(boolean monthDayOfMonthLabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTHDAYOFMONTHLABEL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MONTHDAYOFMONTHLABEL$10);
            }
            target.setBooleanValue(monthDayOfMonthLabel);
        }
    }
    
    /**
     * Sets (as xml) the "monthDayOfMonthLabel" element
     */
    public void xsetMonthDayOfMonthLabel(org.apache.xmlbeans.XmlBoolean monthDayOfMonthLabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MONTHDAYOFMONTHLABEL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(MONTHDAYOFMONTHLABEL$10);
            }
            target.set(monthDayOfMonthLabel);
        }
    }
}
