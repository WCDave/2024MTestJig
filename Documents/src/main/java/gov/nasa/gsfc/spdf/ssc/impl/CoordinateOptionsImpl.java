/*
 * XML Type:  coordinateOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.CoordinateOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML coordinateOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class CoordinateOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.CoordinateOptions
{
    private static final long serialVersionUID = 1L;
    
    public CoordinateOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPONENT$0 = 
        new javax.xml.namespace.QName("", "component");
    private static final javax.xml.namespace.QName COORDINATESYSTEM$2 = 
        new javax.xml.namespace.QName("", "coordinateSystem");
    
    
    /**
     * Gets the "component" element
     */
    public gov.nasa.gsfc.spdf.ssc.CoordinateComponent.Enum getComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPONENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return (gov.nasa.gsfc.spdf.ssc.CoordinateComponent.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "component" element
     */
    public gov.nasa.gsfc.spdf.ssc.CoordinateComponent xgetComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.CoordinateComponent target = null;
            target = (gov.nasa.gsfc.spdf.ssc.CoordinateComponent)get_store().find_element_user(COMPONENT$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "component" element
     */
    public boolean isSetComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPONENT$0) != 0;
        }
    }
    
    /**
     * Sets the "component" element
     */
    public void setComponent(gov.nasa.gsfc.spdf.ssc.CoordinateComponent.Enum component)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPONENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPONENT$0);
            }
            target.setEnumValue(component);
        }
    }
    
    /**
     * Sets (as xml) the "component" element
     */
    public void xsetComponent(gov.nasa.gsfc.spdf.ssc.CoordinateComponent component)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.CoordinateComponent target = null;
            target = (gov.nasa.gsfc.spdf.ssc.CoordinateComponent)get_store().find_element_user(COMPONENT$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.CoordinateComponent)get_store().add_element_user(COMPONENT$0);
            }
            target.set(component);
        }
    }
    
    /**
     * Unsets the "component" element
     */
    public void unsetComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPONENT$0, 0);
        }
    }
    
    /**
     * Gets the "coordinateSystem" element
     */
    public gov.nasa.gsfc.spdf.ssc.CoordinateSystem.Enum getCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COORDINATESYSTEM$2, 0);
            if (target == null)
            {
                return null;
            }
            return (gov.nasa.gsfc.spdf.ssc.CoordinateSystem.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "coordinateSystem" element
     */
    public gov.nasa.gsfc.spdf.ssc.CoordinateSystem xgetCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.CoordinateSystem target = null;
            target = (gov.nasa.gsfc.spdf.ssc.CoordinateSystem)get_store().find_element_user(COORDINATESYSTEM$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "coordinateSystem" element
     */
    public boolean isSetCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COORDINATESYSTEM$2) != 0;
        }
    }
    
    /**
     * Sets the "coordinateSystem" element
     */
    public void setCoordinateSystem(gov.nasa.gsfc.spdf.ssc.CoordinateSystem.Enum coordinateSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COORDINATESYSTEM$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COORDINATESYSTEM$2);
            }
            target.setEnumValue(coordinateSystem);
        }
    }
    
    /**
     * Sets (as xml) the "coordinateSystem" element
     */
    public void xsetCoordinateSystem(gov.nasa.gsfc.spdf.ssc.CoordinateSystem coordinateSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.CoordinateSystem target = null;
            target = (gov.nasa.gsfc.spdf.ssc.CoordinateSystem)get_store().find_element_user(COORDINATESYSTEM$2, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.CoordinateSystem)get_store().add_element_user(COORDINATESYSTEM$2);
            }
            target.set(coordinateSystem);
        }
    }
    
    /**
     * Unsets the "coordinateSystem" element
     */
    public void unsetCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COORDINATESYSTEM$2, 0);
        }
    }
}
