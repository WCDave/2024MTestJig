/*
 * An XML document type.
 * Localname: CalculatorRequest
 * Namespace: dave
 * Java type: dave.CalculatorRequestDocument
 *
 * Automatically generated - do not modify.
 */
package dave.impl;
/**
 * A document containing one CalculatorRequest(@dave) element.
 *
 * This is a complex type.
 */
public class CalculatorRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dave.CalculatorRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public CalculatorRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALCULATORREQUEST$0 = 
        new javax.xml.namespace.QName("dave", "CalculatorRequest");
    
    
    /**
     * Gets the "CalculatorRequest" element
     */
    public dave.CalculatorRequestDocument.CalculatorRequest getCalculatorRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dave.CalculatorRequestDocument.CalculatorRequest target = null;
            target = (dave.CalculatorRequestDocument.CalculatorRequest)get_store().find_element_user(CALCULATORREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CalculatorRequest" element
     */
    public void setCalculatorRequest(dave.CalculatorRequestDocument.CalculatorRequest calculatorRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dave.CalculatorRequestDocument.CalculatorRequest target = null;
            target = (dave.CalculatorRequestDocument.CalculatorRequest)get_store().find_element_user(CALCULATORREQUEST$0, 0);
            if (target == null)
            {
                target = (dave.CalculatorRequestDocument.CalculatorRequest)get_store().add_element_user(CALCULATORREQUEST$0);
            }
            target.set(calculatorRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CalculatorRequest" element
     */
    public dave.CalculatorRequestDocument.CalculatorRequest addNewCalculatorRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dave.CalculatorRequestDocument.CalculatorRequest target = null;
            target = (dave.CalculatorRequestDocument.CalculatorRequest)get_store().add_element_user(CALCULATORREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CalculatorRequest(@dave).
     *
     * This is a complex type.
     */
    public static class CalculatorRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dave.CalculatorRequestDocument.CalculatorRequest
    {
        private static final long serialVersionUID = 1L;
        
        public CalculatorRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIRSTOPERAND$0 = 
            new javax.xml.namespace.QName("", "firstOperand");
        private static final javax.xml.namespace.QName SECONDOPERAND$2 = 
            new javax.xml.namespace.QName("", "secondOperand");
        private static final javax.xml.namespace.QName OPERATION$4 = 
            new javax.xml.namespace.QName("", "operation");
        
        
        /**
         * Gets the "firstOperand" element
         */
        public float getFirstOperand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTOPERAND$0, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "firstOperand" element
         */
        public org.apache.xmlbeans.XmlFloat xgetFirstOperand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(FIRSTOPERAND$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "firstOperand" element
         */
        public void setFirstOperand(float firstOperand)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTOPERAND$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRSTOPERAND$0);
                }
                target.setFloatValue(firstOperand);
            }
        }
        
        /**
         * Sets (as xml) the "firstOperand" element
         */
        public void xsetFirstOperand(org.apache.xmlbeans.XmlFloat firstOperand)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(FIRSTOPERAND$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(FIRSTOPERAND$0);
                }
                target.set(firstOperand);
            }
        }
        
        /**
         * Gets the "secondOperand" element
         */
        public float getSecondOperand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDOPERAND$2, 0);
                if (target == null)
                {
                    return 0.0f;
                }
                return target.getFloatValue();
            }
        }
        
        /**
         * Gets (as xml) the "secondOperand" element
         */
        public org.apache.xmlbeans.XmlFloat xgetSecondOperand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(SECONDOPERAND$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "secondOperand" element
         */
        public void setSecondOperand(float secondOperand)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDOPERAND$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECONDOPERAND$2);
                }
                target.setFloatValue(secondOperand);
            }
        }
        
        /**
         * Sets (as xml) the "secondOperand" element
         */
        public void xsetSecondOperand(org.apache.xmlbeans.XmlFloat secondOperand)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlFloat target = null;
                target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(SECONDOPERAND$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(SECONDOPERAND$2);
                }
                target.set(secondOperand);
            }
        }
        
        /**
         * Gets the "operation" element
         */
        public dave.Operation.Enum getOperation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return (dave.Operation.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "operation" element
         */
        public dave.Operation xgetOperation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                dave.Operation target = null;
                target = (dave.Operation)get_store().find_element_user(OPERATION$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "operation" element
         */
        public void setOperation(dave.Operation.Enum operation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATION$4);
                }
                target.setEnumValue(operation);
            }
        }
        
        /**
         * Sets (as xml) the "operation" element
         */
        public void xsetOperation(dave.Operation operation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                dave.Operation target = null;
                target = (dave.Operation)get_store().find_element_user(OPERATION$4, 0);
                if (target == null)
                {
                    target = (dave.Operation)get_store().add_element_user(OPERATION$4);
                }
                target.set(operation);
            }
        }
    }
}
