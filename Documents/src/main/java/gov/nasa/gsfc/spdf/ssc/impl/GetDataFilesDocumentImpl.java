/*
 * An XML document type.
 * Localname: getDataFiles
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GetDataFilesDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * A document containing one getDataFiles(@http://ssc.spdf.gsfc.nasa.gov/) element.
 *
 * This is a complex type.
 */
public class GetDataFilesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.GetDataFilesDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetDataFilesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETDATAFILES$0 = 
        new javax.xml.namespace.QName("http://ssc.spdf.gsfc.nasa.gov/", "getDataFiles");
    
    
    /**
     * Gets the "getDataFiles" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetDataFiles getGetDataFiles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetDataFiles target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetDataFiles)get_store().find_element_user(GETDATAFILES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getDataFiles" element
     */
    public void setGetDataFiles(gov.nasa.gsfc.spdf.ssc.GetDataFiles getDataFiles)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetDataFiles target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetDataFiles)get_store().find_element_user(GETDATAFILES$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.GetDataFiles)get_store().add_element_user(GETDATAFILES$0);
            }
            target.set(getDataFiles);
        }
    }
    
    /**
     * Appends and returns a new empty "getDataFiles" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetDataFiles addNewGetDataFiles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetDataFiles target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetDataFiles)get_store().add_element_user(GETDATAFILES$0);
            return target;
        }
    }
}
