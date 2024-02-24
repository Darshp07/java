package throwsandthrow;

public class throws1 {
	public static void name(int a , int b) {
		if(b==0) {
			throw new ArithmeticException();
		}
	}
	public static void main(String[] args, int b, int a) 	{
		  
		try {
			throws1 t = new throws1();
			throws1.name(3, 0);
			int c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(" error is "+e);
		}
	
		
	}

}
