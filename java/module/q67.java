//• Write a Java program to convert a hash set to an array
package module;

import java.util.HashSet;

public class q67 {
	public static void main(String[] args) {
		HashSet<String> fruitSet = new HashSet<>();
		fruitSet.add("banana");
		fruitSet.add("chiku");
		fruitSet.add("mango");
		
		String Array[]= new String[fruitSet.size()];
		
		fruitSet.toArray(Array);
		
				
		System.out.println("Elements in the array:");
        for (String element : Array) {
            System.out.println(element);
        }
	}

}
