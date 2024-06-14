/*
 * XML Type:  addit
 * Namespace: http://sandBoxWS.com/
 * Java type: com.sandBoxWS.Addit
 *
 * Automatically generated - do not modify.
 */
package com.sandBoxWS.impl;
/**
 * An XML addit(@http://sandBoxWS.com/).
 *
 * This is a complex type.
 */
public class AdditImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sandBoxWS.Addit
{
    private static final long serialVersionUID = 1L;
    
    public AdditImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARG0$0 = 
        new javax.xml.namespace.QName("", "arg0");
    private static final javax.xml.namespace.QName ARG1$2 = 
        new javax.xml.namespace.QName("", "arg1");
    
    
    /**
     * Gets the "arg0" element
     */
    public int getArg0()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG0$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "arg0" element
     */
    public org.apache.xmlbeans.XmlInt xgetArg0()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ARG0$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "arg0" element
     */
    public void setArg0(int arg0)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG0$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARG0$0);
            }
            target.setIntValue(arg0);
        }
    }
    
    /**
     * Sets (as xml) the "arg0" element
     */
    public void xsetArg0(org.apache.xmlbeans.XmlInt arg0)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ARG0$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ARG0$0);
            }
            target.set(arg0);
        }
    }
    
    /**
     * Gets the "arg1" element
     */
    public int getArg1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG1$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "arg1" element
     */
    public org.apache.xmlbeans.XmlInt xgetArg1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ARG1$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "arg1" element
     */
    public void setArg1(int arg1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG1$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARG1$2);
            }
            target.setIntValue(arg1);
        }
    }
    
    /**
     * Sets (as xml) the "arg1" element
     */
    public void xsetArg1(org.apache.xmlbeans.XmlInt arg1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ARG1$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ARG1$2);
            }
            target.set(arg1);
        }
    }
}
