package tests;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.Assert;

import org.hibernate.LazyInitializationException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.ConfigurationManager;
import domain.GenericFacade;
import domain.Provider;
import domain.Request;
import domain.RequestItem;
import domain.RequestItemDetail;
import domain.RequestItemDetailProviderUse;
import domain.RequestProviderUse;
import domain.Use;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:GenericTest-context.xml" })
public class RPUTest {

	
	@Autowired
	private ApplicationContext appContext;
	
	@Autowired
	private GenericFacade genericFacade;
	
	@SuppressWarnings("unused")
	@Before
	public void setUp() throws Exception {

		ConfigurationManager confMgr = (ConfigurationManager) appContext
				.getBean("configMgr");
	}
	
	@SuppressWarnings({ "unchecked", "unused" })
	@Test
	public void testDupProvUse()
	{
		
		Provider p1 = (Provider) genericFacade.get(Provider.class, new Long(1));
		Provider p2 = (Provider) genericFacade.get(Provider.class, new Long(2));
		
		List<Request> requestList = genericFacade.find("from domain.Request");
		List<RequestProviderUse> requestProvUseList = genericFacade.find("from domain.RequestProviderUse");
		
		RequestItemDetailProviderUse ridUse = new RequestItemDetailProviderUse();
		
		Request r = new Request();
		r.setId("Joe");
		genericFacade.saveOrUpdate(r);
		
		RequestItem ri = new RequestItem();
		ri.setRequest(r);
		r.getRequestItems().add(ri);
		genericFacade.saveOrUpdate(ri);
		
		RequestItemDetail rid = new RequestItemDetail();
		rid.setRequestItem(ri);
		ri.getRequestItemDetails().add(rid);
		genericFacade.saveOrUpdate(rid);
		
		
		ridUse.setProvider(p2);
		Use use = (Use) genericFacade.get(Use.class, new Long(2));
		ridUse.setUse(use);
		ridUse.setRequestItemDetail(rid);
		
		RequestProviderUse rUse = new RequestProviderUse();
		rUse.setProvider(p1);
		rUse.setUse(use);
		rUse.setRequest(r);
		
		
		genericFacade.saveOrUpdate(ridUse);
		genericFacade.saveOrUpdate(rUse);
		
		ridUse = new RequestItemDetailProviderUse();
		ridUse.setProvider(p1);
		ridUse.setRequestItemDetail(rid);
		ridUse.setUse(use);
		try {
			genericFacade.saveOrUpdate(ridUse);
			Assert.fail();
		}
		catch(Exception e)
		{}
		
		rUse = new RequestProviderUse();
		rUse.setProvider(p2);
		rUse.setUse(use);
		rUse.setRequest(r);
		
		try {
			genericFacade.saveOrUpdate(rUse);
			Assert.fail();
		}
		catch(Exception e)
		{}
	}
	
	@Test
    @org.junit.Ignore
	public void lazyInitTest()
	{
		Request r = new Request();
		r.setId("Joe");
		genericFacade.saveOrUpdate(r);
		
		Long rPid = r.getPid();
		
		RequestItem ri = new RequestItem();
		ri.setRequest(r);
		r.getRequestItems().add(ri);
		genericFacade.saveOrUpdate(ri);
		
		ri = new RequestItem();
		ri.setRequest(r);
		genericFacade.saveOrUpdate(ri);		
		
		Request r2 = genericFacade.getHibernateTemplate().get(Request.class, rPid);
		try
		{
			List<RequestItem> ril = r2.getRequestItems();
			RequestItem riTest = ril.get(1);
			Assert.fail();
		}
		catch(LazyInitializationException e)
		{}
		
		genericFacade.initialize(Request.class, r2, "getRequestItems", "eatMe");
		List<RequestItem> ril = r2.getRequestItems();
		RequestItem riTest = ril.get(1);	
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@After
	public void tearDown()
	{
		List rdpul = genericFacade.find("from RequestItemDetailProviderUse");
		genericFacade.deleteAll(rdpul);
		
		List rpul = genericFacade.find("from RequestProviderUse");
		genericFacade.deleteAll(rpul);	
		
		List<RequestItemDetail> ridl = genericFacade.find("from RequestItemDetail");
		
		List ril = genericFacade.find("from RequestItem");
		List<Request> rl = genericFacade.find("from Request");
		Request rq = rl.get(0);
				
		genericFacade.deleteAll(ridl);			
		genericFacade.deleteAll(ril);
		genericFacade.deleteAll(rl);		
	}
}
