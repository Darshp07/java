package games;

public class q14 {

	 public static void main(String[] args) {
//		
////	 1 
//		 2 3 
//		 4 5 6 
//		 7 8 9 10 
//		 11 12 13 14 15 
		 
		 int l=5;
		 int s=1;
		 for(int i=1;i<=l;i++) {
			 
			 for(int j=1;j<=i;j++) {
				
				 System.out.print(s+" ");
				 s++ ;
			 }
			 System.out.println();
		 }
	}
}
