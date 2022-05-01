package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();
		
		
		al.add("divya");
		al.add("chetan");
		al.add("maheshri");
		
		Iterator<String >itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
