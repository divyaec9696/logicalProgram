package Number;

public class EvenOddOfArray2 {

	public static void main(String[] args) {
		int a[]= {1,3,4,54,23,78};
		System.out.println("Even number is array...");
	  
		for(int value:a)
		{
			if(value%2==0)
			{
				System.out.println(value);
			}
		}
	
	
		System.out.println("Odd number is array...");
		  
		for(int value:a)
		{
			if(value%2!=0)
			{
				System.out.println(value);
			}
		}
	
	}
	
}
