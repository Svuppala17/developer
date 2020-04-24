package variables;
class calculation {
	int z;
public void addition(int x,int y ) {
z=x+y;
System.out.println("this is addition"+z);
	}
public void multiplication(int x,int y ) {
z=x*y;
System.out.println("this is multiplication"+z);
			}
}
public class my_calculation extends calculation {
	public void subraction(int x,int y ) {
		z=x-y;
		System.out.println("this is subraction"+z);
			}
	public  void main(String[] args) {
		// TODO Auto-generated method stub
int a=10, b =20;
my_calculation demo=new my_calculation();
demo.addition(a, b);
demo.subraction(a, b);
demo.multiplication(a, b);
	}

}