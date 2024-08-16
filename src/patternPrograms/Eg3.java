package patternPrograms;

public class Eg3
{
	public static void main(String[] args) 
	{
		//*****
		//*****
		//*****
		
		//row--->3 columns--->5
		//outer loop for rows
		//inner loop for columns
		
		int row=3;
		int column=5;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=column;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
