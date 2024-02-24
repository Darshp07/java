package Inherition;

class addition{
void sum(int a,long b ) {
	System.out.println(a+b);
	}
	
	void sum(long a,int b) {
		System.out.println(a+b);
	}
}
public class metholoading {
	public static void main(String[] args) {
		addition a = new addition();
		a.sum(12, 435656557557575464L);
	}

}
