package Inherition;

class School {
	int id;
	String name;

}

class SchoolStudent extends School {
	String coures;
	double fee;

	void SchoolStu(int id, String name, String coures, double fee) {
		this.name = name;
		this.id = id;
		this.coures = coures;
		this.fee = fee;
	}

	void SchoolStd() {
		System.out.println("id is:" + id + "\t name is:" + name + "\t your coures:" + coures + "\tfee is :" + fee);
	}

}

class Schoolfaculti extends SchoolStudent {

	double salary;

	void Schoolfacu(int id, String name, String coures, double salary) {
		super.id = id;
		super.name = name;
		super.fee = fee;
		super.coures = coures;
		this.salary = salary;
	}

	void schoolfac() {

		System.out.println("id is:" + id + "\t name is:" + name + "\t your coures:" + coures + "\t salary:" + salary);
	}

}

public class multi_inherition {

	public static void main(String[] args) {

		SchoolStudent st1 = new SchoolStudent();

		st1.SchoolStd();

		Schoolfaculti f1 = new Schoolfaculti();
		f1.coures="java";
		f1.fee=98098;
		f1.id=121;
		f1.name="darsh";
		f1.salary=331381.0;
		f1.schoolfac();
		Schoolfaculti f2 = new Schoolfaculti();
		f2.schoolfac();
	}

}
