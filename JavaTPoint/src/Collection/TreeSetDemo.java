package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet <String> set=new TreeSet<String>();
	    
		set.add("sun");
		set.add("moon");
	
	   Iterator<String> itr=set.iterator();
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next());
	   }
	
	}
	
}
