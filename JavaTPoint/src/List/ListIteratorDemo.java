package List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		List<String> al=new ArrayList<String>();
		al.add("chetana");
		al.add("rahul");
		al.add("mangla");
		al.add("chandrabhan");
 		ListIterator<String> itr=al.listIterator();
		
 			System.out.println("Traversing elements in forward direction");    
        while(itr.hasNext()){    
              
        System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());    
        }    
        System.out.println("Traversing elements in backward direction");    
        while(itr.hasPrevious()){    
          
        System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());    
        }    
}  
		
		
		
		
	}

