package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("mango");
		list.add("apple");
		list.add("banana");
	
		Collections.sort(list);
		for(String fruit:list)
		
			System.out.println(fruit);
			System.out.println("Sorting number...");
			
		List<Integer> list2=new ArrayList<Integer>();
		
		list2.add(12);
		list2.add(23);
		list2.add(34);
		list2.add(45);
		Collections.sort(list2);
		for(Integer number:list2)
			System.out.println(number);
		
	}
}
