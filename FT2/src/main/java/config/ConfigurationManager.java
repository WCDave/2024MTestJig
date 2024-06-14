                                                                                                
package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

public class ConfigurationManager extends Properties {
	
	private static ConfigurationManager instance;
	private static Logger log = Logger.getLogger(ConfigurationManager.class);	
	
	private ConfigurationManager(){
		super();
		init();
		
	}

	private void init() { 
		log.debug("Config file loading");
		
		String configFilePath = System.getProperties().getProperty("dave.config.file",".");

		InputStream in  = null;
		boolean usingXML = true;
		try {
			in = new FileInputStream(configFilePath);
		} catch (FileNotFoundException e1) {
			try {
				usingXML = false;
				log.warn("No config.xml file found...trying config.properties");
				System.out.println("No config.xml file found...trying config.properties");
				in = new FileInputStream("Config.properties");
			} catch (FileNotFoundException e) {
				log.warn("No config.properties file found");
			}
		}
		
		try {
			if (in != null) {
				if(usingXML) {		
					log.debug("using "+configFilePath);
					loadFromXML(in);				
				}
				else {
					log.debug("using Config.properties");
					load(in);
				}
			}
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			if (in!=null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				in=null;
			}
		}
	}
	
	public static ConfigurationManager getInstance(){
		if(instance==null) {
			instance = new ConfigurationManager();
		}
		return instance;
	}

//	@Bean
//  public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
//	  PropertySourcesPlaceholderConfigurer x = new PropertySourcesPlaceholderConfigurer();
//	  x.setProperties(getInstance());
//    return  x;
//  }
}
