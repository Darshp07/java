
//Create a class named 'Print Number' to print various numbers of different data types
//by creating different methods with the same name 'printn' having a parameter for
//each data type. 
package module;

class PrintNumber{
//	interger
	void printn(int num) {
		System.out.println("your integer:-\t"+num);
	}
	void printn(double num) {
		System.out.println("double value is :-\t"+num);
	}
	void printn(boolean tempt) {
		System.out.println("boolean is :-\t"+tempt);
	}
	void printn(String name) {
		System.out.println("your name is:-\t"+name);
	}
	void printn(char ch) {
		System.out.println("char is:-\t"+ch);
	}
	void printn(float num) {
		System.out.println("decimal num is :-\t"+num);
	}
}
public class q20 {

	public static void main(String[] args) {
		PrintNumber p1 =new PrintNumber();
		p1.printn(7);
		p1.printn(true);
		p1.printn("D");
		p1.printn(7.07);
		p1.printn(7.7);
		p1.printn("darsh");
	}

}
