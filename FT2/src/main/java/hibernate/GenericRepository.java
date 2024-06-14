package hibernate;

import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.dialect.Dialect;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.impl.SessionFactoryImpl;
import org.hibernate.type.DbTimestampType;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class GenericRepository extends HibernateDaoSupport {
	
	public Timestamp getDBTime()
	{
		//Date result = (Date)getHibernateTemplate().find("current_time()").get(0);
		DbTimestampType type = new DbTimestampType();
		Timestamp ts = (Timestamp) type.seed((SessionImplementor)getSession());
		SessionFactoryImpl x = (SessionFactoryImpl)getSession().getSessionFactory();
		Dialect d = x.getDialect();

		return ts;
	}
	
	public void saveOrUpdate(Object o)
	{
		getHibernateTemplate().saveOrUpdate(o);
	}
	
	public Object get(Class<?> c, Long key)
	{
		return getHibernateTemplate().get(c, key);
	}
	
	public void deleteAll(Collection<?> c)
	{
		getHibernateTemplate().deleteAll(c);
	}
	
	public List<?> find(String s)
	{
		List<?> result =  getHibernateTemplate().find(s);
		return result;
	}	
	
	public void initialize(Class<?> c, Object o, String... lazyInitedCollectionGetterNames)
	{
		Session sess = getSession();
		for(String s:lazyInitedCollectionGetterNames)
		{
			try {
				Method m = c.getDeclaredMethod(s, (Class<?>[]) null);
				sess.lock(o, LockMode.NONE);
				Hibernate.initialize(m.invoke(o, (Object[])null));
			} catch (Exception e) {}
		}
		sess.close();
	}
}
