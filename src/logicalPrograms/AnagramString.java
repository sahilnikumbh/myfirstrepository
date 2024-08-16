package logicalPrograms;

import java.util.Arrays;

public class AnagramString
{
	public static void main(String[] args)
	{
		// java avaj
		
		String s1 = "java";
		String s2 = "avaj";
		
		char[] ar1 = s1.toCharArray();//{'j','a','v','a'}
		char[] ar2 = s2.toCharArray();//{'a','v','a','j'}
		
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		boolean result = Arrays.equals(ar1, ar2);
		
		if(result)
		{
			System.out.println("String is an anagram");
		}
		else
		{
			System.out.println("String is not an anagram");
		}
		
	}

}
