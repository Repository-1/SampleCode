package JavaConcepts;

public class SwapingTwoNum 
{
	public static void main(String a[])
	{
		int x = 134;
		int y = 126;
		int temp = 0;
	/*	System.out.println("Before swap:");
		System.out.println("x value: "+x);
		System.out.println("y value: "+y);
		x = x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swap:");
		System.out.println("x value: "+x);
		System.out.println("y value: "+y);*/
		
		 temp = x;
		 x= y;
		 y=temp;
		 
		 System.out.println(x);
		System.out.println(y);
	}
}
