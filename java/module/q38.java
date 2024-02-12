//• W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch
//block. try {
//try
//{//code}
//catch (Exception e)
//{//code}
//catch (Exception e)
//{//code} 
package module;

public class q38 {
public static void main(String[] args) {
	
	int a[]= {34,2,22,56,67};
	try {
		System.out.println(a[5]);
		a[5]=10/0;
		
		
	} catch (ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	}catch (ArithmeticException e) {
		e.printStackTrace();
	}
}
}
