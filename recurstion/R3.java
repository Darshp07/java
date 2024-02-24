package recurstion;

public class R3 {
	static void multi(int a1) {

		for (int i = 1; i <= 10; i++) {
			if (a1 <= 0) {
				System.out.println("enter valid number");
				return;
			}
			System.out.println(a1+"*" + i + "=" + i * a1);
			
		}
	}

	public static void main(String[] args) {

		multi(110);
	}
}
