package concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiple_Checkboxes
{
	

	public static void main(String[] args) 
	{
		WebDriver driver;
		driver = new FirefoxDriver();
		List<WebElement> els = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for ( WebElement el : els ) {
			if ( !el.isSelected() ) {
				el.click();
			}
		}
	}
}
