//Write a Java program to iterate through all elements in an array list
package module;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class q48 {
	public static void main(String[] args) {
   
		ArrayList<String> name = new ArrayList<>();
		
		name.add("darsu");
		name.add("kittu");
		name.add("bittu");
		name.add("darshak");
		name.add("bholu");
		
		Iterator<String>iterator = name.iterator();
		 while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
			
		}
	

////		method 1 : foreach loop 
//		System.out.println("!) use foreach loop:-");
//		for(String n : name) {
//			System.out.print(n+" ");
//		}
////		System.out.println("******************");
//		
////		mthod 2 : lambda
//		System.out.println("\n2)  useing lambda:- ");
//		name.forEach(element -> System.out.print(element+" ") );
	}
}
