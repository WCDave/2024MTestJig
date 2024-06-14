/*
 * An XML document type.
 * Localname: getGraphs
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.GetGraphsDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * A document containing one getGraphs(@http://ssc.spdf.gsfc.nasa.gov/) element.
 *
 * This is a complex type.
 */
public class GetGraphsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.GetGraphsDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetGraphsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETGRAPHS$0 = 
        new javax.xml.namespace.QName("http://ssc.spdf.gsfc.nasa.gov/", "getGraphs");
    
    
    /**
     * Gets the "getGraphs" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetGraphs getGetGraphs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetGraphs target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetGraphs)get_store().find_element_user(GETGRAPHS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getGraphs" element
     */
    public void setGetGraphs(gov.nasa.gsfc.spdf.ssc.GetGraphs getGraphs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetGraphs target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetGraphs)get_store().find_element_user(GETGRAPHS$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.GetGraphs)get_store().add_element_user(GETGRAPHS$0);
            }
            target.set(getGraphs);
        }
    }
    
    /**
     * Appends and returns a new empty "getGraphs" element
     */
    public gov.nasa.gsfc.spdf.ssc.GetGraphs addNewGetGraphs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.GetGraphs target = null;
            target = (gov.nasa.gsfc.spdf.ssc.GetGraphs)get_store().add_element_user(GETGRAPHS$0);
            return target;
        }
    }
}
