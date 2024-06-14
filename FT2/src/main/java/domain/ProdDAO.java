package domain;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class ProdDAO extends HibernateDaoSupport {
	
	public void execute (){
		List<Product> result = (List<Product>) getHibernateTemplate().find("from Product");
		Product p = result.get(0);
		p.setProductname("kk");
		//getHibernateTemplate().save(p);
		int h=6;
	}

}
