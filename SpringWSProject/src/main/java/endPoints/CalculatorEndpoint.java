package endPoints;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;


@Endpoint
public class CalculatorEndpoint {
	
	//private static final String namespaceUri = "http://sandBoxWS.com/";
	private static final String namespaceUri ="dave";
	
//	@PayloadRoot(localPart="CalculatorRequest", namespace=namespaceUri)
//	public CalculatorResponseDocument doCalculation(CalculatorRequestDocument addRequest)
//	{
//		float x = addRequest.getCalculatorRequest().getFirstOperand();
//		float y = addRequest.getCalculatorRequest().getSecondOperand();
//		Operation.Enum op = addRequest.getCalculatorRequest().getOperation();
//		CalculatorResponseDocument response = CalculatorResponseDocument.Factory.newInstance();
//		switch(op.intValue())
//		{
//			case 1:response.setCalculatorResponse(x+y);break;
//			case 2:response.setCalculatorResponse(x-y);break;
//			case 3:response.setCalculatorResponse(x*y);break;
//			case 4:response.setCalculatorResponse(x/y);break;
//		}
//				
//		return response;
//	}

}
