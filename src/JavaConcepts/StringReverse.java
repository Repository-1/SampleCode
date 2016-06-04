package JavaConcepts;

import java.util.Arrays;

public class StringReverse
{
	public static void main(String[] args)
	{

		String s1 = "ripon is a dog.";

		/*char [] alfa = s1.toCharArray();
		System.out.println(Arrays.toString(alfa));
		for (int i = alfa.length-1; i >= 0  ; i--)
		{
		System.out.print(alfa[i]);	
		}*/
		/*	String sun = "";
		char [] alfa = s1.toCharArray();
		for (int i = alfa.length-1; i >= 0; i--) 
		{

			sun+=alfa[i];
		}
		System.out.println(sun);*/

		String []words = s1.split(" ");
		String reverseSting = "";
		for (int i = words.length-1; i > 0 ; i--) 
		{
			String word = words[i];
			String reverseword = "";
			for (int j = word.length()-1 ; j >=0 ; j--)
			{
				reverseword = reverseword + word.charAt(j);
			}
		 	reverseSting = reverseSting + reverseword + " " ;	
		}
		System.out.println(reverseSting);


	}
}
