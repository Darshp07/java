//Write a Java program to iterate through all elements in a hash list
package module;

import java.util.HashSet;
import java.util.Iterator;

public class q58 {
public static void main(String[] args) {
	HashSet<String> hashSet = new HashSet<>();
	
	  hashSet.add("Apple");
      hashSet.add("Banana");
      hashSet.add("Orange");
      
      Iterator<String> iterator = hashSet.iterator();
      
      while (iterator.hasNext()) {
          String element = iterator.next();
          System.out.println(element);
      }
}
}
