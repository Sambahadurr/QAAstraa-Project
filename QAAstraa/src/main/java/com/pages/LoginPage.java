package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private  WebDriver driver;

	private By prsnicon= By.xpath("//a[@class='account-icon']//span[@class='razzi-svg-icon ']//*[name()='svg']");
	private By username= By.name("username");
	private By password=By.name("password");
	private By signin= By.name("login");
	private By frgtpass= By.linkText("Lost your password?");
	private By errormsg= By.xpath("//ul[@class='error-message']/li");
	
	public LoginPage(WebDriver driver) {   //Giving value to the driver
		this.driver=driver;
		}

	
	// Creating getter methods
	public String gettitle() {
		return driver.getTitle();
	}
	public WebElement getprsnicon() {
		return driver.findElement(prsnicon);
	}
	public WebElement getusername() {
		return driver.findElement(username);
	}
	public WebElement getpassword() {
		return driver.findElement(password);
	}
	public WebElement getsignin() {
		return driver.findElement(signin);
	}
	public boolean frgtpass() {
		return driver.findElement(frgtpass).isDisplayed();
	}
	public boolean geterrormsg() {
		return driver.findElement(errormsg).isDisplayed();
	}
	public String geterrormsgs() {
		return driver.findElement(errormsg).getText();
	}
}
