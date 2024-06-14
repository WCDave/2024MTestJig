/*
 * An XML document type.
 * Localname: wind_dir_degrees
 * Namespace: met
 * Java type: met.WindDirDegreesDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one wind_dir_degrees(@met) element.
 *
 * This is a complex type.
 */
public class WindDirDegreesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.WindDirDegreesDocument
{
    private static final long serialVersionUID = 1L;
    
    public WindDirDegreesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WINDDIRDEGREES$0 = 
        new javax.xml.namespace.QName("met", "wind_dir_degrees");
    
    
    /**
     * Gets the "wind_dir_degrees" element
     */
    public int getWindDirDegrees()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WINDDIRDEGREES$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "wind_dir_degrees" element
     */
    public org.apache.xmlbeans.XmlInt xgetWindDirDegrees()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WINDDIRDEGREES$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "wind_dir_degrees" element
     */
    public void setWindDirDegrees(int windDirDegrees)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WINDDIRDEGREES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WINDDIRDEGREES$0);
            }
            target.setIntValue(windDirDegrees);
        }
    }
    
    /**
     * Sets (as xml) the "wind_dir_degrees" element
     */
    public void xsetWindDirDegrees(org.apache.xmlbeans.XmlInt windDirDegrees)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(WINDDIRDEGREES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(WINDDIRDEGREES$0);
            }
            target.set(windDirDegrees);
        }
    }
}
