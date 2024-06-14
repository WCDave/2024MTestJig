/*
 * An XML document type.
 * Localname: auto_station
 * Namespace: met
 * Java type: met.AutoStationDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one auto_station(@met) element.
 *
 * This is a complex type.
 */
public class AutoStationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.AutoStationDocument
{
    private static final long serialVersionUID = 1L;
    
    public AutoStationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTOSTATION$0 = 
        new javax.xml.namespace.QName("met", "auto_station");
    
    
    /**
     * Gets the "auto_station" element
     */
    public java.lang.String getAutoStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOSTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "auto_station" element
     */
    public org.apache.xmlbeans.XmlString xgetAutoStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTOSTATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "auto_station" element
     */
    public void setAutoStation(java.lang.String autoStation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOSTATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTOSTATION$0);
            }
            target.setStringValue(autoStation);
        }
    }
    
    /**
     * Sets (as xml) the "auto_station" element
     */
    public void xsetAutoStation(org.apache.xmlbeans.XmlString autoStation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTOSTATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTOSTATION$0);
            }
            target.set(autoStation);
        }
    }
}
