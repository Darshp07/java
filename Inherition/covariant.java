package Inherition;

class a {
	a get() {

		return this;

	}

	void msg() {
		System.out.println("darsh");
	}
}

class b extends a {
	a get() {
		System.out.println("hi");
		return this;

	}
	void show() {
		System.out.println("hello java");
	}
}

public class covariant {
	public static void main(String[] args) {
		b bb = new b();
		bb.get().msg();;
bb.show();
	}

}
