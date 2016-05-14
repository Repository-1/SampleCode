package JavaConcepts;

import java.util.Arrays;

public class Removing_DuplicateWords 
{
	public static void main(String[] args)
	{
		
		String s1 = "my day is coming very soon is";
		String[]s2 = s1.split(" ");
		for (int i = 0; i < s2.length; i++)
		{
			System.out.println(s2[i]);	
		}
		
		for (int i = 0; i < s2.length-1; i++) 
		{
			for (int j = i+1; j < s2.length; j++) {
				if (s2[j]==s2[i])
				{
					s2[j] = "NO";
				}
			}
		}
		for (int i = 0; i < s2.length-1; i++)
		{
			if (s2[i]!="NO")
			{
				System.out.println ("new arr "+ s2[i]);
				
			}	
		}
	}
}
