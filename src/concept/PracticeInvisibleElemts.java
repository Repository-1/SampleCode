3package concept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeInvisibleElemts 
{
	WebDriver driver;
	public void practice()
	{
		driver.get("");
		WebElement S1 = driver.findElement(By.id(""));
		String s2 ="arguments[0].style.height='auto';arguments[0].style.visibility='visible';";
		((JavascriptExecutor)driver).executeScript(s2, S1);
	}
}
