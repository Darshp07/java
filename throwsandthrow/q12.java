package throwsandthrow;

public class q12 {
	public static int  display(int numerator, int denominator) throws ArithmeticException {
		if (denominator == 0) {
			System.out.println("hello java !! ");
			throw new ArithmeticException("b is zreo so they are not valid number:");
		}
		return  numerator/ denominator;
	}

	public static void main(String[] args) {
		try {
			
		double c =display(28, 5);
		
			System.out.println("your number: " + c);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("good byy java  !");
	}
}
