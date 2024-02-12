
//
//Write a program in Java to input 5 numbers from keyboard and find their sum and  
//average using for loop

package module;

import java.util.Scanner;

public class q5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
int sum =0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("enter your digit " + i);
			int num = sc.nextInt();

			sum = +num ;

		}

		System.out.println("Sum of the numbers is: " + sum);
		double aveg = sum / 5;
		System.out.println("aveg of the numbers is: " + aveg);
		sc.close();
	}
}