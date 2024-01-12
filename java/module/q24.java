//Create a class named 'Member' having the following members:
//1. Data members
//2. Name
//3. Age
//4. Phone number
//5. Address
//6. Salary
//It also has a method named 'printSalary' which prints the salary of the members
package module;

class Member {
	String name;
	int age;
	String phoneNumber;
	String address;
	double salary;

	Member(String name, int age, String phoneNumber, String address, double salary) {
		this.address = address;
		this.age = age;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.salary = salary;

	}

	void printSalary() {
		System.out.println("our salary is:-\t" + salary);
	}
}

public class q24 {
	public static void main(String[] args) {

		Member M = new Member("darsh", 25, "9099474359", "333/gopalnager,surat", 45700.670);
		M.printSalary();
	}

}
