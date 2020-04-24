package variables;

abstract class bike{
	bike(){//constructor created//
		System.out.println("bike is crested");
	}
	abstract void run();//if you use abstract in class
	//then you need to use abstract in method//
	public void changegear() {//created method//
		System.out.println("gear changed");

	}
}

class honda extends bike{
	public void run() {//created method //
		System.out.println("running safley");
	}
}





public class abstractwithconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
honda obj=new honda();
obj.run();
obj.changegear();

	}

		
		
	}

