//Write a Java program to replace the second element of an Array List with the
//specified element. 
package module;

import java.util.ArrayList;

public class q70 {
public static void main(String[] args) {
	ArrayList< String> animalist = new ArrayList<>();
	
	animalist.add("Tiger");
	animalist.add("Lion");
	animalist.add("Dog");
	animalist.add("Elephant");
	animalist.add("lepord");
	animalist.add("Hipopotemas");
	animalist.add("Cat");
	
	System.out.println("befor replace element:-"+animalist);

	 String name = "Crocrodail";
	 
	 animalist.set(2, name);
	 System.out.println("after replace element:-"+animalist);
}
}
