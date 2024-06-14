/*
 * An XML document type.
 * Localname: dewpoint_c
 * Namespace: met
 * Java type: met.DewpointCDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one dewpoint_c(@met) element.
 *
 * This is a complex type.
 */
public class DewpointCDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.DewpointCDocument
{
    private static final long serialVersionUID = 1L;
    
    public DewpointCDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEWPOINTC$0 = 
        new javax.xml.namespace.QName("met", "dewpoint_c");
    
    
    /**
     * Gets the "dewpoint_c" element
     */
    public float getDewpointC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEWPOINTC$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "dewpoint_c" element
     */
    public org.apache.xmlbeans.XmlFloat xgetDewpointC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(DEWPOINTC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dewpoint_c" element
     */
    public void setDewpointC(float dewpointC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEWPOINTC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEWPOINTC$0);
            }
            target.setFloatValue(dewpointC);
        }
    }
    
    /**
     * Sets (as xml) the "dewpoint_c" element
     */
    public void xsetDewpointC(org.apache.xmlbeans.XmlFloat dewpointC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(DEWPOINTC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(DEWPOINTC$0);
            }
            target.set(dewpointC);
        }
    }
}
