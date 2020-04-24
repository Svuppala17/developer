
class outer_demo{
	private int num =175;

//inner class creating//
	public class inner_class{
		public int getvalue() {
		
		System.out.println("this is getmum method for inner class");
		return num;
		}
	}

}

public class privatemmebers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	outer_demo outer=new outer_demo();
outer_demo.inner_class inner=outer.new inner_class();
System.out.println(inner.getvalue());
	}

}
