package stepDefinitions;

import org.junit.Assert;

import Cucumber.FirstProject.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.homePageObjects;

public class homePageSteps extends Base {
	
	homePageObjects homepage;
		//public WebDriver driver;
	
	 @Given("^User is on Greencart home page$")
	    public void user_is_on_greencart_home_page() throws Throwable {
	        driver=Base.initilizeDriver();
	    }

	    @When("^User enter the (.+) in serachbox$")
	    public void user_enter_the_in_serachbox(String vegitable) throws Throwable {
	    	homepage=new homePageObjects(driver);
	    	homepage.getsearch().sendKeys(vegitable);
	    	Thread.sleep(2000);
	    }

	    @Then("^(.+) is displayed$")
	    public void is_displayed(String vegitable) throws Throwable {
	    	//System.out.println(homepage.getsearchresult().getText());
	      Assert.assertTrue(homepage.getsearchresult().getText().contains(vegitable));
	    }
}
