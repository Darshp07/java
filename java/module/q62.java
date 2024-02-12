//• Write a Java program to reverse elements in an array list.
package module;

import java.util.ArrayList;

public class q62 {
	public static void main(String[] args) {
		ArrayList<String> Mobilelist = new ArrayList<>();

		Mobilelist.add("oppo");
		Mobilelist.add("Apple");
		Mobilelist.add("jio");
		Mobilelist.add("vivo");
		Mobilelist.add("samsung");
		Mobilelist.add("realme");
		Mobilelist.add("mi");

		System.out.println(Mobilelist);

		System.out.println("revresed Array" + Mobilelist.reversed());
	}
}
