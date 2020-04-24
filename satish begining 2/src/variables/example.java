package variables;

class matric{// this is superclass//
	int z;
	public void multiplication(int x,int y) {
		z=x*y;
		System.out.println("this is multiplication"+" "+z);
	}
		public void display1() {
			System.out.println("the display of matric");
		}
	}

public class example extends matric{//EXAMOPLE is a subclass//
int z;
 public void display() {
	System.out.println("fuck off");
}
 public void addition(int x,int y) {
		z=x+y;
		System.out.println("this is addition"+" "+z);
	}	
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20;
		example obj=new example();
obj.multiplication(a, b);
//we cannot call the method in subclass //
//because this is belongs to subclass//
obj.addition(a, b);
obj.display();
obj.display1();
//with out creating obj of superclass we can//
//call the methods in superclass by creating subclass//


	}

}
