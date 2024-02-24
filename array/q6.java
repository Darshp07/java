package array;

import java.util.Scanner;

public class q6 {
 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("enter your size of array :");
		int size =sc.nextInt();
		
		int a[]= new int[size];
		for(int i=0;i<a.length;i++) { 
			System.out.print(i +" pos num enter your value=" );
			a[i]= sc.nextInt();
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			sum +=a[i];
		}
		System.out.println("sum is :"+sum);
		System.out.println("avrg is :"+ sum/a.length);
		
		 sc.close();
	}
}
