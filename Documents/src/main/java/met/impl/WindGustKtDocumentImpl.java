/*
 * An XML document type.
 * Localname: wind_gust_kt
 * Namespace: met
 * Java type: met.WindGustKtDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one wind_gust_kt(@met) element.
 *
 * This is a complex type.
 */
public class WindGustKtDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.WindGustKtDocument
{
    private static final long serialVersionUID = 1L;
    
    public WindGustKtDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WINDGUSTKT$0 = 
        new javax.xml.namespace.QName("met", "wind_gust_kt");
    
    
    /**
     * Gets the "wind_gust_kt" element
     */
    public int getWindGustKt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WINDGUSTKT$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "wind_gust_kt" element
     */
    public org.apache.xmlbeans.XmlInt xgetWindGustKt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WINDGUSTKT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "wind_gust_kt" element
     */
    public void setWindGustKt(int windGustKt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WINDGUSTKT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WINDGUSTKT$0);
            }
            target.setIntValue(windGustKt);
        }
    }
    
    /**
     * Sets (as xml) the "wind_gust_kt" element
     */
    public void xsetWindGustKt(org.apache.xmlbeans.XmlInt windGustKt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WINDGUSTKT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(WINDGUSTKT$0);
            }
            target.set(windGustKt);
        }
    }
}
