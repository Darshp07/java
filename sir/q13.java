//Simple Calculator Class: Design a Calculator class with methods to perform basic arithmetic operations like add, subtract, multiply, and divide.
package sir;

class Calculater {

	int a;
	int b;

	public Calculater() {

	}

	Calculater(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int display() {

		System.out.println("addition :" + (a + b));
		System.out.println("subctation :" + (a - b));
		System.out.println("multipilcation :" + (a * b));
		System.out.println("subctation :" + (a / (float)b));
		System.out.println("******************");
		return 0;
	}

	int maths(int a, int b) {
		this.a = a; 
		this.b = b;

		return 0;
	}

}

public class q13 {

	public static void main(String[] args) {
		Calculater C = new Calculater();
		C.a = 733;
		C.b = 126;
		C.display();
		Calculater C1 = new Calculater();
		C1.maths(354, 273);
		C1.display();

		Calculater C2 = new Calculater(345, 123);
		C2.display();
	}

}
