package JavaConcepts;

import java.util.Arrays;

import org.testng.Assert;

public class Array_to_String 
{
	public static void main(String[] args) 
	{
		int [] num = {1,2,3,4,5,6};
	//	String [] num = {"ripon","Jyoti","Shilpa"};
		String str1 = Arrays.toString(num);
		System.out.println(str1);
		str1 = str1.substring(1, str1.length()-1).replaceAll(",", "");
		System.out.println(str1);

	}
}
