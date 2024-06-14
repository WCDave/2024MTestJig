package endPoints;


import dave.RocketDataRequestDocument;
import dave.RocketDataResponseDocument;
import enums.OrbitElementKeys;
import jms.RocketConsole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;

import java.util.Map;

@Endpoint
public class RocketDataEndpoint {

	@Autowired
    RocketConsole rocketConsole;
	
	private ApplicationContext appContext;
	//private static final String namespaceUri = "http://sandBoxWS.com/";
		private static final String namespaceUri ="dave";
		
		@PayloadRoot(localPart="RocketDataRequest", namespace=namespaceUri)
		public RocketDataResponseDocument getRocketData(RocketDataRequestDocument request) {
			
			Map dataMap = rocketConsole.getRocketData();
			RocketDataResponseDocument responseDoc = RocketDataResponseDocument.Factory.newInstance();

            RocketDataResponseDocument.RocketDataResponse data = responseDoc.addNewRocketDataResponse();
            data.setA((Double) dataMap.get(OrbitElementKeys.a));
            data.setEcc((Double) dataMap.get(OrbitElementKeys.ecc));
            data.setRAph((Double) dataMap.get(OrbitElementKeys.rAph));
            data.setVAph((Double) dataMap.get(OrbitElementKeys.vAph));
            data.setRPer((Double) dataMap.get(OrbitElementKeys.rPer));
            data.setVPer((Double) dataMap.get(OrbitElementKeys.vPer));
            data.setRefX((Double) dataMap.get(OrbitElementKeys.refX));
            data.setRefY((Double) dataMap.get(OrbitElementKeys.refY));
            data.setRefZ((Double) dataMap.get(OrbitElementKeys.refZ));
            data.setRocketX((Double) dataMap.get(OrbitElementKeys.rocketX));
            data.setRocketY((Double) dataMap.get(OrbitElementKeys.rocketY));
            data.setRocketZ((Double) dataMap.get(OrbitElementKeys.rocketZ));
            data.setRefName((String) dataMap.get(OrbitElementKeys.refName));

            Map locMap = ((Map)dataMap.get(OrbitElementKeys.locMap));
            double[] moonPos = (double[])(locMap.get("Moon"));
            data.setMoonX(moonPos[0]);
            data.setMoonY(moonPos[1]);
            data.setMoonZ(moonPos[2]);
            responseDoc.setRocketDataResponse(data);
			return responseDoc;
		}
}
