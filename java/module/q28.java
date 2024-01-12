//Create an abstract class 'Parent' with a method 'message'. It has two subclasses each
//having a method with the same name 'message' that prints "This is first subclass"
//and "This is second subclass" respectively. Call the methods 'message' by creating
//an object for each subclass.
package module;

abstract class Parents {
	abstract void massage();

}

class FirstSubclass extends Parents {
	void massage() {
		System.out.println("this is first subclass \n");
	}

}

class SecondSubclass extends Parents {
	void massage() {
		System.out.println("this is second subclass");
	}

}

public class q28 {

	public static void main(String[] args) {
		FirstSubclass F = new FirstSubclass();
		F.massage();

		SecondSubclass S = new SecondSubclass();
		S.massage();

	}

}
