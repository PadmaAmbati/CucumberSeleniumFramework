package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cartPageObjects {
	public  WebDriver driver;
	private By addcartButton=By.xpath("//button[contains(text(),'ADD TO CART')]");
	private By clickOnCartBag=By.xpath("//img[@alt='Cart']");
	private By cartresult=By.xpath("//p[@class='product-name']");
	
	
	public  cartPageObjects(WebDriver driver){
		this.driver=driver;
	}
	public WebElement addcartButton(){
		return driver.findElement(addcartButton);
	}
	public WebElement clickOnCartBag(){
		return driver.findElement(clickOnCartBag);
	}
	public WebElement getcartresult(){
		return driver.findElement(cartresult);
	}
}
