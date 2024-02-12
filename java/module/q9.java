//Write a Java program to print the ASCII value of a given character. 





package module;

import java.util.Scanner;

public class q9 {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your letter:");
		
		  char letter = sc.next().charAt(0);

		  int ASCII = letter;
		
		System.out.println("your ASCII value is :"+ ASCII);
	}
}

