/*
 * XML Type:  regionOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.RegionOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML regionOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class RegionOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.RegionOptions
{
    private static final long serialVersionUID = 1L;
    
    public RegionOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NORTHBTRACEDFOOTPOINT$0 = 
        new javax.xml.namespace.QName("", "northBTracedFootpoint");
    private static final javax.xml.namespace.QName RADIALTRACEDFOOTPOINT$2 = 
        new javax.xml.namespace.QName("", "radialTracedFootpoint");
    private static final javax.xml.namespace.QName SOUTHBTRACEDFOOTPOINT$4 = 
        new javax.xml.namespace.QName("", "southBTracedFootpoint");
    private static final javax.xml.namespace.QName SPACECRAFT$6 = 
        new javax.xml.namespace.QName("", "spacecraft");
    
    
    /**
     * Gets the "northBTracedFootpoint" element
     */
    public boolean getNorthBTracedFootpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NORTHBTRACEDFOOTPOINT$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "northBTracedFootpoint" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetNorthBTracedFootpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NORTHBTRACEDFOOTPOINT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "northBTracedFootpoint" element
     */
    public void setNorthBTracedFootpoint(boolean northBTracedFootpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NORTHBTRACEDFOOTPOINT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NORTHBTRACEDFOOTPOINT$0);
            }
            target.setBooleanValue(northBTracedFootpoint);
        }
    }
    
    /**
     * Sets (as xml) the "northBTracedFootpoint" element
     */
    public void xsetNorthBTracedFootpoint(org.apache.xmlbeans.XmlBoolean northBTracedFootpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NORTHBTRACEDFOOTPOINT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(NORTHBTRACEDFOOTPOINT$0);
            }
            target.set(northBTracedFootpoint);
        }
    }
    
    /**
     * Gets the "radialTracedFootpoint" element
     */
    public boolean getRadialTracedFootpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RADIALTRACEDFOOTPOINT$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "radialTracedFootpoint" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetRadialTracedFootpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RADIALTRACEDFOOTPOINT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "radialTracedFootpoint" element
     */
    public void setRadialTracedFootpoint(boolean radialTracedFootpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RADIALTRACEDFOOTPOINT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RADIALTRACEDFOOTPOINT$2);
            }
            target.setBooleanValue(radialTracedFootpoint);
        }
    }
    
    /**
     * Sets (as xml) the "radialTracedFootpoint" element
     */
    public void xsetRadialTracedFootpoint(org.apache.xmlbeans.XmlBoolean radialTracedFootpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RADIALTRACEDFOOTPOINT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(RADIALTRACEDFOOTPOINT$2);
            }
            target.set(radialTracedFootpoint);
        }
    }
    
    /**
     * Gets the "southBTracedFootpoint" element
     */
    public boolean getSouthBTracedFootpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOUTHBTRACEDFOOTPOINT$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "southBTracedFootpoint" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSouthBTracedFootpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SOUTHBTRACEDFOOTPOINT$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "southBTracedFootpoint" element
     */
    public void setSouthBTracedFootpoint(boolean southBTracedFootpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOUTHBTRACEDFOOTPOINT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOUTHBTRACEDFOOTPOINT$4);
            }
            target.setBooleanValue(southBTracedFootpoint);
        }
    }
    
    /**
     * Sets (as xml) the "southBTracedFootpoint" element
     */
    public void xsetSouthBTracedFootpoint(org.apache.xmlbeans.XmlBoolean southBTracedFootpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SOUTHBTRACEDFOOTPOINT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SOUTHBTRACEDFOOTPOINT$4);
            }
            target.set(southBTracedFootpoint);
        }
    }
    
    /**
     * Gets the "spacecraft" element
     */
    public boolean getSpacecraft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPACECRAFT$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "spacecraft" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSpacecraft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SPACECRAFT$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "spacecraft" element
     */
    public void setSpacecraft(boolean spacecraft)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPACECRAFT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPACECRAFT$6);
            }
            target.setBooleanValue(spacecraft);
        }
    }
    
    /**
     * Sets (as xml) the "spacecraft" element
     */
    public void xsetSpacecraft(org.apache.xmlbeans.XmlBoolean spacecraft)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SPACECRAFT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SPACECRAFT$6);
            }
            target.set(spacecraft);
        }
    }
}
