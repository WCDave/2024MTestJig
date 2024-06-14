package jmsStuff;

import jmsStuff.IRocketData;
import jmsStuff.RocketConsole2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml" })
public class RocketConsole2Test {

    @Autowired
    @Qualifier("c2")
    private IRocketData rocketConsole2;

    @Autowired
    @Qualifier("rest")
    private IRocketData restConsole;

    @Test
    public void testGetRocketData() {
        Map resultMap = rocketConsole2.getRocketData();
    }

  @Test
  public void testRestRocketData() {
    Map resultMap = restConsole.getRocketData();
    assertEquals(17, resultMap.size());
  }
}