//Write a Java program to get the number of elements in a hash set.
package module;

import java.util.HashSet;

public class q59 {
	public static void main(String[] args) {

		HashSet<String> numset = new HashSet<>();
		numset.add("ONE");
		numset.add("TWO");
		numset.add("THREE");
		numset.add("FOUR");
		
		System.out.println("the number of elements in a hash set:-"+numset.size());
	}
}
