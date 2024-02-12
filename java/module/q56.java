//• Write a Java program to shuffle elements in an array list.
package module;

import java.util.ArrayList;
import java.util.Collections;

public class q56 {
	public static void main(String[] args) {
		ArrayList<Integer> numberlist = new ArrayList<>();
		numberlist.add(100);
		numberlist.add(200);
		numberlist.add(300);
		numberlist.add(400);
		numberlist.add(400);
		numberlist.add(500);
		numberlist.add(600);
		numberlist.add(700);

		System.out.println("list of Array:-"+numberlist);

		// sort Array

		Collections.shuffle(numberlist);
		System.out.println("shuffle array:-"+numberlist);

	}
}
