/*
 * An XML document type.
 * Localname: three_hr_pressure_tendency_mb
 * Namespace: met
 * Java type: met.ThreeHrPressureTendencyMbDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one three_hr_pressure_tendency_mb(@met) element.
 *
 * This is a complex type.
 */
public class ThreeHrPressureTendencyMbDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.ThreeHrPressureTendencyMbDocument
{
    private static final long serialVersionUID = 1L;
    
    public ThreeHrPressureTendencyMbDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName THREEHRPRESSURETENDENCYMB$0 = 
        new javax.xml.namespace.QName("met", "three_hr_pressure_tendency_mb");
    
    
    /**
     * Gets the "three_hr_pressure_tendency_mb" element
     */
    public float getThreeHrPressureTendencyMb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THREEHRPRESSURETENDENCYMB$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "three_hr_pressure_tendency_mb" element
     */
    public org.apache.xmlbeans.XmlFloat xgetThreeHrPressureTendencyMb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(THREEHRPRESSURETENDENCYMB$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "three_hr_pressure_tendency_mb" element
     */
    public void setThreeHrPressureTendencyMb(float threeHrPressureTendencyMb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THREEHRPRESSURETENDENCYMB$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(THREEHRPRESSURETENDENCYMB$0);
            }
            target.setFloatValue(threeHrPressureTendencyMb);
        }
    }
    
    /**
     * Sets (as xml) the "three_hr_pressure_tendency_mb" element
     */
    public void xsetThreeHrPressureTendencyMb(org.apache.xmlbeans.XmlFloat threeHrPressureTendencyMb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(THREEHRPRESSURETENDENCYMB$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(THREEHRPRESSURETENDENCYMB$0);
            }
            target.set(threeHrPressureTendencyMb);
        }
    }
}
