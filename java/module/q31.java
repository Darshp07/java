package module;

import java.util.Scanner;

public class q31 {

	static int Factorial(int n) {

		if (n == 0 || n == 1) {

			return 1;
		}
		return n * Factorial(n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int number = sc.nextInt();
		if (number < 0) {
			System.out.println("Factorial is not defined for negative numbers.");
		} else {
			
			int result = Factorial(number);
			System.out.println(number + "! = " + result);
		}
		sc.close();
	}

}
