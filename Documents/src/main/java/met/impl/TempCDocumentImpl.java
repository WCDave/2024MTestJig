/*
 * An XML document type.
 * Localname: temp_c
 * Namespace: met
 * Java type: met.TempCDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one temp_c(@met) element.
 *
 * This is a complex type.
 */
public class TempCDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.TempCDocument
{
    private static final long serialVersionUID = 1L;
    
    public TempCDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEMPC$0 = 
        new javax.xml.namespace.QName("met", "temp_c");
    
    
    /**
     * Gets the "temp_c" element
     */
    public float getTempC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPC$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "temp_c" element
     */
    public org.apache.xmlbeans.XmlFloat xgetTempC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(TEMPC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "temp_c" element
     */
    public void setTempC(float tempC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEMPC$0);
            }
            target.setFloatValue(tempC);
        }
    }
    
    /**
     * Sets (as xml) the "temp_c" element
     */
    public void xsetTempC(org.apache.xmlbeans.XmlFloat tempC)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(TEMPC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(TEMPC$0);
            }
            target.set(tempC);
        }
    }
}
