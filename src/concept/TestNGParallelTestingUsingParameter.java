package concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGParallelTestingUsingParameter
{
	
	WebDriver driver;
	@Test
	@Parameters("browser")// use @Parameters to pass the input through xml
	public void browserTest(String browser)
	{
		if (browser.equals("FF")) 
		{
			driver = new FirefoxDriver();
			driver.quit();
		}
		else if (browser.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "E:/Workspace/Automation/IEDriverServer_x64_2.39.0/IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			driver.quit();
		}
		else if (browser.equals("Crome"))
		{
			System.setProperty("webdriver.crome.driver", "E:/Workspace/Automation/chromedriver_win32_13.0.775.0/chromedriver.exe");
			driver= new ChromeDriver();
			driver.quit();
		}
	}
}
