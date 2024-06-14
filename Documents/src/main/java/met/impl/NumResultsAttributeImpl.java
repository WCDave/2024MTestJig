/*
 * An XML attribute type.
 * Localname: num_results
 * Namespace: met
 * Java type: met.NumResultsAttribute
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one num_results(@met) attribute.
 *
 * This is a complex type.
 */
public class NumResultsAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.NumResultsAttribute
{
    private static final long serialVersionUID = 1L;
    
    public NumResultsAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMRESULTS$0 = 
        new javax.xml.namespace.QName("met", "num_results");
    
    
    /**
     * Gets the "num_results" attribute
     */
    public int getNumResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMRESULTS$0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "num_results" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetNumResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(NUMRESULTS$0);
            return target;
        }
    }
    
    /**
     * True if has "num_results" attribute
     */
    public boolean isSetNumResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NUMRESULTS$0) != null;
        }
    }
    
    /**
     * Sets the "num_results" attribute
     */
    public void setNumResults(int numResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMRESULTS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMRESULTS$0);
            }
            target.setIntValue(numResults);
        }
    }
    
    /**
     * Sets (as xml) the "num_results" attribute
     */
    public void xsetNumResults(org.apache.xmlbeans.XmlInt numResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(NUMRESULTS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(NUMRESULTS$0);
            }
            target.set(numResults);
        }
    }
    
    /**
     * Unsets the "num_results" attribute
     */
    public void unsetNumResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NUMRESULTS$0);
        }
    }
}
