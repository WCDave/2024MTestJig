/*
 * XML Type:  spaceRegionsFilterOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.SpaceRegionsFilterOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML spaceRegionsFilterOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class SpaceRegionsFilterOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.SpaceRegionsFilterOptions
{
    private static final long serialVersionUID = 1L;
    
    public SpaceRegionsFilterOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DAYSIDEMAGNETOSHEATH$0 = 
        new javax.xml.namespace.QName("", "daysideMagnetosheath");
    private static final javax.xml.namespace.QName DAYSIDEMAGNETOSPHERE$2 = 
        new javax.xml.namespace.QName("", "daysideMagnetosphere");
    private static final javax.xml.namespace.QName DAYSIDEPLASMASPHERE$4 = 
        new javax.xml.namespace.QName("", "daysidePlasmasphere");
    private static final javax.xml.namespace.QName HIGHLATITUDEBOUNDARYLAYER$6 = 
        new javax.xml.namespace.QName("", "highLatitudeBoundaryLayer");
    private static final javax.xml.namespace.QName INTERPLANETARYMEDIUM$8 = 
        new javax.xml.namespace.QName("", "interplanetaryMedium");
    private static final javax.xml.namespace.QName LOWLATITUDEBOUNDARYLAYER$10 = 
        new javax.xml.namespace.QName("", "lowLatitudeBoundaryLayer");
    private static final javax.xml.namespace.QName NIGHTSIDEMAGNETOSHEATH$12 = 
        new javax.xml.namespace.QName("", "nightsideMagnetosheath");
    private static final javax.xml.namespace.QName NIGHTSIDEMAGNETOSPHERE$14 = 
        new javax.xml.namespace.QName("", "nightsideMagnetosphere");
    private static final javax.xml.namespace.QName NIGHTSIDEPLASMASPHERE$16 = 
        new javax.xml.namespace.QName("", "nightsidePlasmasphere");
    private static final javax.xml.namespace.QName PLASMASHEET$18 = 
        new javax.xml.namespace.QName("", "plasmaSheet");
    private static final javax.xml.namespace.QName TAILLOBE$20 = 
        new javax.xml.namespace.QName("", "tailLobe");
    
    
    /**
     * Gets the "daysideMagnetosheath" element
     */
    public boolean getDaysideMagnetosheath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAYSIDEMAGNETOSHEATH$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "daysideMagnetosheath" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetDaysideMagnetosheath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DAYSIDEMAGNETOSHEATH$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "daysideMagnetosheath" element
     */
    public void setDaysideMagnetosheath(boolean daysideMagnetosheath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAYSIDEMAGNETOSHEATH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DAYSIDEMAGNETOSHEATH$0);
            }
            target.setBooleanValue(daysideMagnetosheath);
        }
    }
    
    /**
     * Sets (as xml) the "daysideMagnetosheath" element
     */
    public void xsetDaysideMagnetosheath(org.apache.xmlbeans.XmlBoolean daysideMagnetosheath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DAYSIDEMAGNETOSHEATH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DAYSIDEMAGNETOSHEATH$0);
            }
            target.set(daysideMagnetosheath);
        }
    }
    
    /**
     * Gets the "daysideMagnetosphere" element
     */
    public boolean getDaysideMagnetosphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAYSIDEMAGNETOSPHERE$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "daysideMagnetosphere" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetDaysideMagnetosphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DAYSIDEMAGNETOSPHERE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "daysideMagnetosphere" element
     */
    public void setDaysideMagnetosphere(boolean daysideMagnetosphere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAYSIDEMAGNETOSPHERE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DAYSIDEMAGNETOSPHERE$2);
            }
            target.setBooleanValue(daysideMagnetosphere);
        }
    }
    
    /**
     * Sets (as xml) the "daysideMagnetosphere" element
     */
    public void xsetDaysideMagnetosphere(org.apache.xmlbeans.XmlBoolean daysideMagnetosphere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DAYSIDEMAGNETOSPHERE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DAYSIDEMAGNETOSPHERE$2);
            }
            target.set(daysideMagnetosphere);
        }
    }
    
    /**
     * Gets the "daysidePlasmasphere" element
     */
    public boolean getDaysidePlasmasphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAYSIDEPLASMASPHERE$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "daysidePlasmasphere" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetDaysidePlasmasphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DAYSIDEPLASMASPHERE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "daysidePlasmasphere" element
     */
    public void setDaysidePlasmasphere(boolean daysidePlasmasphere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAYSIDEPLASMASPHERE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DAYSIDEPLASMASPHERE$4);
            }
            target.setBooleanValue(daysidePlasmasphere);
        }
    }
    
    /**
     * Sets (as xml) the "daysidePlasmasphere" element
     */
    public void xsetDaysidePlasmasphere(org.apache.xmlbeans.XmlBoolean daysidePlasmasphere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DAYSIDEPLASMASPHERE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DAYSIDEPLASMASPHERE$4);
            }
            target.set(daysidePlasmasphere);
        }
    }
    
    /**
     * Gets the "highLatitudeBoundaryLayer" element
     */
    public boolean getHighLatitudeBoundaryLayer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIGHLATITUDEBOUNDARYLAYER$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "highLatitudeBoundaryLayer" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHighLatitudeBoundaryLayer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HIGHLATITUDEBOUNDARYLAYER$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "highLatitudeBoundaryLayer" element
     */
    public void setHighLatitudeBoundaryLayer(boolean highLatitudeBoundaryLayer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIGHLATITUDEBOUNDARYLAYER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HIGHLATITUDEBOUNDARYLAYER$6);
            }
            target.setBooleanValue(highLatitudeBoundaryLayer);
        }
    }
    
    /**
     * Sets (as xml) the "highLatitudeBoundaryLayer" element
     */
    public void xsetHighLatitudeBoundaryLayer(org.apache.xmlbeans.XmlBoolean highLatitudeBoundaryLayer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HIGHLATITUDEBOUNDARYLAYER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HIGHLATITUDEBOUNDARYLAYER$6);
            }
            target.set(highLatitudeBoundaryLayer);
        }
    }
    
    /**
     * Gets the "interplanetaryMedium" element
     */
    public boolean getInterplanetaryMedium()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERPLANETARYMEDIUM$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "interplanetaryMedium" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetInterplanetaryMedium()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INTERPLANETARYMEDIUM$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "interplanetaryMedium" element
     */
    public void setInterplanetaryMedium(boolean interplanetaryMedium)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERPLANETARYMEDIUM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERPLANETARYMEDIUM$8);
            }
            target.setBooleanValue(interplanetaryMedium);
        }
    }
    
    /**
     * Sets (as xml) the "interplanetaryMedium" element
     */
    public void xsetInterplanetaryMedium(org.apache.xmlbeans.XmlBoolean interplanetaryMedium)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INTERPLANETARYMEDIUM$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INTERPLANETARYMEDIUM$8);
            }
            target.set(interplanetaryMedium);
        }
    }
    
    /**
     * Gets the "lowLatitudeBoundaryLayer" element
     */
    public boolean getLowLatitudeBoundaryLayer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWLATITUDEBOUNDARYLAYER$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "lowLatitudeBoundaryLayer" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetLowLatitudeBoundaryLayer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(LOWLATITUDEBOUNDARYLAYER$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "lowLatitudeBoundaryLayer" element
     */
    public void setLowLatitudeBoundaryLayer(boolean lowLatitudeBoundaryLayer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOWLATITUDEBOUNDARYLAYER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOWLATITUDEBOUNDARYLAYER$10);
            }
            target.setBooleanValue(lowLatitudeBoundaryLayer);
        }
    }
    
    /**
     * Sets (as xml) the "lowLatitudeBoundaryLayer" element
     */
    public void xsetLowLatitudeBoundaryLayer(org.apache.xmlbeans.XmlBoolean lowLatitudeBoundaryLayer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(LOWLATITUDEBOUNDARYLAYER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(LOWLATITUDEBOUNDARYLAYER$10);
            }
            target.set(lowLatitudeBoundaryLayer);
        }
    }
    
    /**
     * Gets the "nightsideMagnetosheath" element
     */
    public boolean getNightsideMagnetosheath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NIGHTSIDEMAGNETOSHEATH$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "nightsideMagnetosheath" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetNightsideMagnetosheath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NIGHTSIDEMAGNETOSHEATH$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "nightsideMagnetosheath" element
     */
    public void setNightsideMagnetosheath(boolean nightsideMagnetosheath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NIGHTSIDEMAGNETOSHEATH$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NIGHTSIDEMAGNETOSHEATH$12);
            }
            target.setBooleanValue(nightsideMagnetosheath);
        }
    }
    
    /**
     * Sets (as xml) the "nightsideMagnetosheath" element
     */
    public void xsetNightsideMagnetosheath(org.apache.xmlbeans.XmlBoolean nightsideMagnetosheath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NIGHTSIDEMAGNETOSHEATH$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(NIGHTSIDEMAGNETOSHEATH$12);
            }
            target.set(nightsideMagnetosheath);
        }
    }
    
    /**
     * Gets the "nightsideMagnetosphere" element
     */
    public boolean getNightsideMagnetosphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NIGHTSIDEMAGNETOSPHERE$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "nightsideMagnetosphere" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetNightsideMagnetosphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NIGHTSIDEMAGNETOSPHERE$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "nightsideMagnetosphere" element
     */
    public void setNightsideMagnetosphere(boolean nightsideMagnetosphere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NIGHTSIDEMAGNETOSPHERE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NIGHTSIDEMAGNETOSPHERE$14);
            }
            target.setBooleanValue(nightsideMagnetosphere);
        }
    }
    
    /**
     * Sets (as xml) the "nightsideMagnetosphere" element
     */
    public void xsetNightsideMagnetosphere(org.apache.xmlbeans.XmlBoolean nightsideMagnetosphere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NIGHTSIDEMAGNETOSPHERE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(NIGHTSIDEMAGNETOSPHERE$14);
            }
            target.set(nightsideMagnetosphere);
        }
    }
    
    /**
     * Gets the "nightsidePlasmasphere" element
     */
    public boolean getNightsidePlasmasphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NIGHTSIDEPLASMASPHERE$16, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "nightsidePlasmasphere" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetNightsidePlasmasphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NIGHTSIDEPLASMASPHERE$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "nightsidePlasmasphere" element
     */
    public void setNightsidePlasmasphere(boolean nightsidePlasmasphere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NIGHTSIDEPLASMASPHERE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NIGHTSIDEPLASMASPHERE$16);
            }
            target.setBooleanValue(nightsidePlasmasphere);
        }
    }
    
    /**
     * Sets (as xml) the "nightsidePlasmasphere" element
     */
    public void xsetNightsidePlasmasphere(org.apache.xmlbeans.XmlBoolean nightsidePlasmasphere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NIGHTSIDEPLASMASPHERE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(NIGHTSIDEPLASMASPHERE$16);
            }
            target.set(nightsidePlasmasphere);
        }
    }
    
    /**
     * Gets the "plasmaSheet" element
     */
    public boolean getPlasmaSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLASMASHEET$18, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "plasmaSheet" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPlasmaSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PLASMASHEET$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "plasmaSheet" element
     */
    public void setPlasmaSheet(boolean plasmaSheet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLASMASHEET$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLASMASHEET$18);
            }
            target.setBooleanValue(plasmaSheet);
        }
    }
    
    /**
     * Sets (as xml) the "plasmaSheet" element
     */
    public void xsetPlasmaSheet(org.apache.xmlbeans.XmlBoolean plasmaSheet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PLASMASHEET$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PLASMASHEET$18);
            }
            target.set(plasmaSheet);
        }
    }
    
    /**
     * Gets the "tailLobe" element
     */
    public boolean getTailLobe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAILLOBE$20, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "tailLobe" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetTailLobe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TAILLOBE$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "tailLobe" element
     */
    public void setTailLobe(boolean tailLobe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TAILLOBE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TAILLOBE$20);
            }
            target.setBooleanValue(tailLobe);
        }
    }
    
    /**
     * Sets (as xml) the "tailLobe" element
     */
    public void xsetTailLobe(org.apache.xmlbeans.XmlBoolean tailLobe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TAILLOBE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TAILLOBE$20);
            }
            target.set(tailLobe);
        }
    }
}
