/*
 * An XML document type.
 * Localname: Planets
 * Namespace: solsys
 * Java type: solsys.PlanetsDocument
 *
 * Automatically generated - do not modify.
 */
package solsys.impl;
/**
 * A document containing one Planets(@solsys) element.
 *
 * This is a complex type.
 */
public class PlanetsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements solsys.PlanetsDocument
{
    private static final long serialVersionUID = 1L;
    
    public PlanetsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLANETS$0 = 
        new javax.xml.namespace.QName("solsys", "Planets");
    
    
    /**
     * Gets the "Planets" element
     */
    public solsys.PlanetsType getPlanets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            solsys.PlanetsType target = null;
            target = (solsys.PlanetsType)get_store().find_element_user(PLANETS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Planets" element
     */
    public void setPlanets(solsys.PlanetsType planets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            solsys.PlanetsType target = null;
            target = (solsys.PlanetsType)get_store().find_element_user(PLANETS$0, 0);
            if (target == null)
            {
                target = (solsys.PlanetsType)get_store().add_element_user(PLANETS$0);
            }
            target.set(planets);
        }
    }
    
    /**
     * Appends and returns a new empty "Planets" element
     */
    public solsys.PlanetsType addNewPlanets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            solsys.PlanetsType target = null;
            target = (solsys.PlanetsType)get_store().add_element_user(PLANETS$0);
            return target;
        }
    }
}
