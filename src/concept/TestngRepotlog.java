package concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngRepotlog
{

	private static WebDriver driver;
	@Test
	public static void test() 
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
		// Our first step is complete, so we produce a main event log here for our reports.
		Reporter.log("Application Lauched successfully | ");
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		driver.findElement(By.id("log")).sendKeys("testuser_1");
		driver.findElement(By.id("pwd")).sendKeys("Test@123");
		driver.findElement(By.id("login")).click();
		// Here we are done with our Second main event
		Reporter.log("Sign In Successful | " );
		driver.findElement(By.id("account_logout"));
		driver.quit();
		// This is the third main event
		Reporter.log("User is Logged out and Application is closed | ");
	}
}
