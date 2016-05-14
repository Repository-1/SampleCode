package JavaConcepts;

public class SumOfNaturalNumbers 
{
public static void main(String[] args) {
	int sum = 0;
	int []feb = {1,2,3,4,5,6,7,8,9,0};
	for (int i = 0; i < feb.length-1; i++) 
	{
		sum = sum += feb[i];
		System.out.println(sum);
	}
}
}
