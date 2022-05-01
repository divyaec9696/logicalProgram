package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		List<String> fruitlist =new ArrayList<>();
		fruitlist.add("mango");
		fruitlist.add("banana");
		fruitlist.add("apple");
		
		String[]array=fruitlist.toArray(new String[fruitlist.size()]);

		System.out.println("Printing Array:"+Arrays.toString(array));
		System.out.println("printing list:"+fruitlist);
	}
}
