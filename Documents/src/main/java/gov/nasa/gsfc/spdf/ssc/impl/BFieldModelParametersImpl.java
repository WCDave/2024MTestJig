/*
 * XML Type:  bFieldModelParameters
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.BFieldModelParameters
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML bFieldModelParameters(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class BFieldModelParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.BFieldModelParameters
{
    private static final long serialVersionUID = 1L;
    
    public BFieldModelParametersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BYIMF$0 = 
        new javax.xml.namespace.QName("", "byImf");
    private static final javax.xml.namespace.QName BZIMF$2 = 
        new javax.xml.namespace.QName("", "bzImf");
    private static final javax.xml.namespace.QName DST$4 = 
        new javax.xml.namespace.QName("", "dst");
    private static final javax.xml.namespace.QName MODEL$6 = 
        new javax.xml.namespace.QName("", "model");
    private static final javax.xml.namespace.QName PARAMETERVALUES$8 = 
        new javax.xml.namespace.QName("", "parameterValues");
    private static final javax.xml.namespace.QName SOLARWINDPRESSURE$10 = 
        new javax.xml.namespace.QName("", "solarWindPressure");
    private static final javax.xml.namespace.QName USEFIXEDVALUES$12 = 
        new javax.xml.namespace.QName("", "useFixedValues");
    
    
    /**
     * Gets the "byImf" element
     */
    public float getByImf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BYIMF$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "byImf" element
     */
    public org.apache.xmlbeans.XmlFloat xgetByImf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(BYIMF$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "byImf" element
     */
    public void setByImf(float byImf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BYIMF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BYIMF$0);
            }
            target.setFloatValue(byImf);
        }
    }
    
    /**
     * Sets (as xml) the "byImf" element
     */
    public void xsetByImf(org.apache.xmlbeans.XmlFloat byImf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(BYIMF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(BYIMF$0);
            }
            target.set(byImf);
        }
    }
    
    /**
     * Gets the "bzImf" element
     */
    public float getBzImf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BZIMF$2, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "bzImf" element
     */
    public org.apache.xmlbeans.XmlFloat xgetBzImf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(BZIMF$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "bzImf" element
     */
    public void setBzImf(float bzImf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BZIMF$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BZIMF$2);
            }
            target.setFloatValue(bzImf);
        }
    }
    
    /**
     * Sets (as xml) the "bzImf" element
     */
    public void xsetBzImf(org.apache.xmlbeans.XmlFloat bzImf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(BZIMF$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(BZIMF$2);
            }
            target.set(bzImf);
        }
    }
    
    /**
     * Gets the "dst" element
     */
    public int getDst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DST$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "dst" element
     */
    public org.apache.xmlbeans.XmlInt xgetDst()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DST$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dst" element
     */
    public void setDst(int dst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DST$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DST$4);
            }
            target.setIntValue(dst);
        }
    }
    
    /**
     * Sets (as xml) the "dst" element
     */
    public void xsetDst(org.apache.xmlbeans.XmlInt dst)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DST$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DST$4);
            }
            target.set(dst);
        }
    }
    
    /**
     * Gets the "model" element
     */
    public gov.nasa.gsfc.spdf.ssc.ExternalBFieldModel.Enum getModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODEL$6, 0);
            if (target == null)
            {
                return null;
            }
            return (gov.nasa.gsfc.spdf.ssc.ExternalBFieldModel.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "model" element
     */
    public gov.nasa.gsfc.spdf.ssc.ExternalBFieldModel xgetModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.ExternalBFieldModel target = null;
            target = (gov.nasa.gsfc.spdf.ssc.ExternalBFieldModel)get_store().find_element_user(MODEL$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "model" element
     */
    public boolean isSetModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODEL$6) != 0;
        }
    }
    
    /**
     * Sets the "model" element
     */
    public void setModel(gov.nasa.gsfc.spdf.ssc.ExternalBFieldModel.Enum model)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODEL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODEL$6);
            }
            target.setEnumValue(model);
        }
    }
    
    /**
     * Sets (as xml) the "model" element
     */
    public void xsetModel(gov.nasa.gsfc.spdf.ssc.ExternalBFieldModel model)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.ExternalBFieldModel target = null;
            target = (gov.nasa.gsfc.spdf.ssc.ExternalBFieldModel)get_store().find_element_user(MODEL$6, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.ExternalBFieldModel)get_store().add_element_user(MODEL$6);
            }
            target.set(model);
        }
    }
    
    /**
     * Unsets the "model" element
     */
    public void unsetModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODEL$6, 0);
        }
    }
    
    /**
     * Gets the "parameterValues" element
     */
    public short getParameterValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETERVALUES$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "parameterValues" element
     */
    public org.apache.xmlbeans.XmlShort xgetParameterValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(PARAMETERVALUES$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "parameterValues" element
     */
    public void setParameterValues(short parameterValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETERVALUES$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAMETERVALUES$8);
            }
            target.setShortValue(parameterValues);
        }
    }
    
    /**
     * Sets (as xml) the "parameterValues" element
     */
    public void xsetParameterValues(org.apache.xmlbeans.XmlShort parameterValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(PARAMETERVALUES$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(PARAMETERVALUES$8);
            }
            target.set(parameterValues);
        }
    }
    
    /**
     * Gets the "solarWindPressure" element
     */
    public float getSolarWindPressure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOLARWINDPRESSURE$10, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "solarWindPressure" element
     */
    public org.apache.xmlbeans.XmlFloat xgetSolarWindPressure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(SOLARWINDPRESSURE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "solarWindPressure" element
     */
    public void setSolarWindPressure(float solarWindPressure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOLARWINDPRESSURE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOLARWINDPRESSURE$10);
            }
            target.setFloatValue(solarWindPressure);
        }
    }
    
    /**
     * Sets (as xml) the "solarWindPressure" element
     */
    public void xsetSolarWindPressure(org.apache.xmlbeans.XmlFloat solarWindPressure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(SOLARWINDPRESSURE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(SOLARWINDPRESSURE$10);
            }
            target.set(solarWindPressure);
        }
    }
    
    /**
     * Gets the "useFixedValues" element
     */
    public boolean getUseFixedValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEFIXEDVALUES$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "useFixedValues" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetUseFixedValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(USEFIXEDVALUES$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "useFixedValues" element
     */
    public void setUseFixedValues(boolean useFixedValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEFIXEDVALUES$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USEFIXEDVALUES$12);
            }
            target.setBooleanValue(useFixedValues);
        }
    }
    
    /**
     * Sets (as xml) the "useFixedValues" element
     */
    public void xsetUseFixedValues(org.apache.xmlbeans.XmlBoolean useFixedValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(USEFIXEDVALUES$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(USEFIXEDVALUES$12);
            }
            target.set(useFixedValues);
        }
    }
}
