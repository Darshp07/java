//We have to calculate the area of a rectangle, a square and a circle. Create an abstract
//class 'Shape' with three abstract methods namely 'RectangleArea' taking two
//parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The
//parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its
//side and that of 'CircleArea' is its radius. Now create another class 'Area' containing
//all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the
//area of rectangle, square and circle respectively. Create an object of class 'Area' and
//call all the three methods.
package module;

abstract class Shape {
	abstract void RectangleArea(float length, float breath);

	abstract void SquareArea(float side);

	abstract void CircleArea(float reduis);
}

class Area1 extends Shape {

	@Override
	void RectangleArea(float length, float breath) {
		
		System.out.println("area of rectangel is :"+(length*breath));
	}

	@Override
	void SquareArea(float side) {
		System.out.println("area of square is :"+(side*side));
		
	}

	@Override
	void CircleArea(float reduis) {
		System.out.println("area of circle is :"+ Math.PI*reduis*reduis);
	}
}

public class q32 {

	public static void main(String[] args) {
		Area1 a= new Area1();
		a.CircleArea(7);
		a.RectangleArea(12, 8);
		a.SquareArea(7);

	}
}
