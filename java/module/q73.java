
//Write a Java program to get a collection view of the values contained in this map.
package module;

import java.util.Collection;
import java.util.HashMap;

public class q73 {
	public static void main(String[] args) {

		HashMap<String, Integer> vegetables = new HashMap<>();
		vegetables.put("potato", 30);
		vegetables.put("Carrots", 35);
		vegetables.put("Tomatoes", 50);
		vegetables.put("Beets", 70);
		vegetables.put("Garlic", 75);

		Collection<Integer> list = vegetables.values();

		System.out.println("Values in the map:");
		for (Integer value : list) {
			System.out.println(value);
		}
	}
}
