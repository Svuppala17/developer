package syncrinization;
class table{
	synchronized void printtable(int n) {
		for(int i=1;i<5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);/// made thread to sleep//
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
public class testasync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final table obj= new table();

Thread t1=new Thread() {// created a thread//
public void run() {
	obj.printtable(5);
}
	
};
Thread t2=new Thread() {// created a thread//
public void run() {
	obj.printtable(50);
}	
};
t1.start();
t2.start();
	}

}
