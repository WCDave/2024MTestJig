/*
 * An XML document type.
 * Localname: snow_in
 * Namespace: met
 * Java type: met.SnowInDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one snow_in(@met) element.
 *
 * This is a complex type.
 */
public class SnowInDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.SnowInDocument
{
    private static final long serialVersionUID = 1L;
    
    public SnowInDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SNOWIN$0 = 
        new javax.xml.namespace.QName("met", "snow_in");
    
    
    /**
     * Gets the "snow_in" element
     */
    public float getSnowIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SNOWIN$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "snow_in" element
     */
    public org.apache.xmlbeans.XmlFloat xgetSnowIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(SNOWIN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "snow_in" element
     */
    public void setSnowIn(float snowIn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SNOWIN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SNOWIN$0);
            }
            target.setFloatValue(snowIn);
        }
    }
    
    /**
     * Sets (as xml) the "snow_in" element
     */
    public void xsetSnowIn(org.apache.xmlbeans.XmlFloat snowIn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(SNOWIN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(SNOWIN$0);
            }
            target.set(snowIn);
        }
    }
}
