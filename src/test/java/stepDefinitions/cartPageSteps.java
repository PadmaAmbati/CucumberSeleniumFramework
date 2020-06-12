package stepDefinitions;

import org.junit.Assert;
import Cucumber.FirstProject.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.cartPageObjects;

public class cartPageSteps extends Base{
	
	
	cartPageObjects cartpage;
	   
	

	    @And("^Add the vegitable to cart$")
	    public void add_the_vegitable_to_cart() throws Throwable {
	    	cartpage=new cartPageObjects(driver);
	        cartpage.addcartButton().click();
	    }

	    @And("^Click onCartBag$")
	    public void click_oncartbag() throws Throwable {
	       cartpage.clickOnCartBag().click();
	    }
	    @Then("^added (.+) is present in cart$")
	    public void added_is_present_in_cart(String vegitable) throws Throwable {
	    	Assert.assertTrue(cartpage.getcartresult().getText().contains(vegitable));
	    }

}
