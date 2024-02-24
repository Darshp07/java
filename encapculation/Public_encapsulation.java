package encapculation;

class movie {
	public int rank;
	private String name;
	protected double income;

	void display() {
		System.out.println("rank is" + rank + "name is " + name + "income is " + income);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}

class gujmovie extends movie {

	void show() {
		System.out.println("rank is " + rank + "name is " + getName() + "income " + income);
	}
}

public class Public_encapsulation {

	public static void main(String[] args) {

	}
}
