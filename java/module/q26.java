//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and
//5 units by creating a class named 'Triangle' without any parameter in its constructor.
package module;

class Triangel{
	
	Triangel(){
		
	}
	double area(int a,int b,int c) {
		double s= (a+b+c)/2;
		double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return  area;
	}
	double perimeter(int a,int b,int c) {
		double perimeter=a+b+c;
		return perimeter;
	}
}
public class q26 {

	
public static void main(String[] args) {
	Triangel t =new Triangel();
	
	System.out.println("area of triangel is:"+t.area(3, 4, 5));
	System.out.println("perimeter of triangel is"+t.perimeter(3, 4, 5));
}
}
