package syncrinization;
// sync block using class//

class tabel{
	public void printtable(int n) {
		synchronized(this) {
			for(int i=1;i<=5;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(400);
					
				}catch(Exception e) {
					System.out.println(e);
				}
			}
		}
		
	}
}
class mythread extends Thread{
	tabel t;// class with instant variable
	mythread(tabel t){
		this.t=t;// seprating instant vairable and local variable
	}
	public void run() {
		t.printtable(5);
	}
}
class mythread2 extends Thread{
	tabel t;
	mythread2(tabel t){
		this.t=t;
		}
public void run() {
	t.printtable(100);
}
}

public class testsycoblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		tabel obj = new tabel();
		mythread t1= new mythread(obj);
		mythread2 t2= new mythread2(obj);

		t1.start();
		t2.start();
	}

}
