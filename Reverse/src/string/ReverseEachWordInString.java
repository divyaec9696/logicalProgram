package string;

public class ReverseEachWordInString {
	
	
	public static void main(String[] args) {
		
	
	String str="WELCOME TO JAVA";
	String []words=str.split("\\s");

	
	String reverseword="";
	
	for(String w:words)
	{
		StringBuilder sb=new StringBuilder(w);
		sb.reverse();
	
	  reverseword =reverseword+sb.toString();
	}
	 System.out.println(reverseword);
	}

}