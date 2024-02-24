package throwsandthrow;

import function.string;

class invalidcaseException extends Exception {
String m;
	public invalidcaseException(String m) {
	
		super(m);
	}
}

class bank {
	String acc_nu;
	String name;
	double amount;
	
	
bank(){
	
}
	bank(String acc_nu, double amount) {
		this.acc_nu = acc_nu;
		this.amount = amount;
	}	

	public void creadit(double balance) throws invalidcaseException  {
		
		if (balance > 0) {
			amount += balance;
		} else {
			throw new invalidcaseException("invalid amount");
		}
		
	}

	void showbalance() {
	
		System.out.println(amount);
	}

}


public class Throwss {

	public static void main(String[] args) throws invalidcaseException {
		System.out.println("hii");
		bank b = new bank();
		
try {
	b.creadit(998);
	b.showbalance();
} catch (invalidcaseException e) {
System.out.println(e.getMessage());
}
System.out.println("hello");

	}
}
