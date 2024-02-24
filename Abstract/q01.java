package Abstract;

abstract class shape {
	String type;

	void show(String type) {
		this.type = type;
	}

	abstract void area();
}

class square extends shape {
	int s;

	public square(int s) {
		this.s = s;
	}

	@Override
	void area() {
		System.out.println(type + " area is :" + (s * s));
	}
}

class rectangel extends shape {
	int l, h;

	public rectangel(int l, int h) {
		this.h = h;
		this.l = l;
	}

	@Override
	void area() {
		System.out.println(type + " area is :" + (l * h));
	}
}

public class q01 {

	public static void main(String[] args) {
		square s = new square(7);
		s.show("square");
		s.area();
		rectangel r = new rectangel(5, 7);
		r.show("rectangel");
		r.area();
	}
}
