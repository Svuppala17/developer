
class tabless{
	 void printtable(int n) {
		synchronized(this) {
			for(int i=1;i<5;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(400);
				}catch(Exception e) {
					System.out.println(e);
				}
			}
		}
		
	}// enidg meathod
}

class Thread1 extends Thread{
	tabless t;
	Thread1(tabless t){
		this.t=t;
	}
	public void run() {
		t.printtable(5);
	}
}
class Thread2 extends Thread{
	tabless t;
	Thread2(tabless t){
		this.t=t;
	}
	public void run() {
		t.printtable(100);
	}
}

public class testsyncblock {

	public static void main(String args[]) {
	final 	tabless obj = new tabless();
		Thread1 t1= new Thread1(obj);
		Thread2 t2= new Thread2(obj);
		t1.start();
		t2.start();
	}
}
