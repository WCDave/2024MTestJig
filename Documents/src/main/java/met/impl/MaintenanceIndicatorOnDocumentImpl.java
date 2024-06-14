/*
 * An XML document type.
 * Localname: maintenance_indicator_on
 * Namespace: met
 * Java type: met.MaintenanceIndicatorOnDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one maintenance_indicator_on(@met) element.
 *
 * This is a complex type.
 */
public class MaintenanceIndicatorOnDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.MaintenanceIndicatorOnDocument
{
    private static final long serialVersionUID = 1L;
    
    public MaintenanceIndicatorOnDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAINTENANCEINDICATORON$0 = 
        new javax.xml.namespace.QName("met", "maintenance_indicator_on");
    
    
    /**
     * Gets the "maintenance_indicator_on" element
     */
    public java.lang.String getMaintenanceIndicatorOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAINTENANCEINDICATORON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "maintenance_indicator_on" element
     */
    public org.apache.xmlbeans.XmlString xgetMaintenanceIndicatorOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAINTENANCEINDICATORON$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "maintenance_indicator_on" element
     */
    public void setMaintenanceIndicatorOn(java.lang.String maintenanceIndicatorOn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAINTENANCEINDICATORON$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAINTENANCEINDICATORON$0);
            }
            target.setStringValue(maintenanceIndicatorOn);
        }
    }
    
    /**
     * Sets (as xml) the "maintenance_indicator_on" element
     */
    public void xsetMaintenanceIndicatorOn(org.apache.xmlbeans.XmlString maintenanceIndicatorOn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAINTENANCEINDICATORON$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAINTENANCEINDICATORON$0);
            }
            target.set(maintenanceIndicatorOn);
        }
    }
}
