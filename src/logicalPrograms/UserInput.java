package logicalPrograms;

import java.util.Scanner;

public class UserInput
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your 1st Number");
		int a = sc.nextInt();
		
		System.out.println("Enter your 2nd Number");
		int b = sc.nextInt();
		
		int sum = a+b;
		System.out.println("Sum is "+sum);
	}

}
