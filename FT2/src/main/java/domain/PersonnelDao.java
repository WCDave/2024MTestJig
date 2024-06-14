package domain;

import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class PersonnelDao extends HibernateDaoSupport {
	

	public List<Employee> findAllEmployees(){
		List<Employee> result = null;		
		Query queryObject = this.getSessionFactory().getCurrentSession().createQuery("from Employee");
		result = queryObject.list();
		return result;		
	}
	
	public List<Customer> findAllCustomers()
	{
		List<Customer> result = null;
		Query queryObject = this.getSessionFactory().getCurrentSession().createQuery("from Customer");
		result = queryObject.list();
		return result;		
	}
	
	public List<Office> findAllOffices()
	{
		List<Office> result = null;
		Query queryObject = this.getSessionFactory().getCurrentSession().createQuery("from Office");
		result = queryObject.list();
		return result;
	}
	
	public void saveAddress(Address address)
	{
		getSession().save(address);
	}	
	
	public Office addOffice(Office office) {
		Office result = null;
    this.getSessionFactory().getCurrentSession().saveOrUpdate(office);
    this.getSessionFactory().getCurrentSession().flush();
		return office;
		
	}
	
	public void deleteAllAddresses(Collection<Address> c)
	{
		getHibernateTemplate().deleteAll(c);
    this.getSessionFactory().getCurrentSession().evict(c);
		getHibernateTemplate().flush();
	}
	
	public void deleteOffice(Office office) {
		
		//getSession().createQuery("delete from Office where city='West Chester'").executeUpdate();
    this.getSessionFactory().getCurrentSession().delete(office);
		//getSession().createQuery("delete from ProductLine where pid >=8").executeUpdate();
	}
	
	public void saveOffice(Office office) {
		// TODO Auto-generated method stub
		
	}
	
	public Office retrieveOffice(Employee emp)
	{
		Office result = null;
		Long pid = emp.getOffice().getPid();
		Criteria c = this.getSessionFactory().getCurrentSession().createCriteria(Office.class).add(Restrictions.eq("pid", pid));
		result = (Office)c.uniqueResult();
		return result;
	}

}
