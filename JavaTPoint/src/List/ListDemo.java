package List;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
	
	List<String> list=new ArrayList<String>();
	list.add("Mango");
	list.add("apple");
	list.add("Banana");
	list.add("Grapes");
	
	for(String fruit:list)
	{
		System.out.println(fruit);
	}
}
}