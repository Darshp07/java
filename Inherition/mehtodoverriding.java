package Inherition;

class maths {
	void sum (int a,int b) {
		System.out.println("parent"+(a+b));
	}
}

class mth extends maths{
	void sum (int a,int b) {
		System.out.println("child  "+(a+b));
	}
}
public class mehtodoverriding {
	public static void main(String[] args) {
		mth m = new mth();
		m.sum(22, 44);

	}
}
