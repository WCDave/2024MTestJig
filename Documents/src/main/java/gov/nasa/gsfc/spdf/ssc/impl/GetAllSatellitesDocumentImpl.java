/*
 * An XML document type.
 * Localname: getAllSatellites
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GetAllSatellitesDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * A document containing one getAllSatellites(@http://ssc.spdf.gsfc.nasa.gov/) element.
 *
 * This is a complex type.
 */
public class GetAllSatellitesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.GetAllSatellitesDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetAllSatellitesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETALLSATELLITES$0 = 
        new javax.xml.namespace.QName("http://ssc.spdf.gsfc.nasa.gov/", "getAllSatellites");
    
    
    /**
     * Gets the "getAllSatellites" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetAllSatellites getGetAllSatellites()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetAllSatellites target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetAllSatellites)get_store().find_element_user(GETALLSATELLITES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getAllSatellites" element
     */
    public void setGetAllSatellites(gov.nasa.gsfc.spdf.ssc.GetAllSatellites getAllSatellites)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetAllSatellites target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetAllSatellites)get_store().find_element_user(GETALLSATELLITES$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.GetAllSatellites)get_store().add_element_user(GETALLSATELLITES$0);
            }
            target.set(getAllSatellites);
        }
    }
    
    /**
     * Appends and returns a new empty "getAllSatellites" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetAllSatellites addNewGetAllSatellites()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetAllSatellites target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetAllSatellites)get_store().add_element_user(GETALLSATELLITES$0);
            return target;
        }
    }
}
