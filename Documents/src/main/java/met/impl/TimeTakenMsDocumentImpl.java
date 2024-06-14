/*
 * An XML document type.
 * Localname: time_taken_ms
 * Namespace: met
 * Java type: met.TimeTakenMsDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one time_taken_ms(@met) element.
 *
 * This is a complex type.
 */
public class TimeTakenMsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.TimeTakenMsDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeTakenMsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMETAKENMS$0 = 
        new javax.xml.namespace.QName("met", "time_taken_ms");
    
    
    /**
     * Gets the "time_taken_ms" element
     */
    public int getTimeTakenMs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMETAKENMS$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "time_taken_ms" element
     */
    public org.apache.xmlbeans.XmlInt xgetTimeTakenMs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIMETAKENMS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "time_taken_ms" element
     */
    public void setTimeTakenMs(int timeTakenMs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMETAKENMS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMETAKENMS$0);
            }
            target.setIntValue(timeTakenMs);
        }
    }
    
    /**
     * Sets (as xml) the "time_taken_ms" element
     */
    public void xsetTimeTakenMs(org.apache.xmlbeans.XmlInt timeTakenMs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TIMETAKENMS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TIMETAKENMS$0);
            }
            target.set(timeTakenMs);
        }
    }
}
