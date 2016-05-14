package SeleniumConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenInNewTab
{
	@Test
	public void newTab()
	{
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		WebElement SIgnin = driver.findElement(By.id("gb_70"));
		SIgnin.sendKeys(Keys.CONTROL,Keys.RETURN);
		driver.close();
	}
}
