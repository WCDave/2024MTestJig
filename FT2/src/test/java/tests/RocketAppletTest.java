package tests;

import java.awt.Graphics;

import javax.annotation.Resource;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import applets.RocketTracker;
import config.ConfigurationManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:GenericTest-context.xml" })
public class RocketAppletTest {

	private Mockery context = new Mockery() {
		{
			setImposteriser(ClassImposteriser.INSTANCE);
		}
	};

	RocketTracker applet = context.mock(RocketTracker.class);
	Graphics gMock = context.mock(Graphics.class);
	
	@Resource
	HibernateTemplate hibernateTemplate;

	@Autowired
	ApplicationContext appContext;

	@Before
	public void setUp() throws Exception {

		ConfigurationManager confMgr = (ConfigurationManager) appContext
				.getBean("configMgr");

	}

	@Test
	public void testUpdateGraphics() {
		context.checking(new Expectations() {
			{
				oneOf (applet).update(with(gMock));
			}
			});
		applet.update(gMock);

	}

}

//