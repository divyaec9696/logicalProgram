package Number;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a no:");
		int num=sc.nextInt();
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				count++;
			}
			if(count==2)
			{
				System.out.println(num+ " is a prime number");
			}
			else
			{
				System.out.println(num+ " not a prime number.");
			}
		}
		else 
		{
		  System.out.println(num+ " not a prime number.");	
		}
	}

}
