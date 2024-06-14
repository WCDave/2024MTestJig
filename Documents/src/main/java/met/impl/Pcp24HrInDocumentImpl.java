/*
 * An XML document type.
 * Localname: pcp24hr_in
 * Namespace: met
 * Java type: met.Pcp24HrInDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one pcp24hr_in(@met) element.
 *
 * This is a complex type.
 */
public class Pcp24HrInDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.Pcp24HrInDocument
{
    private static final long serialVersionUID = 1L;
    
    public Pcp24HrInDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PCP24HRIN$0 = 
        new javax.xml.namespace.QName("met", "pcp24hr_in");
    
    
    /**
     * Gets the "pcp24hr_in" element
     */
    public float getPcp24HrIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PCP24HRIN$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "pcp24hr_in" element
     */
    public org.apache.xmlbeans.XmlFloat xgetPcp24HrIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PCP24HRIN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "pcp24hr_in" element
     */
    public void setPcp24HrIn(float pcp24HrIn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PCP24HRIN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PCP24HRIN$0);
            }
            target.setFloatValue(pcp24HrIn);
        }
    }
    
    /**
     * Sets (as xml) the "pcp24hr_in" element
     */
    public void xsetPcp24HrIn(org.apache.xmlbeans.XmlFloat pcp24HrIn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PCP24HRIN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(PCP24HRIN$0);
            }
            target.set(pcp24HrIn);
        }
    }
}
