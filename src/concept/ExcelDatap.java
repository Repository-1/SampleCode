package concept;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelDatap
{
	@DataProvider(name = "Authentication")
	public static Iterator fetchData() throws InvalidFormatException, IOException
	{
	    ArrayList myData = new ArrayList();
	    
	    FileInputStream fis = new FileInputStream("E://Workspace//Automation//facebooklogin.xlsx");
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sh = wb.getSheet("Sheet1");
	    
	    int numOfRows = sh.getLastRowNum();
	    
	    String userName, pass;
	    
	    for(int i=0; i<numOfRows; i++)
	    {
	        userName = sh.getRow(i).getCell(0).getStringCellValue();
	        pass = sh.getRow(i).getCell(1).getStringCellValue();
	        
	        myData.add(new Object[]{userName,pass});
	    }
	    return myData.iterator();
	}
}
