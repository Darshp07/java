package recurstion;



public class R1 {
	
	public static void show(int a) {
		if(a==10) {
			return;
		}
		System.out.println(a);
		show(a+1);
	}
public static void main(String[] args) {
	  

	show(1);
}
}
