/*
 * An XML document type.
 * Localname: planet
 * Namespace: orbitData
 * Java type: orbitData.PlanetDocument
 *
 * Automatically generated - do not modify.
 */
package orbitData.impl;
/**
 * A document containing one planet(@orbitData) element.
 *
 * This is a complex type.
 */
public class PlanetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements orbitData.PlanetDocument
{
    private static final long serialVersionUID = 1L;
    
    public PlanetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLANET$0 = 
        new javax.xml.namespace.QName("orbitData", "planet");
    
    
    /**
     * Gets the "planet" element
     */
    public orbitData.PlanetDocument.Planet getPlanet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            orbitData.PlanetDocument.Planet target = null;
            target = (orbitData.PlanetDocument.Planet)get_store().find_element_user(PLANET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "planet" element
     */
    public void setPlanet(orbitData.PlanetDocument.Planet planet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            orbitData.PlanetDocument.Planet target = null;
            target = (orbitData.PlanetDocument.Planet)get_store().find_element_user(PLANET$0, 0);
            if (target == null)
            {
                target = (orbitData.PlanetDocument.Planet)get_store().add_element_user(PLANET$0);
            }
            target.set(planet);
        }
    }
    
    /**
     * Appends and returns a new empty "planet" element
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
     * An XML planet(@orbitData).
     *
     * This is a complex type.
     */
    public static class PlanetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements orbitData.PlanetDocument.Planet
    {
        private static final long serialVersionUID = 1L;
        
