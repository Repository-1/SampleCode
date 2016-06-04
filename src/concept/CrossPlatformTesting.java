package concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossPlatformTesting
{
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void parallelTesting(String browser)
	{
		if (browser.equals("FF")) 
		{
			driver =new FirefoxDriver();
		}
		else {

		}
 
	}
}
