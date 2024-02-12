//• Write a Java program to increase the size of an array list
package module;

import java.util.ArrayList;

public class q69 {
public static void main(String[] args) {
	 ArrayList<Integer> mynumlist = new ArrayList<>();
	 mynumlist.add(3648);
	 mynumlist.add(6467);
	 mynumlist.add(8871);
	 
	 System.out.println("wihtout increase size is :-"+mynumlist.size());
	 
	 mynumlist.add(4123);
	 mynumlist.add(431);
	 
	 System.out.println("increase size is :- "+mynumlist.size());
}
}
