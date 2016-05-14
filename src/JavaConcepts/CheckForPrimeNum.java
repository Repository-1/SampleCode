package JavaConcepts;

public class CheckForPrimeNum
{
	public static void main(String[] args) {
		int[] num = {1,2,3,9,1};
		for (int i = 0; i < num.length-1; i++)
		{
			if (num[i]%2==0)
			{
				System.out.println("not a prime num");
			}	
			else {
				System.out.println("prime num");
			}
		}
		
	}
}
