package concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class DynamicXpath 
{
	@Test
	public void xpath() throws Exception
	
	
	{
		Screen s1 = new Screen();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.hdfcbank.com/");
	//	driver.findElement(By.xpath("//div[text() = 'Loans']")).click();
		Pattern load = new Pattern("E:\\Workspace\\Automation\\Sikuli screenshot\\loads.png");
		s1.click(load);
//		driver.findElement(By.xpath("//div[text() = 'Loans']/ul/li[2]")).click();
		driver.close();

	}
}
