package domain;

import hibernate.GenericRepository;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class GenericFacade {

	//@Autowired
	private GenericRepository genericRepository;

	public GenericFacade() {

	}

	@Transactional(readOnly = true)
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional(readOnly = false)
	public void saveOrUpdate(Object o)
	{
		genericRepository.saveOrUpdate(o);
	}
	
	@Transactional(readOnly = true)
	public Object get(Class c, Long key)
	{
		return genericRepository.get(c, key);
	}

	public void setGenericRepository(GenericRepository genericRepository) {
		this.genericRepository = genericRepository;
	}
	
	@Transactional(readOnly = false, propagation = Propagation.NOT_SUPPORTED)
	public void deleteAll(Collection c)
	{
		genericRepository.deleteAll(c);
	}
	
	@Transactional(readOnly = false)
	public List find(String s)
	{
		return genericRepository.find(s);
	}
	
	
	@Transactional(readOnly = false)
	public void initialize(Class<?> c, Object o, String... methodNames)
	{
		genericRepository.initialize(c, o, methodNames);
	}

	
	public HibernateTemplate getHibernateTemplate()
	{
		return genericRepository.getHibernateTemplate();
	}

}
