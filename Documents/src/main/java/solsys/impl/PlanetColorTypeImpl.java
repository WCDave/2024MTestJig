/*
 * XML Type:  PlanetColorType
 * Namespace: solsys
 * Java type: solsys.PlanetColorType
 *
 * Automatically generated - do not modify.
 */
package solsys.impl;
/**
 * An XML PlanetColorType(@solsys).
 *
 * This is an atomic type that is a restriction of solsys.PlanetColorType.
 */
public class PlanetColorTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements solsys.PlanetColorType
{
    private static final long serialVersionUID = 1L;
    
    public PlanetColorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected PlanetColorTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName RED$0 = 
        new javax.xml.namespace.QName("", "red");
    private static final javax.xml.namespace.QName GREEN$2 = 
        new javax.xml.namespace.QName("", "green");
    private static final javax.xml.namespace.QName BLUE$4 = 
        new javax.xml.namespace.QName("", "blue");
    
    
    /**
     * Gets the "red" attribute
     */
    public short getRed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RED$0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "red" attribute
     */
    public org.apache.xmlbeans.XmlShort xgetRed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_attribute_user(RED$0);
            return target;
        }
    }
    
    /**
     * True if has "red" attribute
     */
    public boolean isSetRed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RED$0) != null;
        }
    }
    
    /**
     * Sets the "red" attribute
     */
    public void setRed(short red)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RED$0);
            }
            target.setShortValue(red);
        }
    }
    
    /**
     * Sets (as xml) the "red" attribute
     */
    public void xsetRed(org.apache.xmlbeans.XmlShort red)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_attribute_user(RED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_attribute_user(RED$0);
            }
            target.set(red);
        }
    }
    
    /**
     * Unsets the "red" attribute
     */
    public void unsetRed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RED$0);
        }
    }
    
    /**
     * Gets the "green" attribute
     */
    public short getGreen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GREEN$2);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "green" attribute
     */
    public org.apache.xmlbeans.XmlShort xgetGreen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_attribute_user(GREEN$2);
            return target;
        }
    }
    
    /**
     * True if has "green" attribute
     */
    public boolean isSetGreen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GREEN$2) != null;
        }
    }
    
    /**
     * Sets the "green" attribute
     */
    public void setGreen(short green)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GREEN$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GREEN$2);
            }
            target.setShortValue(green);
        }
    }
    
    /**
     * Sets (as xml) the "green" attribute
     */
    public void xsetGreen(org.apache.xmlbeans.XmlShort green)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_attribute_user(GREEN$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_attribute_user(GREEN$2);
            }
            target.set(green);
        }
    }
    
    /**
     * Unsets the "green" attribute
     */
    public void unsetGreen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GREEN$2);
        }
    }
    
    /**
     * Gets the "blue" attribute
     */
    public short getBlue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLUE$4);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "blue" attribute
     */
    public org.apache.xmlbeans.XmlShort xgetBlue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_attribute_user(BLUE$4);
            return target;
        }
    }
    
    /**
     * True if has "blue" attribute
     */
    public boolean isSetBlue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BLUE$4) != null;
        }
    }
    
    /**
     * Sets the "blue" attribute
     */
    public void setBlue(short blue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLUE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BLUE$4);
            }
            target.setShortValue(blue);
        }
    }
    
    /**
     * Sets (as xml) the "blue" attribute
     */
    public void xsetBlue(org.apache.xmlbeans.XmlShort blue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_attribute_user(BLUE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_attribute_user(BLUE$4);
            }
            target.set(blue);
        }
    }
    
    /**
     * Unsets the "blue" attribute
     */
    public void unsetBlue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BLUE$4);
        }
    }
}
