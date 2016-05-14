package SeleniumConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;


public class DefaultFirefox 
{
	@Test
	public void defaultfirefox()
	{
		// Create object of ProfilesIni class
		ProfilesIni init=new ProfilesIni();
		// Get the default session  
		FirefoxProfile profile=init.getProfile("default");
		// Pass the session/profile to FirefoxDriver 
		WebDriver driver=new FirefoxDriver(profile);
		driver.get("http://learn-automation.com/");
		//driver.quit();
	}
}
