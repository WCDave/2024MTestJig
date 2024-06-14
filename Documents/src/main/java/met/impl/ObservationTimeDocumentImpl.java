/*
 * An XML document type.
 * Localname: observation_time
 * Namespace: met
 * Java type: met.ObservationTimeDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one observation_time(@met) element.
 *
 * This is a complex type.
 */
public class ObservationTimeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.ObservationTimeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ObservationTimeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBSERVATIONTIME$0 = 
        new javax.xml.namespace.QName("met", "observation_time");
    
    
    /**
     * Gets the "observation_time" element
     */
    public java.lang.String getObservationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBSERVATIONTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "observation_time" element
     */
    public org.apache.xmlbeans.XmlString xgetObservationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBSERVATIONTIME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "observation_time" element
     */
    public void setObservationTime(java.lang.String observationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBSERVATIONTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBSERVATIONTIME$0);
            }
            target.setStringValue(observationTime);
        }
    }
    
    /**
     * Sets (as xml) the "observation_time" element
     */
    public void xsetObservationTime(org.apache.xmlbeans.XmlString observationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBSERVATIONTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OBSERVATIONTIME$0);
            }
            target.set(observationTime);
        }
    }
}
