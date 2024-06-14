/*
 * An XML document type.
 * Localname: solar-system
 * Namespace: orbitData
 * Java type: orbitData.SolarSystemDocument
 *
 * Automatically generated - do not modify.
 */
package orbitData.impl;
/**
 * A document containing one solar-system(@orbitData) element.
 *
 * This is a complex type.
 */
public class SolarSystemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements orbitData.SolarSystemDocument
{
    private static final long serialVersionUID = 1L;
    
    public SolarSystemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLARSYSTEM$0 = 
        new javax.xml.namespace.QName("orbitData", "solar-system");
    
    
    /**
     * Gets the "solar-system" element
     */
    public orbitData.SolarSystemDocument.SolarSystem getSolarSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            orbitData.SolarSystemDocument.SolarSystem target = null;
            target = (orbitData.SolarSystemDocument.SolarSystem)get_store().find_element_user(SOLARSYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "solar-system" element
     */
    public void setSolarSystem(orbitData.SolarSystemDocument.SolarSystem solarSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            orbitData.SolarSystemDocument.SolarSystem target = null;
            target = (orbitData.SolarSystemDocument.SolarSystem)get_store().find_element_user(SOLARSYSTEM$0, 0);
            if (target == null)
            {
                target = (orbitData.SolarSystemDocument.SolarSystem)get_store().add_element_user(SOLARSYSTEM$0);
            }
            target.set(solarSystem);
        }
    }
    
    /**
     * Appends and returns a new empty "solar-system" element
     */
    public orbitData.SolarSystemDocument.SolarSystem addNewSolarSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            orbitData.SolarSystemDocument.SolarSystem target = null;
            target = (orbitData.SolarSystemDocument.SolarSystem)get_store().add_element_user(SOLARSYSTEM$0);
            return target;
        }
    }
    /**
     * An XML solar-system(@orbitData).
     *
     * This is a complex type.
     */
    public static class SolarSystemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements orbitData.SolarSystemDocument.SolarSystem
    {
        private static final long serialVersionUID = 1L;
        
        public SolarSystemImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PLANET$0 = 
            new javax.xml.namespace.QName("orbitData", "planet");
        
        
        /**
         * Gets array of all "planet" elements
         */
        public orbitData.PlanetDocument.Planet[] getPlanetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PLANET$0, targetList);
                orbitData.PlanetDocument.Planet[] result = new orbitData.PlanetDocument.Planet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "planet" element
         */
        public orbitData.PlanetDocument.Planet getPlanetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                orbitData.PlanetDocument.Planet target = null;
                target = (orbitData.PlanetDocument.Planet)get_store().find_element_user(PLANET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "planet" element
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
         * Sets array of all "planet" element
         */
        public void setPlanetArray(orbitData.PlanetDocument.Planet[] planetArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(planetArray, PLANET$0);
            }
        }
        
        /**
         * Sets ith "planet" element
         */
        public void setPlanetArray(int i, orbitData.PlanetDocument.Planet planet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                orbitData.PlanetDocument.Planet target = null;
                target = (orbitData.PlanetDocument.Planet)get_store().find_element_user(PLANET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(planet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "planet" element
         */
        public orbitData.PlanetDocument.Planet insertNewPlanet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                orbitData.PlanetDocument.Planet target = null;
                target = (orbitData.PlanetDocument.Planet)get_store().insert_element_user(PLANET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "planet" element
         */
        public orbitData.PlanetDocument.Planet addNewPlanet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                orbitData.PlanetDocument.Planet target = null;
                target = (orbitData.PlanetDocument.Planet)get_store().add_element_user(PLANET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "planet" element
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
}
