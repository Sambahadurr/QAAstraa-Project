package StepDef;

import org.junit.Assert;

import com.base.Base;
import com.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef extends Base {
	
	LoginPage lp=new LoginPage(getdriver());
	
	public String title;
	public String error;
	
	@Given("User is on QAAstraa page") 
		public void User_is_on_QAAstraa_page() {
		getdriver().get("http://qa-astraa.com");
			
		}
	
	@When("User get the title of the QA Astraa page")
	public void user_get_the_title_of_the_qa_astraa_page() {
	    title=lp.gettitle();
	    System.out.println("The title of the page is:" +title);
	    
		
	}
	@Then("User should get page title as {string}")
	public void user_should_get_page_title_as(String expectedtitle) {
		System.out.println("The expected title of the page is:" +expectedtitle);
		Assert.assertEquals(expectedtitle,title);
	}
	
	@When("User clicks on person icon")
	public void user_clicks_on_person_icon() throws InterruptedException {
		Thread.sleep(2000);
	    lp.getprsnicon().click();
		
	}
	
	@Then("QA Astraa forgot password link should be present")
	public void qa_astraa_forgot_password_link_should_be_present() throws InterruptedException {
	    Thread.sleep(4000);
		lp.frgtpass();
	}
	
	
	
	@And("User inputs username {string}")
	public void user_inputs_username(String username) {
	    lp.getusername().sendKeys(username);
	}
	@And("User inputs password {string}")
	public void user_inputs_password(String password) {
	    lp.getpassword().sendKeys(password);
	}

	@And("User clicks on sign-in button")
	public void user_clicks_on_sign_in_button() throws InterruptedException {
		Thread.sleep(2000);
	    lp.getsignin().click();
	}
	@Then("User should not be able to login and should get an error message")
	public void user_should_not_be_able_to_login_and_should_get_an_error_message() throws InterruptedException {
		Thread.sleep(5000);
		error= lp.geterrormsgs();
		System.out.println(error);
	    lp.geterrormsg();
	}



	}


