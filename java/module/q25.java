//
//Create a class named 'Rectangle' with two data members 'length' and 'breadth' and
//two methods to print the area and perimeter of the rectangle respectively. Its
//constructor having parameters for length and breadth is used to initialize the length
//and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its
//constructor having a parameter for its side (suppose s) calling the constructor of its
//parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.
package module;

class Rectangle {

	int length;
	int breadth;
	int area;
	int perimeter;

	Rectangle(int length, int breadth) {
		this.breadth = breadth;
		this.length = length;
	}

	public void area() {

		area = length * breadth;
	}

	void perimeter() {
		perimeter = 2 * (length + breadth);
	}

	void show(String type) {
		System.out.println( " perimeter of "+type +" is:" + perimeter);
		System.out.println(" area of "+type+" is :" + area);
	}

}

class Square extends Rectangle {

	Square(int side) {

		super(side, side);
	}
}

public class q25 {

	public static void main(String[] args) {
		Rectangle R = new Rectangle(17, 7);
		R.area();
		R.perimeter();
		R.show("Rectangle");
		Square S = new Square(7);
		S.perimeter();
		S.area();
		S.show("square");
	}

}
