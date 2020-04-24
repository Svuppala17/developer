package multithearding;

public class extendingTheard extends Thread{
	//here we are using 1st method to crete theard 
	//that is by extending class with object class(thread)

	public void run() {
		System.out.println("This thread is running");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		extendingTheard a= new extendingTheard();
		a.start();
	}

}
