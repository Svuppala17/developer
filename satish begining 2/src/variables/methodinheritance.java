package variables;
interface drawabl{
	void draw();//abstract method
default void msg() {
	System.out.println("defult method");
}
}
class rec implements drawabl{

	@Override
	public void draw() {// overide because 
		//if we use the same abstract name//
		// TODO Auto-generated method stub
	System.out.println("drw rectangle");	
	}
	
}

public class methodinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
drawabl a=new rec();//you cannot use 
//drawable a=new drawable(); because you cant do 
//interface and interface 

a.draw();
a.msg();
	}

}
