/*
 * XML Type:  distanceFromOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.DistanceFromOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML distanceFromOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class DistanceFromOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.DistanceFromOptions
{
    private static final long serialVersionUID = 1L;
    
    public DistanceFromOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BGSEXYZ$0 = 
        new javax.xml.namespace.QName("", "BGseXYZ");
    private static final javax.xml.namespace.QName BOWSHOCK$2 = 
        new javax.xml.namespace.QName("", "bowShock");
    private static final javax.xml.namespace.QName MPAUSE$4 = 
        new javax.xml.namespace.QName("", "MPause");
    private static final javax.xml.namespace.QName NEUTRALSHEET$6 = 
        new javax.xml.namespace.QName("", "neutralSheet");
    
    
    /**
     * Gets the "BGseXYZ" element
     */
    public boolean getBGseXYZ()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BGSEXYZ$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "BGseXYZ" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetBGseXYZ()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BGSEXYZ$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BGseXYZ" element
     */
    public void setBGseXYZ(boolean bGseXYZ)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BGSEXYZ$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BGSEXYZ$0);
            }
            target.setBooleanValue(bGseXYZ);
        }
    }
    
    /**
     * Sets (as xml) the "BGseXYZ" element
     */
    public void xsetBGseXYZ(org.apache.xmlbeans.XmlBoolean bGseXYZ)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BGSEXYZ$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(BGSEXYZ$0);
            }
            target.set(bGseXYZ);
        }
    }
    
    /**
     * Gets the "bowShock" element
     */
    public boolean getBowShock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOWSHOCK$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "bowShock" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetBowShock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOWSHOCK$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "bowShock" element
     */
    public void setBowShock(boolean bowShock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOWSHOCK$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOWSHOCK$2);
            }
            target.setBooleanValue(bowShock);
        }
    }
    
    /**
     * Sets (as xml) the "bowShock" element
     */
    public void xsetBowShock(org.apache.xmlbeans.XmlBoolean bowShock)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOWSHOCK$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(BOWSHOCK$2);
            }
            target.set(bowShock);
        }
    }
    
    /**
     * Gets the "MPause" element
     */
    public boolean getMPause()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MPAUSE$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "MPause" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetMPause()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MPAUSE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MPause" element
     */
    public void setMPause(boolean mPause)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MPAUSE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MPAUSE$4);
            }
            target.setBooleanValue(mPause);
        }
    }
    
    /**
     * Sets (as xml) the "MPause" element
     */
    public void xsetMPause(org.apache.xmlbeans.XmlBoolean mPause)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MPAUSE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(MPAUSE$4);
            }
            target.set(mPause);
        }
    }
    
    /**
     * Gets the "neutralSheet" element
     */
    public boolean getNeutralSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEUTRALSHEET$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "neutralSheet" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetNeutralSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NEUTRALSHEET$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "neutralSheet" element
     */
    public void setNeutralSheet(boolean neutralSheet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEUTRALSHEET$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEUTRALSHEET$6);
            }
            target.setBooleanValue(neutralSheet);
        }
    }
    
    /**
     * Sets (as xml) the "neutralSheet" element
     */
    public void xsetNeutralSheet(org.apache.xmlbeans.XmlBoolean neutralSheet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NEUTRALSHEET$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(NEUTRALSHEET$6);
            }
            target.set(neutralSheet);
        }
    }
}
