package multithearding;

public class runnableinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Runnable t11 = new Runnable() {
		public void run() {
			System.out.println("task one");
		}
	};
	
	Runnable t22= new Runnable() {
		public void run() {
			System.out.println("task two");
		}
	};
	
	
	
Thread t1 =new Thread(t11);

Thread t2 =new Thread(t22);


t1.run();
t2.start();
	}

}
