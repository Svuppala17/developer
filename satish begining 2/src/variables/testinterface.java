package variables;
interface drawable{
	abstract void draw();
}
class rect implements drawable{
	 public void draw() {
		System.out.println("draw rectangle");
	}
}

class cir implements drawable{

	@Override
	public void draw() {
	
		// TODO Auto-generated method stub
		System.out.println("drwang circle");
	}
	
}
public class testinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawable d= new cir();
		d.draw();
		drawable d2= new rect();
		d2.draw();
	}

}
