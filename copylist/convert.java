package copylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

import folder_c.newone;

public class convert {
	public static void main(String[] args) {
		ArrayList<Integer> n = new ArrayList<>();
		n.add(23);
		n.add(3);
		n.add(26);
		n.add(213);
		n.add(7);
		
		System.out.println( n);
		
		HashSet<Integer> h = new HashSet<>(n);
		
		System.out.println(h);
		
		LinkedHashSet<Integer> l = new LinkedHashSet<>(n);
		
		System.out.println(l);
		
		
		
		
	}

}
