package Number;

public class EvenOddOfArray {

	public static void main(String[] args) {
		int a[]= {1,3,4,54,23,78};
		System.out.println("Even numbe is array...");
		for(int i=0;i<a.length;i++)
       {
           if(a[i]%2==0)
           {
        	   System.out.println(a[i]);
           }

	    }
		System.out.println("Odd numbe is array...");
		for(int i=0;i<a.length;i++)
       {
           if(a[i]%2!= 0)
           {
        	   System.out.println(a[i]);
           }

	    }
     }
	}