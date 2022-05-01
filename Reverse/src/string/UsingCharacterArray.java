package string;

public class UsingCharacterArray {
	public static void main(String[] args) {
		String str="abcd";
		  String rev="";
		  
		  
		  char a[]=str.toCharArray();
		  System.out.println();
	       int len=a.length;
	       for(int i=len-1;i>=0;i--)
	       {
	    	   rev=rev+a[i];
	       }
	System.out.println("reverse string is:"+rev);
	
	}

}
