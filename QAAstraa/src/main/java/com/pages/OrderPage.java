package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage {

	private  WebDriver driver;

	private By searchbox= By.xpath("//input[@placeholder='Search for items and brands']");
	private By searchbutton= By.xpath("//div[@class='header-search ra-search-form search-type-form-cat search-form-type form-type-form-cat']//button[@type='submit']//span[@class='razzi-svg-icon ']/*[name()='svg']");
	private By slctprdt= By.linkText("iPhone 13 Mini, SIM Free");
	private By incrsqty= By.xpath("//div[@class='summary entry-summary']//span[@class='razzi-svg-icon razzi-qty-button increase']//*[name()='svg']");
	private By addtocrt= By.xpath("//*[@id='product-6831']/div[2]/div[2]/form/div/button");
	private By chckout= By.linkText("Checkout");
	private By frstname= By.name("billing_first_name");
	private By lstname=By.name("billing_last_name");
	private By ctry= By.name("billing_country");
	private By address= By.name("billing_address_1");
	private By unitno= By.name("billing_address_2");
	private By city= By.name("billing_city");
	private By state= By.name("billing_state");
	private By postalcode= By.name("billing_postcode");
	private By phonenumber= By.name("billing_phone");
	private By email=By.name("billing_email");
	private By ordernote= By.xpath("//textarea[@id='order_comments']");
	private By plceorder= By.id("place_order");
    private By errormsg= By.xpath("//form[@name='checkout']/div[1]");
	public OrderPage(WebDriver driver) {   //Giving value to the driver
		this.driver=driver;
	}


	// Creating getter methods
	public WebElement searchbox() {
		return driver.findElement(searchbox);
	}

	public WebElement searchbutton() {
		return driver.findElement(searchbutton);
	}

	public WebElement slctprdt() {
		return driver.findElement(slctprdt);
	}

	public WebElement incrsqty() {
		return driver.findElement(incrsqty);
	}

	public WebElement addtocrt() {
		return driver.findElement(addtocrt);
	}

	public WebElement chckout() {
		return driver.findElement(chckout);
	}

	public WebElement frstname() {
		return driver.findElement(frstname);
	}

	public WebElement lstname() {
		return driver.findElement(lstname);
	}

	public WebElement ctry() {
		return driver.findElement(ctry);
	}

	public WebElement address() {
		return driver.findElement(address);
	}

	public WebElement unitno() {
		return driver.findElement(unitno);
	}

	public WebElement city() {
		return driver.findElement(city);
	}

	public WebElement state() {
		return driver.findElement(state);
	}

	public WebElement postalcode() {
		return driver.findElement(postalcode);
	}

	public WebElement phonenumber() {
		return driver.findElement(phonenumber);
	}

	public WebElement email() {
		return driver.findElement(email);
	}

	public WebElement ordernote() {
		return driver.findElement(ordernote);
	}
	
	public WebElement placeorder() {
		return driver.findElement(plceorder);
	}
	
	public boolean errormsg() {
		return driver.findElement(errormsg).isDisplayed();
	}
	
	public String errormsgs() {
		return driver.findElement(errormsg).getText();
	}




















}
