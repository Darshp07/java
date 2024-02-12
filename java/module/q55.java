//• Write a Java program to copy one array list into another
package module;

import java.util.ArrayList;
import java.util.Collections;

public class q55 {
	public static void main(String[] args) {

		ArrayList<String> carlist1 = new ArrayList<>();

		carlist1.add("BMW");
		carlist1.add("Mercedes");
		carlist1.add("Audi");
		carlist1.add("Porsche");

		System.out.println(carlist1);

		ArrayList<String> carlist2 = new ArrayList<>();
//
//		carlist2.add("KIA");
//		carlist2.add("Bugatti");
//		carlist2.add("Mustang");

//		System.out.println(carlist2);
//
//		carlist1.addAll(carlist2);
//		System.out.println("copy array :" + carlist1);
//		
//		Collections.sort(carlist1);
//		System.out.println("Accending order:-"+carlist1);
		
		System.out.println(carlist2.addAll(carlist1));
		System.out.println(carlist2);

	}
}
