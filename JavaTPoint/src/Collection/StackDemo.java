package Collection;


import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

public static void main(String[] args) {
		
		
	Stack s=new Stack();
		
		s.push("ravi");
		s.push("vijay");
		s.push("ravi");
		s.push(10);
		s.pop();
		
		Iterator itr =s.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
}
}