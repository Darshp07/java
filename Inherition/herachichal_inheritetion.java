package Inherition;

class collage{
	int id;
	int age;
	String name;
	String course;
	
	
}
class collagestudent extends collage{
	double fee;
	collagestudent(int id,int age, String name ,String course,double fee) {
		
		this.age=age;
		this.course=course;
		this.fee=fee;
		this.id=id;
		this.name=name;
	}
		void display() {
			System.out.println(name+"\t"+ id+"\t" + age+"\t"+ fee +"\t"+ course+"\t");
		}
	}


class collagefaculti extends collage{
	double salary;
	collagefaculti(int id,int age, String name ,String course,double salary){
		this.age=age;
		this.course=course;
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	
	void show() {
		System.out.println(name+"\t"+ id +"\t"+ age+"\t"+ salary+"\t"+ course+"\t");
	}
}
public class herachichal_inheritetion {

	public static void main(String[] args) {
		collagefaculti fc1 = new collagefaculti(78,45,"desai","organic chemistry",75000.50);
	fc1.show();
	
	collagestudent cs1=new collagestudent(101,25,"darsu","java",46044.900);
	cs1.display();
	
	collagestudent c1= new collagestudent(123,22,"dex","python",12321.99);
	c1.display();
	
}
}