package comperator.ter;

import java.util.Comparator;

class Student // implements Comparable<Student>
{
	int enroll;
	String name;
	String course;
	int age;

	public Student(int enroll, String name, String course, int age) {

		this.enroll = enroll;
		this.name = name;
		this.course = course;
		this.age = age;
	}

	public void display() {
		System.out.println("enroll:-" + enroll + "\tname:-" + name + "\tcours:-" + course + "\tage:-" + age);
	}

}

class AgeComparator implements Comparator<Student> {
	@Override
	public int compare(Student std1, Student std2) {
		return Integer.compare(std1.age, std2.age);
	}
}

class namecomper implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o1.name.compareTo(o2.name) ;
	}

}

public class compe {
	public static void main(String[] args) {

		AgeComparator a = new AgeComparator();
		System.out.println("comper age:-"
				+ a.compare(new Student(282, "darsh", "java", 25), new Student(42, "darshak", "python", 23)));

		namecomper name = new namecomper();
		System.out.println(name.compare(new Student(11, "darshak", "java", 25), new Student(12, "darshak", "java", 10)));
	}

}
