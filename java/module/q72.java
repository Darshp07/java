//Write a Java program to compare two sets and retain elements which are same on
//both sets.
package module;

import java.util.HashSet;
import java.util.Set;

public class q72 {
	public static void main(String[] args) {
		HashSet<String> godlist = new HashSet<>();

		godlist.add("shiv");
		godlist.add("krishna");
		godlist.add("Ram");
		godlist.add("Hanuman");

		System.out.println("first Array is :-" + godlist);

		HashSet<String> godlist2 = new HashSet<>();
		godlist2.add("vishnu");
		godlist2.add("shiv");
		godlist2.add("ganesh");
		godlist2.add("bhrama");

		System.out.println("second Array is:-" + godlist2);

		godlist.retainAll(godlist2);
		System.out.println("common element is :-" + godlist);
	}
}
