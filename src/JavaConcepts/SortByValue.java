package JavaConcepts;

import java.util.Arrays;

public class SortByValue 
{
	public static void main(String[] args)
	{
		int temp;
		int[] ia = {1,5,6,2,1,1,8,5,1,1,8,9};
		for (int i=0;i<ia.length-1;i++) 
		{
			for (int j = i+1; j < ia.length; j++)
			{
				if (ia[j]<ia[i]) 
				{
					temp = ia[j];
					ia[j]=ia[i];
					ia[i] = temp;
				}	
			}

		}
		System.out.println(Arrays.toString(ia));
	}
}

