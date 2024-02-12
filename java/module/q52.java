//Write a Java program to remove the third element from an array list
package module;

import java.util.ArrayList;

public class q52 {
	public static void	 main(String[] args) {
		
	ArrayList<String> M = new ArrayList<>();
	
	M.add("oppo");
	M.add("Apple");
	M.add("jio");
	M.add("vivo");
	M.add("samsung");
	M.add("realme");
	M.add("mi");
	
	System.out.println("befor remove element:-"+M);
	
	M.remove(3);
	System.out.println("after remvoe element:-"+M);
	}

}
