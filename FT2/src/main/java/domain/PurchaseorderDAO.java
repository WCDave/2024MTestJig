package domain;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * A data access object (DAO) providing persistence and search support for
 * Purchaseorder entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see domain.Purchaseorder
 * @author MyEclipse Persistence Tools
 */

public class PurchaseorderDAO extends HibernateDaoSupport implements IPurchaseorderDAO {
	private static final Logger log = Logger
			.getLogger(PurchaseorderDAO.class);
	// property constants
	public static final String STATUS = "status";
	public static final String COMMENTS = "comments";
	public static final String CUSTOMERNUMBER = "customernumber";

	public void save(Purchaseorder transientInstance) {
		log.debug("saving Purchaseorder instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Purchaseorder persistentInstance) {
		log.debug("deleting Purchaseorder instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Purchaseorder findById(java.lang.Integer id) {
		log.debug("getting Purchaseorder instance with id: " + id);
		try {
			Purchaseorder instance = (Purchaseorder) getSession().get(
					"domain.Purchaseorder", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Purchaseorder instance) {
		log.debug("finding Purchaseorder instance by example");
		try {
			List results = getSession().createCriteria("domain.Purchaseorder")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Purchaseorder instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Purchaseorder as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findByComments(Object comments) {
		return findByProperty(COMMENTS, comments);
	}

	public List findByCustomernumber(Object customernumber) {
		return findByProperty(CUSTOMERNUMBER, customernumber);
	}

	@Transactional(readOnly=true)
	public List findAll() {
		log.debug("finding all Purchaseorder instances");
		try {
			String queryString = "from Purchaseorder";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Purchaseorder merge(Purchaseorder detachedInstance) {
		log.debug("merging Purchaseorder instance");
		try {
			Purchaseorder result = (Purchaseorder) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Purchaseorder instance) {
		log.debug("attaching dirty Purchaseorder instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Purchaseorder instance) {
		log.debug("attaching clean Purchaseorder instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	
	@Transactional(readOnly=true)
	public List findAllPayments() {
		log.debug("finding all Purchaseorder instances");
		try {
			String queryString = "from Payment";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
	@Transactional(readOnly=true)
	public List findAllPaymentsForCustomer(Customer customer) {
		log.debug("finding all Payments for customer");
		try {
			Long customerNumber = new Long(103);
			Criteria c = getSession().createCriteria(Payment.class).add(Restrictions.eq("customerNumber", customerNumber));
			List result = c.list();
			return result;
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
	@Transactional(readOnly=false, propagation = Propagation.REQUIRED)
	public List findAllProductLine() {
		log.debug("finding all ProductLine");
		try {
			Orderdetail o = getHibernateTemplate().get(Orderdetail.class, new OrderdetailId(10101,"S18_2325"));
			Purchaseorder x = o.getPurchaseorder();
			Hibernate.initialize(x.getOrderdetails());
			int y = x.getPurchaseordernumber();
			x.getOrderdetails();
			//Hibernate.initialize(t);
			String queryString = "from ProductLine";
			Session sess = getSession();
			Query queryObject = sess.createQuery(queryString);
			List<ProductLine> list = queryObject.list();
//			long idx = 1;
//
//			for(ProductLine pl:list)
//			{
//				pl.setPid(new Long(idx++));
//				//sess.saveOrUpdate(pl);
//			}
			Hibernate.initialize(list.get(0).getProducts());
			return list;
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
	@Transactional(readOnly=false)
	public void saveProductLine(ProductLine pl)
	{
		getSession().saveOrUpdate(pl);
	}
}