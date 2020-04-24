package syncrinization;
// some times we have a mutliple threads in same file or same program
//so there is chance that a thread can access the same file so by using syncorization 
//you can make to acces a thread to work on particular resource so that there might have any 
// concurrency

class printdemo {
	
	public void printcount() {
		try {
			for(int i=5;i>0;i--) {
			System.out.println("counter"+" "+i);	
			}
		}catch(Exception e) {
			System.out.println("threas intrepted");
		}
	}
}

class threaddemo extends Thread{
	private Thread t;
	private String threadname;
	printdemo PD;
	
	threaddemo( String name,printdemo pd){
		threadname = name;
		PD=pd;
		}

public void run() {
	
	PD.printcount();
	System.out.println("thread"+ threadname +"existing");
}
public void start() {
	System.out.println("starting "+ threadname);
if(t==null) {
	t= new Thread(this,threadname);

t.start();
}

}
}

public class testsync {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
printdemo PD = new printdemo();
threaddemo t1= new threaddemo( "thread -1",PD);
threaddemo t2 = new threaddemo("thread -2",PD);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch(Exception e) {
			System.out.println("interppted");
		}
	}
}

