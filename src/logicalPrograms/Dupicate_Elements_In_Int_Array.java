package logicalPrograms;

public class Dupicate_Elements_In_Int_Array
{
	public static void main(String[] args)
	{
		int ar[] = {1,2,3,4,3,5,7,5,8,9,1,7};
		int count=0;
		System.out.println("Duplicate elements are: ");
		
		for(int i=1;i<ar.length;i++)
		{
			for(int j= i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[i] + " ");
					count++;
				}
			}

		}
		System.out.println();
		System.out.println("Number of Duplicate elements are "+count);
	}

}
