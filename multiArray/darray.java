package multiArray;

public class darray {

	public static void main(String[] args) {

		int[][] myArray = { { 34, 56, 77 }, { 11, 33, 55 }, { 20, 30, 40 } };
		int[][] myArray1 = { { 76, 98, 45 }, { 65, 89, 45 }, { 99, 11, 22 } };

		for (int i = 0; i <= myArray.length - 1; i++) {
			for (int j = 0; j <= myArray.length - 1; j++) {
				System.out.print(" " + myArray[i][j]);
			}
			System.out.println("  ");
		}
		System.out.println("\n");
		for (int i = 0; i <= myArray1.length - 1; i++) {
			for (int j = 0; j <= myArray1.length - 1; j++) {
				System.out.print(" " + myArray1[i][j]);
			}
			System.out.println("  ");
		}

		System.out.println("*************");
		
		   for(int i=0;i<3;i++) {
			   for(int j=0;j<3;j++) {
				   System.out.print(myArray[i][j]+myArray1[i][j]+" ");
			   }
			   System.out.println("");
		   }
	}
}
