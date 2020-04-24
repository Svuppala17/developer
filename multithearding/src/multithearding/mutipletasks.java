package multithearding;

class mutipletasks1 extends Thread {// super class

	public void run() {
		System.out.println("task one");
	}
}
class mutipletasks2 extends Thread {// subclass
	public void run() {
		System.out.println("task 2");
	}
}
class mutipletasks{// main class
public static void main(String[] args) {
		// TODO Auto-generated method stub
	mutipletasks1 t1 = new mutipletasks1();
	mutipletasks2 t2= new mutipletasks2();
	Thread t3 = new Thread();
	
	t1.start();
	t2.start();
	t3.start();
	}

}
