package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		
		pq.add("divya");
		pq.add("maheshri");
		pq.add("hetvik");
	
		System.out.println("head:"+pq.element());
		System.out.println("head:"+pq.peek());
		System.out.println("iterating the queue element :");
		Iterator itr=pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		pq.remove();
		pq.poll();
		System.out.println("after removing two element");
		Iterator itr2=pq.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
	}
}
