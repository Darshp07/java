package construct;

import java.util.Scanner;

class std{
	
	int age;
	
	String name;
	
	String surname;
	
	int id;
	public void enroll(){
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("enter your age:");
		age =sc.nextInt();
		System.out.println(" enter your name :");
		name =sc.next();
		System.out.println("enter your surname :");
		surname =sc.next();
		System.out.println("enter your id  :");
		id =sc.nextInt();		
		System.out.println("your age is:"+age);
		System.out.println("your name is :"+name+" "+surname);
		System.out.println("your id is :"+id);
		
		System.out.println("\n");
		}
	
}

public class Array01 {
	
	public static void main(String[] args) {
		
		
		
		std d = new std();
		
		d.enroll();
		
		
		

	}
}
	