
// Write a program which will ask the user to enter his/her
//marks (out of 100). Define a method that will display grades according to the marks
//entered as below:
//Marks Grade
//91-100 AA
//81-90 AB
//71-80 BB
//61-70 BC
//51-60 CD
//41-50 DD
//40 Fail
package module;

import java.util.Scanner;

public class q33 {
	static int displaygrades(int marks) {

		if (marks > 100 || marks < 0) {
			System.out.println("Please enter your number between 0 to 100 ");
		} else if (marks > 90 && marks <= 100) {
			System.out.println("your grad is AA");
		} else if (marks > 80 && marks <= 90) {
			System.out.println("your grad is AB");
		} else if (marks > 70 && marks <= 80) {
			System.out.println("your grad is BB");
		} else if (marks > 60 && marks <= 70) {
			System.out.println("your grad is BC");
		} else if (marks > 50 && marks <= 60) {
			System.out.println("your grad is CD");
		} else if (marks > 40 && marks <= 50) {
			System.out.println("your grad is DD");
		} else if (marks < 40) {
			System.out.println("your grad is fail");
		}
		return marks;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks :");
		int marks = sc.nextInt();
		displaygrades(marks);
		
	}
	
}
