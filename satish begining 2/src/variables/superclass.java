package variables;

class upperclass{
	int age;
	upperclass(int age){
		this.age = age;
	}
public void getage() {
System.out.println("This is variable named age"+" "+ age);
  }
}



public class superclass extends upperclass{

	superclass(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
upperclass s = new upperclass(24);
s.getage();
	}

}
