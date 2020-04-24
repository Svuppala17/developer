package syncrinization;


class stcsyco{
	synchronized static void  printstcsyco(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
class thread1 extends Thread{
	
	public void run() {
		stcsyco.printstcsyco(1);
	}
	
}

class thread2 extends Thread{
	
	public void run() {
		stcsyco.printstcsyco(10);
	}
	
}
class thread3 extends Thread{
	
	public void run() {
		stcsyco.printstcsyco(100);
	}
	
}
class thread4 extends Thread{
	
	public void run() {
		stcsyco.printstcsyco(1000);
	}
	
}



public class teststaticsync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thread1 t1= new thread1();
		thread2 t2= new thread2();
		thread3 t3= new thread3();
		thread4 t4= new thread4();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		
		
	}

}
