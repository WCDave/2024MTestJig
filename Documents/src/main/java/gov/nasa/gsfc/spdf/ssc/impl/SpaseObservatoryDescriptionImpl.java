/*
 * XML Type:  spaseObservatoryDescription
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.SpaseObservatoryDescription
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML spaseObservatoryDescription(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class SpaseObservatoryDescriptionImpl extends gov.nasa.gsfc.spdf.ssc.impl.SatelliteDescriptionImpl implements gov.nasa.gsfc.spdf.ssc.SpaseObservatoryDescription
{
    private static final long serialVersionUID = 1L;
    
    public SpaseObservatoryDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEID$0 = 
        new javax.xml.namespace.QName("", "resourceId");
    
    
    /**
     * Gets the "resourceId" element
     */
    public java.lang.String getResourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "resourceId" element
     */
    public org.apache.xmlbeans.XmlString xgetResourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOURCEID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "resourceId" element
     */
    public boolean isSetResourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEID$0) != 0;
        }
    }
    
    /**
     * Sets the "resourceId" element
     */
    public void setResourceId(java.lang.String resourceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOURCEID$0);
            }
            target.setStringValue(resourceId);
        }
    }
    
    /**
     * Sets (as xml) the "resourceId" element
     */
    public void xsetResourceId(org.apache.xmlbeans.XmlString resourceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOURCEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESOURCEID$0);
            }
            target.set(resourceId);
        }
    }
    
    /**
     * Unsets the "resourceId" element
     */
    public void unsetResourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEID$0, 0);
        }
    }
}
