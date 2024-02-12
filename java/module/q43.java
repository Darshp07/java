//W.A.J. P to create one thread by extending Thread class in another Class.
package module;

class mythred extends Thread {
	@Override
	public void run() {
		System.out.println("my thread is stated now");
	}
}

public class q43 {
	public static void main(String[] args) {
		mythred T = new mythred();
		T.start();
	}
}
