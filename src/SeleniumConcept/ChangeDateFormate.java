package SeleniumConcept;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class ChangeDateFormate 
{
	@Test
	public void dateFormate()
	{
		//print date formate of system
		Date systemDate = new Date();
		System.out.println(systemDate);
		//changing the date formate 
		SimpleDateFormat changeFormate = new SimpleDateFormat("MM.dd.yyyy");
		String change = changeFormate.format(systemDate);
		System.out.println(change);
	
	}
}
