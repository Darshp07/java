//Write a Java program to update specific array element by given element. 
package module;

import java.util.ArrayList;

public class q51 {
public static void main(String[] args) {
	ArrayList<Integer> num = new ArrayList<>();
	num.add(1);
	num.add(2);
	num.add(3);
	num.add(4);
	num.add(5);
	num.add(6);
	System.out.println("befor set element:"+num);
	
	num.set(2, 7);
	System.out.println("after element:"+num);
	
	
}
}
