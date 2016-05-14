package JavaConcepts;

import java.util.Arrays;

public class Fabonacci 
{
	public static void main(String[] args) {
		int[]feb = new int[15];
		feb[0]=0;
		feb[1]=1;		
		for (int i = 2; i < feb.length; i++) 
		{
			feb[i]= feb[i-1]+feb[i-2];
		}
		System.out.println(Arrays.toString(feb));
	}
}
