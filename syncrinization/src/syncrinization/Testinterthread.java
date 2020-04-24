package syncrinization;

class bank{/// you can say this is calss 
	int amount=1000;// and all the state and bvehaviour is what u called as objects//
synchronized void withdraw(int amount) {
	System.out.println("going to withdraw");
if(this.amount<amount) {
	System.out.println("less amount waiting for deposity");

try {
	wait();
}catch(Exception e) {
	}

this.amount-=amount;
System.out.println("withdaw completed");
}
}

synchronized void deposit(int amount){

	System.out.println("going to deposit");
	this.amount+=amount;
	System.out.println(" deposit completed");
	notify();
} }



public class Testinterthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
bank obj = new bank();
// YOU CAN CREWTE THE NEW THREAD IN ANOMYNOUS CLASS//
// USING THE SAME MEATHOD//

// new Thread() {-----> we created this object with out any reference //
//	public void run() {---> so we dont want to use any reference obj then we should/
                            //this above method//
//		obj.withdraw(10000);
//	}
// }.start();//

Thread t1= new Thread() {
	public void run() {
		obj.withdraw(15000);
	}
};
Thread t2=new Thread() {
public void 	run() {
		obj.deposit(10000);
	}
};

t1.start();
t2.start();
	}
}
