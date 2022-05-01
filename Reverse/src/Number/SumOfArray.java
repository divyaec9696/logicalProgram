package Number;

import java.util.Scanner;

public class SumOfArray {
	
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	 int a[]=new int[5];
	 int sum=0;
	
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println("Enter element "+(i+1)+" :");
		a[i]=sc.nextInt() ;
		sum=sum+a[i];
	}
	System.out.println("Sum of array is:"+sum);
	}
}
