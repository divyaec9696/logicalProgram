package Number;

import java.util.Scanner;

public class UsingstringBuffer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   
		System.out.println("Enter a no:");
		int num=sc.nextInt();
		
		StringBuffer rev;
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		//StringBuffer rev=sb.reverse();
		System.out.println(rev=sb.reverse());
		System.out.println("Reverse number is :"+rev);
	}

}
