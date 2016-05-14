package SeleniumConcept;

import java.io.BufferedReader;
import java.io.FileReader;

import org.testng.annotations.Test;

public class ReadDataFromNotepad
{
	@Test
	public void readData() throws Exception
	{//read data from notepad
		FileReader f1 = new FileReader("E://Workspace//Practice//Note.txt");
		BufferedReader bf = new BufferedReader(f1);

		//creating area of String to read the line stored in bf
		String[] line = new String[2];
		for (int i = 0; i < line.length; i++)
		{
			line[i] = bf.readLine();
			System.out.println(line[i]);
			String[] words = line[i].split(" ");
			System.out.println(words.length);	
		}
	}
}
