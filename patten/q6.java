package patten;

import java.util.Scanner;

public class q6 {
 
	public static void main(String[] args) {
		
		 Scanner sc =new Scanner(System.in);
		 
		    int i, j;

		    System.out.println("Enter the height of the home: ");
		    int height = sc.nextInt();
		    

		    for (i = 1; i <= height / 2 + 1; i++) {
		        for (j = 1; j <= height - i; j++)
		            System.out.print(" ");
		        for (j = 1; j <= 2 * i - 1; j++)
		          System.out.print("*");
		        System.out.println("\n");
		    }

		    // Draw the walls
		    for (i = 1; i <= height / 2; i++) {
		        System.out.print("*");
		        for (j = 1; j <= height - 2; j++)
		            System.out.print("");
		        System.out.println("*");
		    }

		  
		}

	
}

