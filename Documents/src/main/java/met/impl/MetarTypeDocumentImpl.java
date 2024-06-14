/*
 * An XML document type.
 * Localname: metar_type
 * Namespace: met
 * Java type: met.MetarTypeDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one metar_type(@met) element.
 *
 * This is a complex type.
 */
public class MetarTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.MetarTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetarTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METARTYPE$0 = 
        new javax.xml.namespace.QName("met", "metar_type");
    
    
    /**
     * Gets the "metar_type" element
     */
    public java.lang.String getMetarType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METARTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "metar_type" element
     */
    public org.apache.xmlbeans.XmlString xgetMetarType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METARTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "metar_type" element
     */
    public void setMetarType(java.lang.String metarType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METARTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METARTYPE$0);
            }
            target.setStringValue(metarType);
        }
    }
    
    /**
     * Sets (as xml) the "metar_type" element
     */
    public void xsetMetarType(org.apache.xmlbeans.XmlString metarType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METARTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(METARTYPE$0);
            }
            target.set(metarType);
        }
    }
}
