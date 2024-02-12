//Write a Java program to search an element in an array list..
package module;

import java.util.ArrayList;

public class q53 {
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>();
		number.add(101);
		number.add(7);
		number.add(301);
		number.add(47);
		number.add(313);
		number.add(10);

		System.out.println(number);
		
 System.out.println("find the number of 7 in given Array:-"+number.contains(7));
 
 System.out.println("find the number of 777 in given Array:-"+number.contains(777));
	}
}
