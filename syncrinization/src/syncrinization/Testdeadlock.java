package syncrinization;

public class Testdeadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String resource1="satish";
		
		String resource2= "rajesh";
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized(resource1) {
					System.out.println("threa1: lock resource 1");
				try {
					Thread.sleep(100);
					
				}catch(Exception e) {
					System.out.println(e);
				}
				synchronized (resource2) {
					System.out.println("thread 1:lock resource2");
				}
				}
			}
		};/// to complete local variaclke declartion statment//
				
	}

}
