package domain;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public class PersonnelFacadeImpl implements PersonnelFacade {
	
	private PersonnelDao personnelDao;


	
	@Transactional(readOnly=true )
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
    try {
      return personnelDao.findAllEmployees();
    }
    catch(Exception e) {return Collections.EMPTY_LIST;}
	}
	
	
	/* (non-Javadoc)
	 * @see domain.PersonnelFacade#findAllCustomers()
	 */
	@Transactional(readOnly=false)
	public List<Customer> findAllCustomers() {
		List<Customer> result = personnelDao.findAllCustomers();
		
		return result;
	}
	
	@Transactional(readOnly=false)
	public void saveAddress(Address address)
	{
		personnelDao.saveAddress(address);
	}
	
	@Transactional(readOnly=false)
	public List<Office> findAllOffices()
	{
		List<Office> result = null;
    try {
      result = personnelDao.findAllOffices();
    }
    catch(Exception e) { return Collections.EMPTY_LIST;}

		return result;
	}
	
	
	public void setPersonnelDao(PersonnelDao personnelDao) {
		this.personnelDao = personnelDao;
	}


	@Transactional(readOnly=false)
	public Office addOffice(Office office) {
		return personnelDao.addOffice(office);		
	}


	@Transactional(readOnly=false)
	public void deleteOffice(Office office) {
		personnelDao.deleteOffice(office);		
	}


	@Transactional(readOnly=false)
	public void saveOffice(Office office) {
		personnelDao.saveOffice(office);		
	}


	@Transactional(readOnly=true)
	public Office retrieveOffice(Employee emp) {
		return personnelDao.retrieveOffice(emp);
	}


	@Transactional(readOnly=false)
	public void deleteAllAddresses(Collection<Address> addrs) {
		personnelDao.deleteAllAddresses(addrs);
		
	}
		
}
