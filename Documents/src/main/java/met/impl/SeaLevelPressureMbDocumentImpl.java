/*
 * An XML document type.
 * Localname: sea_level_pressure_mb
 * Namespace: met
 * Java type: met.SeaLevelPressureMbDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one sea_level_pressure_mb(@met) element.
 *
 * This is a complex type.
 */
public class SeaLevelPressureMbDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.SeaLevelPressureMbDocument
{
    private static final long serialVersionUID = 1L;
    
    public SeaLevelPressureMbDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEALEVELPRESSUREMB$0 = 
        new javax.xml.namespace.QName("met", "sea_level_pressure_mb");
    
    
    /**
     * Gets the "sea_level_pressure_mb" element
     */
    public float getSeaLevelPressureMb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEALEVELPRESSUREMB$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "sea_level_pressure_mb" element
     */
    public org.apache.xmlbeans.XmlFloat xgetSeaLevelPressureMb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(SEALEVELPRESSUREMB$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sea_level_pressure_mb" element
     */
    public void setSeaLevelPressureMb(float seaLevelPressureMb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEALEVELPRESSUREMB$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEALEVELPRESSUREMB$0);
            }
            target.setFloatValue(seaLevelPressureMb);
        }
    }
    
    /**
     * Sets (as xml) the "sea_level_pressure_mb" element
     */
    public void xsetSeaLevelPressureMb(org.apache.xmlbeans.XmlFloat seaLevelPressureMb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(SEALEVELPRESSUREMB$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(SEALEVELPRESSUREMB$0);
            }
            target.set(seaLevelPressureMb);
        }
    }
}
