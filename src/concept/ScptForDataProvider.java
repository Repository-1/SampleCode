package concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScptForDataProvider 
{
	WebDriver driver;
	@Test(dataProvider = "Authentication")
	public void test(String sUsername, String sPassword)
	{

		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");


		// Argument passed will be used here as String Variable

		driver.findElement(By.id("email")).sendKeys(sUsername);

		driver.findElement(By.id("pass")).sendKeys(sPassword);

		driver.findElement(By.id("u_0_n")).click();

		driver.findElement(By.id("userNavigationLabel")).click();
		
		driver.findElement(By.id("u_6_2")).click();

		driver.quit();
	}

}
