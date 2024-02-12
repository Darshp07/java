//Write a Java program to retrieve an element (at a specified index) from a given array
//list.
package module;

import java.util.ArrayList;
import java.util.Scanner;

public class q50   {
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 ArrayList<String> flowerlist = new ArrayList<>();
		 
		 flowerlist.add("Lotus");
		 flowerlist.add("Rose");
		 flowerlist.add("Marigold");
		 flowerlist.add("Mogra");
		 System.out.println("enter you get index:");
		 int index = sc.nextInt();
		 
		 System.out.println("index is:-"+ index +"\nelement in this index is :-"+flowerlist.get(index));
		 sc.close();
	}
}

