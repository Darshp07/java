package copylist;

import java.util.HashSet;
import java.util.LinkedList;

public class linkcopy {
public static void main(String[] args) {
	 LinkedList<String> l = new LinkedList<>();
	 
	 l.add("java");
	 l.add("python");
	 l.add("java");
	 l.add("kotlin");
	 
	 System.out.println(l);
	 
	 HashSet<String> hs = new HashSet<>(l);
	 
	 System.out.println(hs);
}
}
