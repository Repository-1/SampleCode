package JavaConcepts;

public class Removing_DuplicateChar
{
	public static void main(String[] args)
	{
		String sum = "";
		String s1 = "my day is coming very soon";
		char[]alfa = s1.toCharArray();
		for (int i = 0; i < alfa.length-1; i++) 
		{
			for (int j = i+1; j < alfa.length; j++) {
				if (alfa[j]==alfa[i])
				{
					alfa[j] = '!';
				}
			}
		}
		for (int i = 0; i < alfa.length; i++)
		{
			if (alfa[i]!='!')
			{
				sum += alfa[i];
				
			}	
		}
		System.out.print(sum);

	}

}
