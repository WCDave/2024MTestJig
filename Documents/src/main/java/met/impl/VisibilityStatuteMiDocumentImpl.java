/*
 * An XML document type.
 * Localname: visibility_statute_mi
 * Namespace: met
 * Java type: met.VisibilityStatuteMiDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one visibility_statute_mi(@met) element.
 *
 * This is a complex type.
 */
public class VisibilityStatuteMiDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.VisibilityStatuteMiDocument
{
    private static final long serialVersionUID = 1L;
    
    public VisibilityStatuteMiDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VISIBILITYSTATUTEMI$0 = 
        new javax.xml.namespace.QName("met", "visibility_statute_mi");
    
    
    /**
     * Gets the "visibility_statute_mi" element
     */
    public float getVisibilityStatuteMi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VISIBILITYSTATUTEMI$0, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "visibility_statute_mi" element
     */
    public org.apache.xmlbeans.XmlFloat xgetVisibilityStatuteMi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(VISIBILITYSTATUTEMI$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "visibility_statute_mi" element
     */
    public void setVisibilityStatuteMi(float visibilityStatuteMi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VISIBILITYSTATUTEMI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VISIBILITYSTATUTEMI$0);
            }
            target.setFloatValue(visibilityStatuteMi);
        }
    }
    
    /**
     * Sets (as xml) the "visibility_statute_mi" element
     */
    public void xsetVisibilityStatuteMi(org.apache.xmlbeans.XmlFloat visibilityStatuteMi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(VISIBILITYSTATUTEMI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(VISIBILITYSTATUTEMI$0);
            }
            target.set(visibilityStatuteMi);
        }
    }
}
