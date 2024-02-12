//Write a Java program to extract a portion of an array list. 
package module;

import java.util.ArrayList;

public class q63 {
	public static void main(String[] args) {
		ArrayList<String> list_Strings = new ArrayList<>();
//		list_Strings.add("One");
//		list_Strings.add("Two");
//		list_Strings.add("Three");
//		list_Strings.add("Four");
//		list_Strings.add("Five");

		for (int i = 0; i <= 10; i++) {
			list_Strings.add("" + i);
		}
		System.out.println("wihtout extraxct :" + list_Strings);

		System.out.println("extract Array 3 to 8 :-" + list_Strings.subList(3, 8));

	}
}
