package Abstract;

abstract class per {

	abstract void marks();

}

class pass extends per {
	double result;

	double  mark(int maths, int sci, int ss) {

		double sum = maths + sci + ss;
		double per = (sum/300);
		result = per*100;
		return result;

	}

	@Override
	void marks() {
		System.out.println(result+" %");
		
	}

}

public class q02 {
	public static void main(String[] args) {
		pass p = new pass();
		p.mark(99, 88, 77);
		p.marks();
		
		pass p2 = new pass();
		p2.mark(77, 87, 56);
		p2.marks();
	}
}
