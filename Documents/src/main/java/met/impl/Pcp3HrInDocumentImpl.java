/*
 * An XML document type.
 * Localname: pcp3hr_in
 * Namespace: met
 * Java type: met.Pcp3HrInDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one pcp3hr_in(@met) element.
 *
 * This is a complex type.
 */
public class Pcp3HrInDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.Pcp3HrInDocument
{
    private static final long serialVersionUID = 1L;
    
    public Pcp3HrInDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PCP3HRIN$0 = 
        new javax.xml.namespace.QName("met", "pcp3hr_in");
    
    
    /**
     * Gets the "pcp3hr_in" element
     */
    public float getPcp3HrIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PCP3HRIN$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "pcp3hr_in" element
     */
    public org.apache.xmlbeans.XmlFloat xgetPcp3HrIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PCP3HRIN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "pcp3hr_in" element
     */
    public void setPcp3HrIn(float pcp3HrIn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PCP3HRIN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PCP3HRIN$0);
            }
            target.setFloatValue(pcp3HrIn);
        }
    }
    
    /**
     * Sets (as xml) the "pcp3hr_in" element
     */
    public void xsetPcp3HrIn(org.apache.xmlbeans.XmlFloat pcp3HrIn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PCP3HRIN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(PCP3HRIN$0);
            }
            target.set(pcp3HrIn);
        }
    }
}
