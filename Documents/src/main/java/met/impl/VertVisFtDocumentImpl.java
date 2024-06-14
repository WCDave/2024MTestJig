/*
 * An XML document type.
 * Localname: vert_vis_ft
 * Namespace: met
 * Java type: met.VertVisFtDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one vert_vis_ft(@met) element.
 *
 * This is a complex type.
 */
public class VertVisFtDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.VertVisFtDocument
{
    private static final long serialVersionUID = 1L;
    
    public VertVisFtDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERTVISFT$0 = 
        new javax.xml.namespace.QName("met", "vert_vis_ft");
    
    
    /**
     * Gets the "vert_vis_ft" element
     */
    public int getVertVisFt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERTVISFT$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "vert_vis_ft" element
     */
    public org.apache.xmlbeans.XmlInt xgetVertVisFt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VERTVISFT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "vert_vis_ft" element
     */
    public void setVertVisFt(int vertVisFt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERTVISFT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERTVISFT$0);
            }
            target.setIntValue(vertVisFt);
        }
    }
    
    /**
     * Sets (as xml) the "vert_vis_ft" element
     */
    public void xsetVertVisFt(org.apache.xmlbeans.XmlInt vertVisFt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VERTVISFT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(VERTVISFT$0);
            }
            target.set(vertVisFt);
        }
    }
}
