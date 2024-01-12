package module;

import java.util.Scanner;

public class q8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		 int num2 =
		
		System.out.println("enter your number less than ten billion  :");
		
		long num = sc.nextLong();
		int count =1;
		while(num>9) {
			num=num/10;
			System.out.println(num);
			count++;
		}
		System.out.println("Number of digits in the number:"+ count);
	}

}
