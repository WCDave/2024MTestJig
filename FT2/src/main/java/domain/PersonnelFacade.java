package domain;

import java.util.Collection;
import java.util.List;

public interface PersonnelFacade {
	
	List<Employee> findAllEmployees();
	
	List<Customer> findAllCustomers();
	
	void saveAddress(Address address);
	
	List<Office> findAllOffices();
	
	Office addOffice(Office office);
	
	void deleteOffice(Office office);
	
	void saveOffice(Office office);
	
	Office retrieveOffice(Employee emp);
	
	void deleteAllAddresses(Collection<Address> addrs);

}
