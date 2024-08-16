package patternPrograms;

public class Eg5
{
	public static void main(String[] args)
	{
//		*****
//		****
//		***
//		**
//		*
		
		//row--->5 column--->5
		//star at 1st row--->5
		
		int row=5;
		int column=5;
		int star=5;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
	}

}
