package variables;

public class methodlocalinnerclass {
void my_method() {
	int num=23;
	//cretaing meathod local inner class//
	class inner_demo{
		public void print() {
			System.out.println("this is method of inner class"+" "+num);
			
		}
    }
//accesing inner class//
	inner_demo inner =new inner_demo();
	inner.print();
}
	public static void main(String args[]) {
		methodlocalinnerclass outer=new methodlocalinnerclass();
		outer.my_method();
	}

}
