package beans.control;

import hibernate.GenericRepository;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;
import javax.resource.spi.work.Work;
import javax.resource.spi.work.WorkAdapter;
import javax.resource.spi.work.WorkException;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jca.work.jboss.JBossWorkManagerTaskExecutor;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.jsf.FacesContextUtils;

import com.icesoft.faces.context.effects.Effect;
import com.icesoft.faces.context.effects.Highlight;

import domain.Address;
import domain.Customer;
import domain.Employee;
import domain.IPurchaseorderDAO;
import domain.Office;
import domain.Orderdetail;
import domain.OrderdetailDAO;
import domain.OrderdetailId;
import domain.Payment;
import domain.PersonnelFacade;
import domain.Product;
import domain.ProductDAO;
import domain.ProductLine;
import domain.Purchaseorder;

public class MainControllerBean {
	
	private Effect valueChangeEffect = new Highlight("#ffcc99");
	private List<String> pageHistory;
	
	@Autowired
	private ProductDAO prodDao;
	
	@Autowired
	private IPurchaseorderDAO poDao;
	
	@Autowired
	private OrderdetailDAO orderDetDAO;
	
	@Autowired
	private PersonnelFacade personnelFacade;
	
	private String selectedPage = "rocketData.jspx";
	
	public MainControllerBean()
	{
		pageHistory = new ArrayList<String>();
	}
	
	public List<SelectItem> getPages(){
		List<SelectItem> resultList = new ArrayList<SelectItem>();
		
		resultList.add(new SelectItem("rocketData.jspx","Rocket"));
		resultList.add(new SelectItem("MyJsp.jspx","Wx"));
		resultList.add(new SelectItem("index.jspx","XXX"));
		resultList.add(new SelectItem("geneDataComp.jspx","Gene"));
		return resultList;
	}
	
	
	public void effectChangeListener(ValueChangeEvent evt)
	{
		valueChangeEffect.setFired(false);
		pageHistory.add((String)evt.getOldValue());
	}

	public void setSelectedPage(String selectedPage) {
		this.selectedPage = selectedPage;
	}

	public String getSelectedPage() {
		return selectedPage;
	}

	public void setValueChangeEffect(Effect valueChangeEffect) {
		this.valueChangeEffect = valueChangeEffect;
	}

	public Effect getValueChangeEffect() {
		return valueChangeEffect;
	}
	
	public List<String> getPageHistoryList()
	{
		return pageHistory;
	}
	
	public void setPageHistoryList(List<String> list)
	{
		
	}
	
	public void breadCrumbChangeListener(ActionEvent evt) throws WorkException
	{
		
		WebApplicationContext ctx = FacesContextUtils.getWebApplicationContext(FacesContext.getCurrentInstance());
		GenericRepository repo = (GenericRepository)ctx.getBean("genericRepository");
		Timestamp dt = repo.getDBTime();
		int offsetdb  = dt.getTimezoneOffset();
		Timestamp st = new Timestamp(new Date().getTime());
		int offsetas = dt.getTimezoneOffset();
		long x = dt.getTime()-st.getTime();
		System.out.println(new Date(x));
		
		List<Product> result = prodDao.findAll();
		//List<Orderdetail> result1 = orderDetDAO.findAll();
		List<Purchaseorder> result2 = poDao.findAll();
		
		List<Payment> result3 = poDao.findAllPaymentsForCustomer(null);
		
		List<ProductLine> result4 = poDao.findAllProductLine();
		
		Orderdetail detail = orderDetDAO.findById(new OrderdetailId(10101,"S18_2325"));
		Purchaseorder po = detail.getPurchaseorder();
		Hibernate.initialize(po);
		List<Orderdetail> aList = po.getOrderdetails();
		
		ProductLine pl = result4.get(0);
		
		List <Employee> list = personnelFacade.findAllEmployees();
		
		List<Customer> custList = personnelFacade.findAllCustomers();
		
		List<Office> offices = personnelFacade.findAllOffices();
		
		Office off = new Office();
		Address addr = new Address();
		addr.setAddressline1("1111");
		addr.setAddressline2("2222");
		addr.setCity("West Chester");
		addr.setCountry("USA");
		addr.setPostalcode("19380");
		addr.setState("PA");
		addr.setAddressType("BUS");		
		off.getAddresses().add(addr);
		
		addr = new Address();
		addr.setAddressline1("2222");
		addr.setAddressline2("3333");
		addr.setCity("West Chester");
		addr.setCountry("USA");
		addr.setPostalcode("19382");
		addr.setState("PA");
		addr.setAddressType("BUS");
		
		off.getAddresses().add(addr);
		off.setCity(addr.getCity());
		off.setTerritory("NA");
		off.setEntityName(off.getCity());
		off.setPhone("1-610-436-4738");
		off.setDOB(new Date());
		personnelFacade.addOffice(off);

    if(offices.size() > 4) {
      try {
        Office off1 = personnelFacade.retrieveOffice((Employee) offices.get(3).getEmployees().toArray()[0]);
      }
      catch(Exception e){}
    }
		offices = personnelFacade.findAllOffices();
		personnelFacade.deleteAllAddresses(off.getAddresses());
		for(Office off2:offices)
		{
			if("West Chester".equalsIgnoreCase(off2.getCity().trim()))
			{
				personnelFacade.deleteOffice(off2);
			}
		}		
		 
		
		String id = (String) evt.getComponent().getAttributes().get("pageName");
		int pageIndx = Integer.parseInt(id.trim());
		selectedPage = pageHistory.get(pageIndx);
		int start = pageHistory.size()-1;
		while(start >= pageIndx)
		{
			pageHistory.remove(start--);
		}
//		JBossWorkManagerTaskExecutor wmTe = (JBossWorkManagerTaskExecutor)ctx.getBean("wmTaskExecutor");
//		WorkAdapter wa = (WorkAdapter)ctx.getBean("wrkListener");
//		wmTe.doWork(new Work(){
//
//
//			public void run() {
//				WebApplicationContext ctx = FacesContextUtils.getWebApplicationContext(FacesContext.getCurrentInstance());
//				GenericRepository repo = (GenericRepository)ctx.getBean("genericRepository");
//				Timestamp dt = repo.getDBTime();
//				System.out.println("************************WORKru "+dt.toString()+" "+this.getClass());
//
//			}
//
//
//			public void release() {
//				System.out.println("************************WORKre");
//
//			}
//
//		});
	}
}
