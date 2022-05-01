package string;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		
		String s="Vihan Chetan Maheshri";
		int totalcount=s.length();
	     int totalcount_afterremove=s.replace("h","").length();
	     int count=totalcount-totalcount_afterremove;
	     System.out.println("number Occurance of h is :"+count);
	   
	
	}

}
