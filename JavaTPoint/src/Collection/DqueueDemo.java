package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DqueueDemo {

	public static void main(String[] args) {
				Deque<String> d=new ArrayDeque<String>();
		
		d.add("vihan");
		d.add("chetan");
		d.add("maheshri");
		
		for(String str:d)
		{
		System.out.println(str);	
		}
	}
}
