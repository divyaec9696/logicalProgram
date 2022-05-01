package Number;

public class RemoveJunk {

	public static void main(String[] args) {
		String s="!@@#$#^123$ This is junk";
		s=s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(s);
		
		
	}
}
