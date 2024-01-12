
//Create a class named 'Shape' with a method to print "This is this is shape". Then 
//create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both
//having a method to print "This is rectangular shape" and "This is circular shape"
//respectively. Create a subclass 'Square' of 'Rectangle' having a method to print
//"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the
//object of 'Square'class. 
package module;

class Shape1 {
	void print1() {
		System.out.println("This is this is shape");
	}
}

class Reactangle extends Shape1 {
	void print2() {
		System.out.println("This is rectangular shape");
	}
}

class Circle extends Shape1 {
	void print3() {
		System.out.println("This is circular shape");
	}
}

class Square1 extends Reactangle {
	void print4() {
		System.out.println("Square is a rectangle");
	}

}

public class q34 {
	public static void main(String[] args) {

		Square1 S1 = new Square1();

		S1.print1();
		S1.print2();
	}

}
