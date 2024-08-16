package logicalPrograms;

import java.util.Scanner;

public class EvenOddNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Number");
		
		int num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Given number is Even Number");
		}
		else
		{
			System.out.println("Given number is Odd Number");
		}
	}

}
