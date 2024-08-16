package logicalPrograms;

public class PalindromeString 
{
	public static void main(String[] args)
	{
		String s = "madam";
		String rev = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev =  rev + s.charAt(i);
		}
		System.out.println("Original String is "+s);
		System.out.println("Reverse String is "+rev);
		if(s.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}

}
