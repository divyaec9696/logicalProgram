package Number;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]={10,20,40,30,60};
		   int search_ele=20;
		   boolean flag=false;
	
	for(int i=0;i<a.length;i++)
	{
		if(search_ele==a[i])
		{
			System.out.println("Element found at:"+i);
              flag=true;
		}
	}
	if(flag==false)
	{
		System.out.println("Element not found");
	}
	
	}
	
}
