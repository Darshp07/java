package games;

import java.util.Scanner;

public class aem {
	
	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		
              System.out.println("enter your numb 1 to 999:");
				int num = sc.nextInt();
				int temp = num;
				int sum = 0;
				
				while (num > 0)
				{
					int rem = num % 10;
					sum = sum +(rem*rem*rem);
					num = num / 10;	
				}
				
				if(temp==sum)
				{
					System.out.println("Armstrong");
				}
				else
				{
					System.out.println("not armstrong");
				}	
			}
	}

