package construct;

import java.util.Scanner;

class array {

	

	public int[] input(Scanner sc, int size) {
		int[] newarray = new int[size];
		System.out.println("enter your  array:");

		for (int i = 0; i < newarray.length; i++) {

			newarray[i] = sc.nextInt();

		}
		
		return newarray;
	}

}

public class Array02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		

		array b = new array();
		
		int[] newarray = b.input(sc, 5);
		for (int i = 0; i < 6; i++) {

			System.out.println(newarray[i]);

		}

	}
}
