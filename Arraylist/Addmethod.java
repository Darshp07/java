package Arraylist;

import java.util.ArrayList;

public class Addmethod {
	public static void main(String[] args) {
		
		ArrayList<Integer> run = new ArrayList<>();
		
		run.add(99);
		run.add(87);
		run.add(37);
		run.add(676);
		run.add(23);
		for(int Arry : run) {
			System.out.println(Arry);
			
		}
		
		System.out.println("size of given arry: "+run.size());
		System.out.println(""+run.indexOf(3));
		System.out.println(run.toArray());
		System.out.println(run.iterator());
		System.out.println(run.toString());
		
		System.out.println("***************************");
		ArrayList<String> name = new ArrayList<>();
		name.add("darsh");
		name.add("kajal");
		name.add("nikita");
		
		System.out.println(name);
		name.add("vidhi");
		System.out.println(name);
		
	}

}
