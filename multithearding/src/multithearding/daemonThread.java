package multithearding;

public class daemonThread extends Thread {

	

	public void run() {
		if(Thread.currentThread().isDaemon()) {// checkijng the deqamon thread
			System.out.println("daemon works");
		}
		
		else {
			System.out.println("user thread works");
		}
		}
	
  public static void main(String[] args) {
		// TODO Auto-generated method stub

	   
	  daemonThread t1= new daemonThread();// created a theard
	  daemonThread t2= new daemonThread();
	  daemonThread t3 = new daemonThread();
	  //the below is the user thread or user thread//
	  t1.setDaemon(true);// now t1 will be a deamon thread
	  t1.start();// thread strts 
	  t2.start();
	  t3.start();
	}

}
