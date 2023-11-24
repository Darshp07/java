

//Write a Java program that accepts an integer (n) and computes the value of
//n+nn+nnn. Input number: 5 
package module;

import java.util.Scanner;

public class q11 {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter a number :");
	  int n = sc.nextInt();
	  
	  int nn = n*10+n;
	  int nnn = n*100+nn;
	  
	  
	  System.out.println(n + "+"+ nn+  "+"+ nnn);
}
}
