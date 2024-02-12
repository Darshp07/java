//Write a Java program to print all the elements of an Array List using the position of
//the elements.
package module;

import java.util.ArrayList;

public class q71 {

	public static void main(String[] args) {
		
		ArrayList<String> brandlist = new ArrayList<>();
		brandlist.add("Apple");
		brandlist.add("TATA");
		brandlist.add("Boat");
		brandlist.add("Microsoft");
		brandlist.add("Tesla");
		
		
		for(int i=0;i<brandlist.size();i++) {
			System.out.println("position :-"+i+" in the element of :-"+brandlist.get(i));
		}
		
	}
}
