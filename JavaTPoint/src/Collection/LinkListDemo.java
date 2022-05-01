package Collection;


import java.util.Iterator;
import java.util.LinkedList;

public class LinkListDemo {

public static void main(String[] args) {
		
		
		LinkedList list=new LinkedList();
		
		list.add("ravi");
		list.add("vijay");
		list.add("ravi");
		list.add(10);
		Iterator itr =list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
}
}
