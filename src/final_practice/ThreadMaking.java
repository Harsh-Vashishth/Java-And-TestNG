package final_practice;

class ThreadA extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getId());
	}
}
public class ThreadMaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i< 10; i++) {
			ThreadA obj = new ThreadA();
			obj.start();
		}
	}

}
