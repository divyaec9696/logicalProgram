package palindrome;

import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	System.out.println("Enter your string :");
		String str=sc.next();
		
		String org_str=str;
		  String rev="";
		  
		  
		  char a[]=str.toCharArray();
		  System.out.println();
	       int len=a.length;
	       for(int i=len-1;i>=0;i--)
	       {
	    	   rev=rev+a[i];
	       }
           if(org_str.equals(rev)) {
        	   System.out.println(org_str+"  is palindrome ");
           }
           else
           {
        	   System.out.println(org_str+"  is not palindrome ");
           }
           
	
	}
}
