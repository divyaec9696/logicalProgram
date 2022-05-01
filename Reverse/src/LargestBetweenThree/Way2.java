package LargestBetweenThree;

import java.util.Scanner;

public class Way2 {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter Second number:");
		int b=sc.nextInt();
		System.out.println("Enter Third no:");
		int c=sc.nextInt();

		int largest1=a>b?a:b;
		int largest2=c>largest1?c:largest1;
		System.out.println(largest2+ " is largest number ");
		
		
}
}
