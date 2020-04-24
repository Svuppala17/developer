package multithearding;

public class priorityTheard extends Thread{
public void run() {
	System.out.println("runing thread name"+Thread.currentThread().getName());
	System.out.println("runing thread priority name"+Thread.currentThread().getPriority());

}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub

	priorityTheard m1= new priorityTheard();
	priorityTheard m2 = new priorityTheard();
	m1.setPriority(Thread.MIN_PRIORITY);
	m2.setPriority(Thread.MAX_PRIORITY);
	// the min priority is 0
	// the max priority is 10
	m1.start();
	m2.start();
	}

}
