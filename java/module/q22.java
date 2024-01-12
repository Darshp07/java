//Create a class to print the area of a square and a rectangle. The class has two methods
//with the same name but different number of parameters. The method for printing
//area of a rectangle has two parameters which are length and breadth respectively
//while the other method for printing area of square has one parameter which is side
//of square.
package module;

class Area {
	int length;
	int breadth;
	int side;

//area of rectangle
	int printArea(int lenght, int breadth) {
		int area = lenght * breadth;
		System.out.println("rectangle area is :-" + area);
		return 0;
	}

//	area of square.
	int printArea(int side) {
		int area = side * 2;
		System.out.println("square area is :" + area);
		return 0;
	}
}

public class q22 {

	public static void main(String[] args) {
		Area a = new Area();
		a.printArea(22, 17);
		a.printArea(7);

	}

}
