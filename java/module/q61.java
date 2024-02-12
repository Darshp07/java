//Write a Java program to count the number of key-value (size) mappings in a map. 
package module;

import java.util.HashMap;

public class q61 {
public static void main(String[] args) {
	HashMap<String, Integer> fruitpricemap = new HashMap<>();
	fruitpricemap.put("banana", 30);
	fruitpricemap.put("mango", 45);
	fruitpricemap.put("chiku", 60);
	
	System.out.println("size of map"+fruitpricemap.size());
}
}
