package concept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickingInvisibleElements 
{
	WebDriver driver;
	public void clickInvisibleElementsUsingJavaScript()
	{
		driver.get("");
		// First identify element 
		WebElement elem = driver.findElement(By.xpath(".//*[@id='__dialog1-footer']/button[1]/div"));
		// This will enable this element if element is invisible      
		String js = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';";
		// Execute the Java Script for the element which we find out
		((JavascriptExecutor) driver).executeScript(js, elem);
		// Click on element
		elem.click();
	}
}
