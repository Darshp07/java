package Inherition;

class SchoolName{
	String name ;
	SchoolName(String name){
		this.name=name;
	}
}
class Studant extends SchoolName{
	int stdid;
	Studant(String name,int id){
		super(name);
		this.stdid=id;
	}
	void showstd() {
		System.out.println("std name:"+name+"\t\tstdid:"+stdid);
	}
}
class Faculti extends SchoolName{
	int facid;
	Faculti(String name,int facid){
		super(name);
		this.facid=facid;
		
	}
	void showfac() {
		System.out.println("fac name:"+name+"\tfacid:"+facid);
	}
	
}
public class hirarchichalconstruct {
 public static void main(String[] args) {
	 Studant std = new Studant("darsh",77);
	 std.showstd();
	 
	 Faculti fac =new Faculti("dhiren sir",123);
	 fac.showfac();
}
	
}
