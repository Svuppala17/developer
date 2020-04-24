package multithearding;

public class multithreadbyanionymous {
	
public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Thread t1= new Thread() {
		public void run() {
			System.out.println("task one");
		}
	};
	
	Thread t2= new Thread() {
		public void run() {
			System.out.println("task two");
		}
	};
	Thread t3= new Thread() {
		public void run() {
			System.out.println("task one");
		}
	};
	t3.start();
	t1.start();
	t2.start();
	
	}

}
