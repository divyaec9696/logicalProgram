package ArrayList;

import java.util.ArrayList;

public class GetSetArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("mango");
		list.add("apple");
		list.add("banana");
		
	System.out.println("Returning element:"+list.get(1));
	list.set(1, "Grapes");
	for(String fruit:list)
	{
		System.out.println(fruit);
	}
		
		
	}
}
