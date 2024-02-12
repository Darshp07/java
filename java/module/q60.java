 //Write a Java program to associate the specified value with the specified key in a
//Hash Map.
package module;

import java.util.HashMap;

public class q60 {
	public static void main(String[] args) {
		HashMap<String, Integer> fruitpricemap = new HashMap<>();
		fruitpricemap.put("banana", 30);
		fruitpricemap.put("mango", 45);
		fruitpricemap.put("chiku", 60);
		System.out.println(fruitpricemap);

	}
}
