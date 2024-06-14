/*
 * An XML document type.
 * Localname: sky_condition
 * Namespace: met
 * Java type: met.SkyConditionDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one sky_condition(@met) element.
 *
 * This is a complex type.
 */
public class SkyConditionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.SkyConditionDocument
{
    private static final long serialVersionUID = 1L;
    
    public SkyConditionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SKYCONDITION$0 = 
        new javax.xml.namespace.QName("met", "sky_condition");
    
    
    /**
     * Gets the "sky_condition" element
     */
    public met.SkyConditionDocument.SkyCondition getSkyCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.SkyConditionDocument.SkyCondition target = null;
            target = (met.SkyConditionDocument.SkyCondition)get_store().find_element_user(SKYCONDITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sky_condition" element
     */
    public void setSkyCondition(met.SkyConditionDocument.SkyCondition skyCondition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.SkyConditionDocument.SkyCondition target = null;
            target = (met.SkyConditionDocument.SkyCondition)get_store().find_element_user(SKYCONDITION$0, 0);
            if (target == null)
            {
                target = (met.SkyConditionDocument.SkyCondition)get_store().add_element_user(SKYCONDITION$0);
            }
            target.set(skyCondition);
        }
    }
    
    /**
     * Appends and returns a new empty "sky_condition" element
     */
    public met.SkyConditionDocument.SkyCondition addNewSkyCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.SkyConditionDocument.SkyCondition target = null;
            target = (met.SkyConditionDocument.SkyCondition)get_store().add_element_user(SKYCONDITION$0);
            return target;
        }
    }
    /**
     * An XML sky_condition(@met).
     *
     * This is a complex type.
     */
    public static class SkyConditionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.SkyConditionDocument.SkyCondition
    {
        private static final long serialVersionUID = 1L;
        
        public SkyConditionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SKYCOVER$0 = 
            new javax.xml.namespace.QName("", "sky_cover");
        private static final javax.xml.namespace.QName CLOUDBASEFTAGL$2 = 
            new javax.xml.namespace.QName("", "cloud_base_ft_agl");
        
        
        /**
         * Gets the "sky_cover" attribute
         */
        public java.lang.String getSkyCover()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SKYCOVER$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sky_cover" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSkyCover()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SKYCOVER$0);
                return target;
            }
        }
        
        /**
         * True if has "sky_cover" attribute
         */
        public boolean isSetSkyCover()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SKYCOVER$0) != null;
            }
        }
        
        /**
         * Sets the "sky_cover" attribute
         */
        public void setSkyCover(java.lang.String skyCover)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SKYCOVER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SKYCOVER$0);
                }
                target.setStringValue(skyCover);
            }
        }
        
        /**
         * Sets (as xml) the "sky_cover" attribute
         */
        public void xsetSkyCover(org.apache.xmlbeans.XmlString skyCover)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SKYCOVER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SKYCOVER$0);
                }
                target.set(skyCover);
            }
        }
        
        /**
         * Unsets the "sky_cover" attribute
         */
        public void unsetSkyCover()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SKYCOVER$0);
            }
        }
        
        /**
         * Gets the "cloud_base_ft_agl" attribute
         */
        public int getCloudBaseFtAgl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLOUDBASEFTAGL$2);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "cloud_base_ft_agl" attribute
         */
        public org.apache.xmlbeans.XmlInt xgetCloudBaseFtAgl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CLOUDBASEFTAGL$2);
                return target;
            }
        }
        
        /**
         * True if has "cloud_base_ft_agl" attribute
         */
        public boolean isSetCloudBaseFtAgl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CLOUDBASEFTAGL$2) != null;
            }
        }
        
        /**
         * Sets the "cloud_base_ft_agl" attribute
         */
        public void setCloudBaseFtAgl(int cloudBaseFtAgl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLOUDBASEFTAGL$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLOUDBASEFTAGL$2);
                }
                target.setIntValue(cloudBaseFtAgl);
            }
        }
        
        /**
         * Sets (as xml) the "cloud_base_ft_agl" attribute
         */
        public void xsetCloudBaseFtAgl(org.apache.xmlbeans.XmlInt cloudBaseFtAgl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(CLOUDBASEFTAGL$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(CLOUDBASEFTAGL$2);
                }
                target.set(cloudBaseFtAgl);
            }
        }
        
        /**
         * Unsets the "cloud_base_ft_agl" attribute
         */
        public void unsetCloudBaseFtAgl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CLOUDBASEFTAGL$2);
            }
        }
    }
}
