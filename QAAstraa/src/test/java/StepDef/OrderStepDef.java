package StepDef;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.Base;
import com.pages.LoginPage;
import com.pages.OrderPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderStepDef extends Base {

	
OrderPage op= new OrderPage(getdriver());

public String  error;

@Given("User is on QAA Astra page")
public void user_is_on_qaa_astra_page() {
	getdriver().get("http://qa-astraa.com");
}
@When("User enters {string} in the search box")
public void user_enters_in_the_search_box(String item) throws InterruptedException {
    Thread.sleep(6000);
	op.searchbox().sendKeys("iphone");
   
}
@And("User click on search button")
public void user_click_on_search_button() throws InterruptedException {
	Thread.sleep(2000);
    op.searchbutton().click();
}
@And("User click on the item")
public void user_click_on_the_item() throws InterruptedException {
	Thread.sleep(2000);
    op.slctprdt().click();
}
@And("User increases the quantity by clicking on plus icon")
public void user_increases_the_quantity_by_clicking_on_plus_icon() throws InterruptedException {
	Thread.sleep(2000);
    op.incrsqty().click();
}
@And("User clicks on add to cart button")
public void user_clicks_on_add_to_cart_button() throws InterruptedException {
	Thread.sleep(2000);
    op.addtocrt().click();
}
@And("User clicks on checkout button")
public void user_clicks_on_checkout_button() throws InterruptedException {
	Thread.sleep(2000);
    op.chckout().click();
}
@And("User inputs {string} and {string}")
public void user_inputs_and(String firstname, String lastname) throws InterruptedException {
	Thread.sleep(2000);
	op.frstname().sendKeys(firstname);
	Thread.sleep(2000);
	op.lstname().sendKeys(lastname);
    
}
@And("User selects the country")
public void user_selects_the_country() throws InterruptedException {
	Thread.sleep(2000);
    Select country= new Select(op.ctry());
    country.selectByVisibleText("Canada");
}
@And("User inputs street {string} and city {string}")
public void user_inputs_street_and_city(String address, String city) throws InterruptedException {
	Thread.sleep(2000);
    op.address().sendKeys(address);
    Thread.sleep(2000);
    op.city().sendKeys(city);
    Thread.sleep(2000);
    op.unitno().sendKeys("59");
}
@And("User selects state")
public void user_selects_state() throws InterruptedException {
	Thread.sleep(2000);
    Select state=new Select(op.state());
    state.selectByVisibleText("Ontario");
}
@When("User inputs zipcode {string} and email {string} and phone number")
public void user_inputs_zipcode_and_email_and_phone_number(String postalcode, String email) throws InterruptedException {
	Thread.sleep(2000);
	op.postalcode().sendKeys(postalcode);
	Thread.sleep(2000);
	op.phonenumber().sendKeys("123456789");
	Thread.sleep(2000);
	op.email().sendKeys(email);
}
@When("User enters special note")
public void user_enters_special_note() throws InterruptedException {
	Thread.sleep(2000);
	op.ordernote().sendKeys("Happy Birthday");
}
@When("User clicks on place order")
public void user_clicks_on_place_order() throws InterruptedException {
	Thread.sleep(2000);
	op.placeorder().click();
}
@Then("User should not be able to order and should get an error message")
public void user_should_not_be_able_to_order_and_should_get_an_error_message() throws InterruptedException {
	Thread.sleep(2000);
	op.errormsg();
  error=  op.errormsgs();
System.out.println(error);


}
}







