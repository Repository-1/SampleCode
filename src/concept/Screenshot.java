    package concept;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Screenshot
{
	@Test
	public void screenshot() throws Exception
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.get("http://selenium-suresh.blogspot.in/2014/01/sikuli-automation-tool-integration-with.html");
		File takescreenShoot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(takescreenShoot, new File("E:/error.png"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
