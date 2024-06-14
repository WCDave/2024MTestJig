package domain;

import java.util.List;

public interface IPurchaseorderDAO {	

		void save(Purchaseorder transientInstance);

		void delete(Purchaseorder persistentInstance);

		Purchaseorder findById(java.lang.Integer id);

		List findByExample(Purchaseorder instance);

		List findByProperty(String propertyName, Object value);

		List findByStatus(Object status);

		List findByComments(Object comments);

		List findByCustomernumber(Object customernumber);
		
		List findAll();

		Purchaseorder merge(Purchaseorder detachedInstance);

		void attachDirty(Purchaseorder instance);

		void attachClean(Purchaseorder instance);
		
		List findAllPayments();
		
		List findAllPaymentsForCustomer(Customer customer);
		
		List findAllProductLine();
		
		void saveProductLine(ProductLine pl);

}
