package logicalPrograms;

public class CountNumberOfWhiteSpaces
{
	public static void main(String[] args)
	{
		String s = "V e loc it y";
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char temp = s.charAt(i);
			if(temp==' ')
			{ 
				count++;
			}
		}
		System.out.println("Number of White spaces are "+count  );
	}

}
