package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
	set.add("chetan");
	set.add("vihu");
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
