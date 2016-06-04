package concept;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;


public class FluentWait
{
	WebDriver driver;
	public void openGoogle()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");

		Wait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver).
				withTimeout(30, TimeUnit.SECONDS).
				pollingEvery(5, TimeUnit.SECONDS).
				ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>()
				{

			public WebElement apply(WebDriver driver) 
			{

				return driver.findElement(By.id("foo"));

			}
				}
	}
	
}
