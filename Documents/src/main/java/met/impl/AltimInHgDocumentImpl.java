/*
 * An XML document type.
 * Localname: altim_in_hg
 * Namespace: met
 * Java type: met.AltimInHgDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one altim_in_hg(@met) element.
 *
 * This is a complex type.
 */
public class AltimInHgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.AltimInHgDocument
{
    private static final long serialVersionUID = 1L;
    
    public AltimInHgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALTIMINHG$0 = 
        new javax.xml.namespace.QName("met", "altim_in_hg");
    
    
    /**
     * Gets the "altim_in_hg" element
     */
    public float getAltimInHg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTIMINHG$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "altim_in_hg" element
     */
    public org.apache.xmlbeans.XmlFloat xgetAltimInHg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(ALTIMINHG$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "altim_in_hg" element
     */
    public void setAltimInHg(float altimInHg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTIMINHG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALTIMINHG$0);
            }
            target.setFloatValue(altimInHg);
        }
    }
    
    /**
     * Sets (as xml) the "altim_in_hg" element
     */
    public void xsetAltimInHg(org.apache.xmlbeans.XmlFloat altimInHg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(ALTIMINHG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(ALTIMINHG$0);
            }
            target.set(altimInHg);
        }
    }
}
