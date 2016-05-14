package SeleniumConcept;


import java.util.ArrayList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowHandler_name
{ 
	@Test
	public void newTab()
	{
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		WebElement SIgnin = driver.findElement(By.id("gb_70"));
		SIgnin.sendKeys(Keys.CONTROL,Keys.RETURN);
		driver.switchTo().window("Sign in - Google Accounts");
		/*ArrayList<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());

		for (String window:windowHandles){

			//if it contains the current window we want to eliminate that from switchTo();
			if (window != parentWindow){
				//Now switchTo new Tab.
				driver.switchTo().window(window);
				//Do whatever you want to do here.

				//Close the newly opened tab
				//driver.close();
			}
		}*/
	}
}
