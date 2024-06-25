package jmsStuff;

//import jaxb.RocketDataRequest;
import enums.OrbitElementKeys;
import rocket.RocketDataRequest;
import rocket.RocketDataResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.util.HashMap;
import java.util.Map;

@Component("c2")
public class RocketConsole2 implements IRocketData {

    @Autowired
    private WebServiceTemplate webServiceTemplate;

    @Override
    public Map getRocketData() {
       RocketDataRequest request = new RocketDataRequest();

        RocketDataResponse result = (RocketDataResponse) webServiceTemplate.marshalSendAndReceive(request);
        Map resultMap = new HashMap();
        resultMap.put(OrbitElementKeys.rPer, new Double(result.getRPer()));
        resultMap.put(OrbitElementKeys.vPer, new Double(result.getVPer()));
        resultMap.put(OrbitElementKeys.rAph, new Double(result.getRAph()));
        resultMap.put(OrbitElementKeys.vAph, new Double(result.getVAph()));
        resultMap.put(OrbitElementKeys.ecc, result.getEcc());
        resultMap.put(OrbitElementKeys.a, result.getVAph());
        resultMap.put(OrbitElementKeys.refX, new Double(result.getRefX()));
        resultMap.put(OrbitElementKeys.refY, new Double(result.getRefY()));
        resultMap.put(OrbitElementKeys.refZ, new Double(result.getRefZ()));
        resultMap.put(OrbitElementKeys.refName, result.getRefName());
        resultMap.put(OrbitElementKeys.rocketX, new Double(result.getRocketX()));
        resultMap.put(OrbitElementKeys.rocketY, new Double(result.getRocketY()));
        resultMap.put(OrbitElementKeys.rocketZ, new Double(result.getRocketZ()));
        Map locMap = new HashMap();
        locMap.put("Moon", new double[]{result.getMoonX(), result.getMoonY(), result.getMoonZ()});
        resultMap.put(OrbitElementKeys.locMap, locMap);
        return resultMap;
    }
}
