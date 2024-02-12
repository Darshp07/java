//• W.A.J.P to create the validate method that takes integer value as a parameter. If the  
//age is less than 18, then throw an Arithmetic Exception otherwise print a message
//welcome to vote.
//O/P- Enter your age: 16
//Exception in thread main java. Lang. Arithmetic Exception: not valid 
package module;

import java.util.Scanner;

public class q40 {
	  void validate(int age)  {
		if (age < 18) {
			throw new  ArithmeticException("you can not vote:");

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age:");
		int age = sc.nextInt();
		q40 v = new q40();
		try {
			
			v.validate(age);
			System.out.println("Welcome to vote.");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
