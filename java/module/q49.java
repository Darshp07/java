//Write a Java program to insert an element into the array list at the first position

package module;

import java.util.ArrayList;

public class q49 {
	public static void main(String[] args) {
		ArrayList<String> fruitlist = new ArrayList<>();
		fruitlist.add("banana");
		fruitlist.add("papya");
		fruitlist.add("chiku");
		fruitlist.add("dragone");
		System.out.println("Array list:-"+fruitlist);
		
		System.out.println("\nbefot added array list at the first position :" + fruitlist.getFirst());

		fruitlist.add(0, "mango");
		
		System.out.println("\nArray list:-"+fruitlist);

		System.out.println("\nafter added array at first position :"+fruitlist.getFirst());
	}
}
