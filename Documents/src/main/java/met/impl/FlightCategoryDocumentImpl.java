/*
 * An XML document type.
 * Localname: flight_category
 * Namespace: met
 * Java type: met.FlightCategoryDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one flight_category(@met) element.
 *
 * This is a complex type.
 */
public class FlightCategoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.FlightCategoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public FlightCategoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FLIGHTCATEGORY$0 = 
        new javax.xml.namespace.QName("met", "flight_category");
    
    
    /**
     * Gets the "flight_category" element
     */
    public java.lang.String getFlightCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTCATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "flight_category" element
     */
    public org.apache.xmlbeans.XmlString xgetFlightCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FLIGHTCATEGORY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "flight_category" element
     */
    public void setFlightCategory(java.lang.String flightCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLIGHTCATEGORY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLIGHTCATEGORY$0);
            }
            target.setStringValue(flightCategory);
        }
    }
    
    /**
     * Sets (as xml) the "flight_category" element
     */
    public void xsetFlightCategory(org.apache.xmlbeans.XmlString flightCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FLIGHTCATEGORY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FLIGHTCATEGORY$0);
            }
            target.set(flightCategory);
        }
    }
}
