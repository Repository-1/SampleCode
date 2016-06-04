package concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SikuliScript 
{
	@Test
	public void sikuli() throws Exception 
	{
	Screen s1 = new Screen();
	Pattern image = new Pattern("E:\\Workspace.signin.jpeg");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.co.in/");
	s1.click(image);
	
	}
}
