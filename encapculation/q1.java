package encapculation;

class clg {

	public String name;
	public int id;
	private String password;
	
	void setpassword(String password) {
		this.password=password;
	}
	public String getpassword() {
		return password;
	}

}

class Std extends clg {

	

	public void show() {
		System.out.println("name :" + name + "\tid :" + id + "\tpasswod: " + getpassword());
	}
}

public class q1 {

	public static void main(String[] args) {

		Std s = new Std();
		s.id = 07;
		s.name = "darsh";
		s.setpassword("Hi.darsh07"); 
		s.show();
	}
}
