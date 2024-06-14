/*
 * An XML document type.
 * Localname: pcp6hr_in
 * Namespace: met
 * Java type: met.Pcp6HrInDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one pcp6hr_in(@met) element.
 *
 * This is a complex type.
 */
public class Pcp6HrInDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.Pcp6HrInDocument
{
    private static final long serialVersionUID = 1L;
    
    public Pcp6HrInDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PCP6HRIN$0 = 
        new javax.xml.namespace.QName("met", "pcp6hr_in");
    
    
    /**
     * Gets the "pcp6hr_in" element
     */
    public float getPcp6HrIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PCP6HRIN$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "pcp6hr_in" element
     */
    public org.apache.xmlbeans.XmlFloat xgetPcp6HrIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PCP6HRIN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "pcp6hr_in" element
     */
    public void setPcp6HrIn(float pcp6HrIn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PCP6HRIN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PCP6HRIN$0);
            }
            target.setFloatValue(pcp6HrIn);
        }
    }
    
    /**
     * Sets (as xml) the "pcp6hr_in" element
     */
    public void xsetPcp6HrIn(org.apache.xmlbeans.XmlFloat pcp6HrIn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PCP6HRIN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(PCP6HRIN$0);
            }
            target.set(pcp6HrIn);
        }
    }
}
