package string;

public class UsingStringconcat {
	public static void main(String[] args) {
		
	String str="abcd";
	  String rev="";
	  
	  int leg=str.length();
	  
	  for (int i=leg-1;i>=0;i--)
	  {
	     rev=rev+str.charAt(i);
		  
	  }
	  System.out.println("Reverse string is :"+rev);
	}
}
