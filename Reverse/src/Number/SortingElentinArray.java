package Number;

import java.util.Arrays;
import java.util.Collections;

public class SortingElentinArray {
	public static void main(String[] args) {
		
		int a[]= {3,5,2,1,4};
		System.out.println("arrays before sorting : "+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("array after sorting: "+Arrays.toString(a));
		
		System.out.println("------------");
	
		int b[]= {3,9,11,1,4};
		System.out.println("arrays before sorting : "+Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("array after sorting: "+Arrays.toString(b));
		
		System.out.println("-------------");///reverse order
		Integer c[]= {30,90,11,10,40};
		System.out.println("arrays before sorting : "+Arrays.toString(c));
		Arrays.sort(c,Collections.reverseOrder());
		System.out.println("array after sorting: "+Arrays.toString(c));
		
		
		
		
		
	}

}
