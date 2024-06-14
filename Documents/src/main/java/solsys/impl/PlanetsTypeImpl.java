/*
 * XML Type:  PlanetsType
 * Namespace: solsys
 * Java type: solsys.PlanetsType
 *
 * Automatically generated - do not modify.
 */
package solsys.impl;
/**
 * An XML PlanetsType(@solsys).
 *
 * This is a complex type.
 */
public class PlanetsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements solsys.PlanetsType
{
    private static final long serialVersionUID = 1L;
    
    public PlanetsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLANET$0 = 
        new javax.xml.namespace.QName("solsys", "Planet");
    
    
    /**
     * Gets array of all "Planet" elements
     */
    public solsys.PlanetType[] getPlanetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PLANET$0, targetList);
            solsys.PlanetType[] result = new solsys.PlanetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Planet" element
     */
    public solsys.PlanetType getPlanetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            solsys.PlanetType target = null;
            target = (solsys.PlanetType)get_store().find_element_user(PLANET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Planet" element
     */
    public int sizeOfPlanetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLANET$0);
        }
    }
    
    /**
     * Sets array of all "Planet" element
     */
    public void setPlanetArray(solsys.PlanetType[] planetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(planetArray, PLANET$0);
        }
    }
    
    /**
     * Sets ith "Planet" element
     */
    public void setPlanetArray(int i, solsys.PlanetType planet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            solsys.PlanetType target = null;
            target = (solsys.PlanetType)get_store().find_element_user(PLANET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(planet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Planet" element
     */
    public solsys.PlanetType insertNewPlanet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            solsys.PlanetType target = null;
            target = (solsys.PlanetType)get_store().insert_element_user(PLANET$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Planet" element
     */
    public solsys.PlanetType addNewPlanet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            solsys.PlanetType target = null;
            target = (solsys.PlanetType)get_store().add_element_user(PLANET$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Planet" element
     */
    public void removePlanet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLANET$0, i);
        }
    }
}
