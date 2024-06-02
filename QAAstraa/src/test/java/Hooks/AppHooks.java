package Hooks;

import java.io.IOException;
import java.util.Properties;

import com.base.Base;
import com.utilites.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {
	
	
	private ConfigReader configreader;
	private Properties prop;
	private Base base;
	
	@Before(order=1)
	public void getProperty() throws IOException {
		configreader= new ConfigReader();
		prop= configreader.init_prop();
	}
	
	@Before(order=2)
	public void openBrowser() {
		String browser= prop.getProperty("browser");
		base= new Base();
		base.init_driver(browser);
	
		
	}
	
	@After
	public void teardown() {
	base.getdriver().quit();
	}

}

