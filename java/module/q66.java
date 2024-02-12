//Write a Java program to join two array lists. 
package module;

import java.util.ArrayList;

public class q66 {
	public static void main(String[] args) {
		ArrayList<String> carlist1 = new ArrayList<>();

		carlist1.add("BMW");
		carlist1.add("Mercedes");
		carlist1.add("Audi");
		carlist1.add("Porsche");
		System.out.println("Array list first is :-" + carlist1);
		
		ArrayList<String> carlist2 = new ArrayList<>();

		
		carlist2.add("KIA");
		carlist2.add("Bugatti");
		carlist2.add("Mustang");

		System.out.println("Array list second is :-" + carlist2);
		
		ArrayList<String> joinlist = new ArrayList<>();
		joinlist.addAll(carlist1);
		joinlist.addAll(carlist2);

		System.out.println("join first and second Array is :-" + joinlist);
	}

}
