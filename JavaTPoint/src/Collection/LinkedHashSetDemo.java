package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<String>();
	set.add("chetan");
	set.add("pune");
	set.add("vicky");
	set.add("chetan");
	
	Iterator <String> itr=set.iterator();
	
	while(itr.hasNext())
	{
	System.out.println(itr.next());	
	}
	
	
	}
}
