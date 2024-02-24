
//Create a Circle Class:Write a class named Circle with an initializer that takes the radius as an argument.Implement a method to calculate the area of
//the circle.

package sir;

class Circle {
	double r;

	Circle() {

	}

	void Calculat2(double r) {

		this.r = r;

	}

	Circle(double r) {
		this.r = r;
	}

	void disPlay() {
		double area = 3.14 * r * r;
		System.out.println("area  is:-" + area);
	}

}

public class q1 {

	public static void main(String[] args) {

		Circle c1 = new Circle();
		c1.r = 23;
		c1.disPlay();

		Circle c2 = new Circle();
		c2.Calculat2(12);
		c2.disPlay();

		Circle c3 = new Circle(22);
		c3.disPlay();

	}

}
