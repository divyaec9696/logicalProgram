package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		
		String [] array= {"java","Python","PHP","C++"};
		System.out.println("printing Array:"+Arrays.toString(array));
        
		List<String> list=new ArrayList<String>();
		
		for(String lang:array)
		{
			list.add(lang);
		}
		System.out.println("Printing List:"+list);
		
		
		
	}
}
