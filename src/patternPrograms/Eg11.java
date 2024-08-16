package patternPrograms;

public class Eg11 
{
	public static void main(String[] args)
	{
//		* * * *
//		 * * *
//		  * *
//		   *
		
		//row=4, star=4, space=0
		
		int row=4;
		int star=4;
		int space=0;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star--;
			space++;
		}
	}

}
