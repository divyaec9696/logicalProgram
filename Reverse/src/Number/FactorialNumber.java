package Number;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int num=sc.nextInt();
		
		long factorial=1;
		
		System.out.println("1st way");
		for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("Factorial of "+num+ "is"+factorial);
	  
		System.out.println("2nd way");
		
		for(int i=num;i>=1;i--)
		{

			factorial=factorial*i;
		}
		System.out.println("Factorial of "+num+ "is"+factorial);
		
	}
}
