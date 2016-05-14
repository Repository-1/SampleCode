package JavaConcepts;

public class ReverseStringWordByWord
{
	public static void main(String[] args)
	{
		String sum = ""; 
		String s1 = "ripon is a dog.";
		String [] words=s1.split(" ");
		for (int i = 0 ; i <words.length; i++)
		{
			String word = words[i];
			char [] c1 = word.toCharArray();
			for (int j = c1.length-1; j >= 0 ; j--)
			{
				sum = sum+=c1[j];
				System.out.println(sum);
			}
		}
		
	 
		/*String inputString = "ripon is a dog";
		String[] words = inputString.split(" ");
		String reverseString = "";
		for (int i = 0; i < words.length; i++) 
		{
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length()-1; j >= 0; j--) 
			{
				reverseWord = reverseWord + word.charAt(j);
			} 
			reverseString = reverseString + reverseWord + " ";
		}

		System.out.println(inputString);
		System.out.println(reverseString);
		System.out.println("-------------------------");*/
	}

}
