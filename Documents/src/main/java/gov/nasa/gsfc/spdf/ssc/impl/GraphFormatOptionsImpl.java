/*
 * XML Type:  graphFormatOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GraphFormatOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML graphFormatOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class GraphFormatOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.GraphFormatOptions
{
    private static final long serialVersionUID = 1L;
    
    public GraphFormatOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHARSIZE$0 = 
        new javax.xml.namespace.QName("", "charSize");
    private static final javax.xml.namespace.QName CUSTOMLABELOPTIONS$2 = 
        new javax.xml.namespace.QName("", "customLabelOptions");
    private static final javax.xml.namespace.QName SYMBOLSIZE$4 = 
        new javax.xml.namespace.QName("", "symbolSize");
    
    
    /**
     * Gets the "charSize" element
     */
    public float getCharSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARSIZE$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "charSize" element
     */
    public org.apache.xmlbeans.XmlFloat xgetCharSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(CHARSIZE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "charSize" element
     */
    public void setCharSize(float charSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHARSIZE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHARSIZE$0);
            }
            target.setFloatValue(charSize);
        }
    }
    
    /**
     * Sets (as xml) the "charSize" element
     */
    public void xsetCharSize(org.apache.xmlbeans.XmlFloat charSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(CHARSIZE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(CHARSIZE$0);
            }
            target.set(charSize);
        }
    }
    
    /**
     * Gets the "customLabelOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.GraphLabelOptions getCustomLabelOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GraphLabelOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GraphLabelOptions)get_store().find_element_user(CUSTOMLABELOPTIONS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "customLabelOptions" element
     */
    public boolean isSetCustomLabelOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMLABELOPTIONS$2) != 0;
        }
    }
    
    /**
     * Sets the "customLabelOptions" element
     */
    public void setCustomLabelOptions(gov.nasa.gsfc.spdf.ssc.GraphLabelOptions customLabelOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GraphLabelOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GraphLabelOptions)get_store().find_element_user(CUSTOMLABELOPTIONS$2, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.GraphLabelOptions)get_store().add_element_user(CUSTOMLABELOPTIONS$2);
            }
            target.set(customLabelOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "customLabelOptions" element
     */
    public gov.nasa.gsfc.spdf.ssc.GraphLabelOptions addNewCustomLabelOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GraphLabelOptions target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GraphLabelOptions)get_store().add_element_user(CUSTOMLABELOPTIONS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "customLabelOptions" element
     */
    public void unsetCustomLabelOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMLABELOPTIONS$2, 0);
        }
    }
    
    /**
     * Gets the "symbolSize" element
     */
    public float getSymbolSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYMBOLSIZE$4, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "symbolSize" element
     */
    public org.apache.xmlbeans.XmlFloat xgetSymbolSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(SYMBOLSIZE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "symbolSize" element
     */
    public void setSymbolSize(float symbolSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYMBOLSIZE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYMBOLSIZE$4);
            }
            target.setFloatValue(symbolSize);
        }
    }
    
    /**
     * Sets (as xml) the "symbolSize" element
     */
    public void xsetSymbolSize(org.apache.xmlbeans.XmlFloat symbolSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(SYMBOLSIZE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(SYMBOLSIZE$4);
            }
            target.set(symbolSize);
        }
    }
}
