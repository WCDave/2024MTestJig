package orbitService;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import domain.SolarSystemObject;
import orbitDataDao.IOrbitData;
import orbitService.impl.OrbitCalcImpl2;


@RunWith(SpringJUnit4ClassRunner.class)
// ApplicationContext will be loaded from "/applicationContext.xml"
// in the root of the classpath
@ContextConfiguration({"classpath*:/spring/*-appContext.xml"})
public class OrbitCalcImpl2Test {

    IOrbitCalc iut = new OrbitCalcImpl2();

    @Autowired
    @Qualifier("orbitDataDaoImpl2")
    IOrbitData orbitDao;

    @BeforeClass
    public static void setUp() throws Exception {


    }
    

    @Test
    public void testComputeMA() throws Exception {

    }

    @Test
    public void testComputeTA() throws Exception {


        List<SolarSystemObject> objs = orbitDao.loadPlanetData();
        SolarSystemObject earth = objs.get(0);

        double old = 0;
        for(int i=0;i<365;i++) {
            iut.computeTA(earth, i);
            System.out.println("ta="+Math.toDegrees(earth.getTrueAnamoly())+"      "+earth.getHelioPositionVec()[0]+" "+earth.getHelioPositionVec()[1]+" "+earth.getHelioPositionVec()[2]);
            System.out.println("deltaTA="+Math.abs(Math.toDegrees(earth.getTrueAnamoly())-old));
            old =  Math.toDegrees(earth.getTrueAnamoly());
        }
    }

    @Test
    public void testGetHelioCoordsForAngle() throws Exception {

    }
}
