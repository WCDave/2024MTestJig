package service.impl;

import domain.Circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import service.IVoronoiService;
import met.METAR;
import met.Response;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.*;
import java.util.List;


@Service
public class VoronoiServiceImpl implements IVoronoiService {

  enum Letters {
    A, B, C, D, E, F, G, H, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z
  };

  enum Countries {
    K,C
    ,T,M,P
  };

  @Autowired
  private RestTemplate restTemplate;

  @Override
  public List<Circle> generateCircles(List<Point2D> points) {
    return null;
  }

  @Override
  public List<Polygon> generatePolygons(List<Circle> circles) {
    return null;
  }

  @Override
  public List<METAR> callWebService() {
    List<METAR> resultList = new ArrayList<METAR>();
    String serviceURL = "http://www.aviationweather.gov/adds/dataserver_current/httpparam?";
    String serviceURL2 ="https://aviationweather.gov/api/data/metar";
    final Map<String, String> urlVariables = new HashMap<String, String>();

//    SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
//    StreamSource ss = new StreamSource(VoronoiServiceImpl.class.getResourceAsStream("/xsds/metar1_2.xsd"));
//
//    Schema schema = null;
//    Unmarshaller unmarshaller = null;
//    try {
//      schema = sf.newSchema(ss);
//      JAXBContext jaxbContext = JAXBContext.newInstance("jaxb");
//
//      unmarshaller = jaxbContext.createUnmarshaller();
//      unmarshaller.setSchema(schema);
//      unmarshaller.setEventHandler(new ValidationEventHandler() {
//        @Override
//        public boolean handleEvent(ValidationEvent event) {
//          System.out.println(event.getMessage());
//          return true;
//        }
//      });
//
//    } catch (Exception e) {
//      e.printStackTrace();
//    }

//    urlVariables.put("dataSource", "metars");
//    urlVariables.put("requestType", "retrieve");
    urlVariables.put("format", "xml");
    urlVariables.put("hoursBeforeNow", "1");
    urlVariables.put("taf", "false");
    //UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(serviceURL);

//    for(String key : urlVariables.keySet()) {
//      builder.queryParam(key, urlVariables.get(key));
//    }



    for(Countries c : Countries.values()) {
      String countryLetter = c.toString();
      UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(serviceURL2);

      for(String key : urlVariables.keySet()) {
        builder.queryParam(key, urlVariables.get(key));
      }
      String finalStationStaring="";
      for (Letters letter : Letters.values()) {
        String letterString = letter.toString();
        finalStationStaring += countryLetter+letterString+" ";
      }

      try {
        builder.queryParam("ids", finalStationStaring);
        String urlString = builder.build().toUriString();
        ResponseEntity<Response> re = restTemplate.getForEntity(urlString, Response.class);
        resultList.addAll(re.getBody().getData().getMETAR());
      } catch (Exception e) {
        e.printStackTrace();
      }

    }
    return resultList;
  }

  @Override
  public Circle createCircle(Point2D.Float p1, Point2D.Float p2, Point2D.Float p3) {

    Set<Point2D.Float> pointSet = new HashSet<Point2D.Float>(Arrays.asList(p1, p2, p3));

    float mr = (p2.y - p1.y) / (p2.x - p1.x);
    float mt = (p3.y - p2.y) / (p3.x - p2.x);
    float x = (mr*mt*(p3.y-p1.y) + mr*(p2.x+p3.x) - mt*(p1.x+p2.x)) / (2*(mr-mt));
    float y = (p1.y+p2.y)/2 - (x - (p1.x+p2.x)/2) / mr;

    float radius = (float) Math.sqrt((p1.x - x) * (p1.x - x) + (p1.y - y) * (p1.y - y));
    Circle circle = null;
    if(radius <= Float.MAX_VALUE) {
      circle = new Circle(x, y, radius, pointSet);
    }
    return circle;

  }
}
