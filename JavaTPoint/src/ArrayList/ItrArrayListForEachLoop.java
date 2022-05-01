package ArrayList;

import java.util.ArrayList;

public class ItrArrayListForEachLoop {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("mango");
		list.add("apple");
		list.add("banan");
	   
		for(String fruit:list)
		{
			System.out.println(fruit);
		}
	
	
	}
	
}
