package JavaConcepts;

public class Middleindex
{
	public static void main(String[] args) 
	{
		//int sum = 0;
		int count=0;
		int[] ia = {1,5,6,2,1,1,8,5,1,1,8,9};
		for (int i = 0; i < ia.length; i++) 
		{
			//sum+=ia[i];
			count++;
			System.out.println(count);
		}
		System.out.println("middle index " + count/2);
	}
}

