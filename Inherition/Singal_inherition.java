package Inherition;

class Person{
	int id;
	String name;
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
	
}

class Student extends Person{
	
	double fee;
	
	Student(double fee){
		super(7,"darsh");
		this.fee=fee;
//		this.id=id;
//		this.name=name;
		System.out.println("your id:"+id +"\t"+"your name is:"+name+"\t"+"fee :"+fee);
		
	}
	
//	void display() {
//		System.out.println("your id:"+id +"\t"+"your name is:"+name+"\t"+"fee :"+fee);
//	}
	
}


public class Singal_inherition {
 public static void main(String[] args) {
	
	new Student(48500.500);

}
 

}
