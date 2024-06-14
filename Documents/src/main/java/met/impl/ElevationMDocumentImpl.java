/*
 * An XML document type.
 * Localname: elevation_m
 * Namespace: met
 * Java type: met.ElevationMDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one elevation_m(@met) element.
 *
 * This is a complex type.
 */
public class ElevationMDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.ElevationMDocument
{
    private static final long serialVersionUID = 1L;
    
    public ElevationMDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELEVATIONM$0 = 
        new javax.xml.namespace.QName("met", "elevation_m");
    
    
    /**
     * Gets the "elevation_m" element
     */
    public float getElevationM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELEVATIONM$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "elevation_m" element
     */
    public org.apache.xmlbeans.XmlFloat xgetElevationM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(ELEVATIONM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "elevation_m" element
     */
    public void setElevationM(float elevationM)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELEVATIONM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ELEVATIONM$0);
            }
            target.setFloatValue(elevationM);
        }
    }
    
    /**
     * Sets (as xml) the "elevation_m" element
     */
    public void xsetElevationM(org.apache.xmlbeans.XmlFloat elevationM)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(ELEVATIONM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(ELEVATIONM$0);
            }
            target.set(elevationM);
        }
    }
}
