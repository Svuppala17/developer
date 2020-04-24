package variables;

abstract class anonymous1{
public abstract void mymethod();
}




public class anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
anonymous1 inner=new anonymous1() {
	public void mymethod() {
		System.out.println("this is ex anoymous");
	}
};inner.mymethod();
	}

}
