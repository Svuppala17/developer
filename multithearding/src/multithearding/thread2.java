package multithearding;

public class thread2 implements Runnable{

	@Override// always we should overide because we are using runnable interface
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread is running");
	}

	public static void main(String args[]) {
		thread2 m1= new thread2();
		Thread t1 = new Thread(m1);
		t1.start();//it allows the execution of program//
	}
	
	
}
