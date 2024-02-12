//• W.A.J.P to start the same Thread twice by calling start () method twice. Test
//ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start (); 
package module;

class twicethread extends Thread {
	@Override
	public void run() {
		System.out.println("hello my thread");
	}
}

public class q45 {

	public static void main(String[] args) {
		twicethread t1 = new twicethread();
		t1.start();
		t1.start();
	}
}
