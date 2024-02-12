//Write a Java program to compare two array lists
package module;

import java.util.ArrayList;

public class q64 {
	public static void main(String[] args) {
  // first Array
		ArrayList<Integer> Roll_nolist = new ArrayList<>();

		Roll_nolist.add(1);
		Roll_nolist.add(2);
		Roll_nolist.add(3);
		Roll_nolist.add(4);
		Roll_nolist.add(5);
// second Array
		ArrayList<String> list_Strings = new ArrayList<>();

		list_Strings.add("One");
		list_Strings.add("Two");
		list_Strings.add("Three");
		list_Strings.add("Four");
		list_Strings.add("Five");
// third Array		
		ArrayList<String> list_Strings2 = new ArrayList<>();

		list_Strings2.add("One");
		list_Strings2.add("Two");
		list_Strings2.add("Three");
		list_Strings2.add("Four");
		list_Strings2.add("Five");
		// comper first to second
		System.out.println("comper first to second:-"+Roll_nolist.equals(list_Strings));
		//comper second to third
		System.out.println("comper second to third:-"+list_Strings.equals(list_Strings2));
		//comper to third to first
		  System.out.println("comper third to first:-"+list_Strings2.equals(Roll_nolist));
		
	}
}
