package jmsStuff;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.net.URI;

import java.util.*;

@Component("rest")
public class RocketConsoleREST implements IRocketData {

  private RestTemplate restTemplate = new RestTemplate();
  private static final Logger log = Logger.getLogger(RocketConsoleREST.class);

  @Autowired
  @Value(value = "${webService.url}/rest")
  private String serviceURL ;

  @Override
  public Map getRocketData() {

    ResponseEntity<Map> re = restTemplate.getForEntity(serviceURL+"/rocketData/rd", java.util.Map.class);
    Object o = new Object() {
      public String getString(){
        return "xx";
      }
    };
    Object ro = restTemplate.postForObject(serviceURL+"/rocketData/rd", o, Object.class);
    log.debug("rest ws call "+re.getBody().size());

    return re.getBody();
  }
}
