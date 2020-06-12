package Cucumber.FirstProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriver initilizeDriver() throws IOException{
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\resources\\globalvar.properties");
		prop=new Properties();
		prop.load(fis);
		String browser=System.getProperty("browser");
		
		//System.out.println(browser);
		if(browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("IE")){
			//System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\test\\java\\resources\\IEDriverServer.exe");
			 //driver=new InternetExplorerDriver();
			 
		}
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\java\\resources\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
		return driver;
		
	}

}
