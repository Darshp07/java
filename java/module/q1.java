
//Write a Java program to Take three numbers from the user and print the greatest
//number. 

package module;
import java.util.Scanner;

public class q1 {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  
//	  Write a Java program to Take three numbers from the user and print the greatest
//	  number. 
	  
	  int a,b,c;
	  
	  System.out.println("enter your three number : ");
	  a = sc.nextInt();
	  b = sc.nextInt();
	  c = sc.nextInt();
	   

		String result =  a>b ? a>c ? "A is greater":"C is greater" : b>c ? "B is greater":"C is greater" ;
		
		System.out.println(result);
		sc.close();
  }
}
