package concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class Internationalisation
{
@Test
public void language()
{
	FirefoxProfile profile = new FirefoxProfile();

	profile.setPreference("intl.accept_languages","jp");

	WebDriver driver = new FirefoxDriver(profile); driver.get("https://www.google.co.in/");	
}
}
