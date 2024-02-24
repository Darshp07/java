package patten;

public class q2 {
	public static void main(String[] args) {
		
//		
//		*****
//		****
//		***
//		**
//		*
		
		int n =5;
		int count =1;
		for(int i=0;i<=n;i++) {
			for(int j=n ;j>=count;j--) {
				System.out.print("* ");
			}
			System.out.println("* ");
			count++;
		}
		
	}

}
  