package SeleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClick
{
	@Test
	public void doubleClick()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		WebElement signin= driver.findElement(By.id("gb_70"));
		Actions builder = new Actions(driver);
		builder.moveToElement(signin).doubleClick().perform();
	}

}
