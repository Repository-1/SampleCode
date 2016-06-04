package concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Alert
{
	WebDriver driver;
	@Test
	public void alertExamplae()
	{
		driver = new FirefoxDriver();
	//	driver.findElement(By.id("chutspa")).click();
	    String mainPage = driver.getWindowHandle(); // get the address of main page
	    org.openqa.selenium.Alert a1 = driver.switchTo().alert(); //this will switch the control to alert pop-up 
		a1.accept(); // to click on OK or to accept the alert pop-up
		//alt.dismiss(); // to click on CANCEL
		driver.switchTo().window(mainPage);
	}
}
