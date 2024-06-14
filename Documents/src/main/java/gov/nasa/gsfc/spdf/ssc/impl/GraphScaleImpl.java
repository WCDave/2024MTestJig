/*
 * XML Type:  graphScale
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GraphScale
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML graphScale(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class GraphScaleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.GraphScale
{
    private static final long serialVersionUID = 1L;
    
    public GraphScaleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAXR$0 = 
        new javax.xml.namespace.QName("", "maxR");
    private static final javax.xml.namespace.QName MAXX$2 = 
        new javax.xml.namespace.QName("", "maxX");
    private static final javax.xml.namespace.QName MAXY$4 = 
        new javax.xml.namespace.QName("", "maxY");
    private static final javax.xml.namespace.QName MAXZ$6 = 
        new javax.xml.namespace.QName("", "maxZ");
    private static final javax.xml.namespace.QName MINR$8 = 
        new javax.xml.namespace.QName("", "minR");
    private static final javax.xml.namespace.QName MINX$10 = 
        new javax.xml.namespace.QName("", "minX");
    private static final javax.xml.namespace.QName MINY$12 = 
        new javax.xml.namespace.QName("", "minY");
    private static final javax.xml.namespace.QName MINZ$14 = 
        new javax.xml.namespace.QName("", "minZ");
    
    
    /**
     * Gets the "maxR" element
     */
    public int getMaxR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXR$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxR" element
     */
    public org.apache.xmlbeans.XmlInt xgetMaxR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "maxR" element
     */
    public void setMaxR(int maxR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXR$0);
            }
            target.setIntValue(maxR);
        }
    }
    
    /**
     * Sets (as xml) the "maxR" element
     */
    public void xsetMaxR(org.apache.xmlbeans.XmlInt maxR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXR$0);
            }
            target.set(maxR);
        }
    }
    
    /**
     * Gets the "maxX" element
     */
    public int getMaxX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXX$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxX" element
     */
    public org.apache.xmlbeans.XmlInt xgetMaxX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXX$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "maxX" element
     */
    public void setMaxX(int maxX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXX$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXX$2);
            }
            target.setIntValue(maxX);
        }
    }
    
    /**
     * Sets (as xml) the "maxX" element
     */
    public void xsetMaxX(org.apache.xmlbeans.XmlInt maxX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXX$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXX$2);
            }
            target.set(maxX);
        }
    }
    
    /**
     * Gets the "maxY" element
     */
    public int getMaxY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXY$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxY" element
     */
    public org.apache.xmlbeans.XmlInt xgetMaxY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXY$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "maxY" element
     */
    public void setMaxY(int maxY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXY$4);
            }
            target.setIntValue(maxY);
        }
    }
    
    /**
     * Sets (as xml) the "maxY" element
     */
    public void xsetMaxY(org.apache.xmlbeans.XmlInt maxY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXY$4);
            }
            target.set(maxY);
        }
    }
    
    /**
     * Gets the "maxZ" element
     */
    public int getMaxZ()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXZ$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxZ" element
     */
    public org.apache.xmlbeans.XmlInt xgetMaxZ()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXZ$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "maxZ" element
     */
    public void setMaxZ(int maxZ)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXZ$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXZ$6);
            }
            target.setIntValue(maxZ);
        }
    }
    
    /**
     * Sets (as xml) the "maxZ" element
     */
    public void xsetMaxZ(org.apache.xmlbeans.XmlInt maxZ)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXZ$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXZ$6);
            }
            target.set(maxZ);
        }
    }
    
    /**
     * Gets the "minR" element
     */
    public int getMinR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINR$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "minR" element
     */
    public org.apache.xmlbeans.XmlInt xgetMinR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINR$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "minR" element
     */
    public void setMinR(int minR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINR$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINR$8);
            }
            target.setIntValue(minR);
        }
    }
    
    /**
     * Sets (as xml) the "minR" element
     */
    public void xsetMinR(org.apache.xmlbeans.XmlInt minR)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINR$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MINR$8);
            }
            target.set(minR);
        }
    }
    
    /**
     * Gets the "minX" element
     */
    public int getMinX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINX$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "minX" element
     */
    public org.apache.xmlbeans.XmlInt xgetMinX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINX$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "minX" element
     */
    public void setMinX(int minX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINX$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINX$10);
            }
            target.setIntValue(minX);
        }
    }
    
    /**
     * Sets (as xml) the "minX" element
     */
    public void xsetMinX(org.apache.xmlbeans.XmlInt minX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINX$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MINX$10);
            }
            target.set(minX);
        }
    }
    
    /**
     * Gets the "minY" element
     */
    public int getMinY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINY$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "minY" element
     */
    public org.apache.xmlbeans.XmlInt xgetMinY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINY$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "minY" element
     */
    public void setMinY(int minY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINY$12);
            }
            target.setIntValue(minY);
        }
    }
    
    /**
     * Sets (as xml) the "minY" element
     */
    public void xsetMinY(org.apache.xmlbeans.XmlInt minY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MINY$12);
            }
            target.set(minY);
        }
    }
    
    /**
     * Gets the "minZ" element
     */
    public int getMinZ()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINZ$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "minZ" element
     */
    public org.apache.xmlbeans.XmlInt xgetMinZ()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINZ$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "minZ" element
     */
    public void setMinZ(int minZ)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINZ$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINZ$14);
            }
            target.setIntValue(minZ);
        }
    }
    
    /**
     * Sets (as xml) the "minZ" element
     */
    public void xsetMinZ(org.apache.xmlbeans.XmlInt minZ)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINZ$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MINZ$14);
            }
            target.set(minZ);
        }
    }
}
