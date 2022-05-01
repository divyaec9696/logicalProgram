package CountNumber;

import java.util.Scanner;

public class CountEvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int num=sc.nextInt();
		int even_count=0;
		int odd_count=0;
		
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0) 
			{
			   even_count++;
			   
			}
			else
			{
				odd_count++;
			}
			num=num/10;
		}
		System.out.println("No of even no is :"+even_count+" No of odd no is:"+odd_count);
	}

}
