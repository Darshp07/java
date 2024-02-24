package array;

import java.util.Scanner;

public class A__02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter  your size of  array :");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		int sum =0;
		for(int i=0;i<a.length;i++)
		{
			
			System.out.println("enter your value index " + i+":");
			a[i] = sc.nextInt();
			sum =+a[i];
			 
		}
		 System.out.println("sum :"+ sum);
		 sc.close(); 
	}  
	
}
