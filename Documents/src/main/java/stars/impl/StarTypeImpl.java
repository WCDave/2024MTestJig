/*
 * XML Type:  starType
 * Namespace: stars
 * Java type: stars.StarType
 *
 * Automatically generated - do not modify.
 */
package stars.impl;
/**
 * An XML starType(@stars).
 *
 * This is a complex type.
 */
public class StarTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements stars.StarType
{
    private static final long serialVersionUID = 1L;
    
    public StarTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName X$0 = 
        new javax.xml.namespace.QName("stars", "x");
    private static final javax.xml.namespace.QName BRIGHTNESS$2 = 
        new javax.xml.namespace.QName("stars", "brightness");
    private static final javax.xml.namespace.QName Z$4 = 
        new javax.xml.namespace.QName("stars", "z");
    private static final javax.xml.namespace.QName Y$6 = 
        new javax.xml.namespace.QName("stars", "y");
    
    
    /**
     * Gets the "x" element
     */
    public float getX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(X$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "x" element
     */
    public org.apache.xmlbeans.XmlFloat xgetX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(X$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "x" element
     */
    public void setX(float x)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(X$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(X$0);
            }
            target.setFloatValue(x);
        }
    }
    
    /**
     * Sets (as xml) the "x" element
     */
    public void xsetX(org.apache.xmlbeans.XmlFloat x)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(X$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(X$0);
            }
            target.set(x);
        }
    }
    
    /**
     * Gets the "brightness" element
     */
    public float getBrightness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRIGHTNESS$2, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "brightness" element
     */
    public org.apache.xmlbeans.XmlFloat xgetBrightness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(BRIGHTNESS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "brightness" element
     */
    public void setBrightness(float brightness)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRIGHTNESS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRIGHTNESS$2);
            }
            target.setFloatValue(brightness);
        }
    }
    
    /**
     * Sets (as xml) the "brightness" element
     */
    public void xsetBrightness(org.apache.xmlbeans.XmlFloat brightness)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(BRIGHTNESS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(BRIGHTNESS$2);
            }
            target.set(brightness);
        }
    }
    
    /**
     * Gets the "z" element
     */
    public float getZ()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Z$4, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "z" element
     */
    public org.apache.xmlbeans.XmlFloat xgetZ()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(Z$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "z" element
     */
    public void setZ(float z)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Z$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(Z$4);
            }
            target.setFloatValue(z);
        }
    }
    
    /**
     * Sets (as xml) the "z" element
     */
    public void xsetZ(org.apache.xmlbeans.XmlFloat z)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(Z$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(Z$4);
            }
            target.set(z);
        }
    }
    
    /**
     * Gets the "y" element
     */
    public float getY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Y$6, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "y" element
     */
    public org.apache.xmlbeans.XmlFloat xgetY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(Y$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "y" element
     */
    public void setY(float y)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Y$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(Y$6);
            }
            target.setFloatValue(y);
        }
    }
    
    /**
     * Sets (as xml) the "y" element
     */
    public void xsetY(org.apache.xmlbeans.XmlFloat y)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(Y$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(Y$6);
            }
            target.set(y);
        }
    }
}
