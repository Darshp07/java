//
//Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5
//and by both. 
package module;

import java.util.Scanner;

public class q10 {
  
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		
		 
		 for(int i=1;i<=100;i++) {
		 if(i%3==0 || i%5==0 ) {
			 
			 System.out.println(i+":this num is divisible by 3 and 5 ");
			 
		 }else if(i%5==0 ) {
			 System.out.println(i+":this num is divisible by 5 ");
			 
		 }else if(i%3==0 ) {
			 System.out.println(i+ ":this num is divisible by 3 ");
			 
		 }
		 
		 else 
		 {
			 System.out.println( i+": this num not is divisible by 3, 5 ");
		 }
		 }
	}
}
