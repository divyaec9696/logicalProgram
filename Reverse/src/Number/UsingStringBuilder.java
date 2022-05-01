package Number;

import java.util.Scanner;

public class UsingStringBuilder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int num=sc.nextInt();
		
		StringBuilder sb=new StringBuilder ();
		sb.append(num);
		StringBuilder rev=sb.reverse();
		System.out.println("Reverse number is "+rev);
		
	}
}
