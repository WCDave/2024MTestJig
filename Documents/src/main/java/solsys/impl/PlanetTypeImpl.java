/*
 * XML Type:  PlanetType
 * Namespace: solsys
 * Java type: solsys.PlanetType
 *
 * Automatically generated - do not modify.
 */
package solsys.impl;
/**
 * An XML PlanetType(@solsys).
 *
 * This is a complex type.
 */
public class PlanetTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements solsys.PlanetType
{
    private static final long serialVersionUID = 1L;
    
    public PlanetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLANETNAME$0 = 
        new javax.xml.namespace.QName("solsys", "PlanetName");
    private static final javax.xml.namespace.QName PLANETCOLOR$2 = 
        new javax.xml.namespace.QName("solsys", "PlanetColor");
    private static final javax.xml.namespace.QName TRUEANAMOLY$4 = 
        new javax.xml.namespace.QName("solsys", "TrueAnamoly");
    private static final javax.xml.namespace.QName PERIHELIONANGLE$6 = 
        new javax.xml.namespace.QName("solsys", "PerihelionAngle");
    private static final javax.xml.namespace.QName OBLIQUITY$8 = 
        new javax.xml.namespace.QName("solsys", "Obliquity");
    private static final javax.xml.namespace.QName ROTATIONALPERIOD$10 = 
        new javax.xml.namespace.QName("solsys", "RotationalPeriod");
    private static final javax.xml.namespace.QName MEANANAMOLY0$12 = 
        new javax.xml.namespace.QName("solsys", "MeanAnamoly0");
    private static final javax.xml.namespace.QName MEANANAMOLY$14 = 
        new javax.xml.namespace.QName("solsys", "MeanAnamoly");
    private static final javax.xml.namespace.QName DM$16 = 
        new javax.xml.namespace.QName("solsys", "Dm");
    private static final javax.xml.namespace.QName RADIUS$18 = 
        new javax.xml.namespace.QName("solsys", "Radius");
    private static final javax.xml.namespace.QName OBLATENESS$20 = 
        new javax.xml.namespace.QName("solsys", "Oblateness");
    private static final javax.xml.namespace.QName ARGOFPERHELION$22 = 
        new javax.xml.namespace.QName("solsys", "ArgOfPerhelion");
    private static final javax.xml.namespace.QName ATMO$24 = 
        new javax.xml.namespace.QName("solsys", "Atmo");
    private static final javax.xml.namespace.QName SEMIMAJORAXIS$26 = 
        new javax.xml.namespace.QName("solsys", "SemiMajorAxis");
    private static final javax.xml.namespace.QName PERIOD$28 = 
        new javax.xml.namespace.QName("solsys", "Period");
    private static final javax.xml.namespace.QName ECCENTRICITY$30 = 
        new javax.xml.namespace.QName("solsys", "Eccentricity");
    private static final javax.xml.namespace.QName INCLINATION$32 = 
        new javax.xml.namespace.QName("solsys", "Inclination");
    private static final javax.xml.namespace.QName ASCENDINGNODE$34 = 
        new javax.xml.namespace.QName("solsys", "AscendingNode");
    private static final javax.xml.namespace.QName EPOCHLONGITUDE$36 = 
        new javax.xml.namespace.QName("solsys", "EpochLongitude");
    private static final javax.xml.namespace.QName MASS$38 = 
        new javax.xml.namespace.QName("solsys", "Mass");
    
    
    /**
     * Gets the "PlanetName" element
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
     * Gets (as xml) the "PlanetName" element
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
     * Sets the "PlanetName" element
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
     * Sets (as xml) the "PlanetName" element
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
     * Gets the "PlanetColor" element
     */
    public solsys.PlanetColorType getPlanetColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            solsys.PlanetColorType target = null;
            target = (solsys.PlanetColorType)get_store().find_element_user(PLANETCOLOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PlanetColor" element
     */
    public void setPlanetColor(solsys.PlanetColorType planetColor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            solsys.PlanetColorType target = null;
            target = (solsys.PlanetColorType)get_store().find_element_user(PLANETCOLOR$2, 0);
            if (target == null)
            {
                target = (solsys.PlanetColorType)get_store().add_element_user(PLANETCOLOR$2);
            }
            target.set(planetColor);
        }
    }
    
