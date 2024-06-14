/*
 * XML Type:  hemisphereOptions
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.HemisphereOptions
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML hemisphereOptions(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class HemisphereOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.HemisphereOptions
{
    private static final long serialVersionUID = 1L;
    
    public HemisphereOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NORTH$0 = 
        new javax.xml.namespace.QName("", "north");
    private static final javax.xml.namespace.QName SOUTH$2 = 
        new javax.xml.namespace.QName("", "south");
    
    
    /**
     * Gets the "north" element
     */
    public boolean getNorth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NORTH$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "north" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetNorth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NORTH$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "north" element
     */
    public void setNorth(boolean north)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NORTH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NORTH$0);
            }
            target.setBooleanValue(north);
        }
    }
    
    /**
     * Sets (as xml) the "north" element
     */
    public void xsetNorth(org.apache.xmlbeans.XmlBoolean north)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NORTH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(NORTH$0);
            }
            target.set(north);
        }
    }
    
    /**
     * Gets the "south" element
     */
    public boolean getSouth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOUTH$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "south" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSouth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SOUTH$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "south" element
     */
    public void setSouth(boolean south)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOUTH$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOUTH$2);
            }
            target.setBooleanValue(south);
        }
    }
    
    /**
     * Sets (as xml) the "south" element
     */
    public void xsetSouth(org.apache.xmlbeans.XmlBoolean south)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SOUTH$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SOUTH$2);
            }
            target.set(south);
        }
    }
}
