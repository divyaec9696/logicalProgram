package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		Deque <String> deque= new ArrayDeque<String>();
		deque.add("vihu");
		deque.add("chetan");
		
		for(String  str:deque) {
			System.out.println(str);
		}
		
		
		
		
		
	}
}
