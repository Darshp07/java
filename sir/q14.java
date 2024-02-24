//Employee Class with Salary Calculation: Create an Employee class with name and hourly wage. 
//Add a method to calculate weekly salary based on hours worked.
package sir;

class Employe {
	String name;
	int hourWork;
	double hourWage;

	public Employe() {

	}

	Employe(String name, int hourWork, int hourWage) {
		this.hourWage = hourWage;
		this.hourWork = hourWork;
		this.name = name;

	}

	void salary(String name, int hourWork, double hourWage) {
		this.hourWage = hourWage;
		this.hourWork = hourWork;
		this.name = name;

	}

	void display() {
		double WeeklySalary = hourWork * hourWage;
		System.out.println("name:-" + name + "\t" + "weekkly salary is:" + WeeklySalary + " $");
		
	}
}

public class q14 {

	public static void main(String[] args) {

		Employe E1 = new Employe();
		E1.name = "darsha";
		E1.hourWage = 120;
		E1.hourWork = 46;
		E1.display();
		Employe E2 = new Employe();
		E2.salary("kajal", 42, 90);
		E2.display();
		Employe E3 = new Employe("nikita", 52, 100);
		E3.display();

	}

}
