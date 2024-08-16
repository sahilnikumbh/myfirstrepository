package patternPrograms;

public class Eg4 
{
	public static void main(String[] args)
	{
//		*
//		**
//		***
//		****
//		*****
		
		//row--->5 columns--->5
		//1st row star count-->star--->1
		int row=5;
		int column=5;
		int star=1;
		
		//outer loop for rows
		for(int i=1;i<=row;i++)
		{
			//inner loop for column
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
	}

}
