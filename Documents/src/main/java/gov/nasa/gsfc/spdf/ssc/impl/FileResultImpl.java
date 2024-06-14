/*
 * XML Type:  fileResult
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.FileResult
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML fileResult(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class FileResultImpl extends gov.nasa.gsfc.spdf.ssc.impl.ResultImpl implements gov.nasa.gsfc.spdf.ssc.FileResult
{
    private static final long serialVersionUID = 1L;
    
    public FileResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName URLS$0 = 
        new javax.xml.namespace.QName("", "urls");
    
    
    /**
     * Gets array of all "urls" elements
     */
    public java.lang.String[] getUrlsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(URLS$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "urls" element
     */
    public java.lang.String getUrlsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URLS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "urls" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetUrlsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(URLS$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "urls" element
     */
    public org.apache.xmlbeans.XmlString xgetUrlsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URLS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Tests for nil ith "urls" element
     */
    public boolean isNilUrlsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URLS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "urls" element
     */
    public int sizeOfUrlsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URLS$0);
        }
    }
    
    /**
     * Sets array of all "urls" element
     */
    public void setUrlsArray(java.lang.String[] urlsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(urlsArray, URLS$0);
        }
    }
    
    /**
     * Sets ith "urls" element
     */
    public void setUrlsArray(int i, java.lang.String urls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URLS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(urls);
        }
    }
    
    /**
     * Sets (as xml) array of all "urls" element
     */
    public void xsetUrlsArray(org.apache.xmlbeans.XmlString[]urlsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(urlsArray, URLS$0);
        }
    }
    
    /**
     * Sets (as xml) ith "urls" element
     */
    public void xsetUrlsArray(int i, org.apache.xmlbeans.XmlString urls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URLS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(urls);
        }
    }
    
    /**
     * Nils the ith "urls" element
     */
    public void setNilUrlsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URLS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "urls" element
     */
    public void insertUrls(int i, java.lang.String urls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(URLS$0, i);
            target.setStringValue(urls);
        }
    }
    
    /**
     * Appends the value as the last "urls" element
     */
    public void addUrls(java.lang.String urls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URLS$0);
            target.setStringValue(urls);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "urls" element
     */
    public org.apache.xmlbeans.XmlString insertNewUrls(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(URLS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "urls" element
     */
    public org.apache.xmlbeans.XmlString addNewUrls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URLS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "urls" element
     */
    public void removeUrls(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URLS$0, i);
        }
    }
}
