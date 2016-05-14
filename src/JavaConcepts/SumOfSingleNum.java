package JavaConcepts;

public class SumOfSingleNum
{
	public static void main(String[] args) {
		int num = 12391;
		int temp = 0;
        int sun = 0;
		while(num>0)
		{
        temp=num%10;
		num=num/10;
		sun=sun+=temp;
		
		}
		System.out.println(sun);
	}
	
}
