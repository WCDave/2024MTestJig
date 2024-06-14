/*
 * An XML document type.
 * Localname: getAllGroundStations
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GetAllGroundStationsDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * A document containing one getAllGroundStations(@http://ssc.spdf.gsfc.nasa.gov/) element.
 *
 * This is a complex type.
 */
public class GetAllGroundStationsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.GetAllGroundStationsDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetAllGroundStationsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETALLGROUNDSTATIONS$0 = 
        new javax.xml.namespace.QName("http://ssc.spdf.gsfc.nasa.gov/", "getAllGroundStations");
    
    
    /**
     * Gets the "getAllGroundStations" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetAllGroundStations getGetAllGroundStations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetAllGroundStations target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetAllGroundStations)get_store().find_element_user(GETALLGROUNDSTATIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getAllGroundStations" element
     */
    public void setGetAllGroundStations(gov.nasa.gsfc.spdf.ssc.GetAllGroundStations getAllGroundStations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetAllGroundStations target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetAllGroundStations)get_store().find_element_user(GETALLGROUNDSTATIONS$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.GetAllGroundStations)get_store().add_element_user(GETALLGROUNDSTATIONS$0);
            }
            target.set(getAllGroundStations);
        }
    }
    
    /**
     * Appends and returns a new empty "getAllGroundStations" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetAllGroundStations addNewGetAllGroundStations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetAllGroundStations target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetAllGroundStations)get_store().add_element_user(GETALLGROUNDSTATIONS$0);
            return target;
        }
    }
}
