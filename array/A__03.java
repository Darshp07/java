package array;

public class A__03 {
  public static void main(String[] args) {
	
      int a[] = {23,24,13,13,54,13,42,42,41,55};
      int sum =0;
      
      for(int i=1;i<a.length;i++) {
//    	  
    	  sum =sum + a[i];
    	 
      }
       System.out.println("sum :"+sum);
       System.out.println("arg :"+sum/a.length);
	  }
	 
}
