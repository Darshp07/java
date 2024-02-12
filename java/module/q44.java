//W.A.J.P to create 2 threads and execute that threads by providing sleep time as
//2000ms and check the execution.
package module;
class Mynewthread extends Thread{
	@Override
	public void run() {
		System.out.println("Start thread");
		try {
			sleep(2000);
			System.out.println("thread:-"+Thread.currentThread().getName());
			sleep(5000);
			System.out.println("thread 2 :-"+currentThread().getId());
		} catch (InterruptedException e) {
	
		}
	}
}
public class q44 {
public static void main(String[] args) {
	Mynewthread mt = new Mynewthread();
	mt.start();
}
}
