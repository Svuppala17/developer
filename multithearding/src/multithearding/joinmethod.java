package multithearding;

public class joinmethod extends Thread{
public void run() {
	for(int i=1;i<=5;i++) {
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			System.out.println(e);
		}
	System.out.println(i);
	}
	
}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	joinmethod j=new joinmethod();
j.start();// starts the executions
	
	try {
		j.join();// join waits for thread to die//and it will 
		//stop the remaining threads to execute //
	}catch(Exception e) {
		System.out.println(e);
	}
	
	joinmethod j2=new joinmethod();
	j2.start();
	joinmethod j3=new joinmethod();
	j3.start();
	
	
	
	
	}

}
