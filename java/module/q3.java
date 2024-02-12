//Write a Java program that takes a year from user and print whether that year is a leap
//year or not. 

package module;

import java.util.Scanner;
public class q3 {



public static void main(String[] args) {
	
	 Scanner sc  = new Scanner(System.in);
	 int year;
		  System.out.println("enter your year:");
	 
	 year = sc.nextInt();
	 
	 if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
		 System.out.println("your year is leap year ");
		 
	 }else {
		 System.out.println("your year is not leap year ");
	 }
	 sc.close();
}
}
