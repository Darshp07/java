//We have to calculate the percentage of marks obtained in three subjects (each out of
//100) by student A and in four subjects (each out of 100) by student B. Create an
//abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two
//other classes 'A' and 'B' each having a method with the same name which returns the
//percentage of the students. The constructor of student A takes the marks in three
//subjects as its parameters and the marks in four subjects as its parameters for student
//B. Create an object for each of the two classes and print the percentage of marks for
//both the students. 
package module;

abstract class Marks {

	double Percentage;

	abstract double getPercentage();

}

class A extends Marks {
	public int a, b, c;

	A(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;

	}

	double getPercentage() {

		return (a + b + c) / 3.0;

	}

}

class B extends Marks {
	int a, b, c, d;

	B(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	double getPercentage() {

		return (a + b + c + d) / 4.0;

	}

}

public class q30 {

	public static void main(String[] args) {

		A stdA = new A(78, 88, 91);

		System.out.println(" percentage of studant A is " + stdA.getPercentage() + " %");
		B stdB = new B(89, 90, 93, 91);

		System.out.println(" percentage of studant B is " + stdB.getPercentage() + " %");

	}
}
