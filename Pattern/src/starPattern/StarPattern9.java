package starPattern;

public class StarPattern9 {
	
	public static void main(String[] args) {
		
		
		for(int i=1;i<=4;i++)
		{
          for (int j=1;j<=i;j++)
             {
               System.out.print(" ");        	 
              }
          for(int k=4;k>=i;k--)
              {
        	   System.out.print("*");
               }
          for(int l=3;l>=i;l--)
             {
        	   System.out.print("*");
              }
          
          System.out.println();
          }
		
     System.out.println("2nd way "); 
     
     for(int i=1;i<=4;i++)
		{
	      for( int j=1;j<=i;j++)
	       {
	    	  System.out.print(" ");        	 
	        }
	      for(int k=9;k>(i*2);k--)
	        {
	      	   System.out.print("*");
            }
	      System.out.println();

	}
     System.out.println("Third way");
     
        for(int i=5;i>=1;i--)
        {
        	for(int j=5;j>i;j--) 
        	{
         		System.out.print(" ");
        	}
        	for(int k=1;k<(i*2);k++);
        	{
        	 System.out.print("*");
        			
        	}
        	System.out.println();
        }
	
	}
}

