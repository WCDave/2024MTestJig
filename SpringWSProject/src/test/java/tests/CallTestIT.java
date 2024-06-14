//package tests;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.ws.client.core.WebServiceTemplate;
//
//import dave.RocketDataRequestDocument;
//import dave.RocketDataResponseDocument;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"classpath*:test-applicationContext.xml" })
//public class CallTestIT {
//
//	@Autowired
//	@Qualifier(value = "webServiceTemplate")
//	private WebServiceTemplate webServiceTemplate;
//
//	public CallTestIT()
//	{
//
//	}
//	
//	@Test
//	public void testIt()
//	{
//		RocketDataRequestDocument request = RocketDataRequestDocument.Factory.newInstance();
//		request.setRocketDataRequest(null);
//		RocketDataResponseDocument response = (RocketDataResponseDocument) webServiceTemplate.marshalSendAndReceive(request);
//		System.out.println("*** "+response.getRocketDataResponse().getRefName());
//
//	}
//}
