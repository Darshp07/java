package games;

public class q16 {
 
	public static void main(String[] args) {
//		
//		
//		A  
//		A B  
//		A B C  
//		A B C D  
//		A B C D E  
		
		int l=5;
		
		for(int i=1;i<=l;i++) {
			char letter = 'A';
			for(int j=1;j<=i;j++) {
				System.out.print(letter+" ");
				letter++;
			}
			System.out.println(" ");
		}
	}
}
