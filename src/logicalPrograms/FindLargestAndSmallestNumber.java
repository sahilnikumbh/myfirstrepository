package logicalPrograms;

import java.util.ArrayList;
import java.util.TreeSet;

public class FindLargestAndSmallestNumber 
{
	public static void main(String[] args) 
	{
		int ar[] = {12,29,99,98,77,24,55,33};
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i=0;i<ar.length;i++)
		{
			ts.add(ar[i]);
		}
		System.out.println(ts);
		
		ArrayList<Integer> al = new ArrayList<Integer>(ts);
		
		//smallest number
		System.out.println(al.get(0));
		
		//largest number
		System.out.println(al.get(al.size()-1));
		
		//2nd smallest
		System.out.println(al.get(1));
		
		//2nd largest
		System.out.println(al.get(al.size()-2));
	}

}
