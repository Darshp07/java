package games;

public class q13 {

	
	public static void main(String[] args) {
		
//		A
//		BC
//		DEF
//		GHIJ
//		KLMNO
		
//		char l='A';
		char s = 'A';
		
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(s+" ");
				s++;
			}
			System.out.println(" ");
		}
	}
}
