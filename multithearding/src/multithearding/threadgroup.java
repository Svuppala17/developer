package multithearding;

public class threadgroup implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		threadgroup x = new threadgroup();
		ThreadGroup tg1= new ThreadGroup("parent thread");
		
		
		Thread t1= new Thread(tg1,x,"hi");
		t1.start();
		Thread t2 = new Thread(tg1,x,"hi bro");
		t2.start();
		Thread t3 = new Thread(tg1,x," hi sis ");
		t3.start();
		System.out.println("thread group name"+" "+tg1.getName());
	tg1.list();
	}

	

}
