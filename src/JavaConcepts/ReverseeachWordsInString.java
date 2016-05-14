package JavaConcepts;

public class ReverseeachWordsInString {

	public static void main(String[] args)
	{
		String sj = "That’s been one of my mantras — focus and simplicity. Simple can be harder than complex you have to work hard to get your thinking clean to make it simple";	
		String[] words = sj.split(" ");
		String reverseSting = "";
		for (int i = 0; i < words.length; i++) 
		{
			String word = words[i];
			String reverseword = "";
			for (int j = word.length()-1 ; j >=0 ; j--)
			{
				reverseword = reverseword + word.charAt(j);
			}
			reverseSting = reverseSting + reverseword + " " ;
		}	
		System.out.println(reverseSting);
	}

}
