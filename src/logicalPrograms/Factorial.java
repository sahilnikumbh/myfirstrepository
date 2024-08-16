package logicalPrograms;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		//4!=4*3*2*1=24
		//5!=5*4*3*2*1=120
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number");
		int num = sc.nextInt();
		int fact=1;
		
		for(int i=num;i>=1;i--)
		{
			fact = i*fact;
		}
		System.out.println("Factorial of "+num+ " is "+fact );
	}

}
