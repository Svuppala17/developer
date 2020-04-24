package variables;

abstract class shape{// craeed abstract class//
	abstract void draw();//method created//	
	}
class circle extends shape{
	void draw() {
		System.out.println("drwing circle");
		}
}
class square extends shape{
	void draw() {
		System.out.println("drwing squre");
		}
}

public class abstractclass {
public static void main(String args[]) {
	shape s;//use declare a variable for SHAPE //
	s=new circle();//calling class by using variable//
	s.draw();
}
}
