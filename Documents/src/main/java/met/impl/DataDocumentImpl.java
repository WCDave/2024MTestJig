/*
 * An XML document type.
 * Localname: data
 * Namespace: met
 * Java type: met.DataDocument
 *
 * Automatically generated - do not modify.
 */
package met.impl;
/**
 * A document containing one data(@met) element.
 *
 * This is a complex type.
 */
public class DataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.DataDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATA$0 = 
        new javax.xml.namespace.QName("met", "data");
    
    
    /**
     * Gets the "data" element
     */
    public met.DataDocument.Data getData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.DataDocument.Data target = null;
            target = (met.DataDocument.Data)get_store().find_element_user(DATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "data" element
     */
    public void setData(met.DataDocument.Data data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.DataDocument.Data target = null;
            target = (met.DataDocument.Data)get_store().find_element_user(DATA$0, 0);
            if (target == null)
            {
                target = (met.DataDocument.Data)get_store().add_element_user(DATA$0);
            }
            target.set(data);
        }
    }
    
    /**
     * Appends and returns a new empty "data" element
     */
    public met.DataDocument.Data addNewData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            met.DataDocument.Data target = null;
            target = (met.DataDocument.Data)get_store().add_element_user(DATA$0);
            return target;
        }
    }
    /**
     * An XML data(@met).
     *
     * This is a complex type.
     */
    public static class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements met.DataDocument.Data
    {
        private static final long serialVersionUID = 1L;
        
        public DataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName METAR$0 = 
            new javax.xml.namespace.QName("met", "METAR");
        private static final javax.xml.namespace.QName NUMRESULTS$2 = 
            new javax.xml.namespace.QName("", "num_results");
        
        
        /**
         * Gets array of all "METAR" elements
         */
        public met.METARDocument.METAR[] getMETARArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(METAR$0, targetList);
                met.METARDocument.METAR[] result = new met.METARDocument.METAR[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "METAR" element
         */
        public met.METARDocument.METAR getMETARArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                met.METARDocument.METAR target = null;
                target = (met.METARDocument.METAR)get_store().find_element_user(METAR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "METAR" element
         */
        public int sizeOfMETARArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(METAR$0);
            }
        }
        
        /**
         * Sets array of all "METAR" element
         */
        public void setMETARArray(met.METARDocument.METAR[] metarArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(metarArray, METAR$0);
            }
        }
        
        /**
         * Sets ith "METAR" element
         */
        public void setMETARArray(int i, met.METARDocument.METAR metar)
        {
            synchronized (monitor())
            {
                check_orphaned();
                met.METARDocument.METAR target = null;
                target = (met.METARDocument.METAR)get_store().find_element_user(METAR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(metar);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "METAR" element
         */
        public met.METARDocument.METAR insertNewMETAR(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                met.METARDocument.METAR target = null;
                target = (met.METARDocument.METAR)get_store().insert_element_user(METAR$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "METAR" element
         */
        public met.METARDocument.METAR addNewMETAR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                met.METARDocument.METAR target = null;
                target = (met.METARDocument.METAR)get_store().add_element_user(METAR$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "METAR" element
         */
        public void removeMETAR(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(METAR$0, i);
            }
        }
        
        /**
         * Gets the "num_results" attribute
         */
        public int getNumResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMRESULTS$2);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "num_results" attribute
         */
        public org.apache.xmlbeans.XmlInt xgetNumResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(NUMRESULTS$2);
                return target;
            }
        }
        
        /**
         * True if has "num_results" attribute
         */
        public boolean isSetNumResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NUMRESULTS$2) != null;
            }
        }
        
        /**
         * Sets the "num_results" attribute
         */
        public void setNumResults(int numResults)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMRESULTS$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMRESULTS$2);
                }
                target.setIntValue(numResults);
            }
        }
        
        /**
         * Sets (as xml) the "num_results" attribute
         */
        public void xsetNumResults(org.apache.xmlbeans.XmlInt numResults)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(NUMRESULTS$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(NUMRESULTS$2);
                }
                target.set(numResults);
            }
        }
        
        /**
         * Unsets the "num_results" attribute
         */
        public void unsetNumResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NUMRESULTS$2);
            }
        }
    }
}
