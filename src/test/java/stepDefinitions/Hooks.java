package stepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import Cucumber.FirstProject.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends Base{
	
	static Logger log = Logger.getLogger(Hooks.class);
	

	@Before
	public void before(Scenario scenario) {
		log.info("------------------------------");
		log.info("Starting - " + scenario.getName());
		log.info("------------------------------");
	}
	@After
	public void getscreenshot(Scenario scenarioname){
		
		
		if(scenarioname.isFailed()){
			log.info(scenarioname.getName()+" is failed");
			 byte[] scrShot =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			 scenarioname.attach(scrShot, "image/png", "Screenshot");
			 
		}
		else
		{
			log.info(scenarioname.getName()+" is pass");
			 byte[] scrShot =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			 scenarioname.attach(scrShot, "image/png", "Screenshot");
		}
		driver.close();
	}
}
