//W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set
//Daemon () method of Thread class and check whether the thread is set daemon or
//not by using is Daemon () method.
//TestDaemonThread2 t1=new TestDaemonThread2();
//TestDaemonThread2 t2=new TestDaemonThread2(); t1.start();
//t1.setDaemon(true);//will throw exception here t2.start(); 
package module;
class TestDaemonThread2 extends Thread{
	@Override
	public void run() {
		 if(Thread.currentThread().isDaemon()){  
			   System.out.println("Daemon thread executing");  
			  }  
			  else{  
			   System.out.println("User thread executing");  
			  }
	}
}
public class q46 {
public static void main(String[] args) {
	TestDaemonThread2 t1 = new TestDaemonThread2();
	TestDaemonThread2 t2 = new TestDaemonThread2();
	t1.start();
	t1.setDaemon(true);
	t2.start();
}
}
