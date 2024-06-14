/*
 * An XML document type.
 * Localname: wind_speed_kt
 * Namespace: met
 * Java type: met.WindSpeedKtDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one wind_speed_kt(@met) element.
 *
 * This is a complex type.
 */
public class WindSpeedKtDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.WindSpeedKtDocument
{
    private static final long serialVersionUID = 1L;
    
    public WindSpeedKtDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WINDSPEEDKT$0 = 
        new javax.xml.namespace.QName("met", "wind_speed_kt");
    
    
    /**
     * Gets the "wind_speed_kt" element
     */
    public int getWindSpeedKt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WINDSPEEDKT$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "wind_speed_kt" element
     */
    public org.apache.xmlbeans.XmlInt xgetWindSpeedKt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WINDSPEEDKT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "wind_speed_kt" element
     */
    public void setWindSpeedKt(int windSpeedKt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WINDSPEEDKT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WINDSPEEDKT$0);
            }
            target.setIntValue(windSpeedKt);
        }
    }
    
    /**
     * Sets (as xml) the "wind_speed_kt" element
     */
    public void xsetWindSpeedKt(org.apache.xmlbeans.XmlInt windSpeedKt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WINDSPEEDKT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(WINDSPEEDKT$0);
            }
            target.set(windSpeedKt);
        }
    }
}
