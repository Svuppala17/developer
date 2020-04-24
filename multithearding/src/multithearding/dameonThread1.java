package multithearding;

public class dameonThread1 extends Thread {
	public void run() {
		System.out.println("satish"+Thread.currentThread().getName());
	
	 System.out.println("daeomon"+Thread.currentThread().isDaemon());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dameonThread1 t1= new dameonThread1();
		dameonThread1 t2 = new dameonThread1();
	
		t1.start();
		t1.setDaemon(true);//if the daemon method is after the 
		// start method then it throws the execption 
		// so if we shoukd get output then we should set 
		//deamon method 1st later we should start the thread//
		t2.start();
		
		
	}

}
