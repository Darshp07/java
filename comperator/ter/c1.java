package comperator.ter;

import java.util.ArrayList;


class user implements Comparable<user> {

	private int id;
	private String name;
	private int age;

	public user(int id, String name, int age) {

		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(user std) {
		if (this.age > std.age) {

			return 1;
		} else if (this.age < std.age) {
			return -1;
		} else
			return 0;

	}

}

public class c1 {
	public static void main(String[] args) {

		ArrayList<user> i = new ArrayList<>();
		i.add(new user(7, "darsh", 25));

		user newuser = new user(77, "darshak", 25);

		System.out.println(i.get(0).compareTo(newuser));
	}

}
