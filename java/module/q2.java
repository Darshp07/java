
//Write a Java program that takes the user to provide a single character from the
//alphabet. Print Vowel or Consonant, depending on the user input. If the user input
//is not a letter (between a and z or A and Z), or is a string of length > 1, print an error
//message. 
//Write a Java program that takes the user to provide a single character from the
//alphabet. Print Vowel or Consonant, depending on the user input. If the user input
//is not a letter (between a and z or A and Z), or is a string of length > 1, print an error
//message.


package module;
import java.util.Scanner;
public class q2 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch;
		
		System.out.println(" enter your latter:");
		 ch = sc.next().charAt(0);
		
		if( ch == 'A'|| ch == 'E' || ch == 'I'|| ch == 'O'|| ch == 'U' || ch == 'a' ||ch == 'e' ||ch == 'i'||ch == 'o'||ch == 'u' ) {
			
			System.out.println("vowle");
		}else  {
			System.out.println("Consonant");
		}
	} 

}
