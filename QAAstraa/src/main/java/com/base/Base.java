package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public WebDriver driver;

	public static ThreadLocal<WebDriver> tdriver= new ThreadLocal<WebDriver>();

	public WebDriver init_driver (String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			tdriver.set(new ChromeDriver(option));
		} else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tdriver.set(new FirefoxDriver());
		} else 
			System.out.println("Please provide correct browser information");

		getdriver().manage().window().maximize();
		return getdriver();
	}

	public  WebDriver getdriver() {
		return tdriver.get();
	}

}
