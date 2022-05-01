package LargestBetweenThree;

import java.util.Scanner;

public class Way3 {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter first number:");
	int a=sc.nextInt();
	System.out.println("Enter Second number:");
	int b=sc.nextInt();
	System.out.println("Enter Third no:");
	int c=sc.nextInt();

	int largest=c>(a>b?a:b)?c:(a>b?a:b);
	System.out.println(largest+ "   is largest number ");
	}		
}
