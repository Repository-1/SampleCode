package concept;

import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class DownloadPopup 
{
	@Test
	public void DownloadExample()
	{
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "Applition/zip");
		profile.setPreference("", "");
	}
}