

//Write a Java program that accepts an integer (n) and computes the value of  
//n+nn+nnn. Input number: 5 
package module;

import java.util.Scanner;

public class q11 {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		   System.out.println("enter your n :");
		int n = sc.nextInt();

		int term =0;
		if(n<=11) {
		for(int i=1;i<n;i++) {
			if(i==n || i==1) {
				System.out.print("");
			}else {
				 
	 System.out.print("+");
			}
		  
			term = term*10 +1;
//			
			System.out.print(term+" ");
		}
		}
		else {
			System.out.println("enter less than 10 ");
		}
	}
}
