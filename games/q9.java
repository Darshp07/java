package games;

public class q9 {
  public static void main(String[] args) {
       
//	  
//	      *
//	     * *
//	    *   *
//	   *     *
//	    *   *
//	     * *
//	      *

	  
	  int l=7;
	  int s=1;
	  int sp=l-1;
	  int m=(l/2)+1;
	  
	  for(int i=1;i<=l;i++)
	  {
		  for(int k=1;k<=sp;k++)
		  {
			  System.out.print(" ");
		  }
			  for(int j=1;j<=s;j++)
			  {
				  
					  System.out.println("*");
				  }
			
			  }
			   
		 
		  System.out.println("");
		  
		
  }
}
