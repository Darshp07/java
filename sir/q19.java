package sir;

class Feedingschdule{
	
	String name;
  String species;
  
  Feedingschdule(){
	  
  }
  Feedingschdule(String name ,String species){
	  this.name=name;
	  this.species=species;
  }
  void feeding (String name ,String species) {
	  this.name=name;
	  this.species=species;
  }
	void display() {
		if(species.matches("dog")) {
			System.out.println(name+" Feeding in morring");
		}else {
			System.out.println(name+" feeding in evening");
		}
	}
}
public class q19 {

public static void main(String[] args) {
	
	Feedingschdule T1= new Feedingschdule();
	T1.name="monty";
	T1.species="dog";
    T1.display();
	Feedingschdule T2= new Feedingschdule();
	T2.feeding("kalu", "dog");
	T2.display();
	
	Feedingschdule T3= new Feedingschdule("shelu","cat");
	T3.display();
	
}

}
