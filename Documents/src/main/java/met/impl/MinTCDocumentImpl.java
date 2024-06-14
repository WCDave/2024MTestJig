/*
 * An XML document type.
 * Localname: minT_c
 * Namespace: met
 * Java type: met.MinTCDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one minT_c(@met) element.
 *
 * This is a complex type.
 */
public class MinTCDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.MinTCDocument
{
    private static final long serialVersionUID = 1L;
    
    public MinTCDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MINTC$0 = 
        new javax.xml.namespace.QName("met", "minT_c");
    
    
    /**
     * Gets the "minT_c" element
     */
    public float getMinTC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINTC$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "minT_c" element
     */
    public org.apache.xmlbeans.XmlFloat xgetMinTC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MINTC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "minT_c" element
     */
    public void setMinTC(float minTC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINTC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINTC$0);
            }
            target.setFloatValue(minTC);
        }
    }
    
    /**
     * Sets (as xml) the "minT_c" element
     */
    public void xsetMinTC(org.apache.xmlbeans.XmlFloat minTC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MINTC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(MINTC$0);
            }
            target.set(minTC);
        }
    }
}
