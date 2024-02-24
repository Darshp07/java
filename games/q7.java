package games;

public class q7 {
	public static void main(String[] args) {

//	    *
//	   ***
//    *****
//     ***
//      *

		int l = 9;
		int s = 1;
		int sp = l - 1;
		int m = (l / 2) + 1;

		for (int i = 1; i <= l; i++) {

			for (int j = 1; j <= s; j++) {
				System.out.print("*");
			}

			System.out.println("  ");

			if (i < m) {
				s = s + 2;
				sp--;
			} else {
				s = s - 2;
				sp++;
			}

		}

	}
}
