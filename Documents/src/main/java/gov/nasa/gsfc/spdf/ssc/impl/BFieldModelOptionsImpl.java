/*
 * XML Type:  bFieldModelOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.BFieldModelOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML bFieldModelOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class BFieldModelOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.BFieldModelOptions
{
    private static final long serialVersionUID = 1L;
    
    public BFieldModelOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALMODEL$0 = 
        new javax.xml.namespace.QName("", "externalModel");
    private static final javax.xml.namespace.QName FIELDLINESSTOPALTITUDE$2 = 
        new javax.xml.namespace.QName("", "fieldLinesStopAltitude");
    private static final javax.xml.namespace.QName INTERNALMODEL$4 = 
        new javax.xml.namespace.QName("", "internalModel");
    
    
    /**
     * Gets the "externalModel" element
     */
    public gov.nasa.gsfc.spdf.ssc.BFieldModelParameters getExternalModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.BFieldModelParameters target = null;
            target = (gov.nasa.gsfc.spdf.ssc.BFieldModelParameters)get_store().find_element_user(EXTERNALMODEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "externalModel" element
     */
    public boolean isSetExternalModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALMODEL$0) != 0;
        }
    }
    
    /**
     * Sets the "externalModel" element
     */
    public void setExternalModel(gov.nasa.gsfc.spdf.ssc.BFieldModelParameters externalModel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.BFieldModelParameters target = null;
            target = (gov.nasa.gsfc.spdf.ssc.BFieldModelParameters)get_store().find_element_user(EXTERNALMODEL$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.BFieldModelParameters)get_store().add_element_user(EXTERNALMODEL$0);
            }
            target.set(externalModel);
        }
    }
    
    /**
     * Appends and returns a new empty "externalModel" element
     */
    public gov.nasa.gsfc.spdf.ssc.BFieldModelParameters addNewExternalModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.BFieldModelParameters target = null;
            target = (gov.nasa.gsfc.spdf.ssc.BFieldModelParameters)get_store().add_element_user(EXTERNALMODEL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "externalModel" element
     */
    public void unsetExternalModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALMODEL$0, 0);
        }
    }
    
    /**
     * Gets the "fieldLinesStopAltitude" element
     */
    public double getFieldLinesStopAltitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDLINESSTOPALTITUDE$2, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "fieldLinesStopAltitude" element
     */
    public org.apache.xmlbeans.XmlDouble xgetFieldLinesStopAltitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(FIELDLINESSTOPALTITUDE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fieldLinesStopAltitude" element
     */
    public void setFieldLinesStopAltitude(double fieldLinesStopAltitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIELDLINESSTOPALTITUDE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIELDLINESSTOPALTITUDE$2);
            }
            target.setDoubleValue(fieldLinesStopAltitude);
        }
    }
    
    /**
     * Sets (as xml) the "fieldLinesStopAltitude" element
     */
    public void xsetFieldLinesStopAltitude(org.apache.xmlbeans.XmlDouble fieldLinesStopAltitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(FIELDLINESSTOPALTITUDE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(FIELDLINESSTOPALTITUDE$2);
            }
            target.set(fieldLinesStopAltitude);
        }
    }
    
    /**
     * Gets the "internalModel" element
     */
    public gov.nasa.gsfc.spdf.ssc.InternalBFieldModel.Enum getInternalModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERNALMODEL$4, 0);
            if (target == null)
            {
                return null;
            }
            return (gov.nasa.gsfc.spdf.ssc.InternalBFieldModel.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "internalModel" element
     */
    public gov.nasa.gsfc.spdf.ssc.InternalBFieldModel xgetInternalModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.InternalBFieldModel target = null;
            target = (gov.nasa.gsfc.spdf.ssc.InternalBFieldModel)get_store().find_element_user(INTERNALMODEL$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "internalModel" element
     */
    public boolean isSetInternalModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERNALMODEL$4) != 0;
        }
    }
    
    /**
     * Sets the "internalModel" element
     */
    public void setInternalModel(gov.nasa.gsfc.spdf.ssc.InternalBFieldModel.Enum internalModel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERNALMODEL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERNALMODEL$4);
            }
            target.setEnumValue(internalModel);
        }
    }
    
    /**
     * Sets (as xml) the "internalModel" element
     */
    public void xsetInternalModel(gov.nasa.gsfc.spdf.ssc.InternalBFieldModel internalModel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.InternalBFieldModel target = null;
            target = (gov.nasa.gsfc.spdf.ssc.InternalBFieldModel)get_store().find_element_user(INTERNALMODEL$4, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.InternalBFieldModel)get_store().add_element_user(INTERNALMODEL$4);
            }
            target.set(internalModel);
        }
    }
    
    /**
     * Unsets the "internalModel" element
     */
    public void unsetInternalModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERNALMODEL$4, 0);
        }
    }
}
