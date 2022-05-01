package Collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

public static void main(String[] args) {
		
		
		Vector v=new Vector();
		
		v.add("ravi");
		v.add("vijay");
		v.add("ravi");
		v.add(10);
		Iterator itr =v.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
}
}
