package multithearding;

public class joinmiliseconds extends Thread{
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
		j.join(1500);
//actuall in above we gave that it should run 500sec in sleep 
//but in instialization process we gave j to run 1500sec 
//that means j will be 1st procesed 3 times aafter that j2 j3 will excute		
	}catch(Exception e) {
		System.out.println(e);
	}
	
	joinmethod j2=new joinmethod();
	j2.start();
	joinmethod j3=new joinmethod();
	j3.start();
	
	
	
	
	}

}
