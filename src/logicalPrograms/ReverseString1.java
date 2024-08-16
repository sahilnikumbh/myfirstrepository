package logicalPrograms;

public class ReverseString1 
{
	public static void main(String[] args)
	{
		String s = "I am in Pune city";
		             //I am in enuP city
		
		String s1 = "Pune";
		
		String[] ar = s.split(" ");
		for(int i=0;i<=ar.length-1;i++)
		{
			if(ar[i].equals(s1))
			{
				String temp = ar[i];
				String rev = "";
				for(int j=temp.length()-1;j>=0;j--) 
				{
					rev = rev + temp.charAt(j);
				}
				ar[i]= rev;
			}
			System.out.println(ar[i]+"  ");
		}
		
	}

}
