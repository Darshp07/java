//Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and
//$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'
//are subclasses of class 'Bank', each having a method named 'getBalance'. Call this
//method by creating an object of each of the three classes. 
package module;

abstract class Bank {
	double added;

	void diposit(double added) {
		this.added = added;
	}

	abstract void getbalance();

}

class BankA extends Bank {
	void getbalance() {
		System.out.println("diposited amount in BankA : " + added + " $");
	}
}

class BankB extends Bank {
	void getbalance() {
		System.out.println("diposited amount in BankB : " + added + " $");
	}
}

class BankC extends Bank {
	void getbalance() {
		System.out.println("diposited amount in BankC : " + added + " $");
	}
}

public class q29 {
	public static void main(String[] args) {

		BankA A = new BankA();
		A.diposit(100.0);
		A.getbalance();
		
		BankB B = new BankB();
		B.diposit(150.0);
		B.getbalance();
		
		BankC C = new BankC();
		C.diposit(200.0);
		C.getbalance();
	}
}
