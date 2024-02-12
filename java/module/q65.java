
//Write a Java program of swap two elements in an array list.
package module;

import java.util.ArrayList;
import java.util.Collections;

public class q65 {
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>();
		number.add(101);
		number.add(7);
		number.add(301);
		number.add(47);
		number.add(313);
		number.add(10);
		
		System.out.println("wihtout swap :-"+ number);
		  Collections.swap(number, 1, 3);
		System.out.println("swap element 1 and 3 :-"+number);
	}
}
