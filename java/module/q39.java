//• W.A.J. P to demonstrate try catch block, take two numbers from the use/r by
//Command line argument and perform the division operation and handle Ari/thmetic
//O/PException in thread main java. Lang. Arithmetic Exception:/ by zero/
package module;

public class q39 {
public static void main(String[] args) {
	try {
		System.out.println("division operation"+(20/0));
	}catch(ArithmeticException e) {
		System.out.println("Arithmetic exception"+e);
	}
}
}
