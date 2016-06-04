package concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class SameOriginPolicy 
{
	
	/*The “Same Origin Policy” is introduced for security reason, and it ensures 
	that content of your site will never be accessible by a script from another site.
	As per the policy, any code loaded within the browser can only operate within that
	website’s domain.

	To avoid “Same Origin Policy” proxy injection method is used, in proxy injection mode
	the Selenium Server acts as a client configured HTTP proxy , which sits between the 
	browser and application under test and then masks the AUT under a fictional URL	
	*/
@Test
public void proxy()
{
	DesiredCapabilities capability=DesiredCapabilities.firefox();

	capability.setCapability(CapabilityType.PROXY,"your desire proxy");

	WebDriver driver=new FirefoxDriver(capability);	
}
}
