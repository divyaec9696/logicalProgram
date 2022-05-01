package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {
		
		
		ArrayList list=new ArrayList();
		
		list.add("ravi");
		list.add("vijay");
		list.add("ravi");
		list.add(10);
		Iterator itr =list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	
		
	}
}
