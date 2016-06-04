package concept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Datadriven
{
	WebDriver driver;

	@Test(dataProvider = "Authentication")
	public void beforeMethod(String userName, String pass) throws Exception 
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");	
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.quit();
	}
	public void dataout() throws Exception
	{
		FileInputStream fis = new FileInputStream("E:\\Workspace\\Automation\\facebooklogin.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");

		int rowcount = sh.getLastRowNum();
		for (int i = 1; i < rowcount+1 ; i++) 
		{
			String userName1 = sh.getRow(i).getCell(1).getStringCellValue();
			String pass1 = sh.getRow(i).getCell(0).getStringCellValue();
		}
	}
}
