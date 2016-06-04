package concept;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Log4j
{


	//mainLogger is a logger object that we got from LogManager. All loggers are 
	//using this method only. We can consider LogManager as a factory to create
	//Logger objects
	static Logger mainLogger = LogManager.getLogger(Log4j.class.getName());
	private static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicConfigurator.configure();
		mainLogger.info("This is just a logger");

		/*WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.presenceOfElementLocated());*/
	}
}
