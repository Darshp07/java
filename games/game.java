package games;

import java.util.Scanner;

public class game {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("let start games");
		
		System.out.println("*******************************************");
		int mynumber = (int)(Math.random()*100);
		int usernumber ;
		
		do {
		  
			System.out.println("enter your number :");
			usernumber =sc.nextInt();
			
		if (usernumber == mynumber)
		{
			 System.out.println("wow !! you win ");
//			 break ;
		}
		else if (usernumber > mynumber)
		{
			System.out.println("your num is large");
			
		}
		else
		{
			System.out.println("your num is small");
		}
	
		}
		while (usernumber >=0);
		
		 System.out.print("my number is :"+ mynumber);
		 
}
}
