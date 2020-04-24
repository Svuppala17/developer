package multithearding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class testthreadpool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ExecutorService executor= Executors.newFixedThreadPool(5);	
	//if you need to know the service executor then you should know 
	//what exactly the executor?
	
	// in thread life cycle we have 
	//new,runnable,running ,non runnable,termination
	//so this executorservice provides methods to  manage the termination// 	

	for(int i=0;i<10;i++) {
		Runnable  worker= new workerthread(""+i);
		executor.execute(worker);//as abve workr is the variable //
	}
	executor.shutdown();
	while(!executor.isTerminated()) {
		
	}
		System.out.println("fiiisd all theads");
	}
	}


