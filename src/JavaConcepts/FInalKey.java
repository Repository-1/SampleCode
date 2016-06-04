package JavaConcepts;

public class FInalKey
{
	final int i = 30;
	public int final1()
	{
		int i = 10 ;
		return i; 
	}
	public static void main(String[] args)
	{
		FInalKey f1 = new FInalKey();
		System.out.println(f1.i);
	}
} 