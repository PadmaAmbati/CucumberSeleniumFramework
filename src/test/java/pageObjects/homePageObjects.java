package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePageObjects {
	
	public  WebDriver driver;
	private By search=By.xpath("//input[@type='search']");
	private By searchresult=By.xpath("//h4[@class='product-name']");
	
	
	public  homePageObjects(WebDriver driver){
		this.driver=driver;
	}
	public WebElement getsearch(){
		return driver.findElement(search);
	}
	public WebElement getsearchresult(){
		return driver.findElement(searchresult);
	}
}
