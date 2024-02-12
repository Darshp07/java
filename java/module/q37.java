// W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero
//exception and another one is to handle
//ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;
package module;

public class q37 {
	public static void main(String[] args) {
		int a[]= {32,22,23,11,55};
		try {
			
			
			System.out.println(a[5]);
			
			
		} 
		catch (ArrayIndexOutOfBoundsException  e) {
			System.out.println(" handle of "+e);
		}
		
		try {
			a[5]=30/0;
		}catch (ArithmeticException e) {
			System.out.println("handle divide "+e);
		}
	}

}

