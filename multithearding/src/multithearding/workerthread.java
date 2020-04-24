package multithearding;

public class workerthread implements  Runnable{
	private String message;
	public workerthread(String s) {
		// TODO Auto-generated constructor stub
	this.message=s;
	
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"(start)message=" + message);
	processmessage();
	System.out.println(Thread.currentThread().getName()+"(end)");
	}

	private void processmessage() {
		// TODO Auto-generated method stub
	try {
		Thread.sleep(2000);}
catch(InterruptedException e) {
	e.printStackTrace();
	
}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
