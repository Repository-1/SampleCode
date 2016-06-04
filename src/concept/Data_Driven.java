package concept;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Data_Driven 
{
	@Test
	public void dataFromExcel() throws Exception
	{
		File dataFile = new File("E:\\Workspace\\Automation\\facebooklogin.xlsx");
		FileInputStream f1 = new FileInputStream(dataFile);
		Workbook wb = WorkbookFactory.create(f1);
		Sheet sheetNumber = wb.getSheet("Sheet1");

		int row_count = sheetNumber.getLastRowNum();
		System.out.println("Number of row in the Table" + row_count);
//CASE-1		
 //HOw to get value of only 1 cloumb
		// change the valuve of i to start with that perticular index num of Row
		for (int i = 1; i < row_count; i++)
		{
			//Change the value of Getcell to print the perticular index num of Coloumb
			String Team = sheetNumber.getRow(i).getCell(0).getStringCellValue();
			if (Team!=null) 
			{
				System.out.println("status of the 1st match = " + Team);
			}
			
		}
	//CASE2
//how to get value of only 1 single row all the elements
		/*for (int i = 1; i < 2; i++)
		{
			int Colo_Count = sheetNumber.getRow(i).getLastCellNum();
			for (int j = 0; j < Colo_Count; j++)
			{
				String Team = sheetNumber.getRow(i).getCell(j).getStringCellValue(); 
				System.out.println("Status of the Teams " + Team);	
			}
		}*/
	}
}

