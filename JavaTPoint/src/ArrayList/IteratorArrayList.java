package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorArrayList {

	public static void main(String[] args) {
		ArrayList <String> list=new ArrayList<String>();
		
		list.add("mango");
		list.add("apple");
		list.add("banana");

		Iterator  itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	
	
	
	
}
