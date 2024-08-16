package patternPrograms;

public class Eg12 
{
	public static void main(String[] args)
	{
//		*
//		**
//		***
//		****
//		***
//		**
//		*
		
		//row=7, star=1
		
		int row=7;
		int star=1;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<4)
			{
				star++;
			}
			else
			{
				star--;
			}
		}
	}

}
