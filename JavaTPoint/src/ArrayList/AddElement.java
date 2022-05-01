package ArrayList;

import java.util.ArrayList;

public class AddElement {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("Initial list of element :" +al);
		
		al.add("vicky");
		al.add("chetan");
		al.add("dholu");
		
		System.out.println("After invoking add(E e) method:"+al);
		al.add("laddu");
		System.out.println("After invoking add(int index,E element)method:"+al);
		
		ArrayList<String> al2=new ArrayList<String>();
		
		al2.add("shona");
	     al2.add("laddu");  
         
           al.addAll(al2);  
           System.out.println("After invoking addAll(Collection<? extends E> c) method: "+al);  
           ArrayList<String> al3=new ArrayList<String>();  
           al3.add("John");  
           al3.add("Rahul");  
           //Adding second list elements to the first list at specific position  
           al.addAll(1, al3);  
           System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al);  
             	
		
	}
}
