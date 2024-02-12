//• W.A.J.P to create a class Student with attributes roll no, name, age and course. 
//Initialize values through parameterized constructor. If age of student is not in
//between 15 and 21 then generate user defined exception
//"AgeNotWithinRangeException". If name contains numbers or special symbols
//raise exception "NameNotValidException". Define the two exception classes. 
package module;

class NameNotValidException extends Exception {
	public NameNotValidException(String Msg) {
		super(Msg);
	}
}

class AgeNotWithinRangeException extends Exception {
	public AgeNotWithinRangeException(String Msg) {
		super(Msg);
	}

}

class Student {

	int roll_no;
	String name;
	int age;
	String course;

	public Student(int roll_no, String name, int age, String course) {
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
		this.course = course;

	}

	public void Validetion() throws NameNotValidException, AgeNotWithinRangeException {
		if (age < 15 || age > 21) {
			throw new AgeNotWithinRangeException("your age is not valid ");
		}

//		if (!name.matches("[a-zA-Z ]+")) {
//			throw new NameNotValidException("use only alphabet in your name");
//
//		}
		for(char n : name.toCharArray()) {
			if (!Character.isLetter(n) && n != ' ') {
	            throw new NameNotValidException("Use only alphabets in your name");
	        }
			
		}
	}

	public void showdata() {
		System.out.println("roll.nu:" + roll_no + "\nname:" + name + "\n" + "age:" + age + "\ncourse:" + course);
	}
}

public class q41 {
	public static void main(String[] args) {
		Student S1 = new Student(7, "darsh", 20, "java"); 

		try {
			S1.Validetion();
			S1.showdata();
			System.out.println("Student created successfully!");

		} catch (AgeNotWithinRangeException | NameNotValidException e) {
			System.out.println(e.getMessage());
		}
	}
}
