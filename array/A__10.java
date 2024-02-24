package array;

import java.util.Scanner;

public class A__10 {
 public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  
	 int a[] = {10,2,20,3,45,89,5,89,12,4,66}; 
	 for(int i=0;i<a.length;i++) {
	  System.out.println("arry is "+i+" pos of ="+a[i]);
	 }
	 System.out.println("enter remove number of possition : ");
	 int d = sc.nextInt();
	 for(int i=0;i<a.length;i++) {
	
	 if(a[i] == a[d]) {
		 continue;
	 }
//	 System.out.println(i + "= number in "+a[i]+",");
	 System.out.print("\s"+a[i]);
	 }
	 
	 
	 
	 
	 sc.close();
}
 
 
}
