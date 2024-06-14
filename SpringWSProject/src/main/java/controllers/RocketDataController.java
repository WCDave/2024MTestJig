package controllers;

import dave.RocketDataResponseDocument;
import enums.OrbitElementKeys;
import jms.RocketConsole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

@RestController
@RequestMapping("/rocketData/*")
public class RocketDataController extends ResponseEntityExceptionHandler {

  @Autowired
  private RocketConsole rocketConsole;

  @CrossOrigin(origins = "http://localhost:8081")
  @RequestMapping(value = "/rd", method = RequestMethod.GET) //, headers="Access-Control-Allow-Origin=*")//, headers = {"Accept=*/*", "content-type=*/*"} )
  public ResponseEntity<Map> getGreeting(HttpServletResponse response, @RequestParam(value = "x", required = false, defaultValue = "World")String x) {
    Map dataMap = rocketConsole.getRocketData();
    if(x.equals("REACT"))  dataMap.remove(OrbitElementKeys.locMap);
    //linkTo(RocketDataController.class).slash("getGreeting").toUri();
    linkTo(methodOn(RocketDataController.class).getGreeting(null,"hello")).toUri();
//    HttpHeaders headers = new HttpHeaders();
//    headers.add("Access-Control-Allow-Origin","*");
    ResponseEntity<Map> result = new ResponseEntity<Map>(dataMap,  HttpStatus.OK);
    return result;
  }

  @CrossOrigin
  @RequestMapping(value = "/rd", method = RequestMethod.POST, headers = {"Accept=*/*", "Content-Type=*/*"} )
  public ResponseEntity<Map> postGreeting(@RequestParam(value = "x", required = false, defaultValue = "World")String x, @RequestBody Object  o) {
    Map dataMap = rocketConsole.getRocketData();
    if(x.equals("REACT"))  dataMap.remove(OrbitElementKeys.locMap);
    //linkTo(RocketDataController.class).slash("getGreeting").toUri();
    linkTo(methodOn(RocketDataController.class).getGreeting(null,"hello")).toUri();
    HttpHeaders headers = new HttpHeaders();
    headers.add("Access-Control-Allow-Origin","*");
    ResponseEntity<Map> result = new ResponseEntity<Map>(dataMap, headers, HttpStatus.OK);
    return result;
  }

  @CrossOrigin(origins = "http://localhost:8081")
  @RequestMapping(value = "/orbElements", method = RequestMethod.GET)
  public ResponseEntity getOrbitElementData() {
    Map dataMap = rocketConsole.getOrbElements();
    ResponseEntity result = new ResponseEntity(dataMap,  HttpStatus.OK);
    return result;
  }




    @ExceptionHandler({Exception.class, RuntimeException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleNoHandlerFound(Exception e, WebRequest request) {
      System.out.println("sssss");
    }


}
