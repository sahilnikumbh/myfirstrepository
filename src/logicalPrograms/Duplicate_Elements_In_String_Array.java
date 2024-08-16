package logicalPrograms;

public class Duplicate_Elements_In_String_Array 
{
	public static void main(String[] args)
	{
		String ar[] = {"java","testing","java","python","sql","sql","testing","api"};
		System.out.println("Duplicate elements are: ");
		int count=0;
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i].equals(ar[j]))
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
