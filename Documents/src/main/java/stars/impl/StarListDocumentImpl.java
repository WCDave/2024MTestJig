/*
 * An XML document type.
 * Localname: star-list
 * Namespace: stars
 * Java type: stars.StarListDocument
 *
 * Automatically generated - do not modify.
 */
package stars.impl;
/**
 * A document containing one star-list(@stars) element.
 *
 * This is a complex type.
 */
public class StarListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements stars.StarListDocument
{
    private static final long serialVersionUID = 1L;
    
    public StarListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARLIST$0 = 
        new javax.xml.namespace.QName("stars", "star-list");
    
    
    /**
     * Gets the "star-list" element
     */
    public stars.StarListDocument.StarList getStarList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            stars.StarListDocument.StarList target = null;
            target = (stars.StarListDocument.StarList)get_store().find_element_user(STARLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "star-list" element
     */
    public void setStarList(stars.StarListDocument.StarList starList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            stars.StarListDocument.StarList target = null;
            target = (stars.StarListDocument.StarList)get_store().find_element_user(STARLIST$0, 0);
            if (target == null)
            {
                target = (stars.StarListDocument.StarList)get_store().add_element_user(STARLIST$0);
            }
            target.set(starList);
        }
    }
    
    /**
     * Appends and returns a new empty "star-list" element
     */
    public stars.StarListDocument.StarList addNewStarList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            stars.StarListDocument.StarList target = null;
            target = (stars.StarListDocument.StarList)get_store().add_element_user(STARLIST$0);
            return target;
        }
    }
    /**
     * An XML star-list(@stars).
     *
     * This is a complex type.
     */
    public static class StarListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements stars.StarListDocument.StarList
    {
        private static final long serialVersionUID = 1L;
        
        public StarListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STAR$0 = 
            new javax.xml.namespace.QName("stars", "star");
        
        
        /**
         * Gets array of all "star" elements
         */
        public stars.StarType[] getStarArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STAR$0, targetList);
                stars.StarType[] result = new stars.StarType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "star" element
         */
        public stars.StarType getStarArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                stars.StarType target = null;
                target = (stars.StarType)get_store().find_element_user(STAR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "star" element
         */
        public int sizeOfStarArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STAR$0);
            }
        }
        
        /**
         * Sets array of all "star" element
         */
        public void setStarArray(stars.StarType[] starArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(starArray, STAR$0);
            }
        }
        
        /**
         * Sets ith "star" element
         */
        public void setStarArray(int i, stars.StarType star)
        {
            synchronized (monitor())
            {
                check_orphaned();
                stars.StarType target = null;
                target = (stars.StarType)get_store().find_element_user(STAR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(star);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "star" element
         */
        public stars.StarType insertNewStar(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                stars.StarType target = null;
                target = (stars.StarType)get_store().insert_element_user(STAR$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "star" element
         */
        public stars.StarType addNewStar()
        {
            synchronized (monitor())
            {
                check_orphaned();
                stars.StarType target = null;
                target = (stars.StarType)get_store().add_element_user(STAR$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "star" element
         */
        public void removeStar(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STAR$0, i);
            }
        }
    }
}
