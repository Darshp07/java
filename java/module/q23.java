
//Create a class with a method that prints "This is a parent class" and its subclass with
//another method that prints "This is child class". Now, create an object for each of
//the class and call 1 - method of parent class by object of parent class 2 - method of
//child class by object of child class 3 - method of parent class by object of child class 
package module;

class Parent {
	void display() {
		System.out.println("this is  parent class");
	}
}

class Child extends Parent {
	void display() {
		System.out.println("this is child class");
	}
}

public class q23 {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.display();
		Child c = new Child();
		c.display();
		Parent p1 = new Child();
		p1.display();

	}
}
