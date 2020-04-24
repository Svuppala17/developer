package syncrinization;

public class deadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String resource1 = "ratan jaswqal";
	String resource2 = "ratan ";
Thread t1= new Thread() {
	public void run() {
		synchronized(resource1) {
			System.out.println("thread1:locked with resource1");
		}try {
			Thread.sleep(400);		
			}catch(Exception e) {
				synchronized(resource2) {
					System.out.println("thread1  locked with resource2");
				}
			}
	}
};

Thread t2= new Thread() {
	public void run() {
		synchronized(resource2) {
			System.out.println("thread2:locked with resource2");
		}try {
			Thread.sleep(400);		
			}catch(Exception e) {
				synchronized(resource1) {
					System.out.println("thread2  locked with resource1");
				}
			}
	}
};

t1.start();
t2.start();

	}
	}
	 
	 
	 
	 
	


