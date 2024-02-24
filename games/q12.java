package games;

public class q12 {
 
	public static void main(String[] args) {
		
//	    0
//		10
//		010
//		1010
//		01010
//		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2==i%2)
				{
					System.out.print("0");
				}else 
				{
					System.out.print("1");
				}
				
			}
			System.out.println("");
		}
	}
}

