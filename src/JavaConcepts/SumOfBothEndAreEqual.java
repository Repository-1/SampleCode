package JavaConcepts;

public class SumOfBothEndAreEqual 
{

	public static void main(String[] args)
	{
		int rightsum = 0;
		int leftsum = 0;
		int count = 0;
		int[] ia = {1, 5, 6, 2, 1 , 8, 5, 1, 8,9};

		for (int i = 0; i < ia.length; i++)
		{
			rightsum+=ia[i];
			//	System.out.println("rightsum" + rightsum);
		}

		for (int i = ia.length-1; i > 0; i--)
		{
			leftsum += ia[i];
			count++;
			//System.out.println("leftsum " + leftsum);
			if (rightsum-leftsum==leftsum) 
			{
				System.out.println(count);	
			}
		}

	}
}