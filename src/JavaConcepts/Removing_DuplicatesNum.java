package JavaConcepts;

import java.util.Arrays;

public class Removing_DuplicatesNum 
{
	public static void main(String[] args) {
		int [] num = {1,2,3,4,5,1,23,45,67,8,1,23,4};
		for (int i = 0; i < num.length-1; i++) 
		{
			for (int j = i+1; j < num.length; j++)
			{

				if (num[j] == num[i])
				{
					num[j]=-1;	
				}
			}	
		}
		
		System.out.println(Arrays.toString(num));
		for (int i = 0; i < num.length; i++) 
		{
			if (num[i]!=-1)
			{
				//System.out.print(num[i]);
				System.out.println(Arrays.toString(num));
			}	
			
		}
		
	}
}
