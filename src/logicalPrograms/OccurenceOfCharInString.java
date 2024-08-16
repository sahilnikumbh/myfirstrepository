package logicalPrograms;

public class OccurenceOfCharInString
{
	public static void main(String[] args)
	{
		// count char A
		String s = "RADAR";
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char temp = s.charAt(i);
			if(temp=='A')
			{
				count++;
			}
		}
		System.out.println("Occurence of A is "+count);
	}

}
