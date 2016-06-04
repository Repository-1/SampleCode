package concept;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithExcel
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
	@DataProvider(name="Authentication")
	public static Object[][] test()
	{	
		try
		{
			ArrayList myData = new ArrayList();
			FileInputStream fis = new FileInputStream("./facebooklogin.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet("Sheet4");


			int numOfRows = sh.getLastRowNum();
			for(int i=0; i<numOfRows; i++)
			{
				String	userName = sh.getRow(i).getCell(0).getStringCellValue();
				String	pass = sh.getRow(i).getCell(1).getStringCellValue();
				myData.add(new Object[]{userName,pass});
			}
			return test();
		}
		catch (Exception e)

		{
			e.printStackTrace();
		}
		return null;
	}
}
