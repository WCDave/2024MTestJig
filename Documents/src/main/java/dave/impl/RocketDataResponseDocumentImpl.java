/*
 * An XML document type.
 * Localname: RocketDataResponse
 * Namespace: dave
 * Java type: dave.RocketDataResponseDocument
 *
 * Automatically generated - do not modify.
 */
package dave.impl;
/**
 * A document containing one RocketDataResponse(@dave) element.
 *
 * This is a complex type.
 */
public class RocketDataResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dave.RocketDataResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public RocketDataResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROCKETDATARESPONSE$0 = 
        new javax.xml.namespace.QName("dave", "RocketDataResponse");
    
    
    /**
     * Gets the "RocketDataResponse" element
     */
    public dave.RocketDataResponseDocument.RocketDataResponse getRocketDataResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dave.RocketDataResponseDocument.RocketDataResponse target = null;
            target = (dave.RocketDataResponseDocument.RocketDataResponse)get_store().find_element_user(ROCKETDATARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RocketDataResponse" element
     */
    public void setRocketDataResponse(dave.RocketDataResponseDocument.RocketDataResponse rocketDataResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dave.RocketDataResponseDocument.RocketDataResponse target = null;
            target = (dave.RocketDataResponseDocument.RocketDataResponse)get_store().find_element_user(ROCKETDATARESPONSE$0, 0);
            if (target == null)
            {
                target = (dave.RocketDataResponseDocument.RocketDataResponse)get_store().add_element_user(ROCKETDATARESPONSE$0);
            }
            target.set(rocketDataResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "RocketDataResponse" element
     */
    public dave.RocketDataResponseDocument.RocketDataResponse addNewRocketDataResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dave.RocketDataResponseDocument.RocketDataResponse target = null;
            target = (dave.RocketDataResponseDocument.RocketDataResponse)get_store().add_element_user(ROCKETDATARESPONSE$0);
            return target;
        }
    }
    /**
     * An XML RocketDataResponse(@dave).
     *
     * This is a complex type.
     */
    public static class RocketDataResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dave.RocketDataResponseDocument.RocketDataResponse
    {
        private static final long serialVersionUID = 1L;
        
        public RocketDataResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REFNAME$0 = 
            new javax.xml.namespace.QName("dave", "refName");
        private static final javax.xml.namespace.QName RPER$2 = 
            new javax.xml.namespace.QName("dave", "rPer");
        private static final javax.xml.namespace.QName VPER$4 = 
            new javax.xml.namespace.QName("dave", "vPer");
        private static final javax.xml.namespace.QName RAPH$6 = 
            new javax.xml.namespace.QName("dave", "rAph");
        private static final javax.xml.namespace.QName VAPH$8 = 
            new javax.xml.namespace.QName("dave", "vAph");
        private static final javax.xml.namespace.QName ECC$10 = 
            new javax.xml.namespace.QName("dave", "ecc");
        private static final javax.xml.namespace.QName A$12 = 
            new javax.xml.namespace.QName("dave", "a");
        private static final javax.xml.namespace.QName REFX$14 = 
            new javax.xml.namespace.QName("dave", "refX");
        private static final javax.xml.namespace.QName REFY$16 = 
            new javax.xml.namespace.QName("dave", "refY");
        private static final javax.xml.namespace.QName REFZ$18 = 
            new javax.xml.namespace.QName("dave", "refZ");
        private static final javax.xml.namespace.QName ROCKETX$20 = 
            new javax.xml.namespace.QName("dave", "rocketX");
        private static final javax.xml.namespace.QName ROCKETY$22 = 
            new javax.xml.namespace.QName("dave", "rocketY");
        private static final javax.xml.namespace.QName ROCKETZ$24 = 
            new javax.xml.namespace.QName("dave", "rocketZ");
        private static final javax.xml.namespace.QName MOONX$26 = 
            new javax.xml.namespace.QName("dave", "moonX");
        private static final javax.xml.namespace.QName MOONY$28 = 
            new javax.xml.namespace.QName("dave", "moonY");
        private static final javax.xml.namespace.QName MOONZ$30 = 
            new javax.xml.namespace.QName("dave", "moonZ");
        
        
        /**
         * Gets the "refName" element
         */
        public java.lang.String getRefName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "refName" element
         */
        public org.apache.xmlbeans.XmlString xgetRefName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFNAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "refName" element
         */
        public void setRefName(java.lang.String refName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFNAME$0);
                }
                target.setStringValue(refName);
            }
        }
        
        /**
         * Sets (as xml) the "refName" element
         */
        public void xsetRefName(org.apache.xmlbeans.XmlString refName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFNAME$0);
                }
                target.set(refName);
            }
        }
        
        /**
         * Gets the "rPer" element
         */
        public double getRPer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RPER$2, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "rPer" element
         */
        public org.apache.xmlbeans.XmlDouble xgetRPer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(RPER$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "rPer" element
         */
        public void setRPer(double rPer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RPER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RPER$2);
                }
                target.setDoubleValue(rPer);
            }
        }
        
        /**
         * Sets (as xml) the "rPer" element
         */
        public void xsetRPer(org.apache.xmlbeans.XmlDouble rPer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(RPER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(RPER$2);
                }
                target.set(rPer);
            }
        }
        
        /**
         * Gets the "vPer" element
         */
        public double getVPer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VPER$4, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "vPer" element
         */
        public org.apache.xmlbeans.XmlDouble xgetVPer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(VPER$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "vPer" element
         */
        public void setVPer(double vPer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VPER$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VPER$4);
                }
                target.setDoubleValue(vPer);
            }
        }
        
        /**
         * Sets (as xml) the "vPer" element
         */
        public void xsetVPer(org.apache.xmlbeans.XmlDouble vPer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(VPER$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(VPER$4);
                }
                target.set(vPer);
            }
        }
        
        /**
         * Gets the "rAph" element
         */
        public double getRAph()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RAPH$6, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "rAph" element
         */
        public org.apache.xmlbeans.XmlDouble xgetRAph()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(RAPH$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "rAph" element
         */
        public void setRAph(double rAph)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RAPH$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RAPH$6);
                }
                target.setDoubleValue(rAph);
            }
        }
        
        /**
         * Sets (as xml) the "rAph" element
         */
        public void xsetRAph(org.apache.xmlbeans.XmlDouble rAph)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(RAPH$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(RAPH$6);
                }
                target.set(rAph);
            }
        }
        
        /**
         * Gets the "vAph" element
         */
        public double getVAph()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VAPH$8, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "vAph" element
         */
        public org.apache.xmlbeans.XmlDouble xgetVAph()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(VAPH$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "vAph" element
         */
        public void setVAph(double vAph)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VAPH$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VAPH$8);
                }
                target.setDoubleValue(vAph);
            }
        }
        
        /**
         * Sets (as xml) the "vAph" element
         */
        public void xsetVAph(org.apache.xmlbeans.XmlDouble vAph)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(VAPH$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(VAPH$8);
                }
                target.set(vAph);
            }
        }
        
        /**
         * Gets the "ecc" element
         */
        public double getEcc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ECC$10, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "ecc" element
         */
        public org.apache.xmlbeans.XmlDouble xgetEcc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ECC$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ecc" element
         */
        public void setEcc(double ecc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ECC$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ECC$10);
                }
                target.setDoubleValue(ecc);
            }
        }
        
        /**
         * Sets (as xml) the "ecc" element
         */
        public void xsetEcc(org.apache.xmlbeans.XmlDouble ecc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ECC$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(ECC$10);
                }
                target.set(ecc);
            }
        }
        
        /**
         * Gets the "a" element
         */
        public double getA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(A$12, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "a" element
         */
        public org.apache.xmlbeans.XmlDouble xgetA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(A$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "a" element
         */
        public void setA(double a)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(A$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(A$12);
                }
                target.setDoubleValue(a);
            }
        }
        
        /**
         * Sets (as xml) the "a" element
         */
        public void xsetA(org.apache.xmlbeans.XmlDouble a)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(A$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(A$12);
                }
                target.set(a);
            }
        }
        
        /**
         * Gets the "refX" element
         */
        public double getRefX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFX$14, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "refX" element
         */
        public org.apache.xmlbeans.XmlDouble xgetRefX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(REFX$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "refX" element
         */
        public void setRefX(double refX)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFX$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFX$14);
                }
                target.setDoubleValue(refX);
            }
        }
        
        /**
         * Sets (as xml) the "refX" element
         */
        public void xsetRefX(org.apache.xmlbeans.XmlDouble refX)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(REFX$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(REFX$14);
                }
                target.set(refX);
            }
        }
        
        /**
         * Gets the "refY" element
         */
        public double getRefY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFY$16, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "refY" element
         */
        public org.apache.xmlbeans.XmlDouble xgetRefY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(REFY$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "refY" element
         */
        public void setRefY(double refY)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFY$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFY$16);
                }
                target.setDoubleValue(refY);
            }
        }
        
        /**
         * Sets (as xml) the "refY" element
         */
        public void xsetRefY(org.apache.xmlbeans.XmlDouble refY)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(REFY$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(REFY$16);
                }
                target.set(refY);
            }
        }
        
        /**
         * Gets the "refZ" element
         */
        public double getRefZ()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFZ$18, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "refZ" element
         */
        public org.apache.xmlbeans.XmlDouble xgetRefZ()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(REFZ$18, 0);
                return target;
            }
        }
        
        /**
         * Sets the "refZ" element
         */
        public void setRefZ(double refZ)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFZ$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFZ$18);
                }
                target.setDoubleValue(refZ);
            }
        }
        
        /**
         * Sets (as xml) the "refZ" element
         */
        public void xsetRefZ(org.apache.xmlbeans.XmlDouble refZ)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(REFZ$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(REFZ$18);
                }
                target.set(refZ);
            }
        }
        
        /**
         * Gets the "rocketX" element
         */
        public double getRocketX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROCKETX$20, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "rocketX" element
         */
        public org.apache.xmlbeans.XmlDouble xgetRocketX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ROCKETX$20, 0);
                return target;
            }
        }
        
        /**
         * Sets the "rocketX" element
         */
        public void setRocketX(double rocketX)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROCKETX$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROCKETX$20);
                }
                target.setDoubleValue(rocketX);
            }
        }
        
        /**
         * Sets (as xml) the "rocketX" element
         */
        public void xsetRocketX(org.apache.xmlbeans.XmlDouble rocketX)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ROCKETX$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(ROCKETX$20);
                }
                target.set(rocketX);
            }
        }
        
        /**
         * Gets the "rocketY" element
         */
        public double getRocketY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROCKETY$22, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "rocketY" element
         */
        public org.apache.xmlbeans.XmlDouble xgetRocketY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ROCKETY$22, 0);
                return target;
            }
        }
        
        /**
         * Sets the "rocketY" element
         */
        public void setRocketY(double rocketY)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROCKETY$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROCKETY$22);
                }
                target.setDoubleValue(rocketY);
            }
        }
        
        /**
         * Sets (as xml) the "rocketY" element
         */
        public void xsetRocketY(org.apache.xmlbeans.XmlDouble rocketY)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ROCKETY$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(ROCKETY$22);
                }
                target.set(rocketY);
            }
        }
        
        /**
         * Gets the "rocketZ" element
         */
        public double getRocketZ()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROCKETZ$24, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "rocketZ" element
         */
        public org.apache.xmlbeans.XmlDouble xgetRocketZ()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ROCKETZ$24, 0);
                return target;
            }
        }
        
        /**
         * Sets the "rocketZ" element
         */
        public void setRocketZ(double rocketZ)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROCKETZ$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROCKETZ$24);
                }
                target.setDoubleValue(rocketZ);
            }
        }
        
        /**
         * Sets (as xml) the "rocketZ" element
         */
        public void xsetRocketZ(org.apache.xmlbeans.XmlDouble rocketZ)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ROCKETZ$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(ROCKETZ$24);
                }
                target.set(rocketZ);
            }
        }
        
        /**
         * Gets the "moonX" element
         */
        public double getMoonX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOONX$26, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "moonX" element
         */
        public org.apache.xmlbeans.XmlDouble xgetMoonX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MOONX$26, 0);
                return target;
            }
        }
        
        /**
         * Sets the "moonX" element
         */
        public void setMoonX(double moonX)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOONX$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOONX$26);
                }
                target.setDoubleValue(moonX);
            }
        }
        
        /**
         * Sets (as xml) the "moonX" element
         */
        public void xsetMoonX(org.apache.xmlbeans.XmlDouble moonX)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MOONX$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MOONX$26);
                }
                target.set(moonX);
            }
        }
        
        /**
         * Gets the "moonY" element
         */
        public double getMoonY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOONY$28, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "moonY" element
         */
        public org.apache.xmlbeans.XmlDouble xgetMoonY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MOONY$28, 0);
                return target;
            }
        }
        
        /**
         * Sets the "moonY" element
         */
        public void setMoonY(double moonY)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOONY$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOONY$28);
                }
                target.setDoubleValue(moonY);
            }
        }
        
        /**
         * Sets (as xml) the "moonY" element
         */
        public void xsetMoonY(org.apache.xmlbeans.XmlDouble moonY)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MOONY$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MOONY$28);
                }
                target.set(moonY);
            }
        }
        
        /**
         * Gets the "moonZ" element
         */
        public double getMoonZ()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOONZ$30, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "moonZ" element
         */
        public org.apache.xmlbeans.XmlDouble xgetMoonZ()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MOONZ$30, 0);
                return target;
            }
        }
        
        /**
         * Sets the "moonZ" element
         */
        public void setMoonZ(double moonZ)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOONZ$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOONZ$30);
                }
                target.setDoubleValue(moonZ);
            }
        }
        
        /**
         * Sets (as xml) the "moonZ" element
         */
        public void xsetMoonZ(org.apache.xmlbeans.XmlDouble moonZ)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MOONZ$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MOONZ$30);
                }
                target.set(moonZ);
            }
        }
    }
}
