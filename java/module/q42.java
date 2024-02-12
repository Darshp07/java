//• W.A.J. P to create one thread by implementing Runnable interface in
//Class. 

package module;
class mythread implements Runnable{
	
	@Override
	public void run() {
	System.out.println("my thread is start:-");
	
		
	}
}
public class q42 {
public static void main(String[] args) throws InterruptedException {
	mythread m = new mythread();
	Thread T = new Thread(m);
	
	T.start();
}
}
