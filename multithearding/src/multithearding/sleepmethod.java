package multithearding;

public class sleepmethod extends Thread{
public void run() {
	for(int i=1;i<5;i++) {
		
			try {
				//this is claas name//
				sleepmethod.sleep(500);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		System.out.println(i);
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
sleepmethod t1= new sleepmethod();
sleepmethod t2 = new sleepmethod();
sleepmethod t3 = new sleepmethod();
// if you use run it perfrm action of thread
// that is it only give the output what ever it is //
t1.start();
t1.run();
	
	}

}
