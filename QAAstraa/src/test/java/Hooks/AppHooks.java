package Hooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.Base;
import com.utilites.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

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
	
	@After(order=0)
	public void teardown() {
	Base.getdriver().quit();
	}
	
	@After(order=1)
	public void screenshot(Scenario scenario) {
	if(scenario.isFailed()) {
		String screenshotName= scenario.getName().replaceAll("", "_");
		byte [] sourcePath= ((TakesScreenshot)Base.getdriver()).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcePath, "img/png", screenshotName);
	}
		
	}
	}



