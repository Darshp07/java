//Write a Java program to convert a hash set to a List/Array List. 
package module;

import java.util.ArrayList;
import java.util.HashSet;


public class q68 {
public static void main(String[] args) {
	HashSet<Integer> hashnumset = new HashSet<>();
	
	hashnumset.add(7);
	hashnumset.add(77);
	hashnumset.add(777);
	
	System.err.println("hashset:-"+ hashnumset);
	
	ArrayList<Integer> listnum = new ArrayList<>(hashnumset);
	
	System.out.println(listnum);
	
	System.out.println("\nElements in the ArrayList:");
    for (Integer element : listnum) {
        System.out.println(element);
    }
    
	
}
}