    /**
     * Appends and returns a new empty "PlanetColor" element
     */
    public solsys.PlanetColorType addNewPlanetColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            solsys.PlanetColorType target = null;
            target = (solsys.PlanetColorType)get_store().add_element_user(PLANETCOLOR$2);
            return target;
        }
    }
    
    /**
     * Gets the "TrueAnamoly" element
     */
    public float getTrueAnamoly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRUEANAMOLY$4, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "TrueAnamoly" element
     */
    public org.apache.xmlbeans.XmlFloat xgetTrueAnamoly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(TRUEANAMOLY$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TrueAnamoly" element
     */
    public void setTrueAnamoly(float trueAnamoly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRUEANAMOLY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRUEANAMOLY$4);
            }
            target.setFloatValue(trueAnamoly);
        }
    }
    
    /**
     * Sets (as xml) the "TrueAnamoly" element
     */
    public void xsetTrueAnamoly(org.apache.xmlbeans.XmlFloat trueAnamoly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(TRUEANAMOLY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(TRUEANAMOLY$4);
            }
            target.set(trueAnamoly);
        }
    }
    
    /**
     * Gets the "PerihelionAngle" element
     */
    public float getPerihelionAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIHELIONANGLE$6, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "PerihelionAngle" element
     */
    public org.apache.xmlbeans.XmlFloat xgetPerihelionAngle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PERIHELIONANGLE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PerihelionAngle" element
     */
    public void setPerihelionAngle(float perihelionAngle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIHELIONANGLE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIHELIONANGLE$6);
            }
            target.setFloatValue(perihelionAngle);
        }
    }
    
    /**
     * Sets (as xml) the "PerihelionAngle" element
     */
    public void xsetPerihelionAngle(org.apache.xmlbeans.XmlFloat perihelionAngle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PERIHELIONANGLE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(PERIHELIONANGLE$6);
            }
            target.set(perihelionAngle);
        }
    }
    
    /**
     * Gets the "Obliquity" element
     */
    public float getObliquity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBLIQUITY$8, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "Obliquity" element
     */
    public org.apache.xmlbeans.XmlFloat xgetObliquity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(OBLIQUITY$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Obliquity" element
     */
    public void setObliquity(float obliquity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBLIQUITY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBLIQUITY$8);
            }
            target.setFloatValue(obliquity);
        }
    }
    
    /**
     * Sets (as xml) the "Obliquity" element
     */
    public void xsetObliquity(org.apache.xmlbeans.XmlFloat obliquity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(OBLIQUITY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(OBLIQUITY$8);
            }
            target.set(obliquity);
        }
    }
    
    /**
     * Gets the "RotationalPeriod" element
     */
    public float getRotationalPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROTATIONALPERIOD$10, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "RotationalPeriod" element
     */
    public org.apache.xmlbeans.XmlFloat xgetRotationalPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(ROTATIONALPERIOD$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RotationalPeriod" element
     */
    public void setRotationalPeriod(float rotationalPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROTATIONALPERIOD$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROTATIONALPERIOD$10);
            }
            target.setFloatValue(rotationalPeriod);
        }
    }
    
    /**
     * Sets (as xml) the "RotationalPeriod" element
     */
    public void xsetRotationalPeriod(org.apache.xmlbeans.XmlFloat rotationalPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(ROTATIONALPERIOD$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(ROTATIONALPERIOD$10);
            }
            target.set(rotationalPeriod);
        }
    }
    
    /**
     * Gets the "MeanAnamoly0" element
     */
    public float getMeanAnamoly0()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEANANAMOLY0$12, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "MeanAnamoly0" element
     */
    public org.apache.xmlbeans.XmlFloat xgetMeanAnamoly0()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MEANANAMOLY0$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MeanAnamoly0" element
     */
    public void setMeanAnamoly0(float meanAnamoly0)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEANANAMOLY0$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEANANAMOLY0$12);
            }
            target.setFloatValue(meanAnamoly0);
        }
    }
    
    /**
     * Sets (as xml) the "MeanAnamoly0" element
     */
    public void xsetMeanAnamoly0(org.apache.xmlbeans.XmlFloat meanAnamoly0)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MEANANAMOLY0$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(MEANANAMOLY0$12);
            }
            target.set(meanAnamoly0);
        }
    }
    
    /**
     * Gets the "MeanAnamoly" element
     */
    public float getMeanAnamoly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEANANAMOLY$14, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "MeanAnamoly" element
     */
    public org.apache.xmlbeans.XmlFloat xgetMeanAnamoly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MEANANAMOLY$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MeanAnamoly" element
     */
    public void setMeanAnamoly(float meanAnamoly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEANANAMOLY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEANANAMOLY$14);
            }
            target.setFloatValue(meanAnamoly);
        }
    }
    
    /**
     * Sets (as xml) the "MeanAnamoly" element
     */
    public void xsetMeanAnamoly(org.apache.xmlbeans.XmlFloat meanAnamoly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MEANANAMOLY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(MEANANAMOLY$14);
            }
            target.set(meanAnamoly);
        }
    }
    
    /**
     * Gets the "Dm" element
     */
    public float getDm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DM$16, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "Dm" element
     */
    public org.apache.xmlbeans.XmlFloat xgetDm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(DM$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Dm" element
     */
    public void setDm(float dm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DM$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DM$16);
            }
            target.setFloatValue(dm);
        }
    }
    
    /**
     * Sets (as xml) the "Dm" element
     */
    public void xsetDm(org.apache.xmlbeans.XmlFloat dm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(DM$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(DM$16);
            }
            target.set(dm);
        }
    }
    
    /**
     * Gets the "Radius" element
     */
    public float getRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RADIUS$18, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "Radius" element
     */
    public org.apache.xmlbeans.XmlFloat xgetRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(RADIUS$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Radius" element
     */
    public void setRadius(float radius)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RADIUS$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RADIUS$18);
            }
            target.setFloatValue(radius);
        }
    }
    
    /**
     * Sets (as xml) the "Radius" element
     */
    public void xsetRadius(org.apache.xmlbeans.XmlFloat radius)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(RADIUS$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(RADIUS$18);
            }
            target.set(radius);
        }
    }
    
    /**
     * Gets the "Oblateness" element
     */
    public float getOblateness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBLATENESS$20, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "Oblateness" element
     */
    public org.apache.xmlbeans.XmlFloat xgetOblateness()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(OBLATENESS$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Oblateness" element
     */
    public void setOblateness(float oblateness)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBLATENESS$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBLATENESS$20);
            }
            target.setFloatValue(oblateness);
        }
    }
    
    /**
     * Sets (as xml) the "Oblateness" element
     */
    public void xsetOblateness(org.apache.xmlbeans.XmlFloat oblateness)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(OBLATENESS$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(OBLATENESS$20);
            }
            target.set(oblateness);
        }
    }
    
    /**
     * Gets the "ArgOfPerhelion" element
     */
    public float getArgOfPerhelion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARGOFPERHELION$22, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "ArgOfPerhelion" element
     */
    public org.apache.xmlbeans.XmlFloat xgetArgOfPerhelion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(ARGOFPERHELION$22, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ArgOfPerhelion" element
     */
    public void setArgOfPerhelion(float argOfPerhelion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARGOFPERHELION$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARGOFPERHELION$22);
            }
            target.setFloatValue(argOfPerhelion);
        }
    }
    
    /**
     * Sets (as xml) the "ArgOfPerhelion" element
     */
    public void xsetArgOfPerhelion(org.apache.xmlbeans.XmlFloat argOfPerhelion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(ARGOFPERHELION$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(ARGOFPERHELION$22);
            }
            target.set(argOfPerhelion);
        }
    }
    
    /**
     * Gets the "Atmo" element
     */
    public solsys.PlanetType.Atmo.Enum getAtmo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATMO$24, 0);
            if (target == null)
            {
                return null;
            }
            return (solsys.PlanetType.Atmo.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Atmo" element
     */
    public solsys.PlanetType.Atmo xgetAtmo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            solsys.PlanetType.Atmo target = null;
            target = (solsys.PlanetType.Atmo)get_store().find_element_user(ATMO$24, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Atmo" element
     */
    public void setAtmo(solsys.PlanetType.Atmo.Enum atmo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATMO$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATMO$24);
            }
            target.setEnumValue(atmo);
        }
    }
    
    /**
     * Sets (as xml) the "Atmo" element
     */
    public void xsetAtmo(solsys.PlanetType.Atmo atmo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            solsys.PlanetType.Atmo target = null;
            target = (solsys.PlanetType.Atmo)get_store().find_element_user(ATMO$24, 0);
            if (target == null)
            {
                target = (solsys.PlanetType.Atmo)get_store().add_element_user(ATMO$24);
            }
            target.set(atmo);
        }
    }
    
    /**
     * Gets the "SemiMajorAxis" element
     */
    public float getSemiMajorAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEMIMAJORAXIS$26, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "SemiMajorAxis" element
     */
    public org.apache.xmlbeans.XmlFloat xgetSemiMajorAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(SEMIMAJORAXIS$26, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SemiMajorAxis" element
     */
    public void setSemiMajorAxis(float semiMajorAxis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEMIMAJORAXIS$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEMIMAJORAXIS$26);
            }
            target.setFloatValue(semiMajorAxis);
        }
    }
    
    /**
     * Sets (as xml) the "SemiMajorAxis" element
     */
    public void xsetSemiMajorAxis(org.apache.xmlbeans.XmlFloat semiMajorAxis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(SEMIMAJORAXIS$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(SEMIMAJORAXIS$26);
            }
            target.set(semiMajorAxis);
        }
    }
    
    /**
     * Gets the "Period" element
     */
    public float getPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIOD$28, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "Period" element
     */
    public org.apache.xmlbeans.XmlFloat xgetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PERIOD$28, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Period" element
     */
    public void setPeriod(float period)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIOD$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIOD$28);
            }
            target.setFloatValue(period);
        }
    }
    
    /**
     * Sets (as xml) the "Period" element
     */
    public void xsetPeriod(org.apache.xmlbeans.XmlFloat period)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PERIOD$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(PERIOD$28);
            }
            target.set(period);
        }
    }
    
    /**
     * Gets the "Eccentricity" element
     */
    public float getEccentricity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ECCENTRICITY$30, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "Eccentricity" element
     */
    public org.apache.xmlbeans.XmlFloat xgetEccentricity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(ECCENTRICITY$30, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Eccentricity" element
     */
    public void setEccentricity(float eccentricity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ECCENTRICITY$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ECCENTRICITY$30);
            }
            target.setFloatValue(eccentricity);
        }
    }
    
    /**
     * Sets (as xml) the "Eccentricity" element
     */
    public void xsetEccentricity(org.apache.xmlbeans.XmlFloat eccentricity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(ECCENTRICITY$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(ECCENTRICITY$30);
            }
            target.set(eccentricity);
        }
    }
    
    /**
     * Gets the "Inclination" element
     */
    public float getInclination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLINATION$32, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "Inclination" element
     */
    public org.apache.xmlbeans.XmlFloat xgetInclination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(INCLINATION$32, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Inclination" element
     */
    public void setInclination(float inclination)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLINATION$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCLINATION$32);
            }
            target.setFloatValue(inclination);
        }
    }
    
    /**
     * Sets (as xml) the "Inclination" element
     */
    public void xsetInclination(org.apache.xmlbeans.XmlFloat inclination)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(INCLINATION$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(INCLINATION$32);
            }
            target.set(inclination);
        }
    }
    
    /**
     * Gets the "AscendingNode" element
     */
    public float getAscendingNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASCENDINGNODE$34, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "AscendingNode" element
     */
    public org.apache.xmlbeans.XmlFloat xgetAscendingNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(ASCENDINGNODE$34, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AscendingNode" element
     */
    public void setAscendingNode(float ascendingNode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASCENDINGNODE$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASCENDINGNODE$34);
            }
            target.setFloatValue(ascendingNode);
        }
    }
    
    /**
     * Sets (as xml) the "AscendingNode" element
     */
    public void xsetAscendingNode(org.apache.xmlbeans.XmlFloat ascendingNode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(ASCENDINGNODE$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(ASCENDINGNODE$34);
            }
            target.set(ascendingNode);
        }
    }
    
    /**
     * Gets the "EpochLongitude" element
     */
    public float getEpochLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EPOCHLONGITUDE$36, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "EpochLongitude" element
     */
    public org.apache.xmlbeans.XmlFloat xgetEpochLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(EPOCHLONGITUDE$36, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EpochLongitude" element
     */
    public void setEpochLongitude(float epochLongitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EPOCHLONGITUDE$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EPOCHLONGITUDE$36);
            }
            target.setFloatValue(epochLongitude);
        }
    }
    
    /**
     * Sets (as xml) the "EpochLongitude" element
     */
    public void xsetEpochLongitude(org.apache.xmlbeans.XmlFloat epochLongitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(EPOCHLONGITUDE$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(EPOCHLONGITUDE$36);
            }
            target.set(epochLongitude);
        }
    }
    
    /**
     * Gets the "Mass" element
     */
    public float getMass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MASS$38, 0);
            if (target == null)
            {
                return 0.0f;
            }
            return target.getFloatValue();
        }
    }
    
    /**
     * Gets (as xml) the "Mass" element
     */
    public org.apache.xmlbeans.XmlFloat xgetMass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MASS$38, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Mass" element
     */
    public void setMass(float mass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MASS$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MASS$38);
            }
            target.setFloatValue(mass);
        }
    }
    
    /**
     * Sets (as xml) the "Mass" element
     */
    public void xsetMass(org.apache.xmlbeans.XmlFloat mass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(MASS$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(MASS$38);
            }
            target.set(mass);
        }
    }
    /**
     * An XML Atmo(@solsys).
     *
     * This is an atomic type that is a restriction of solsys.PlanetType$Atmo.
     */
    public static class AtmoImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements solsys.PlanetType.Atmo
    {
        private static final long serialVersionUID = 1L;
        
        public AtmoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected AtmoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
