package patten;

public class q1 {
	public static void main(String[] args) {
		
		
//		*
//		**
//		***
//		****
//		*****
		
		int line =9;
//		int starcount=line;
		for(int i=1;i<=line;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		        line--;
		}
	}

}
