package JavaConcepts;

public class ReverseNumber
{
	public static void main(String[] args)
	{
		int number = 23943245;
		int reversedNumber = 0;
		int temp = 0;

		while(number > 0){

			//use modulus operator to strip off the last digit
			temp = number%10;
			System.out.println("temp" + temp);

			//create the reversed number
			reversedNumber = reversedNumber * 10 + temp;
			System.out.println("RV" + reversedNumber);
			 
			number = number/10;
			System.out.println("new num" + number);

		}

		//output the reversed number
		System.out.println("Reversed Number is: " + reversedNumber);

	}
}
