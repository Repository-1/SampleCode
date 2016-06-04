package JavaConcepts;

public class Add
{
	public int add(int a, int b)

	{
		int c = a+b;
		int d = a*b;
		return c;
	}
	
	public static void main(String[] args)
	{
	
		Add a1 = new Add();
		int sum=a1.add(1, 2);
		System.out.println(sum);
	}
}
