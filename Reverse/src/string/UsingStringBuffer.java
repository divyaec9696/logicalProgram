package string;

public class UsingStringBuffer {
public static void main(String[] args) {
	String str="abcd";
	  String rev="";
	  
	
	StringBuffer sb=new StringBuffer(str);
	System.out.println("Reverse is :"+sb.reverse());
	
}
}