        public PlanetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PLANETNAME$0 = 
            new javax.xml.namespace.QName("orbitData", "planet-name");
        private static final javax.xml.namespace.QName COLOR$2 = 
            new javax.xml.namespace.QName("orbitData", "color");
        private static final javax.xml.namespace.QName ECCENTRICITY$4 = 
            new javax.xml.namespace.QName("", "eccentricity");
        private static final javax.xml.namespace.QName ECCENTRICITYDELTA$6 = 
            new javax.xml.namespace.QName("", "eccentricityDelta");
        private static final javax.xml.namespace.QName TRUEANAMOLY$8 = 
            new javax.xml.namespace.QName("", "true-anamoly");
        private static final javax.xml.namespace.QName ASCENDINGNODE$10 = 
            new javax.xml.namespace.QName("", "ascending-node");
        private static final javax.xml.namespace.QName ASCENDINGNODEDELTA$12 = 
            new javax.xml.namespace.QName("", "ascending-nodeDelta");
        private static final javax.xml.namespace.QName INCLINATION$14 = 
            new javax.xml.namespace.QName("", "inclination");
        private static final javax.xml.namespace.QName INCLINATIONDELTA$16 = 
            new javax.xml.namespace.QName("", "inclinationDelta");
        private static final javax.xml.namespace.QName MEANANAMOLY$18 = 
            new javax.xml.namespace.QName("", "mean-anamoly");
        private static final javax.xml.namespace.QName ROTATIONALPERIOD$20 = 
            new javax.xml.namespace.QName("", "rotational-period");
        private static final javax.xml.namespace.QName RADIUS$22 = 
            new javax.xml.namespace.QName("", "radius");
        private static final javax.xml.namespace.QName OBLATENESS$24 = 
            new javax.xml.namespace.QName("", "oblateness");
        private static final javax.xml.namespace.QName OBLIQUITY$26 = 
            new javax.xml.namespace.QName("", "obliquity");
        private static final javax.xml.namespace.QName ATMO$28 = 
            new javax.xml.namespace.QName("", "atmo");
        private static final javax.xml.namespace.QName SEMIMAJORAXIS$30 = 
            new javax.xml.namespace.QName("", "semi-major-axis");
        private static final javax.xml.namespace.QName SEMIMAJORAXISDELTA$32 = 
            new javax.xml.namespace.QName("", "semi-major-axisDelta");
        private static final javax.xml.namespace.QName MASS$34 = 
            new javax.xml.namespace.QName("", "mass");
        private static final javax.xml.namespace.QName ARGOFPERHELION$36 = 
            new javax.xml.namespace.QName("", "arg-of-perhelion");
        private static final javax.xml.namespace.QName ARGOFPERHELIONDELTA$38 = 
            new javax.xml.namespace.QName("", "arg-of-perhelionDelta");
        private static final javax.xml.namespace.QName DM$40 = 
            new javax.xml.namespace.QName("", "dm");
        private static final javax.xml.namespace.QName PERIOD$42 = 
            new javax.xml.namespace.QName("", "period");
        private static final javax.xml.namespace.QName EPOCHLONGITUDE$44 = 
            new javax.xml.namespace.QName("", "epoch-longitude");
        private static final javax.xml.namespace.QName EPOCHLONGITUDEDELTA$46 = 
            new javax.xml.namespace.QName("", "epoch-longitudeDelta");
        private static final javax.xml.namespace.QName PERIHELIONANGLE$48 = 
            new javax.xml.namespace.QName("", "perihelion-angle");
        private static final javax.xml.namespace.QName MEANANAMOLY0$50 = 
            new javax.xml.namespace.QName("", "mean-anamoly0");
        private static final javax.xml.namespace.QName EPOCHDATETIME$52 = 
            new javax.xml.namespace.QName("", "epochDateTime");
        
        
        /**
         * Gets the "planet-name" element
         */
        public java.lang.String getPlanetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLANETNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "planet-name" element
         */
        public org.apache.xmlbeans.XmlString xgetPlanetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLANETNAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "planet-name" element
         */
        public void setPlanetName(java.lang.String planetName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PLANETNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PLANETNAME$0);
                }
                target.setStringValue(planetName);
            }
        }
        
        /**
         * Sets (as xml) the "planet-name" element
         */
        public void xsetPlanetName(org.apache.xmlbeans.XmlString planetName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PLANETNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PLANETNAME$0);
                }
                target.set(planetName);
            }
        }
        
        /**
         * Gets the "color" element
         */
        public orbitData.PlanetDocument.Planet.Color getColor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                orbitData.PlanetDocument.Planet.Color target = null;
                target = (orbitData.PlanetDocument.Planet.Color)get_store().find_element_user(COLOR$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "color" element
         */
        public void setColor(orbitData.PlanetDocument.Planet.Color color)
        {
            synchronized (monitor())
            {
                check_orphaned();
                orbitData.PlanetDocument.Planet.Color target = null;
                target = (orbitData.PlanetDocument.Planet.Color)get_store().find_element_user(COLOR$2, 0);
                if (target == null)
                {
                    target = (orbitData.PlanetDocument.Planet.Color)get_store().add_element_user(COLOR$2);
                }
                target.set(color);
            }
        }
        
        /**
         * Appends and returns a new empty "color" element
         */
        public orbitData.PlanetDocument.Planet.Color addNewColor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                orbitData.PlanetDocument.Planet.Color target = null;
                target = (orbitData.PlanetDocument.Planet.Color)get_store().add_element_user(COLOR$2);
                return target;
            }
        }
        
        /**
         * Gets the "eccentricity" attribute
         */
        public double getEccentricity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ECCENTRICITY$4);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "eccentricity" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetEccentricity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ECCENTRICITY$4);
                return target;
            }
        }
        
        /**
         * Sets the "eccentricity" attribute
         */
        public void setEccentricity(double eccentricity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ECCENTRICITY$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ECCENTRICITY$4);
                }
                target.setDoubleValue(eccentricity);
            }
        }
        
        /**
         * Sets (as xml) the "eccentricity" attribute
         */
        public void xsetEccentricity(org.apache.xmlbeans.XmlDouble eccentricity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ECCENTRICITY$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ECCENTRICITY$4);
                }
                target.set(eccentricity);
            }
        }
        
        /**
         * Gets the "eccentricityDelta" attribute
         */
        public double getEccentricityDelta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ECCENTRICITYDELTA$6);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "eccentricityDelta" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetEccentricityDelta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ECCENTRICITYDELTA$6);
                return target;
            }
        }
        
        /**
         * Sets the "eccentricityDelta" attribute
         */
        public void setEccentricityDelta(double eccentricityDelta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ECCENTRICITYDELTA$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ECCENTRICITYDELTA$6);
                }
                target.setDoubleValue(eccentricityDelta);
            }
        }
        
        /**
         * Sets (as xml) the "eccentricityDelta" attribute
         */
        public void xsetEccentricityDelta(org.apache.xmlbeans.XmlDouble eccentricityDelta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ECCENTRICITYDELTA$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ECCENTRICITYDELTA$6);
                }
                target.set(eccentricityDelta);
            }
        }
        
        /**
         * Gets the "true-anamoly" attribute
         */
        public double getTrueAnamoly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRUEANAMOLY$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TRUEANAMOLY$8);
                }
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "true-anamoly" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetTrueAnamoly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TRUEANAMOLY$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_default_attribute_value(TRUEANAMOLY$8);
                }
                return target;
            }
        }
        
        /**
         * Sets the "true-anamoly" attribute
         */
        public void setTrueAnamoly(double trueAnamoly)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRUEANAMOLY$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRUEANAMOLY$8);
                }
                target.setDoubleValue(trueAnamoly);
            }
        }
        
        /**
         * Sets (as xml) the "true-anamoly" attribute
         */
        public void xsetTrueAnamoly(org.apache.xmlbeans.XmlDouble trueAnamoly)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(TRUEANAMOLY$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(TRUEANAMOLY$8);
                }
                target.set(trueAnamoly);
            }
        }
        
        /**
         * Gets the "ascending-node" attribute
         */
        public double getAscendingNode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASCENDINGNODE$10);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "ascending-node" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetAscendingNode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ASCENDINGNODE$10);
                return target;
            }
        }
        
        /**
         * Sets the "ascending-node" attribute
         */
        public void setAscendingNode(double ascendingNode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASCENDINGNODE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ASCENDINGNODE$10);
                }
                target.setDoubleValue(ascendingNode);
            }
        }
        
        /**
         * Sets (as xml) the "ascending-node" attribute
         */
        public void xsetAscendingNode(org.apache.xmlbeans.XmlDouble ascendingNode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ASCENDINGNODE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ASCENDINGNODE$10);
                }
                target.set(ascendingNode);
            }
        }
        
        /**
         * Gets the "ascending-nodeDelta" attribute
         */
        public double getAscendingNodeDelta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASCENDINGNODEDELTA$12);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "ascending-nodeDelta" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetAscendingNodeDelta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ASCENDINGNODEDELTA$12);
                return target;
            }
        }
        
        /**
         * Sets the "ascending-nodeDelta" attribute
         */
        public void setAscendingNodeDelta(double ascendingNodeDelta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASCENDINGNODEDELTA$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ASCENDINGNODEDELTA$12);
                }
                target.setDoubleValue(ascendingNodeDelta);
            }
        }
        
        /**
         * Sets (as xml) the "ascending-nodeDelta" attribute
         */
        public void xsetAscendingNodeDelta(org.apache.xmlbeans.XmlDouble ascendingNodeDelta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ASCENDINGNODEDELTA$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ASCENDINGNODEDELTA$12);
                }
                target.set(ascendingNodeDelta);
            }
        }
        
        /**
         * Gets the "inclination" attribute
         */
        public double getInclination()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLINATION$14);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "inclination" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetInclination()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INCLINATION$14);
                return target;
            }
        }
        
        /**
         * Sets the "inclination" attribute
         */
        public void setInclination(double inclination)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLINATION$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCLINATION$14);
                }
                target.setDoubleValue(inclination);
            }
        }
        
        /**
         * Sets (as xml) the "inclination" attribute
         */
        public void xsetInclination(org.apache.xmlbeans.XmlDouble inclination)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INCLINATION$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(INCLINATION$14);
                }
                target.set(inclination);
            }
        }
        
        /**
         * Gets the "inclinationDelta" attribute
         */
        public double getInclinationDelta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLINATIONDELTA$16);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "inclinationDelta" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetInclinationDelta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INCLINATIONDELTA$16);
                return target;
            }
        }
        
        /**
         * Sets the "inclinationDelta" attribute
         */
        public void setInclinationDelta(double inclinationDelta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLINATIONDELTA$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCLINATIONDELTA$16);
                }
                target.setDoubleValue(inclinationDelta);
            }
        }
        
        /**
         * Sets (as xml) the "inclinationDelta" attribute
         */
        public void xsetInclinationDelta(org.apache.xmlbeans.XmlDouble inclinationDelta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(INCLINATIONDELTA$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(INCLINATIONDELTA$16);
                }
                target.set(inclinationDelta);
            }
        }
        
        /**
         * Gets the "mean-anamoly" attribute
         */
        public double getMeanAnamoly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEANANAMOLY$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MEANANAMOLY$18);
                }
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "mean-anamoly" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetMeanAnamoly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MEANANAMOLY$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_default_attribute_value(MEANANAMOLY$18);
                }
                return target;
            }
        }
        
        /**
         * Sets the "mean-anamoly" attribute
         */
        public void setMeanAnamoly(double meanAnamoly)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEANANAMOLY$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEANANAMOLY$18);
                }
                target.setDoubleValue(meanAnamoly);
            }
        }
        
        /**
         * Sets (as xml) the "mean-anamoly" attribute
         */
        public void xsetMeanAnamoly(org.apache.xmlbeans.XmlDouble meanAnamoly)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MEANANAMOLY$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(MEANANAMOLY$18);
                }
                target.set(meanAnamoly);
            }
        }
        
        /**
         * Gets the "rotational-period" attribute
         */
        public double getRotationalPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROTATIONALPERIOD$20);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "rotational-period" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetRotationalPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ROTATIONALPERIOD$20);
                return target;
            }
        }
        
        /**
         * Sets the "rotational-period" attribute
         */
        public void setRotationalPeriod(double rotationalPeriod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROTATIONALPERIOD$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROTATIONALPERIOD$20);
                }
                target.setDoubleValue(rotationalPeriod);
            }
        }
        
        /**
         * Sets (as xml) the "rotational-period" attribute
         */
        public void xsetRotationalPeriod(org.apache.xmlbeans.XmlDouble rotationalPeriod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ROTATIONALPERIOD$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ROTATIONALPERIOD$20);
                }
                target.set(rotationalPeriod);
            }
        }
        
        /**
         * Gets the "radius" attribute
         */
        public double getRadius()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RADIUS$22);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "radius" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetRadius()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RADIUS$22);
                return target;
            }
        }
        
        /**
         * Sets the "radius" attribute
         */
        public void setRadius(double radius)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RADIUS$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RADIUS$22);
                }
                target.setDoubleValue(radius);
            }
        }
        
        /**
         * Sets (as xml) the "radius" attribute
         */
        public void xsetRadius(org.apache.xmlbeans.XmlDouble radius)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RADIUS$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RADIUS$22);
                }
                target.set(radius);
            }
        }
        
        /**
         * Gets the "oblateness" attribute
         */
        public double getOblateness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBLATENESS$24);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "oblateness" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetOblateness()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(OBLATENESS$24);
                return target;
            }
        }
        
        /**
         * Sets the "oblateness" attribute
         */
        public void setOblateness(double oblateness)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBLATENESS$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBLATENESS$24);
                }
                target.setDoubleValue(oblateness);
            }
        }
        
        /**
         * Sets (as xml) the "oblateness" attribute
         */
        public void xsetOblateness(org.apache.xmlbeans.XmlDouble oblateness)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(OBLATENESS$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(OBLATENESS$24);
                }
                target.set(oblateness);
            }
        }
        
        /**
         * Gets the "obliquity" attribute
         */
        public double getObliquity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBLIQUITY$26);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "obliquity" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetObliquity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(OBLIQUITY$26);
                return target;
            }
        }
        
        /**
         * Sets the "obliquity" attribute
         */
        public void setObliquity(double obliquity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBLIQUITY$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBLIQUITY$26);
                }
                target.setDoubleValue(obliquity);
            }
        }
        
        /**
         * Sets (as xml) the "obliquity" attribute
         */
        public void xsetObliquity(org.apache.xmlbeans.XmlDouble obliquity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(OBLIQUITY$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(OBLIQUITY$26);
                }
                target.set(obliquity);
            }
        }
        
        /**
         * Gets the "atmo" attribute
         */
        public boolean getAtmo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATMO$28);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "atmo" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetAtmo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ATMO$28);
                return target;
            }
        }
        
        /**
         * Sets the "atmo" attribute
         */
        public void setAtmo(boolean atmo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATMO$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ATMO$28);
                }
                target.setBooleanValue(atmo);
            }
        }
        
        /**
         * Sets (as xml) the "atmo" attribute
         */
        public void xsetAtmo(org.apache.xmlbeans.XmlBoolean atmo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ATMO$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ATMO$28);
                }
                target.set(atmo);
            }
        }
        
        /**
         * Gets the "semi-major-axis" attribute
         */
        public double getSemiMajorAxis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEMIMAJORAXIS$30);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "semi-major-axis" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSemiMajorAxis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SEMIMAJORAXIS$30);
                return target;
            }
        }
        
        /**
         * Sets the "semi-major-axis" attribute
         */
        public void setSemiMajorAxis(double semiMajorAxis)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEMIMAJORAXIS$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEMIMAJORAXIS$30);
                }
                target.setDoubleValue(semiMajorAxis);
            }
        }
        
        /**
         * Sets (as xml) the "semi-major-axis" attribute
         */
        public void xsetSemiMajorAxis(org.apache.xmlbeans.XmlDouble semiMajorAxis)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SEMIMAJORAXIS$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SEMIMAJORAXIS$30);
                }
                target.set(semiMajorAxis);
            }
        }
        
        /**
         * Gets the "semi-major-axisDelta" attribute
         */
        public double getSemiMajorAxisDelta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEMIMAJORAXISDELTA$32);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "semi-major-axisDelta" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetSemiMajorAxisDelta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SEMIMAJORAXISDELTA$32);
                return target;
            }
        }
        
        /**
         * Sets the "semi-major-axisDelta" attribute
         */
        public void setSemiMajorAxisDelta(double semiMajorAxisDelta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEMIMAJORAXISDELTA$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEMIMAJORAXISDELTA$32);
                }
                target.setDoubleValue(semiMajorAxisDelta);
            }
        }
        
        /**
         * Sets (as xml) the "semi-major-axisDelta" attribute
         */
        public void xsetSemiMajorAxisDelta(org.apache.xmlbeans.XmlDouble semiMajorAxisDelta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(SEMIMAJORAXISDELTA$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(SEMIMAJORAXISDELTA$32);
                }
                target.set(semiMajorAxisDelta);
            }
        }
        
        /**
         * Gets the "mass" attribute
         */
        public double getMass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MASS$34);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "mass" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetMass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MASS$34);
                return target;
            }
        }
        
        /**
         * Sets the "mass" attribute
         */
        public void setMass(double mass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MASS$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MASS$34);
                }
                target.setDoubleValue(mass);
            }
        }
        
        /**
         * Sets (as xml) the "mass" attribute
         */
        public void xsetMass(org.apache.xmlbeans.XmlDouble mass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MASS$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(MASS$34);
                }
                target.set(mass);
            }
        }
        
        /**
         * Gets the "arg-of-perhelion" attribute
         */
        public double getArgOfPerhelion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARGOFPERHELION$36);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "arg-of-perhelion" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetArgOfPerhelion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ARGOFPERHELION$36);
                return target;
            }
        }
        
        /**
         * Sets the "arg-of-perhelion" attribute
         */
        public void setArgOfPerhelion(double argOfPerhelion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARGOFPERHELION$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ARGOFPERHELION$36);
                }
                target.setDoubleValue(argOfPerhelion);
            }
        }
        
        /**
         * Sets (as xml) the "arg-of-perhelion" attribute
         */
        public void xsetArgOfPerhelion(org.apache.xmlbeans.XmlDouble argOfPerhelion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ARGOFPERHELION$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ARGOFPERHELION$36);
                }
                target.set(argOfPerhelion);
            }
        }
        
        /**
         * Gets the "arg-of-perhelionDelta" attribute
         */
        public double getArgOfPerhelionDelta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARGOFPERHELIONDELTA$38);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "arg-of-perhelionDelta" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetArgOfPerhelionDelta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ARGOFPERHELIONDELTA$38);
                return target;
            }
        }
        
        /**
         * Sets the "arg-of-perhelionDelta" attribute
         */
        public void setArgOfPerhelionDelta(double argOfPerhelionDelta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARGOFPERHELIONDELTA$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ARGOFPERHELIONDELTA$38);
                }
                target.setDoubleValue(argOfPerhelionDelta);
            }
        }
        
        /**
         * Sets (as xml) the "arg-of-perhelionDelta" attribute
         */
        public void xsetArgOfPerhelionDelta(org.apache.xmlbeans.XmlDouble argOfPerhelionDelta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ARGOFPERHELIONDELTA$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ARGOFPERHELIONDELTA$38);
                }
                target.set(argOfPerhelionDelta);
            }
        }
        
        /**
         * Gets the "dm" attribute
         */
        public double getDm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DM$40);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "dm" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetDm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DM$40);
                return target;
            }
        }
        
        /**
         * Sets the "dm" attribute
         */
        public void setDm(double dm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DM$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DM$40);
                }
                target.setDoubleValue(dm);
            }
        }
        
        /**
         * Sets (as xml) the "dm" attribute
         */
        public void xsetDm(org.apache.xmlbeans.XmlDouble dm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(DM$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(DM$40);
                }
                target.set(dm);
            }
        }
        
        /**
         * Gets the "period" attribute
         */
        public double getPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERIOD$42);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "period" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PERIOD$42);
                return target;
            }
        }
        
        /**
         * Sets the "period" attribute
         */
        public void setPeriod(double period)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERIOD$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERIOD$42);
                }
                target.setDoubleValue(period);
            }
        }
        
        /**
         * Sets (as xml) the "period" attribute
         */
        public void xsetPeriod(org.apache.xmlbeans.XmlDouble period)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PERIOD$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(PERIOD$42);
                }
                target.set(period);
            }
        }
        
        /**
         * Gets the "epoch-longitude" attribute
         */
        public double getEpochLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EPOCHLONGITUDE$44);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "epoch-longitude" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetEpochLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EPOCHLONGITUDE$44);
                return target;
            }
        }
        
        /**
         * Sets the "epoch-longitude" attribute
         */
        public void setEpochLongitude(double epochLongitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EPOCHLONGITUDE$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EPOCHLONGITUDE$44);
                }
                target.setDoubleValue(epochLongitude);
            }
        }
        
        /**
         * Sets (as xml) the "epoch-longitude" attribute
         */
        public void xsetEpochLongitude(org.apache.xmlbeans.XmlDouble epochLongitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EPOCHLONGITUDE$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EPOCHLONGITUDE$44);
                }
                target.set(epochLongitude);
            }
        }
        
        /**
         * Gets the "epoch-longitudeDelta" attribute
         */
        public double getEpochLongitudeDelta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EPOCHLONGITUDEDELTA$46);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "epoch-longitudeDelta" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetEpochLongitudeDelta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EPOCHLONGITUDEDELTA$46);
                return target;
            }
        }
        
        /**
         * Sets the "epoch-longitudeDelta" attribute
         */
        public void setEpochLongitudeDelta(double epochLongitudeDelta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EPOCHLONGITUDEDELTA$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EPOCHLONGITUDEDELTA$46);
                }
                target.setDoubleValue(epochLongitudeDelta);
            }
        }
        
        /**
         * Sets (as xml) the "epoch-longitudeDelta" attribute
         */
        public void xsetEpochLongitudeDelta(org.apache.xmlbeans.XmlDouble epochLongitudeDelta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(EPOCHLONGITUDEDELTA$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(EPOCHLONGITUDEDELTA$46);
                }
                target.set(epochLongitudeDelta);
            }
        }
        
        /**
         * Gets the "perihelion-angle" attribute
         */
        public double getPerihelionAngle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERIHELIONANGLE$48);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "perihelion-angle" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetPerihelionAngle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PERIHELIONANGLE$48);
                return target;
            }
        }
        
        /**
         * Sets the "perihelion-angle" attribute
         */
        public void setPerihelionAngle(double perihelionAngle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERIHELIONANGLE$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERIHELIONANGLE$48);
                }
                target.setDoubleValue(perihelionAngle);
            }
        }
        
        /**
         * Sets (as xml) the "perihelion-angle" attribute
         */
        public void xsetPerihelionAngle(org.apache.xmlbeans.XmlDouble perihelionAngle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(PERIHELIONANGLE$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(PERIHELIONANGLE$48);
                }
                target.set(perihelionAngle);
            }
        }
        
        /**
         * Gets the "mean-anamoly0" attribute
         */
        public double getMeanAnamoly0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEANANAMOLY0$50);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "mean-anamoly0" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetMeanAnamoly0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MEANANAMOLY0$50);
                return target;
            }
        }
        
        /**
         * Sets the "mean-anamoly0" attribute
         */
        public void setMeanAnamoly0(double meanAnamoly0)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEANANAMOLY0$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEANANAMOLY0$50);
                }
                target.setDoubleValue(meanAnamoly0);
            }
        }
        
        /**
         * Sets (as xml) the "mean-anamoly0" attribute
         */
        public void xsetMeanAnamoly0(org.apache.xmlbeans.XmlDouble meanAnamoly0)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(MEANANAMOLY0$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(MEANANAMOLY0$50);
                }
                target.set(meanAnamoly0);
            }
        }
        
        /**
         * Gets the "epochDateTime" attribute
         */
        public java.util.Calendar getEpochDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EPOCHDATETIME$52);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "epochDateTime" attribute
         */
        public org.apache.xmlbeans.XmlDateTime xgetEpochDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(EPOCHDATETIME$52);
                return target;
            }
        }
        
        /**
         * True if has "epochDateTime" attribute
         */
        public boolean isSetEpochDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EPOCHDATETIME$52) != null;
            }
        }
        
        /**
         * Sets the "epochDateTime" attribute
         */
        public void setEpochDateTime(java.util.Calendar epochDateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EPOCHDATETIME$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EPOCHDATETIME$52);
                }
                target.setCalendarValue(epochDateTime);
            }
        }
        
        /**
         * Sets (as xml) the "epochDateTime" attribute
         */
        public void xsetEpochDateTime(org.apache.xmlbeans.XmlDateTime epochDateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(EPOCHDATETIME$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(EPOCHDATETIME$52);
                }
                target.set(epochDateTime);
            }
        }
        
        /**
         * Unsets the "epochDateTime" attribute
         */
        public void unsetEpochDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EPOCHDATETIME$52);
            }
        }
        /**
         * An XML color(@orbitData).
         *
         * This is a complex type.
         */
        public static class ColorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements orbitData.PlanetDocument.Planet.Color
        {
            private static final long serialVersionUID = 1L;
            
            public ColorImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName RED$0 = 
                new javax.xml.namespace.QName("", "red");
            private static final javax.xml.namespace.QName GREEN$2 = 
                new javax.xml.namespace.QName("", "green");
            private static final javax.xml.namespace.QName BLUE$4 = 
                new javax.xml.namespace.QName("", "blue");
            
            
            /**
             * Gets the "red" attribute
             */
            public int getRed()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RED$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RED$0);
                    }
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "red" attribute
             */
            public org.apache.xmlbeans.XmlInt xgetRed()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(RED$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(RED$0);
                    }
                    return target;
                }
            }
            
            /**
             * True if has "red" attribute
             */
            public boolean isSetRed()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(RED$0) != null;
                }
            }
            
            /**
             * Sets the "red" attribute
             */
            public void setRed(int red)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RED$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RED$0);
                    }
                    target.setIntValue(red);
                }
            }
            
            /**
             * Sets (as xml) the "red" attribute
             */
            public void xsetRed(org.apache.xmlbeans.XmlInt red)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(RED$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(RED$0);
                    }
                    target.set(red);
                }
            }
            
            /**
             * Unsets the "red" attribute
             */
            public void unsetRed()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(RED$0);
                }
            }
            
            /**
             * Gets the "green" attribute
             */
            public int getGreen()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GREEN$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GREEN$2);
                    }
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "green" attribute
             */
            public org.apache.xmlbeans.XmlInt xgetGreen()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(GREEN$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(GREEN$2);
                    }
                    return target;
                }
            }
            
            /**
             * True if has "green" attribute
             */
            public boolean isSetGreen()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(GREEN$2) != null;
                }
            }
            
            /**
             * Sets the "green" attribute
             */
            public void setGreen(int green)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GREEN$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GREEN$2);
                    }
                    target.setIntValue(green);
                }
            }
            
            /**
             * Sets (as xml) the "green" attribute
             */
            public void xsetGreen(org.apache.xmlbeans.XmlInt green)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(GREEN$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(GREEN$2);
                    }
                    target.set(green);
                }
            }
            
            /**
             * Unsets the "green" attribute
             */
            public void unsetGreen()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(GREEN$2);
                }
            }
            
            /**
             * Gets the "blue" attribute
             */
            public int getBlue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLUE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BLUE$4);
                    }
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "blue" attribute
             */
            public org.apache.xmlbeans.XmlInt xgetBlue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(BLUE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(BLUE$4);
                    }
                    return target;
                }
            }
            
            /**
             * True if has "blue" attribute
             */
            public boolean isSetBlue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(BLUE$4) != null;
                }
            }
            
            /**
             * Sets the "blue" attribute
             */
            public void setBlue(int blue)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLUE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BLUE$4);
                    }
                    target.setIntValue(blue);
                }
            }
            
            /**
             * Sets (as xml) the "blue" attribute
             */
            public void xsetBlue(org.apache.xmlbeans.XmlInt blue)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(BLUE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(BLUE$4);
                    }
                    target.set(blue);
                }
            }
            
            /**
             * Unsets the "blue" attribute
             */
            public void unsetBlue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(BLUE$4);
                }
            }
        }
    }
}
