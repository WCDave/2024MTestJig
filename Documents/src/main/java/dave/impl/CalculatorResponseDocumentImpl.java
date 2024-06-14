/*
 * An XML document type.
 * Localname: CalculatorResponse
 * Namespace: dave
 * Java type: dave.CalculatorResponseDocument
 *
 * Automatically generated - do not modify.
 */
package dave.impl;
/**
 * A document containing one CalculatorResponse(@dave) element.
 *
 * This is a complex type.
 */
public class CalculatorResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dave.CalculatorResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CalculatorResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALCULATORRESPONSE$0 = 
        new javax.xml.namespace.QName("dave", "CalculatorResponse");
    
    
    /**
     * Gets the "CalculatorResponse" element
     */
    public double getCalculatorResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALCULATORRESPONSE$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "CalculatorResponse" element
     */
    public org.apache.xmlbeans.XmlDouble xgetCalculatorResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(CALCULATORRESPONSE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CalculatorResponse" element
     */
    public void setCalculatorResponse(double calculatorResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALCULATORRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALCULATORRESPONSE$0);
            }
            target.setDoubleValue(calculatorResponse);
        }
    }
    
    /**
     * Sets (as xml) the "CalculatorResponse" element
     */
    public void xsetCalculatorResponse(org.apache.xmlbeans.XmlDouble calculatorResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(CALCULATORRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(CALCULATORRESPONSE$0);
            }
            target.set(calculatorResponse);
        }
    }
}
