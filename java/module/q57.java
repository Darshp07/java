//Write a Java program to append the specified element to the end of a hash set.
package module;

import java.util.HashSet;

public class q57 {
	public static void main(String[] args) {
		HashSet<String> myString = new HashSet<>();
		
		myString.add("darsh");
		myString.add("abhi");
		myString.add("mitesh");
		myString.add("yatin");
		
		System.out.println("without added :"+myString);
		
		String name ="meet";
		
	
		myString.add(name);
		
	
		System.out.println("with added :"+myString);
	}

}
