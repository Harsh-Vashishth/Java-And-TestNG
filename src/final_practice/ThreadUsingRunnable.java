package final_practice;

class ThreadB implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getId());
	}
}
public class ThreadUsingRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i< 10; i++) {
			ThreadB obj = new ThreadB();
			Thread thread = new Thread(obj);
			thread.start();
		}
	}

}
