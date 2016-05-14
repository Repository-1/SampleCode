package JavaConcepts;

import java.util.Arrays;

public class StringReverse
{
	public static void main(String[] args)
	{
		String sun = "";
		String s1 = "ripon is a dog.";
		char [] alfa = s1.toCharArray();
		System.out.println(Arrays.toString(alfa));
		
	/*	for (int i = alfa.length-1; i >= 0; i--) 
		{
			
			sun+=alfa[i];
		}
		System.out.println(sun);*/
		
		for (int i = alfa.length-1; i >= 0  ; i--)
		{
		System.out.print(alfa[i]);	
		}
	}
}
