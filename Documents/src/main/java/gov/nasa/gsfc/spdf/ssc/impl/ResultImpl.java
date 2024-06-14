/*
 * XML Type:  result
 * Namespace: http://ssc.spdf.gsfc.nasa.gov/
 * Java type: gov.nasa.gsfc.spdf.ssc.Result
 *
 * Automatically generated - do not modify.
 */
package gov.nasa.gsfc.spdf.ssc.impl;
/**
 * An XML result(@http://ssc.spdf.gsfc.nasa.gov/).
 *
 * This is a complex type.
 */
public class ResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nasa.gsfc.spdf.ssc.Result
{
    private static final long serialVersionUID = 1L;
    
    public ResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUSCODE$0 = 
        new javax.xml.namespace.QName("", "statusCode");
    private static final javax.xml.namespace.QName STATUSSUBCODE$2 = 
        new javax.xml.namespace.QName("", "statusSubCode");
    private static final javax.xml.namespace.QName STATUSTEXT$4 = 
        new javax.xml.namespace.QName("", "statusText");
    
    
    /**
     * Gets the "statusCode" element
     */
    public gov.nasa.gsfc.spdf.ssc.ResultStatusCode.Enum getStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (gov.nasa.gsfc.spdf.ssc.ResultStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "statusCode" element
     */
    public gov.nasa.gsfc.spdf.ssc.ResultStatusCode xgetStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.ResultStatusCode target = null;
            target = (gov.nasa.gsfc.spdf.ssc.ResultStatusCode)get_store().find_element_user(STATUSCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "statusCode" element
     */
    public boolean isSetStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "statusCode" element
     */
    public void setStatusCode(gov.nasa.gsfc.spdf.ssc.ResultStatusCode.Enum statusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSCODE$0);
            }
            target.setEnumValue(statusCode);
        }
    }
    
    /**
     * Sets (as xml) the "statusCode" element
     */
    public void xsetStatusCode(gov.nasa.gsfc.spdf.ssc.ResultStatusCode statusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.ResultStatusCode target = null;
            target = (gov.nasa.gsfc.spdf.ssc.ResultStatusCode)get_store().find_element_user(STATUSCODE$0, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.ResultStatusCode)get_store().add_element_user(STATUSCODE$0);
            }
            target.set(statusCode);
        }
    }
    
    /**
     * Unsets the "statusCode" element
     */
    public void unsetStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSCODE$0, 0);
        }
    }
    
    /**
     * Gets the "statusSubCode" element
     */
    public gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode.Enum getStatusSubCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSSUBCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "statusSubCode" element
     */
    public gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode xgetStatusSubCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode target = null;
            target = (gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode)get_store().find_element_user(STATUSSUBCODE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "statusSubCode" element
     */
    public boolean isSetStatusSubCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSSUBCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "statusSubCode" element
     */
    public void setStatusSubCode(gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode.Enum statusSubCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSSUBCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSSUBCODE$2);
            }
            target.setEnumValue(statusSubCode);
        }
    }
    
    /**
     * Sets (as xml) the "statusSubCode" element
     */
    public void xsetStatusSubCode(gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode statusSubCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode target = null;
            target = (gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode)get_store().find_element_user(STATUSSUBCODE$2, 0);
            if (target == null)
            {
                target = (gov.nasa.gsfc.spdf.ssc.ResultStatusSubCode)get_store().add_element_user(STATUSSUBCODE$2);
            }
            target.set(statusSubCode);
        }
    }
    
    /**
     * Unsets the "statusSubCode" element
     */
    public void unsetStatusSubCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSSUBCODE$2, 0);
        }
    }
    
    /**
     * Gets array of all "statusText" elements
     */
    public java.lang.String[] getStatusTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STATUSTEXT$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "statusText" element
     */
    public java.lang.String getStatusTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "statusText" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetStatusTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STATUSTEXT$4, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "statusText" element
     */
    public org.apache.xmlbeans.XmlString xgetStatusTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Tests for nil ith "statusText" element
     */
    public boolean isNilStatusTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "statusText" element
     */
    public int sizeOfStatusTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSTEXT$4);
        }
    }
    
    /**
     * Sets array of all "statusText" element
     */
    public void setStatusTextArray(java.lang.String[] statusTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(statusTextArray, STATUSTEXT$4);
        }
    }
    
    /**
     * Sets ith "statusText" element
     */
    public void setStatusTextArray(int i, java.lang.String statusText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUSTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(statusText);
        }
    }
    
    /**
     * Sets (as xml) array of all "statusText" element
     */
    public void xsetStatusTextArray(org.apache.xmlbeans.XmlString[]statusTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(statusTextArray, STATUSTEXT$4);
        }
    }
    
    /**
     * Sets (as xml) ith "statusText" element
     */
    public void xsetStatusTextArray(int i, org.apache.xmlbeans.XmlString statusText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(statusText);
        }
    }
    
    /**
     * Nils the ith "statusText" element
     */
    public void setNilStatusTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUSTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts the value as the ith "statusText" element
     */
    public void insertStatusText(int i, java.lang.String statusText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STATUSTEXT$4, i);
            target.setStringValue(statusText);
        }
    }
    
    /**
     * Appends the value as the last "statusText" element
     */
    public void addStatusText(java.lang.String statusText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUSTEXT$4);
            target.setStringValue(statusText);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "statusText" element
     */
    public org.apache.xmlbeans.XmlString insertNewStatusText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(STATUSTEXT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "statusText" element
     */
    public org.apache.xmlbeans.XmlString addNewStatusText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUSTEXT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "statusText" element
     */
    public void removeStatusText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSTEXT$4, i);
        }
    }
}
