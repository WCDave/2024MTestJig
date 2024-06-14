/*
 * An XML document type.
 * Localname: station_id
 * Namespace: met
 * Java type: met.StationIdDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one station_id(@met) element.
 *
 * This is a complex type.
 */
public class StationIdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.StationIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public StationIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATIONID$0 = 
        new javax.xml.namespace.QName("met", "station_id");
    
    
    /**
     * Gets the "station_id" element
     */
    public java.lang.String getStationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATIONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "station_id" element
     */
    public org.apache.xmlbeans.XmlString xgetStationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATIONID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "station_id" element
     */
    public void setStationId(java.lang.String stationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATIONID$0);
            }
            target.setStringValue(stationId);
        }
    }
    
    /**
     * Sets (as xml) the "station_id" element
     */
    public void xsetStationId(org.apache.xmlbeans.XmlString stationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATIONID$0);
            }
            target.set(stationId);
        }
    }
}
