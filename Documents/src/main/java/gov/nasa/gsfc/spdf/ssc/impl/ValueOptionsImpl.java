/*
 * XML Type:  valueOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.ValueOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML valueOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class ValueOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.ValueOptions
{
    private static final long serialVersionUID = 1L;
    
    public ValueOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BFIELDSTRENGTH$0 = 
        new javax.xml.namespace.QName("", "BFieldStrength");
    private static final javax.xml.namespace.QName DIPOLEINVLAT$2 = 
        new javax.xml.namespace.QName("", "dipoleInvLat");
    private static final javax.xml.namespace.QName DIPOLELVALUE$4 = 
        new javax.xml.namespace.QName("", "dipoleLValue");
    private static final javax.xml.namespace.QName RADIALDISTANCE$6 = 
        new javax.xml.namespace.QName("", "radialDistance");
    
    
    /**
     * Gets the "BFieldStrength" element
     */
    public boolean getBFieldStrength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BFIELDSTRENGTH$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "BFieldStrength" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetBFieldStrength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BFIELDSTRENGTH$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BFieldStrength" element
     */
    public void setBFieldStrength(boolean bFieldStrength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BFIELDSTRENGTH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BFIELDSTRENGTH$0);
            }
            target.setBooleanValue(bFieldStrength);
        }
    }
    
    /**
     * Sets (as xml) the "BFieldStrength" element
     */
    public void xsetBFieldStrength(org.apache.xmlbeans.XmlBoolean bFieldStrength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BFIELDSTRENGTH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(BFIELDSTRENGTH$0);
            }
            target.set(bFieldStrength);
        }
    }
    
    /**
     * Gets the "dipoleInvLat" element
     */
    public boolean getDipoleInvLat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIPOLEINVLAT$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dipoleInvLat" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetDipoleInvLat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DIPOLEINVLAT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dipoleInvLat" element
     */
    public void setDipoleInvLat(boolean dipoleInvLat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIPOLEINVLAT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIPOLEINVLAT$2);
            }
            target.setBooleanValue(dipoleInvLat);
        }
    }
    
    /**
     * Sets (as xml) the "dipoleInvLat" element
     */
    public void xsetDipoleInvLat(org.apache.xmlbeans.XmlBoolean dipoleInvLat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DIPOLEINVLAT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DIPOLEINVLAT$2);
            }
            target.set(dipoleInvLat);
        }
    }
    
    /**
     * Gets the "dipoleLValue" element
     */
    public boolean getDipoleLValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIPOLELVALUE$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "dipoleLValue" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetDipoleLValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DIPOLELVALUE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dipoleLValue" element
     */
    public void setDipoleLValue(boolean dipoleLValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIPOLELVALUE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIPOLELVALUE$4);
            }
            target.setBooleanValue(dipoleLValue);
        }
    }
    
    /**
     * Sets (as xml) the "dipoleLValue" element
     */
    public void xsetDipoleLValue(org.apache.xmlbeans.XmlBoolean dipoleLValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DIPOLELVALUE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DIPOLELVALUE$4);
            }
            target.set(dipoleLValue);
        }
    }
    
    /**
     * Gets the "radialDistance" element
     */
    public boolean getRadialDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RADIALDISTANCE$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "radialDistance" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetRadialDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RADIALDISTANCE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "radialDistance" element
     */
    public void setRadialDistance(boolean radialDistance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RADIALDISTANCE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RADIALDISTANCE$6);
            }
            target.setBooleanValue(radialDistance);
        }
    }
    
    /**
     * Sets (as xml) the "radialDistance" element
     */
    public void xsetRadialDistance(org.apache.xmlbeans.XmlBoolean radialDistance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RADIALDISTANCE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(RADIALDISTANCE$6);
            }
            target.set(radialDistance);
        }
    }
}
