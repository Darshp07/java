//Take two numbers from the user and perform the division operation and handle
//Arithmetic Exception. O/P- Enter two numbers: 10 0 
package module;

import java.util.Scanner;

public class q36 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" enter your num1: ");
	int num1 =sc.nextInt();
	System.out.println("enter your num2: ");
	int num2 = sc.nextInt();
	
	try {
		System.out.println("divide of num1 and num2"+(num1/num2));
		
	}catch (ArithmeticException e) {
		System.out.println("in this code of arithmeticexception"+e);
	
	}
	
}
}
